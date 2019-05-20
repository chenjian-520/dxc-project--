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

    <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>

</head>

<body>
<script type="text/javascript">

    (function (root, factory) {
        if (typeof define === 'function' && define.amd) {
            // AMD. Register as an anonymous module.
            define(['exports', 'echarts'], factory);
        } else if (typeof exports === 'object' && typeof exports.nodeName !== 'string') {
            // CommonJS
            factory(exports, require('echarts'));
        } else {
            // Browser globals
            factory({}, root.echarts);
        }
    }(this, function (exports, echarts) {
        var log = function (msg) {
            if (typeof console !== 'undefined') {
                console && console.error && console.error(msg);
            }
        };
        if (!echarts) {
            log('ECharts is not Loaded');
            return;
        }
        echarts.registerTheme('vintage', {
            "color": [
                "#d87c7c",
                "#919e8b",
                "#d7ab82",
                "#6e7074",
                "#61a0a8",
                "#efa18d",
                "#787464",
                "#cc7e63",
                "#724e58",
                "#4b565b"
            ],
            "backgroundColor": "rgba(254,248,239,1)",
            "textStyle": {},
            "title": {
                "textStyle": {
                    "color": "#333333"
                },
                "subtextStyle": {
                    "color": "#aaaaaa"
                }
            },
            "line": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 1
                    }
                },
                "lineStyle": {
                    "normal": {
                        "width": 2
                    }
                },
                "symbolSize": 4,
                "symbol": "emptyCircle",
                "smooth": false
            },
            "radar": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 1
                    }
                },
                "lineStyle": {
                    "normal": {
                        "width": 2
                    }
                },
                "symbolSize": 4,
                "symbol": "emptyCircle",
                "smooth": false
            },
            "bar": {
                "itemStyle": {
                    "normal": {
                        "barBorderWidth": 0,
                        "barBorderColor": "#ccc"
                    },
                    "emphasis": {
                        "barBorderWidth": 0,
                        "barBorderColor": "#ccc"
                    }
                }
            },
            "pie": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    },
                    "emphasis": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    }
                }
            },
            "scatter": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    },
                    "emphasis": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    }
                }
            },
            "boxplot": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    },
                    "emphasis": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    }
                }
            },
            "parallel": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    },
                    "emphasis": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    }
                }
            },
            "sankey": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    },
                    "emphasis": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    }
                }
            },
            "funnel": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    },
                    "emphasis": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    }
                }
            },
            "gauge": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    },
                    "emphasis": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    }
                }
            },
            "candlestick": {
                "itemStyle": {
                    "normal": {
                        "color": "#c23531",
                        "color0": "#314656",
                        "borderColor": "#c23531",
                        "borderColor0": "#314656",
                        "borderWidth": 1
                    }
                }
            },
            "graph": {
                "itemStyle": {
                    "normal": {
                        "borderWidth": 0,
                        "borderColor": "#ccc"
                    }
                },
                "lineStyle": {
                    "normal": {
                        "width": 1,
                        "color": "#aaaaaa"
                    }
                },
                "symbolSize": 4,
                "symbol": "emptyCircle",
                "smooth": false,
                "color": [
                    "#d87c7c",
                    "#919e8b",
                    "#d7ab82",
                    "#6e7074",
                    "#61a0a8",
                    "#efa18d",
                    "#787464",
                    "#cc7e63",
                    "#724e58",
                    "#4b565b"
                ],
                "label": {
                    "normal": {
                        "textStyle": {
                            "color": "#eeeeee"
                        }
                    }
                }
            },
            "map": {
                "itemStyle": {
                    "normal": {
                        "areaColor": "#eeeeee",
                        "borderColor": "#444444",
                        "borderWidth": 0.5
                    },
                    "emphasis": {
                        "areaColor": "rgba(255,215,0,0.8)",
                        "borderColor": "#444444",
                        "borderWidth": 1
                    }
                },
                "label": {
                    "normal": {
                        "textStyle": {
                            "color": "#000000"
                        }
                    },
                    "emphasis": {
                        "textStyle": {
                            "color": "rgb(100,0,0)"
                        }
                    }
                }
            },
            "geo": {
                "itemStyle": {
                    "normal": {
                        "areaColor": "#eeeeee",
                        "borderColor": "#444444",
                        "borderWidth": 0.5
                    },
                    "emphasis": {
                        "areaColor": "rgba(255,215,0,0.8)",
                        "borderColor": "#444444",
                        "borderWidth": 1
                    }
                },
                "label": {
                    "normal": {
                        "textStyle": {
                            "color": "#000000"
                        }
                    },
                    "emphasis": {
                        "textStyle": {
                            "color": "rgb(100,0,0)"
                        }
                    }
                }
            },
            "categoryAxis": {
                "axisLine": {
                    "show": true,
                    "lineStyle": {
                        "color": "#333"
                    }
                },
                "axisTick": {
                    "show": true,
                    "lineStyle": {
                        "color": "#333"
                    }
                },
                "axisLabel": {
                    "show": true,
                    "textStyle": {
                        "color": "#333"
                    }
                },
                "splitLine": {
                    "show": false,
                    "lineStyle": {
                        "color": [
                            "#ccc"
                        ]
                    }
                },
                "splitArea": {
                    "show": false,
                    "areaStyle": {
                        "color": [
                            "rgba(250,250,250,0.3)",
                            "rgba(200,200,200,0.3)"
                        ]
                    }
                }
            },
            "valueAxis": {
                "axisLine": {
                    "show": true,
                    "lineStyle": {
                        "color": "#333"
                    }
                },
                "axisTick": {
                    "show": true,
                    "lineStyle": {
                        "color": "#333"
                    }
                },
                "axisLabel": {
                    "show": true,
                    "textStyle": {
                        "color": "#333"
                    }
                },
                "splitLine": {
                    "show": true,
                    "lineStyle": {
                        "color": [
                            "#ccc"
                        ]
                    }
                },
                "splitArea": {
                    "show": false,
                    "areaStyle": {
                        "color": [
                            "rgba(250,250,250,0.3)",
                            "rgba(200,200,200,0.3)"
                        ]
                    }
                }
            },
            "logAxis": {
                "axisLine": {
                    "show": true,
                    "lineStyle": {
                        "color": "#333"
                    }
                },
                "axisTick": {
                    "show": true,
                    "lineStyle": {
                        "color": "#333"
                    }
                },
                "axisLabel": {
                    "show": true,
                    "textStyle": {
                        "color": "#333"
                    }
                },
                "splitLine": {
                    "show": true,
                    "lineStyle": {
                        "color": [
                            "#ccc"
                        ]
                    }
                },
                "splitArea": {
                    "show": false,
                    "areaStyle": {
                        "color": [
                            "rgba(250,250,250,0.3)",
                            "rgba(200,200,200,0.3)"
                        ]
                    }
                }
            },
            "timeAxis": {
                "axisLine": {
                    "show": true,
                    "lineStyle": {
                        "color": "#333"
                    }
                },
                "axisTick": {
                    "show": true,
                    "lineStyle": {
                        "color": "#333"
                    }
                },
                "axisLabel": {
                    "show": true,
                    "textStyle": {
                        "color": "#333"
                    }
                },
                "splitLine": {
                    "show": true,
                    "lineStyle": {
                        "color": [
                            "#ccc"
                        ]
                    }
                },
                "splitArea": {
                    "show": false,
                    "areaStyle": {
                        "color": [
                            "rgba(250,250,250,0.3)",
                            "rgba(200,200,200,0.3)"
                        ]
                    }
                }
            },
            "toolbox": {
                "iconStyle": {
                    "normal": {
                        "borderColor": "#999999"
                    },
                    "emphasis": {
                        "borderColor": "#666666"
                    }
                }
            },
            "legend": {
                "textStyle": {
                    "color": "#333333"
                }
            },
            "tooltip": {
                "axisPointer": {
                    "lineStyle": {
                        "color": "#cccccc",
                        "width": 1
                    },
                    "crossStyle": {
                        "color": "#cccccc",
                        "width": 1
                    }
                }
            },
            "timeline": {
                "lineStyle": {
                    "color": "#293c55",
                    "width": 1
                },
                "itemStyle": {
                    "normal": {
                        "color": "#293c55",
                        "borderWidth": 1
                    },
                    "emphasis": {
                        "color": "#a9334c"
                    }
                },
                "controlStyle": {
                    "normal": {
                        "color": "#293c55",
                        "borderColor": "#293c55",
                        "borderWidth": 0.5
                    },
                    "emphasis": {
                        "color": "#293c55",
                        "borderColor": "#293c55",
                        "borderWidth": 0.5
                    }
                },
                "checkpointStyle": {
                    "color": "#e43c59",
                    "borderColor": "rgba(194,53,49,0.5)"
                },
                "label": {
                    "normal": {
                        "textStyle": {
                            "color": "#293c55"
                        }
                    },
                    "emphasis": {
                        "textStyle": {
                            "color": "#293c55"
                        }
                    }
                }
            },
            "visualMap": {
                "color": [
                    "#bf444c",
                    "#d88273",
                    "#f6efa6"
                ]
            },
            "dataZoom": {
                "backgroundColor": "rgba(47,69,84,0)",
                "dataBackgroundColor": "rgba(47,69,84,0.3)",
                "fillerColor": "rgba(167,183,204,0.4)",
                "handleColor": "#a7b7cc",
                "handleSize": "100%",
                "textStyle": {
                    "color": "#333333"
                }
            },
            "markPoint": {
                "label": {
                    "normal": {
                        "textStyle": {
                            "color": "#eeeeee"
                        }
                    },
                    "emphasis": {
                        "textStyle": {
                            "color": "#eeeeee"
                        }
                    }
                }
            }
        });
    }));

</script>

<!-- ECharts单文件引入 -->
<script src="http://echarts.baidu.com/build/dist/echarts.js"></script>


<div style="height: 40px ; width: 100%;background-color: antiquewhite">
   <div class="text" style="height: 40px;width: 14% ;float: left ;text-align-all: center;background-color: rgba(240, 255, 255, 0.5);" >
       <span>浏览次数（PV）</span><br>
       <span>881</span>
   </div>
    <div class="text" style="height: 40px;width: 14% ;float: left;text-align-all: center;background-color: rgba(240, 255, 255, 0.5);" >
        <span>独立访客数（UV）</span><br>
        <span>546</span>
    </div>
    <div class="text" style="height: 40px;width: 14% ;float: left;text-align-all: center;background-color: rgba(240, 255, 255, 0.5);" >
        <span>IP</span><br>
        <span>546</span>
    </div>
    <div class="text" style="height: 40px;width: 14% ;float: left;text-align-all: center;background-color: rgba(240, 255, 255, 0.5);" >
        <span>新独立访客数</span><br>
        <span>479</span>
    </div>
    <div class="text" style="height: 40px;width: 14% ;float: left;text-align-all: center;background-color: rgba(240, 255, 255, 0.5);" >
        <span>访问次数</span><br>
        <span>681</span>
    </div>
    <div class="text" style="height: 40px;width: 14% ;float: left;text-align-all: center;background-color: rgba(240, 255, 255, 0.5);" >
        <span>人均浏览页数</span><br>
        <span>1.61</span>
    </div>
    <div class="text" style="height: 40px;width: 14% ;float: left;text-align-all: center;background-color: rgba(240, 255, 255, 0.5);" >
        <span>平均访问深度</span><br>
        <span>1.29</span>
    </div>
</div>

<div style="height: 470px ; width: 100%;background-color: antiquewhite">
    <div id="main" style="height:470px;width: 50% ;float: left"></div>
    <div id="main1" style="height:470px;width: 50%; float: right"  ></div>
</div>

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
            var myChart = ec.init(document.getElementById('main'),'vintage');

            option = {
                title : {
                    text: '浏览器占比变化',
                    subtext: '数据来源占比',
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
                            name:'浏览器（数据来源占比）',
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
            var myChart = ec.init(document.getElementById('main1'),'vintage');

            option = {
                title : {
                    text: '某网站会员量和游客量',
                    subtext: '小红书'
                },
                tooltip : {
                    trigger: 'axis'
                },
                legend: {
                    data:['会员量','游客量']
                },
                toolbox: {
                    show : true,
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false},
                        magicType : {show: true, type: ['line', 'bar']},
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : true,
                xAxis : [
                    {
                        type : 'category',
                        data : ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'会员量',
                        type:'bar',
                        data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3],
                        markPoint : {
                            data : [
                                {type : 'max', name: '最大值'},
                                {type : 'min', name: '最小值'}
                            ]
                        },
                        markLine : {
                            data : [
                                {type : 'average', name: '平均值'}
                            ]
                        }
                    },
                    {
                        name:'游客量',
                        type:'bar',
                        data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3],
                        markPoint : {
                            data : [
                                {name : '年最高', value : 182.2, xAxis: 7, yAxis: 183, symbolSize:18},
                                {name : '年最低', value : 2.3, xAxis: 11, yAxis: 3}
                            ]
                        },
                        markLine : {
                            data : [
                                {type : 'average', name : '平均值'}
                            ]
                        }
                    }
                ]
            };

            // 为echarts对象加载数据
            myChart.setOption(option);
        }
    );
</script>

<div style="height: 470px ; width: 100%;background-color: antiquewhite">
    <div id="main2" style="height:470px;width: 50% ;float: left"></div>
    <div id="main3" style="height:470px;width: 50%; float: right"  ></div>
</div>

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
            'echarts/chart/chord',
            'echarts/chart/funnel',
            'echarts/chart/map'

        ],
        function (ec) {
            // 基于准备好的dom，初始化echarts图表
            var myChart = ec.init(document.getElementById('main2'),'vintage');

            option = {
                color : [
                    'rgba(255, 69, 0, 0.5)',
                    'rgba(255, 150, 0, 0.5)',
                    'rgba(255, 200, 0, 0.5)',
                    'rgba(155, 200, 50, 0.5)',
                    'rgba(55, 200, 100, 0.5)'
                ],
                title : {
                    text: '漏斗图',
                    subtext: '纯属虚构'
                },
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c}%"
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
                legend: {
                    data : ['展现','点击','访问','咨询','订单']
                },
                calculable : true,
                series : [
                    {
                        name:'预期',
                        type:'funnel',
                        x: '10%',
                        width: '80%',
                        itemStyle: {
                            normal: {
                                label: {
                                    formatter: '{b}预期'
                                },
                                labelLine: {
                                    show : false
                                }
                            },
                            emphasis: {
                                label: {
                                    position:'inside',
                                    formatter: '{b}预期 : {c}%'
                                }
                            }
                        },
                        data:[
                            {value:60, name:'访问'},
                            {value:40, name:'咨询'},
                            {value:20, name:'订单'},
                            {value:80, name:'点击'},
                            {value:100, name:'展现'}
                        ]
                    },
                    {
                        name:'实际',
                        type:'funnel',
                        x: '10%',
                        width: '80%',
                        maxSize: '80%',
                        itemStyle: {
                            normal: {
                                borderColor: '#fff',
                                borderWidth: 2,
                                label: {
                                    position: 'inside',
                                    formatter: '{c}%',
                                    textStyle: {
                                        color: '#fff'
                                    }
                                }
                            },
                            emphasis: {
                                label: {
                                    position:'inside',
                                    formatter: '{b}实际 : {c}%'
                                }
                            }
                        },
                        data:[
                            {value:30, name:'访问'},
                            {value:10, name:'咨询'},
                            {value:5, name:'订单'},
                            {value:50, name:'点击'},
                            {value:80, name:'展现'}
                        ]
                    }
                ]
            };


            // 为echarts对象加载数据

            myChart.setOption(option);
        }
    );
</script>
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
            'echarts/chart/chord',
            'echarts/chart/funnel',
            'echarts/chart/map'

        ],
        function (ec) {
            // 基于准备好的dom，初始化echarts图表
            var myChart = ec.init(document.getElementById('main3'),'vintage');

            option = {
                title : {
                    text: '2011全国用户分布（人数）',
                    subtext: '数据来自国家统计局'
                },
                tooltip : {
                    trigger: 'item'
                },
                legend: {
                    x:'right',
                    selectedMode:false,
                    data:['北京','上海','广东']
                },
                dataRange: {
                    orient: 'horizontal',
                    min: 0,
                    max: 55000,
                    text:['高','低'],           // 文本，默认为数值文本
                    splitNumber:0
                },
                toolbox: {
                    show : true,
                    orient: 'vertical',
                    x:'right',
                    y:'center',
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false}
                    }
                },
                series : [
                    {
                        name: '2011全国用户分布',
                        type: 'map',
                        mapType: 'china',
                        mapLocation: {
                            x: 'left'
                        },
                        selectedMode : 'multiple',
                        itemStyle:{
                            normal:{label:{show:true}},
                            emphasis:{label:{show:true}}
                        },
                        data:[
                            {name:'西藏', value:605.83},
                            {name:'青海', value:1670.44},
                            {name:'宁夏', value:2102.21},
                            {name:'海南', value:2522.66},
                            {name:'甘肃', value:5020.37},
                            {name:'贵州', value:5701.84},
                            {name:'新疆', value:6610.05},
                            {name:'云南', value:8893.12},
                            {name:'重庆', value:10011.37},
                            {name:'吉林', value:10568.83},
                            {name:'山西', value:11237.55},
                            {name:'天津', value:11307.28},
                            {name:'江西', value:11702.82},
                            {name:'广西', value:11720.87},
                            {name:'陕西', value:12512.3},
                            {name:'黑龙江', value:12582},
                            {name:'内蒙古', value:14359.88},
                            {name:'安徽', value:15300.65},
                            {name:'北京', value:16251.93, selected:true},
                            {name:'福建', value:17560.18},
                            {name:'上海', value:19195.69, selected:true},
                            {name:'湖北', value:19632.26},
                            {name:'湖南', value:19669.56},
                            {name:'四川', value:21026.68},
                            {name:'辽宁', value:22226.7},
                            {name:'河北', value:24515.76},
                            {name:'河南', value:26931.03},
                            {name:'浙江', value:32318.85},
                            {name:'山东', value:45361.85},
                            {name:'江苏', value:49110.27},
                            {name:'广东', value:53210.28, selected:true}
                        ]
                    },
                    {
                        name:'2011全国用户对比',
                        type:'pie',
                        roseType : 'area',
                        tooltip: {
                            trigger: 'item',
                            formatter: "{a} <br/>{b} : {c} ({d}%)"
                        },
                        center: [document.getElementById('main').offsetWidth - 250, 225],
                        radius: [30, 120],
                        data:[
                            {name: '北京', value: 16251.93},
                            {name: '上海', value: 19195.69},
                            {name: '广东', value: 53210.28}
                        ]
                    }
                ],
                animation: false
            };
            var ecConfig = require('echarts/config');
            myChart.on(ecConfig.EVENT.MAP_SELECTED, function (param){
                var selected = param.selected;
                var mapSeries = option.series[0];
                var data = [];
                var legendData = [];
                var name;
                for (var p = 0, len = mapSeries.data.length; p < len; p++) {
                    name = mapSeries.data[p].name;
                    //mapSeries.data[p].selected = selected[name];
                    if (selected[name]) {
                        data.push({
                            name: name,
                            value: mapSeries.data[p].value
                        });
                        legendData.push(name);
                    }
                }
                option.legend.data = legendData;
                option.series[1].data = data;
                myChart.setOption(option, true);
            })




            // 为echarts对象加载数据

            myChart.setOption(option);
        }
    );
</script>





</body>
</html>
