<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>批量修改Visits信息</title>

	<script type="text/javascript">
        function updateAllVisitsPost(){
            document.VisitsForm.action = "${pageContext.request.contextPath }/visits/updateAllVisitsPost.do";
            document.VisitsForm.submit();
        }
	</script>

</head>

<body>
<form name="VisitsForm" action="" method="post">
	<a href="${pageContext.request.contextPath }/visits/getAllVisits.do" name="返回visits列表" >返回visits列表</a>
	<table width="90%" border="1px" align="center">
		<tr>
			<td><input type="button" value="批量修改" onclick="updateAllVisitsPost()" /></td>
		</tr>
	</table>

	<table width="90%" border="1px" align="center">
		<tr>
			<td>session</td>
			<td>remote_addr</td>
			<td>inTime</td>
			<td>outTime</td>
			<td>inPage</td>
			<td>outPage</td>
			<td>referal</td>
			<td>pageVisits</td>
		</tr>

		<c:forEach items="${visitsList}" var="visits" varStatus="status">
			<tr>
				<td><input name="visitsList[${status.index}].session" value="${visits.session }"></td>
				<td><input name="visitsList[${status.index}].remote_addr" type="text" value="${visits.remote_addr }"></td>
				<td><input name="visitsList[${status.index}].inTime" type="text" value="${visits.inTime }"></td>
				<td><input name="visitsList[${status.index}].outTime" type="text" value="${visits.outTime }"></td>
				<td><input name="visitsList[${status.index}].inPage" type="text" value="${visits.inPage }"></td>
				<td><input name="visitsList[${status.index}].outPage" type="text" value="${visits.outPage }"></td>
				<td><input name="visitsList[${status.index}].referal" type="text" value="${visits.referal }"></td>
				<td><input name="visitsList[${status.index}].pageVisits" type="text" value="${visits.pageVisits }"></td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>