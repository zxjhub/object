import numpy as np
import cv2 as cv
import os
import time
import glob

weightsPath = 'model/yolov3.weights' #-tiny
configPath = 'model/yolov3.cfg'
labelsPath = 'model/coco.names'
imgPath = ''
CONFIDENCE = 0.5  #过滤弱检测的最小概率
THRESHOLD = 0.4   #非最大值抑制阙值
# with open(labelsPath,'rt') as f:
#     labels = f.read().rstrip('\n').split('\n')
#读取网络设置
net = cv.dnn.readNetFromDarknet(configPath,weightsPath)
#对图片进行检测
def get_coco_names():
    # COCO 物体类别名
    classesFile = 'model/coco.names'
    classes = None
    with open(classesFile, 'rt') as f:
        classes = f.read().rstrip('\n').split('\n')

    return classes

def detectionAll(img):
    # img = cv.imread(fileName)
    # print(img)
    classes = get_coco_names()
    blobImg = cv.dnn.blobFromImage(img,1.0/255.0,(416,416),None,True,False)
    #print(blobImg)
    net.setInput(blobImg)
    outInfo = net.getUnconnectedOutLayersNames()
   # print(outInfo)
    layerOutputs = net.forward(outInfo)
    (H,W) = img.shape[:2]
    boxes = []
    confidences = []
    classIDs = []
    class1_name=[]
    boxes1=[]
    class1_name1=[]
    boxes2=[]
    class1_name2=[]
    #过滤置信度低的框框
    for out in layerOutputs:
        for detection in out:
            scores = detection[5:]  #每个类别的置信度
            classID = np.argmax(scores)  #最高置信度的类别ID
            confidence = scores[classID] #拿到置信度
            #根据置信度筛选
            if(confidence>CONFIDENCE):
                box = detection[0:4]*np.array([W,H,W,H])
                (centerX,centerY,width,height) = box.astype("int")
                x = int(centerX-(width/2))
                y = int(centerY-(height/2))
                if(classes[classID]=="car"):
                    boxes.append([x,y,int(width),int(height)])
                    #confidences.append(float(confidence))
                    #classIDs.append(classID)
                    class1_name.append(classes[classID])
                elif(classes[classID]=="person"):
                    boxes1.append([x, y, int(width), int(height)])
                    class1_name1.append(classes[classID])
                elif (classes[classID] == "traffic light"):
                    boxes2.append([x, y, int(width), int(height)])
                    class1_name2.append(classes[classID])
    return boxes,class1_name,boxes1,class1_name1,boxes2,class1_name2

