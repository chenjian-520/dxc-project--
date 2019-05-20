<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改Menu信息</title>

</head>
<body>

	<form id="itemForm" action="${pageContext.request.contextPath }/users/insertMenu" method="post">
		 修改学生信息：
		<table width="90%" border=1 align="center">
			<tr>
				<td>id</td>
				<td><input type="text" name="id" value="" /></td>
			</tr>
			<tr>
				<td>m_1</td>
				<td><input type="text" name="m_1" value="" /></td>
			</tr>
			<tr>
				<td>m_2</td>
				<td><input type="text" name="m_2" value="" /></td>
			</tr>
			<tr>
				<td>m_3</td>
				<td><input type="text" name="m_3" value="" /></td>
			</tr>
			<tr>
				<td>m_4</td>
				<td><input type="text" name="m_4" value="" /></td>
			</tr>
			<tr>
				<td>m_5</td>
				<td><input type="text" name="m_5" value="" /></td>
			</tr>
			<tr>
				<td>m_6</td>
				<td><input type="text" name="m_6" value="" /></td>
			</tr>
			<tr>
				<td>m_7</td>
				<td><input type="text" name="m_7" value="" /></td>
			</tr>
			<tr>
				<td>m_8</td>
				<td><input type="text" name="m_8" value="" /></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>