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
  <span>菜单管理表</span>
    <table width="90%" border="1px" align="center">
        <tr>
            <td></td>
            <td>id</td>
            <td>m_1</td>
            <td>m_2</td>
            <td>m_3</td>
            <td>m_4</td>
            <td>m_5</td>
            <td>m_6</td>
            <td>m_7</td>
            <td>m_8</td>
           
            <c:if test="${role.level_1>=3}">
            <td>操作</td>
            </c:if>
            
        </tr>
        <c:forEach items="${menu}" var="menu">
            <tr>
                <td>
                    <input type="checkbox" name="menu" value="${menu.id }">
                </td>
                <td>${menu.id}</td>
	            <td>${menu.m_1}</td>
	            <td>${menu.m_2}</td>
	            <td>${menu.m_3}</td>
	            <td>${menu.m_4}</td>
	            <td>${menu.m_5}</td>
	            <td>${menu.m_6}</td>
	            <td>${menu.m_7}</td>
	            <td>${menu.m_8}</td>
	            <c:if test="${role.level_1>=3}">
	             <td>
                    <a href="${pageContext.request.contextPath }/Menu/updateMenu123?id=${menu.id}">修改</a>
                    <c:if test="${role.level_1>=4}">
                    <a href="${pageContext.request.contextPath }/Menu/deleteMenu123?id=${menu.id}">删除</a>
               		</c:if>
                </td>
	            
	            </c:if>
               
            </tr>
        </c:forEach>
    </table>
   
</body>
</html>