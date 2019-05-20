<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>批量修改学生信息</title>

<script type="text/javascript">
	function updateAllStudentsPost(){
		document.studentForm.action = "${pageContext.request.contextPath }/student/updateAllStudentsPost.do";
		document.studentForm.submit();
	}
</script>

</head>
<body>
	<form name="studentForm" action="" method="post">
		<a href="${pageContext.request.contextPath }/student/getAllStudents.do" name="返回学生列表" >返回学生列表</a>
		<table width="90%" border="1px" align="center">
			<tr>
				<td><input type="button" value="批量修改" onclick="updateAllStudentsPost()" /></td>
			</tr>
		</table>

		<table width="90%" border="1px" align="center">
			<tr>
				<td>ID</td>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td>部门</td>
			</tr>
			<c:forEach items="${studentList}" var="student" varStatus="status">
				<tr>
					<td><input name="studentList[${status.index}].id" value="${student.id }"></td>
					<td><input name="studentList[${status.index}].name" type="text" value="${student.name }"></td>
					<td><input name="studentList[${status.index}].sex" type="text" value="${student.sex }"></td>
					<td><input name="studentList[${status.index}].age" type="text" value="${student.age }"></td>
					<td><input name="studentList[${status.index}].department" type="text" value="${student.department }"></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>