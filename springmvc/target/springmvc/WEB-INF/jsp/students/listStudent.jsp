<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询学生列表</title>

    <script type="text/javascript">
        function deleteCheckStudents() {
            document.studentForm.action = "${pageContext.request.contextPath }/student/deleteCheckStudents.do";
            document.studentForm.submit();
        }

        function getAllStudents() {
            document.studentForm.action = "${pageContext.request.contextPath }/student/getAllStudentsWhere.do";
            document.studentForm.submit();
        }

        function updateAllStudents() {
            document.studentForm.action = "${pageContext.request.contextPath }/student/updateAllStudents.do";
            document.studentForm.submit();
        }
    </script>

</head>
<body>
<form name="studentForm" action="" method="post">
    <input name="birthday" type="hidden" value="2012-12-12 14:14:14">
    <table width="90%" border="1px" align="center">
        <tr>
            <td><input type="button" value="删除选中" onclick="deleteCheckStudents()"></td>
            <td><input type="button" value="查询" onclick="getAllStudents()"/></td>
            <td><input type="button" value="批量修改" onclick="updateAllStudents()"/></td>
            <td>姓名<input type="text" name="name" value=""/></td>
            <td>性别<input type="text" name="sex" value=""/></td>
            <td>年龄<input type="text" name="age" value="0"/></td>
            <td>部门<input type="text" name="department" value=""/></td>
        </tr>
    </table>

    <br/>

    <table width="90%" border="1px" align="center">
        <tr>
            <td></td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>部门</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${studentList}" var="student">
            <tr>
                <td>
                    <input type="checkbox" name="student_ids" value="${student.id }">
                </td>
                <td>
                    <a href="${pageContext.request.contextPath }/student/getOneStudent.do?id=${student.id}">${student.name }</a>
                </td>
                <td>${student.sex }</td>
                <td>${student.age }</td>
                <td>${student.department }</td>
                <td>
                    <a href="${pageContext.request.contextPath }/student/updateStudent.do?id=${student.id}">修改</a>
                    <a href="${pageContext.request.contextPath }/student/deleteStudent.do?id=${student.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>