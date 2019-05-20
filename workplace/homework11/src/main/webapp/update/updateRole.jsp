<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改role信息</title>

</head>
<body>

	<form id="itemForm" action="${pageContext.request.contextPath }/Menu/updateRole" method="post">
		<input type="hidden" name="rid" value="${select_Role.rid }" /> 修改学生信息：
		<table width="90%" border=1 align="center">
			<tr>
				<td>rolename</td>
				<td><input type="text" name="rolename" value="${select_Role.rolename }" /></td>
			</tr>
			<tr>
				<td>level_1</td>
				<td><input type="text" name="level_1" value="${select_Role.level_1 }" /></td>
			</tr>
			<tr>
				<td>uid</td>
				<td><input type="text" name="uid" value="${select_Role.uid }" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>