<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Index</title>
        <link rel="stylesheet" type="text/css" href="/WEB-INF/static/css/test.css" />
    </head>

    <body>
        <p>hello world</p>
    </body>


    <textarea name="哈哈" id="hh" cols="30" rows="10"></textarea>

    <a href="${pageContext.request.contextPath }/student/getAllStudents.do" name="学生列表" >学生列表</a>

    <a href="${pageContext.request.contextPath }/student/getAllStudents.do">学生列表</a>


    <a href="${pageContext.request.contextPath }/echarts/index.do">Echarts测试页面</a>

    <a href="${pageContext.request.contextPath }/echarts/groupAge.do">学生分组测试页面</a>

</html>