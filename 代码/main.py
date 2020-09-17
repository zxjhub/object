#! /usr/bin/env python
# -*- coding: utf-8 -*-

from __future__ import division, print_function, absolute_import
import os
import datetime
from timeit import time
import warnings
import cv2
import numpy as np
import argparse
from PIL import Image
from 代码.dnn识别 import detectionAll
from 代码.deep_sort import preprocessing
from 代码.deep_sort import nn_matching
from 代码.deep_sort.detection import Detection
from 代码.deep_sort.tracker import Tracker
from 代码.tools import generate_detections as gdet
from 代码.deep_sort.detection import Detection as ddet
from collections import deque
from keras import backend
from flask import Flask, render_template, request
from flask_sockets import Sockets
import time
from flask import jsonify
import json
app = Flask(__name__)
sockets = Sockets(app)
backend.clear_session()
ap = argparse.ArgumentParser()
ap.add_argument("-i", "--input",help="path to input video", default = "./model/t1.mp4")
ap.add_argument("-c", "--class",help="name of class", default = "person")
args = vars(ap.parse_args())

pts = [deque(maxlen=30) for _ in range(9999)]
warnings.filterwarnings('ignore')

# initialize a list of colors to represent each possible class label
np.random.seed(100)
COLORS = np.random.randint(0, 255, size=(200, 3),
	dtype="uint8")

@sockets.route('/tagCurValue')
def tagCurValue(ws):

    start = time.time()
    #Definition of the parameters
    max_cosine_distance = 0.5 #余弦距离的控制阈值
    nn_budget = None
    nms_max_overlap = 0.3 #非极大抑制的阈值

    counter = []
    counter1 = []
    counter2 = []
    #deep_sort
    model_filename = 'model/market1501.pb'
    encoder = gdet.create_box_encoder(model_filename,batch_size=1)
    metric = nn_matching.NearestNeighborDistanceMetric("cosine", max_cosine_distance, nn_budget)
    metric1 = nn_matching.NearestNeighborDistanceMetric("cosine", max_cosine_distance, nn_budget)
    metric2 = nn_matching.NearestNeighborDistanceMetric("cosine", max_cosine_distance, nn_budget)
    tracker = Tracker(metric)
    tracker1 = Tracker(metric1)
    tracker2 = Tracker(metric2)
    writeVideo_flag = True
    #video_path = "./output/output.avi"
    video_capture = cv2.VideoCapture(args["input"])

    if writeVideo_flag:
    # Define the codec and create VideoWriter object
        w = int(video_capture.get(3))
        h = int(video_capture.get(4))
        fourcc = cv2.VideoWriter_fourcc(*'MJPG')
        out = cv2.VideoWriter('./static/video/'+args["input"][43:57]+ "_" + args["class"] + '_output.avi', fourcc, 25, (w, h))
        list_file = open('detection.txt', 'w')
        frame_index = -1

    fps = 0.0

    while True:
        d2=[]
        ret, frame = video_capture.read()  # frame shape 640*480*3
        if ret != True:
            break
        t1 = time.time()
        img = Image.fromarray(frame)

        #image = Image.fromarray(frame[...,::-1]) #bgr to rgb
        boxs,class_names,boxs1, class_names1,boxs2, class_names2= detectionAll(frame)
        features = encoder(frame,boxs)
        features1 = encoder(frame, boxs1)
        features2 = encoder(frame, boxs2)
        # score to 1.0 here).
        detections = [Detection(bbox, 1.0, feature) for bbox, feature in zip(boxs, features)]
        detections1 = [Detection(bbox, 1.0, feature) for bbox, feature in zip(boxs1, features1)]
        detections2 = [Detection(bbox, 1.0, feature) for bbox, feature in zip(boxs2, features2)]
        # Run non-maxima suppression.
        boxes = np.array([d.tlwh for d in detections])
        boxes1 = np.array([d.tlwh for d in detections1])
        boxes2 = np.array([d.tlwh for d in detections2])
        scores = np.array([d.confidence for d in detections])
        scores1 = np.array([d.confidence for d in detections1])
        scores2 = np.array([d.confidence for d in detections2])
        indices = preprocessing.non_max_suppression(boxes, nms_max_overlap, scores)
        indices1 = preprocessing.non_max_suppression(boxes1, nms_max_overlap, scores1)
        indices2 = preprocessing.non_max_suppression(boxes2, nms_max_overlap, scores2)
        detections = [detections[i] for i in indices]
        detections1 = [detections1[i] for i in indices1]
        detections2 = [detections2[i] for i in indices2]
        # Call the tracker
        tracker.predict()
        tracker1.predict()
        tracker2.predict()
        tracker.update(detections)
        tracker1.update(detections1)
        tracker2.update(detections2)
        i = int(0)
        i1=int(0)
        i2 = int(0)
        indexIDs = []
        c = []
        boxes = []
        for track in tracker.tracks:
            if not track.is_confirmed() or track.time_since_update > 1:
                continue
            #boxes.append([track[0], track[1], track[2], track[3]])
            indexIDs.append(int(track.track_id))
            counter.append(int(track.track_id))
            bbox = track.to_tlbr()
            color = [int(c) for c in COLORS[indexIDs[i] % len(COLORS)]]

            cv2.rectangle(frame, (int(bbox[0]), int(bbox[1])), (int(bbox[2]), int(bbox[3])),(color), 3)
            img1 = img.crop((int(bbox[0]), int(bbox[1]), int(bbox[2]), int(bbox[3])))

            cv2.putText(frame,str(track.track_id),(int(bbox[0]), int(bbox[1] -50)),0, 5e-3 * 150, (color),2)
            if len(class_names) > 0:
                 class_name = class_names[0]
                 cv2.putText(frame, str(class_name),(int(bbox[0]), int(bbox[1] -20)),0, 5e-3 * 150, (color),2)
                 if(os.path.exists("./static/video/" +str(class_name) +str(track.track_id)+".jpg")!=True):
                     img1.save("./static/video/" +str(class_name) +str(track.track_id)+".jpg")
                     d2.append("http://127.0.0.1:5000/static/video/" +str(class_name) +str(track.track_id)+".jpg")
            i += 1
            #bbox_center_point(x,y)
            center = (int(((bbox[0])+(bbox[2]))/2),int(((bbox[1])+(bbox[3]))/2))
            #track_id[center]
            pts[track.track_id].append(center)
            thickness = 5
            #center point
            cv2.circle(frame,  (center), 1, color, thickness)
	        #draw motion path
            for j in range(1, len(pts[track.track_id])):
                if pts[track.track_id][j - 1] is None or pts[track.track_id][j] is None:
                   continue
                thickness = int(np.sqrt(64 / float(j + 1)) * 2)
                #cv2.line(frame,(pts[track.track_id][j-1]), (pts[track.track_id][j]),(color),thickness)
                #cv2.putText(frame, str(class_names[j]),(int(bbox[0]), int(bbox[1] -20)),0, 5e-3 * 150, (255,255,255),2)
        for track in tracker1.tracks:
            if not track.is_confirmed() or track.time_since_update > 1:
                continue
            # boxes.append([track[0], track[1], track[2], track[3]])
            indexIDs.append(int(track.track_id))
            counter1.append(int(track.track_id))
            bbox = track.to_tlbr()
            color = [int(c) for c in COLORS[indexIDs[i] % len(COLORS)]]
            img2 = img.crop((int(bbox[0]), int(bbox[1]), int(bbox[2]), int(bbox[3])))
            cv2.rectangle(frame, (int(bbox[0]), int(bbox[1])), (int(bbox[2]), int(bbox[3])), (color), 3)
            cv2.putText(frame, str(track.track_id), (int(bbox[0]), int(bbox[1] - 50)), 0, 5e-3 * 150, (color),2)
            if len(class_names1) > 0:
                class_name = class_names1[0]
                cv2.putText(frame, str(class_name), (int(bbox[0]), int(bbox[1] - 20)), 0, 5e-3 * 150,(color), 2)
                if (os.path.exists("./static/video/" + str(class_name) + str(track.track_id) + ".jpg") != True):
                  img2.save("./static/video/" + str(class_name) + str(track.track_id)+".jpg")
                  d2.append("http://127.0.0.1:5000/static/video/" + str(class_name) + str(track.track_id) + ".jpg")
            i1 += 1
            # bbox_center_point(x,y)
            center = (int(((bbox[0]) + (bbox[2])) / 2), int(((bbox[1]) + (bbox[3])) / 2))
            # track_id[center]
            pts[track.track_id].append(center)
            thickness = 5
            # center point
            cv2.circle(frame, (center), 1, color, thickness)
            # draw motion path
            for j in range(1, len(pts[track.track_id])):
                if pts[track.track_id][j - 1] is None or pts[track.track_id][j] is None:
                    continue
                thickness = int(np.sqrt(64 / float(j + 1)) * 2)
                #cv2.line(frame, (pts[track.track_id][j - 1]), (pts[track.track_id][j]), (color), thickness)
                #cv2.putText(frame, str(class_names[j]),(int(bbox[0]), int(bbox[1] -20)),0, 5e-3 * 150, (255,255,255),2)
        for track in tracker2.tracks:
            if not track.is_confirmed() or track.time_since_update > 1:
                continue
            # boxes.append([track[0], track[1], track[2], track[3]])
            indexIDs.append(int(track.track_id))
            counter2.append(int(track.track_id))
            bbox = track.to_tlbr()
            color = [int(c) for c in COLORS[indexIDs[i] % len(COLORS)]]
            img3 = img.crop((int(bbox[0]), int(bbox[1]), int(bbox[2]), int(bbox[3])))
            cv2.rectangle(frame, (int(bbox[0]), int(bbox[1])), (int(bbox[2]), int(bbox[3])), (color), 3)
            cv2.putText(frame, str(track.track_id), (int(bbox[0]), int(bbox[1] - 50)), 0, 5e-3 * 150, (color),
                                2)
            if len(class_names2) > 0:
                class_name = class_names2[0]
                cv2.putText(frame, str(class_name), (int(bbox[0]), int(bbox[1] - 20)), 0, 5e-3 * 150,
                            (color), 2)
                if (os.path.exists("./static/video/" + str(class_name) + str(track.track_id) + ".jpg") != True):
                  img3.save("./static/video/" + str(class_name) + str(track.track_id)+".jpg")
                  d2.append("http://127.0.0.1:5000/static/video/" + str(class_name) + str(track.track_id) + ".jpg")
            i2 += 1
            # bbox_center_point(x,y)
            center = (int(((bbox[0]) + (bbox[2])) / 2), int(((bbox[1]) + (bbox[3])) / 2))
            # track_id[center]
            pts[track.track_id].append(center)
            thickness = 5
            # center point
            cv2.circle(frame, (center), 1, color, thickness)
            # draw motion path
            for j in range(1, len(pts[track.track_id])):
                if pts[track.track_id][j - 1] is None or pts[track.track_id][j] is None:
                    continue
                thickness = int(np.sqrt(64 / float(j + 1)) * 2)
                # cv2.line(frame,(pts[track.track_id][j-1]), (pts[track.track_id][j]),(color),thickness)
                # cv2.putText(frame, str(class_names[j]),(int(bbox[0]), int(bbox[1] -20)),0, 5e-3 * 150, (255,255,255),2)
        count = len(set(counter))
        count1 = len(set(counter1))
        count2 = len(set(counter2))
        cv2.putText(frame, "car: "+str(count),(int(20), int(120)),0, 5e-3 * 200, (0,255,0),2)
        cv2.putText(frame, "person: "+str(count1),(int(20), int(80)),0, 5e-3 * 200, (0,255,0),2)
        cv2.putText(frame, "traffic light: " + str(count2), (int(20), int(160)), 0, 5e-3 * 200, (0, 255, 0), 2)
        cv2.putText(frame, "FPS: %f"%(fps),(int(20), int(40)),0, 5e-3 * 200, (0,255,0),3)
        #cv2.namedWindow("YOLO3_Deep_SORT", 0);
        #cv2.resizeWindow('YOLO3_Deep_SORT', 1024, 768);
        #cv2.imshow('YOLO3_Deep_SORT', frame)

        if writeVideo_flag:
            #save a frame
            out.write(frame)
            frame_index = frame_index + 1
            list_file.write(str(frame_index)+' ')
            if len(boxs) != 0:
                for i in range(0,len(boxs)):
                    list_file.write(str(boxs[i][0]) + ' '+str(boxs[i][1]) + ' '+str(boxs[i][2]) + ' '+str(boxs[i][3]) + ' ')
            list_file.write('\n')
        fps  = ( fps + (1./(time.time()-t1)) ) / 2
        d = [{"value": count, "name": 'car'}, {"value": count1, "name": 'person'},
             {"value": count2, "name": 'light'}, {"value": fps, "name": 'fps'}]
        d1=[i,i1,i2]
        ds=[{"name":"sum","children":d},{"name":"shishi","children":d1},{"name":"image","children":d2}]

        ws.send(json.dumps(ds))
        print(d2)
        #print("tag curent value:" + json.dumps(ds))
        #print(fps)

        # Press Q to stop!
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break
    print(" ")
    print("[Finish]")
    end = time.time()

    if len(pts[track.track_id]) != None:
       print(args["input"][43:57]+": "+ str(count) + " " + str(class_name) +' Found')

    else:
       print("[No Found]")

    video_capture.release()

    if writeVideo_flag:
        out.release()
        list_file.close()
    cv2.destroyAllWindows()


@app.route('/')
def hello():
    return render_template('index.html')


if __name__ == "__main__":
    from gevent import pywsgi
    from geventwebsocket.handler import WebSocketHandler

    server = pywsgi.WSGIServer(('0.0.0.0', 5000), application=app, handler_class=WebSocketHandler)
    print('Server Start')
    server.serve_forever()