<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册student信息详情</title>
    <script type="text/javascript">
        function check() {
            var name = document.getElementsByName("name");
            var sex = document.getElementsByName("sex");
            var age = document.getElementsByName("age");
            var department = document.getElementsByName("department");
            if (name == ""||sex==""||age==""||department==""){
                alert("输入框不能为空！！！")
                return false;
            }
        }
    </script>
</head>

<body>
<form id="itemForm" action="${pageContext.request.contextPath }/student/insertStudent.do" method="post">
    <a href="${pageContext.request.contextPath }/student/getAllStudents.do" name="返回学生列表" onsubmit="return check()" >返回学生列表</a>
    <table width="90%" border=1 align="center">
        <tr>
            <td>给student录入信息</td>
        </tr>
        <tr>
            <td>name</td>
            <td><input name="name" type="text" value=""></td>
        </tr>
        <tr>
            <td>sex</td>
            <td><input name="sex" type="text" value=""></td>
        </tr>
        <tr>
            <td>age</td>
            <td><input name="age" type="text" value=""></td>
        </tr>
        <tr>
            <td>department</td>
            <td><input name="department" type="text" value=""></td>
        </tr>
    </table>
    <tr>
        <td colspan="2" align="center"><input type="submit" value="提交" /></td>
    </tr>
</form>
</body>
</html>