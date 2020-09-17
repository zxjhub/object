var symptomName = last_month_day();
$(function(){
  init();
})
function init(){
$(function(){
    $("#btn").on("click",function(){
        $.ajax({
            url: 'http://127.0.0.1:5000/index',
            type: 'post',
            success: function (responseText) {
                $('#div1').html(responseText);
            }
        });
    });
    $("#test").on("click",function(){
        alert('hello world!');
    });
});
$(document).ready(function(){
    if ("WebSocket" in window) {
        //连接server--TagCurValue
        var ws = new WebSocket("ws://127.0.0.1:5000/tagCurValue");
        //var ws = new WebSocket("ws://127.0.0.1:8008/tagCurValue");
        ws.onmessage = function (evt) {
            // 接收数据
            var receivedMsg = evt.data;
            var json1=JSON.parse(receivedMsg)
            var json=json1[0].children
            var jsonshishi=json1[1].children
            var jsonimage=json1[2].children
            var car=json[0].value
            var person=json[1].value
            var light=json[2].value
            var fps=json[3].value
            document.getElementById('car').innerHTML=":"+car
            document.getElementById('person').innerHTML=":"+person
            document.getElementById('light').innerHTML=":"+light
             document.getElementById('fps').innerHTML=":"+fps
            for(i=0;i<jsonimage.length;i++) {

            }
             var histogramChart = echarts.init(document.getElementById('pieChart1'));
    histogramChart.setOption({
    tooltip: {
        trigger: 'axis',
        axisPointer: {
            type: 'shadow'
        }
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis: {
        type: 'value',
        boundaryGap: [0, 0.01]
    },
    yAxis: {
        type: 'category',
        axisLabel: {
          color: "#ff0" //刻度线标签颜色
         } ,
        data: ['汽车', '人', '交通灯']
    },
    series: [

        {
             label:{
                 show: true,
             },
            //name: '2011年',
            type: 'bar',
            data: jsonshishi
                //[18203, 23489, 29034]
        }
    ]
   });
        };
    }
});
}
