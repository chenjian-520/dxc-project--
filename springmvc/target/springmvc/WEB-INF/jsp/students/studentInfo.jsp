<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生详情</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/student/getAllStudents.do" name="返回学生列表" >返回学生列表</a>
	<table width="90%" border=1 align="center">
		<tr>
			<td>name</td>
			<td>${student.name }</td>
		</tr>
		<tr>
			<td>sex</td>
			<td>${student.sex }</td>
		</tr>
		<tr>
			<td>age</td>
			<td>${student.age }</td>
		</tr>
		<tr>
			<td>department</td>
			<td>${student.department }</td>
		</tr>
	</table>
</body>
</html>