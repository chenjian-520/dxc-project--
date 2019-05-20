<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>学生信息登录</title>
        <link rel="stylesheet" type="text/css" href="/WEB-INF/static/css/test.css" />
    </head>

    <body>
        <p>输入你的信息登录操作界面</p>

        <div style="color:#00FF00;background-color:#eeeeee ;width: 500px ; text-align:center;margin-left: 20%;margin-top: 200px">
            <form action="<%=request.getContextPath()%>/student/user.do" method="post" id="form1">
                id :<br>
                <input type="text" name="id"  id="id" ><br>
                name :<br>
                <input type="text" name="name"  id="name" ><br>
                sex :<br>
                <input type="text" name="sex"  id="sex" ><br>
                age :<br>
                <input type="text" name="age"  id="age" >
                <br><br>
                <input type="Submit" value="Submit">
            </form>
            <td><a href="${pageContext.request.contextPath}/student/insertStudent.do"><input type="button" name="11" value="注册学生信息"></a></td>
        </div>


    </body>



</html>