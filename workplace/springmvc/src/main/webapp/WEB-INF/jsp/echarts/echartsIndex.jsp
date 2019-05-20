<%--
  Created by IntelliJ IDEA.
  User: mazhonghua
  Date: 2018/11/18
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>Echarts测试页面</title>
    </head>

    <body>

        <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
        <div id="main" style="height:600px"></div>

        <!-- ECharts单文件引入 -->
        <script src="http://echarts.baidu.com/build/dist/echarts.js"></script>


        <script type="text/javascript">
            // 路径配置
            require.config({
                paths: {
                    echarts: 'http://echarts.baidu.com/build/dist'
                }
            });


            // 使用
            require(
                [
                    'echarts',
                    'echarts/chart/bar',      // 使用柱状图就加载bar模块，按需加载
                    'echarts/chart/line',
                    'echarts/chart/pie',
                    'echarts/chart/scatter',
                    'echarts/chart/k',
                    'echarts/chart/radar',
                    'echarts/chart/chord'

                ],
                function (ec) {
                    // 基于准备好的dom，初始化echarts图表
                    var myChart = ec.init(document.getElementById('main'));

                    var option = {
                        tooltip: {
                            show: true
                        },
                        /*legend: {
                            data:['销量']
                        },*/
                        xAxis : [
                            {
                                type : 'category',
                                data : ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
                            }
                        ],
                        yAxis : [
                            {
                                type : 'value'
                            }
                        ],
                        series : [
                            {
                                "name":"销量",
                                "type":"line",
                                "data":[5, 20, 40, 10, 10, 20]
                            }
                        ]
                    };




                    option = {

                        // 提示框
                        tooltip : {
                            trigger: 'axis'
                        },
                        // 图例
                        legend: {
                            data:['邮件营销','联盟广告','直接访问','搜索引擎']
                        },
                        //
                        toolbox: {
                            show : true,
                            feature : {
                                mark : {show: true},
                                dataView : {show: true, readOnly: false},
                                magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                                restore : {show: true},
                                saveAsImage : {show: true}
                            }
                        },
                        calculable : true,
                        xAxis : [
                            {
                                type : 'category',
                                boundaryGap : false,
                                data : ['周一','周二','周三','周四','周五','周六','周日']
                            }
                        ],
                        yAxis : [
                            {
                                type : 'value',
                                splitArea : {show : true}
                            }
                        ],
                        series : [
                            {
                                name:'邮件营销',
                                type:'line',
                                stack: '总量',
                                symbol: 'none',
                                itemStyle: {
                                    normal: {
                                        areaStyle: {
                                            // 区域图，纵向渐变填充
                                            color : (function (){
                                                var zrColor = require('zrender/tool/color');
                                                return zrColor.getLinearGradient(
                                                    0, 200, 0, 400,
                                                    [[0, 'rgba(255,0,0,0.8)'],[0.8, 'rgba(255,255,255,0.1)']]
                                                )
                                            })()
                                        }
                                    }
                                },
                                data:[
                                    120, 132, 301, 134,
                                    {value:90, symbol:'droplet',symbolSize:5},
                                    230, 210
                                ]
                            },
                            {
                                name:'联盟广告',
                                type:'line',
                                stack: '总量',
                                smooth: true,
                                symbol: 'image://../../doc/asset/ico/favicon.png',     // 系列级个性化拐点图形
                                symbolSize: 8,
                                data:[
                                    120, 82,
                                    {
                                        value:201,
                                        symbol: 'star',  // 数据级个性化拐点图形
                                        symbolSize : 15,
                                        itemStyle : { normal: {label : {
                                                    show: true,
                                                    textStyle : {
                                                        fontSize : '20',
                                                        fontFamily : '微软雅黑',
                                                        fontWeight : 'bold'
                                                    }
                                                }}}
                                    },
                                    {
                                        value:134,
                                        symbol: 'none'
                                    },
                                    190,
                                    {
                                        value : 230,
                                        symbol: 'emptypin',
                                        symbolSize: 8
                                    },
                                    110
                                ]
                            },
                            {
                                name:'直接访问',
                                type:'line',
                                stack: '总量',
                                symbol: 'arrow',
                                symbolSize: 6,
                                symbolRotate: -45,
                                itemStyle: {
                                    normal: {
                                        color: 'red',
                                        lineStyle: {        // 系列级个性化折线样式
                                            width: 2,
                                            type: 'dashed'
                                        }
                                    },
                                    emphasis: {
                                        color: 'blue'
                                    }
                                },
                                data:[
                                    320, 332, '-', 334,
                                    {
                                        value: 390,
                                        symbol: 'star6',
                                        symbolSize : 20,
                                        symbolRotate : 10,
                                        itemStyle: {        // 数据级个性化折线样式
                                            normal: {
                                                color: 'yellowgreen'
                                            },
                                            emphasis: {
                                                color: 'orange',
                                                label : {
                                                    show: true,
                                                    position: 'inside',
                                                    textStyle : {
                                                        fontSize : '20'
                                                    }
                                                }
                                            }
                                        }
                                    },
                                    330, 320
                                ]
                            },
                            {
                                name:'搜索引擎',
                                type:'line',
                                symbol:'emptyCircle',
                                itemStyle: {
                                    normal: {
                                        lineStyle: {            // 系列级个性化折线样式，横向渐变描边
                                            width: 2,
                                            color: (function (){
                                                var zrColor = require('zrender/tool/color');
                                                return zrColor.getLinearGradient(
                                                    0, 0, 1000, 0,
                                                    [[0, 'rgba(255,0,0,0.8)'],[0.8, 'rgba(255,255,0,0.8)']]
                                                )
                                            })(),
                                            shadowColor : 'rgba(0,0,0,0.5)',
                                            shadowBlur: 10,
                                            shadowOffsetX: 8,
                                            shadowOffsetY: 8
                                        }
                                    },
                                    emphasis : {
                                        label : {show: true}
                                    }
                                },
                                data:[
                                    620, 732, 791,
                                    {value:734, symbol:'emptyHeart',symbolSize:10},
                                    890, 930, 820
                                ],
                                markPoint : {
                                    data : [
                                        {name : '周最高', value : 930, xAxis: '周六', yAxis: 935}
                                    ]
                                }
                            }
                        ]
                    };


                    option = {
                        title : {
                            text: '浏览器占比变化',
                            subtext: '纯属虚构',
                            x:'right',
                            y:'bottom'
                        },
                        tooltip : {
                            trigger: 'item',
                            formatter: "{a} <br/>{b} : {c} ({d}%)"
                        },
                        legend: {
                            orient : 'vertical',
                            x : 'left',
                            data:['Chrome','Firefox','Safari','IE9+','IE8-']
                        },
                        toolbox: {
                            show : true,
                            feature : {
                                mark : {show: true},
                                dataView : {show: true, readOnly: false},
                                restore : {show: true},
                                saveAsImage : {show: true}
                            }
                        },
                        calculable : false,
                        series : (function (){
                            var series = [];
                            for (var i = 0; i < 30; i++) {
                                series.push({
                                    name:'浏览器（数据纯属虚构）',
                                    type:'pie',
                                    itemStyle : {normal : {
                                            label : {show : i > 28},
                                            labelLine : {show : i > 28, length:20}
                                        }},
                                    radius : [i * 4 + 40, i * 4 + 43],
                                    data:[
                                        {value: i * 128 + 80,  name:'Chrome'},
                                        {value: i * 64  + 160,  name:'Firefox'},
                                        {value: i * 32  + 320,  name:'Safari'},
                                        {value: i * 16  + 640,  name:'IE9+'},
                                        {value: i * 8  + 1280, name:'IE8-'}
                                    ]
                                })
                            }
                            series[0].markPoint = {
                                symbol:'emptyCircle',
                                symbolSize:series[0].radius[0],
                                effect:{show:true,scaleSize:12,color:'rgba(250,225,50,0.8)',shadowBlur:10,period:30},
                                data:[{x:'50%',y:'50%'}]
                            };
                            return series;
                        })()
                    };
                    setTimeout(function (){
                        var _ZR = myChart.getZrender();
                        var TextShape = require('zrender/shape/Text');
                        // 补充千层饼
                        _ZR.addShape(new TextShape({
                            style : {
                                x : _ZR.getWidth() / 2,
                                y : _ZR.getHeight() / 2,
                                color: '#e83930',
                                text : '恶梦的过去',
                                textAlign : 'center'
                            }
                        }));
                        _ZR.addShape(new TextShape({
                            style : {
                                x : _ZR.getWidth() / 2 + 200,
                                y : _ZR.getHeight() / 2,
                                brushType:'fill',
                                color: 'orange',
                                text : '美好的未来',
                                textAlign : 'left',
                                textFont:'normal 20px 微软雅黑'
                            }
                        }));
                        _ZR.refresh();
                    }, 2000);



                    // 为echarts对象加载数据
                    myChart.setOption(option);
                }
            );
        </script>
    </body>
</html>
