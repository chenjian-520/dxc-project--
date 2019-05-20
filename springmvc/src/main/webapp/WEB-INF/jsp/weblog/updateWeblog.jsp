<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>修改weblog信息</title>

</head>
<body>
<a href="${pageContext.request.contextPath }/weblog/getAllWeblog.do" name="返回weblog列表" >返回weblog列表</a>
<form id="itemForm" action="${pageContext.request.contextPath }/weblog/updateAllWeblogPost.do" method="post">
	<input type="hidden" name="id" value="${weblogList[0].remote_addr }" /> 修改visits信息：
	<table width="90%" border=1 align="center">
		<c:forEach items="${weblogList}" var="weblog" varStatus="status">
			<tr>
				<td><input name="weblogList[${status.index}].valid" value="${weblog.valid }"></td>
				<td><input name="weblogList[${status.index}].remote_addr" type="text" value="${weblog.remote_addr }"></td>
				<td><input name="weblogList[${status.index}].remote_user" type="text" value="${weblog.remote_user }"></td>
				<td><input name="weblogList[${status.index}].time_local" type="text" value="${weblog.time_local }"></td>
				<td><input name="weblogList[${status.index}].request" type="text" value="${weblog.request }"></td>
				<td><input name="weblogList[${status.index}].status" type="text" value="${weblog.status }"></td>
				<td><input name="weblogList[${status.index}].body_bytes_sent" type="text" value="${weblog.body_bytes_sent }"></td>
				<td><input name="weblogList[${status.index}].http_referer" type="text" value="${weblog.http_referer }"></td>
				<td><input name="weblogList[${status.index}].http_user_agent" type="text" value="${weblog.http_user_agent }"></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="提交" /></td>
		</tr>
	</table>
</form>
</body>
</html>