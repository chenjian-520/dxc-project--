<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有用户！</title>
</head>

<body>
   <table border="3" width="300px">
   	<tr>
   		<td>uid</td>
   		<td>uname</td>
   		<td>password</td>
   	</tr>
   	<c:forEach items="${user123}" var="user">
   			<tr>
		   		<td>${user.uid }</td>
		   		<td>${user.uname }</td>
		   		<td>${user.password }</td>
   			</tr>
   	</c:forEach>
   </table>
</body>
</html>