<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pageviews信息详情</title>
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
	<table width="90%" class="gridtable" border=1 align="center">
		<tr>
			<td>Session</td>
			<td>${pageviews.session }</td>
		</tr>
		<tr>
			<td>key1</td>
			<td>${pageviews.key1 }</td>
		</tr>
		<tr>
			<td>Remote_addr</td>
			<td>${pageviews.remote_addr }</td>
		</tr>
		<tr>
			<td>Timestr</td>
			<td>${pageviews.timestr }</td>
		</tr>
		<tr>
			<td>Tequest</td>
			<td>${pageviews.tequest }</td>
		</tr>
		<tr>
			<td>Step</td>
			<td>${pageviews.step }</td>
		</tr>
		<tr>
			<td>Staylong</td>
			<td>${pageviews.staylong }</td>
		</tr>
		<tr>
			<td>Referal</td>
			<td>${pageviews.referal }</td>
		</tr>
		<tr>
			<td>Useragent</td>
			<td>${pageviews.useragent }</td>
		</tr>
		<tr>
			<td>Bytes_send</td>
			<td>${pageviews.bytes_send }</td>
		</tr>
		<tr>
			<td>Status</td>
			<td>${pageviews.status }</td>
		</tr>

	</table>
</body>
</html>