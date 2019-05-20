<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>weblog信息详情</title>
</head>

<body>
<a href="${pageContext.request.contextPath }/weblog/getAllWeblog.do" name="返回weblog列表" >返回weblog列表</a>
<table width="90%" border=1 align="center">
	<c:forEach items="${weblogList}" var="weblog" varStatus="status">
	<tr>
		<td>valid</td>
		<td>${weblog.valid }</td>
	</tr>
	<tr>
		<td>remote_addr</td>
		<td>${weblog.remote_addr }</td>
	</tr>
	<tr>
		<td>remote_user</td>
		<td>${weblog.remote_user }</td>
	</tr>
	<tr>
		<td>time_local</td>
		<td>${weblog.time_local }</td>
	</tr>
	<tr>
		<td>request</td>
		<td>${weblog.request }</td>
	</tr>
	<tr>
		<td>status</td>
		<td>${weblog.status }</td>
	</tr>
	<tr>
		<td>body_bytes_sent</td>
		<td>${weblog.body_bytes_sent }</td>
	</tr>
	<tr>
		<td>http_referer</td>
		<td>${weblog.http_referer }</td>
	</tr>
	<tr>
		<td>http_user_agent</td>
		<td>${weblog.http_user_agent }</td>
	</tr>
	<tr><td>第${status.index+1}次访问信息</td>
		<td></td>
	</tr>
	</c:forEach>




</table>
</body>
</html>