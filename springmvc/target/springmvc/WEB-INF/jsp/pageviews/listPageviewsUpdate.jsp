<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>批量修改Pageviews信息</title>

<script type="text/javascript">
	function updateAllPageviewsPost(){
		document.PageviewsForm.action = "${pageContext.request.contextPath }/pageviews/updateAllPageviewsPost.do";
		document.PageviewsForm.submit();
	}
</script>
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
	<form name="PageviewsForm" action="" method="post">
		<table width="90%" class="gridtable" border="1px" align="center">
			<tr>
				<td><input type="button" value="批量修改" onclick="updateAllPageviewsPost()" /></td>
			</tr>
		</table>

		<table width="90%" border="1px" align="center">
			<tr>
				<td>Session</td>
				<td>key1</td>
				<td>Remote_addr</td>
				<td>Timestr</td>
				<td>Tequest</td>
				<td>Step</td>
				<td>Staylong</td>
				<td>Referal</td>
				<td>Useragent</td>
				<td>Bytes_send</td>
				<td>Status</td>
			</tr>

			<c:forEach items="${pageviewsList}" var="pageviews" varStatus="status">
				<tr>
					<td><input name="pageviewsList[${status.index}].session" value="${pageviews.session }"></td>
					<td><input name="pageviewsList[${status.index}].key1" type="text" value="${pageviews.key1 }"></td>
					<td><input name="pageviewsList[${status.index}].remote_addr" type="text" value="${pageviews.remote_addr }"></td>
					<td><input name="pageviewsList[${status.index}].timestr" type="text" value="${pageviews.timestr }"></td>
					<td><input name="pageviewsList[${status.index}].tequest" type="text" value="${pageviews.tequest }"></td>
					<td><input name="pageviewsList[${status.index}].step" type="text" value="${pageviews.step }"></td>
					<td><input name="pageviewsList[${status.index}].staylong" type="text" value="${pageviews.staylong }"></td>
					<td><input name="pageviewsList[${status.index}].referal" type="text" value="${pageviews.referal }"></td>
					<td><input name="pageviewsList[${status.index}].useragent" type="text" value="${pageviews.useragent }"></td>
					<td><input name="pageviewsList[${status.index}].bytes_send" type="text" value="${pageviews.bytes_send }"></td>
					<td><input name="pageviewsList[${status.index}].status" type="text" value="${pageviews.status }"></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>