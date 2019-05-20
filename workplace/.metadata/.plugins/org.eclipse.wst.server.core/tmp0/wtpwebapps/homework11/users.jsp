<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有用户！</title>
</head>
欢迎你：<br>
${role}
<body>
    <br/>
    <span>角色管理表</span>
	   <table width="90%" border="1px" align="center">
   	<tr>
   		<td></td>
   		<td>uid</td>
   		<td>username</td>
   		<td>password</td>
   		<c:if test="${role.level_1>=2}">
   		<td>操作</td>
   		</c:if>
   	</tr>
   	<c:forEach items="${user123}" var="user">		
   			   <tr>
                <td>
                    <input type="checkbox" name="user_uid" value="${user.uid }">
                </td>
                <td>${user.uid }</td>
                <td>${user.username }</td>
                <td>${user.password }</td>
                <c:if test="${role.level_1>=2}">
                <td>
                    <a href="${pageContext.request.contextPath }/Menu/updateUser?id=${user.uid}">修改</a>
                     <c:if test="${role.level_1>=3}">
                    <a href="${pageContext.request.contextPath }/Menu/deleteUser?id=${user.uid}">删除</a>
                	</c:if>
                </td>
                </c:if>
            </tr>
   	</c:forEach>
   </table>
</body>
</html>