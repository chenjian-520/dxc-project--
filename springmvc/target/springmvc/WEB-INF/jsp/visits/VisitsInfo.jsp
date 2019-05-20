<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>visits信息详情</title>
</head>

<body>
<table width="90%" border=1 align="center">
	<a href="${pageContext.request.contextPath }/visits/getAllVisits.do" name="返回visits列表" >返回visits列表</a>
	<tr>
		<td>session</td>
		<td>${visits.session }</td>
	</tr>
	<tr>
		<td>remote_addr</td>
		<td>${visits.remote_addr }</td>
	</tr>
	<tr>
		<td>intime</td>
		<td>${visits.inTime }</td>
	</tr>
	<tr>
		<td>outtime</td>
		<td>${visits.outTime }</td>
	</tr>
	<tr>
		<td>inpage</td>
		<td>${visits.inPage }</td>
	</tr>
	<tr>
		<td>outpage</td>
		<td>${visits.outPage }</td>
	</tr>
	<tr>
		<td>referal</td>
		<td>${visits.referal }</td>
	</tr>
	<tr>
		<td>pagevisits</td>
		<td>${visits.pagevisits }</td>
	</tr>

</table>
</body>
</html>