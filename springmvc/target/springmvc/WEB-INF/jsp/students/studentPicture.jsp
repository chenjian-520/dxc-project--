<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生详情</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/student/getAllStudents.do" name="返回学生列表" >返回学生列表</a>
	<form name="uploadForm" action="${pageContext.request.contextPath }/student/uploadPicture.do"
		method="post" enctype="multipart/form-data">
		<input type="submit" value="上传图片">
		<table>
			<tr>
				<td>图片</td>
				<td>
					<img src="${pageContext.request.contextPath }/${newFileName2}"
					 width="900px" height="600px" alt="fsdfsdfsdf"/>
					<input type="file" name="pictureFile" />
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>