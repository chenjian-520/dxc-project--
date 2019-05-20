<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改学生信息</title>

</head>
<body>

	<form id="itemForm" action="${pageContext.request.contextPath }/student/updateStudent.do" method="post">
		<input type="hidden" name="id" value="${student.id }" /> 修改学生信息：
		<table width="90%" border=1 align="center">
			<tr>
				<td>name</td>
				<td><input type="text" name="name" value="${student.name }" /></td>
			</tr>
			<tr>
				<td>sex</td>
				<td><input type="text" name="sex" value="${student.sex }" /></td>
			</tr>
			<tr>
				<td>age</td>
				<td><input type="text" name="age" value="${student.age }" /></td>
			</tr>
			<tr>
				<td>department</td>
				<td><input type="text" name="department" value="${student.department }" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>