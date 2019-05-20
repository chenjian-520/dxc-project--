<%@page import="com.hp.servlet.ServletWork"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录页面</title>
</head>
<body>
	<div style="color:#00FF00;background-color:#000000 ;width: 500px ; text-align:center;margin-left: 20%;margin-top: 200px">
		<form action="<%=request.getContextPath()%>/ServletWork" method="post" id="form1">
		username :<br>
		<input type="text" name="username"  id="username" ><br>
		password :<br>
		<input type="password" name="password"  id="password" >
		<br><br>
		<input type="Submit" value="Submit">
		</form> 
	</div>
</body>
</html>