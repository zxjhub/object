from flask import Flask, render_template, request
from flask_sockets import Sockets
import time

app = Flask(__name__)
sockets = Sockets(app)


@sockets.route('/tagCurValue')
def tagCurValue(ws):
    '''
        代码模拟每5秒钟，定时给客户端推送一个自增的变量数据
    '''
    n = 0
    while not ws.closed:
        n = n + 1
        ws.send(str(n))
        print("tag curent value:" + str(n))
        time.sleep(5)

@app.route('/')
def hello():
    return render_template('index.html')


if __name__ == "__main__":
    from gevent import pywsgi
    from geventwebsocket.handler import WebSocketHandler

    server = pywsgi.WSGIServer(('0.0.0.0', 5000), application=app, handler_class=WebSocketHandler)
    print('Server Start')
    server.serve_forever()