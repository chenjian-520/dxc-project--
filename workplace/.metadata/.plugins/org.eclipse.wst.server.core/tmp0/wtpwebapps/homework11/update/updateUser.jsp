<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改user信息</title>

</head>
<body>

	<form id="itemForm" action="${pageContext.request.contextPath }/Menu/updateUser" method="post">
		<input type="hidden" name="uid" value="${select_users.uid }" /> 修改学生信息：
		<table width="90%" border=1 align="center">
			<tr>
				<td>username</td>
				<td><input type="text" name="username" value="${select_users.username }" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="password" value="${select_users.password }" /></td>
			</tr>
		
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>