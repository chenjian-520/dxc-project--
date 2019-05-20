<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <style type="text/css">
        body{
    background-image: url("/static/index.jpg");
    background-size: 100%;
    background-repeat: no-repeat;
    font-family: 'Microsoft YaHei UI';
    }
        #login_frame {
            width: 400px;
            height: 360px;
            padding: 13px;

            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -200px;
            margin-top: -200px;

            background-color: rgba(240, 255, 255, 0.5);

            border-radius: 10px;
            text-align: center;
        }
    </style>
</head>

<body>
<div id="login_frame">
<p>欢迎 ${student} 的到来!!</p>



<textarea name="哈哈" id="hh" cols="30" rows="10"></textarea> <br>

<a href="${pageContext.request.contextPath }/student/updateLoadFile.do" name="上传学生照片" >上传学生照片</a><br>

<a href="${pageContext.request.contextPath }/student/getAllStudents.do" name="学生列表" >学生列表</a><br>

<a href="${pageContext.request.contextPath }/echarts/index.do">Echarts测试页面</a><br>

<a href="${pageContext.request.contextPath }/echarts/groupAge.do">学生分组Echarts页面</a><br>

<a href="${pageContext.request.contextPath }/pageviews/getAllPageviews.do" name="pageviews列表" >pageviews列表</a><br>

<a href="${pageContext.request.contextPath }/visits/getAllVisits.do" name="visits列表" >visits列表</a><br>

<a href="${pageContext.request.contextPath }/weblog/getAllWeblog.do" name="weblog列表" >weblog列表</a><br>

<a href="${pageContext.request.contextPath }/echarts/echarts.do" name="weblog列表" >用户行为分析页面</a><br>

</div>


</body>

</html>