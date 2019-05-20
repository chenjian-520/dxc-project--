<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息登录</title>
    <link rel="stylesheet" type="text/css" href="static/login.css"/>
    <script type="text/javascript" src="static/login.js"></script>
</head>

<body>


<div id="login_frame">
    <p style="color: #3BD9FF">输入你的信息登录操作界面</p>
    <p id="image_logo"><img src="static/huaxia.jpg" style="width: 96px;height: 70px"></p>

    <form action="<%=request.getContextPath()%>/student/user.do" method="post">

        <p><label class="label_input"><img src="static/person2.png" id="image_logo1" style="width: 28px;height: 24px"></label><input type="text" id="id" name="id" class="text_field" placeholder="id"/></p>
        <p><label class="label_input"><img src="static/person2.png" id="image_logo2" style="width: 28px;height: 24px"></label><input type="text" id="name" name="name" class="text_field" placeholder="name"/></p>
        <p><label class="label_input"><img src="static/person2.png" id="image_logo4" style="width: 28px;height: 24px"></label><input type="text" id="sex" name="sex" class="text_field" placeholder="sex"/></p>
        <p><label class="label_input"><img src="static/person2.png" id="image_logo5" style="width: 28px;height: 24px"></label><input type="text" id="age" name="age" class="text_field" placeholder="age"/></p>
        <div id="login_control">
            <input id="btn_login2" type="Submit" value="Submit" >
            <a id="forget_pwd" href="${pageContext.request.contextPath}/student/insertStudent.do">忘记密码？</a>
            <a href="${pageContext.request.contextPath}/student/insertStudent.do"><input type="button" name="11" id="btn_login1" value="注册信息"></a>
        </div>

    </form>
</div>

</body>



</html>