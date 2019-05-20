<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>修改visits信息</title>

</head>
<body>

<form id="itemForm" action="${pageContext.request.contextPath }/visits/updateVisits.do" method="post">
	<a href="${pageContext.request.contextPath }/visits/getAllVisits.do" name="返回visits列表" >返回visits列表</a>
	<input type="hidden" name="id" value="${visits.session }" /> 修改visits信息：
	<table width="90%" border=1 align="center">
		<tr>
			<td>session</td>
			<td><input type="text" name="session" value="${visits.session }" /></td>
		</tr>
		<tr>
			<td>remote_addr</td>
			<td><input type="text" name="remote_addr" value="${visits.remote_addr }" /></td>
		</tr>
		<tr>
			<td>inTime</td>
			<td><input type="text" name="inTime" value="${visits.inTime }" /></td>
		</tr>
		<tr>
			<td>outTime</td>
			<td><input type="text" name="outTime" value="${visits.outTime }" /></td>
		</tr>
		<tr>
			<td>inPage</td>
			<td><input type="text" name="inPage" value="${visits.inPage }" /></td>
		</tr>
		<tr>
			<td>outPage</td>
			<td><input type="text" name="outPage" value="${visits.outPage }" /></td>
		</tr>
		<tr>
			<td>referal</td>
			<td><input type="text" name="referal" value="${visits.referal }" /></td>
		</tr>
		<tr>
			<td>pageVisits</td>
			<td><input type="text" name="pageVisits" value="${visits.pageVisits }" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="提交" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>