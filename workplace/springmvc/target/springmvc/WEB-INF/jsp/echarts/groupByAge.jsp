<%--
  Created by IntelliJ IDEA.
  User: mazhonghua
  Date: 2018/11/18
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>学生按照年龄分组统计</title>
    </head>
    <body>
        <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
        <div id="groupByAgeMain" style="height:600px"></div>

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
                    var myChart = ec.init(document.getElementById('groupByAgeMain'));

                    var ages = ${ages};
                    var counts = ${counts};


                    var option = {
                        tooltip: {
                            show: true
                        },
                        legend: {
                            data:['销量']
                        },
                        xAxis : [
                            {
                                type : 'category',
                                data : ages
                            }
                        ],
                        yAxis : [
                            {
                                type : 'value'
                            }
                        ],
                        series : [
                            {
                                "name":"该年龄学生数：",
                                "type":"line",
                                "data": counts
                            }
                        ]
                    };


                    // 为echarts对象加载数据
                    myChart.setOption(option);
                }
            )
        </script>

    </body>
</html>
