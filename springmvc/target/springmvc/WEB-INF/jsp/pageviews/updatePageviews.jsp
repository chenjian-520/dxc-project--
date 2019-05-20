<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改pageviews信息</title>
	<style type="text/css">
		table.gridtable {
			font-family: verdana,arial,sans-serif;
			font-size:11px;
			color:#333333;
			border-width: 1px;
			border-color: #666666;
			border-collapse: collapse;
		}
		table.gridtable th {
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #666666;
			background:#b5cfd2 ;
		}
		table.gridtable td {
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #666666;
			background:#dcddc0 ;

		}
	</style>

</head>
<body>
<a href="${pageContext.request.contextPath }/pageviews/getAllPageviews.do" name="返回pageviews列表" >返回pageviews列表</a>
	<form id="itemForm" action="${pageContext.request.contextPath }/pageviews/updatePageviews.do" method="post">
		<input type="hidden" name="id" value="${pageviews.session }" /> 修改Pageviews信息：
		<table width="90%" class="gridtable" border=1 align="center">
			<tr>
				<td>Session</td>
				<td><input type="text" name="session" value="${pageviews.session }" /></td>
			</tr>
			<tr>
				<td>key1</td>
				<td><input type="text" name="key1" value="${pageviews.key1 }" /></td>
			</tr>
			<tr>
				<td>Remote_addr</td>
				<td><input type="text" name="remote_addr" value="${pageviews.remote_addr }" /></td>
			</tr>
			<tr>
				<td>Timestr</td>
				<td><input type="text" name="timestr" value="${pageviews.timestr }" /></td>
			</tr>
			<tr>
				<td>Tequest</td>
				<td><input type="text" name="tequest" value="${pageviews.tequest }" /></td>
			</tr>
			<tr>
				<td>Step</td>
				<td><input type="text" name="step" value="${pageviews.step }" /></td>
			</tr>
			<tr>
				<td>Staylong</td>
				<td><input type="text" name="staylong" value="${pageviews.staylong }" /></td>
			</tr>
			<tr>
				<td>Referal</td>
				<td><input type="text" name="referal" value="${pageviews.referal }" /></td>
			</tr>
			<tr>
				<td>Useragent</td>
				<td><input type="text" name="useragent" value="${pageviews.useragent }" /></td>
			</tr>
			<tr>
				<td>Bytes_send</td>
				<td><input type="text" name="bytes_send" value="${pageviews.bytes_send }" /></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><input type="text" name="status" value="${pageviews.status }" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>