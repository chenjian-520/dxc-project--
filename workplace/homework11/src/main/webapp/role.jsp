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
  <br>
    <span>用户管理表</span>
    <table width="90%" border="1px" align="center">
        <tr>
            <td></td>
            <td>rid</td>
            <td>rolename</td>
            <td>level_1</td>
            <td>uid</td>
             <c:if test="${role.level_1>=2}">
            <td>操作</td>
            </c:if>
        </tr>
        <c:forEach items="${role123}" var="role123">
            <tr>
                <td>
                    <input type="checkbox" name="role_rid" value="${role123.rid }">
                </td>
                <td>${role123.rid }</td>
                <td>${role123.rolename }</td>
                <td>${role123.level_1 }</td>
                <td>${role123.uid }</td>
                <c:if test="${role.level_1>=2}">
                <td>
                    <a href="${pageContext.request.contextPath }/Menu/updateRole123?id=${role123.rid}">修改</a>
                    <c:if test="${role.level_1>=3}">
                    <a href="${pageContext.request.contextPath }/Menu/deleteRole123?id=${role123.rid}">删除</a>
               		</c:if>
                </td>
                </c:if>
            </tr>
        </c:forEach>
    </table>
</body>
</html>