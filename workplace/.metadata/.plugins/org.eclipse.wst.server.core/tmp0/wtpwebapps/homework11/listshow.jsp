<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>批量修改信息</title>

<script type="text/javascript">
	function updateAllPost(){
		document.UpdateForm.action = "${pageContext.request.contextPath }/Menu/updateAllPost.do";
		document.UpdateForm.submit();
	}
</script>

</head>
<body>
	<form name="UpdateForm" action="" method="post">
		<table width="90%" border="1px" align="center">
			<tr>
				<td><input type="button" value="批量修改" onclick="updateAllPost()" /></td>
			</tr>
		</table>

		<br>
	    <span>用户管理表</span>	
		<br/>
	   <table width="90%" border="1px" align="center">
   	<tr>
   
   		<td>uid</td>
   		<td>username</td>
   		<td>password</td>
   		
   	</tr>
   	<c:forEach items="${user123}" var="user123" varStatus="status">		
   			   <tr>
              
                <td><input name="user123[${status.index}].uid" value="${user123.uid}"></td>
                <td><input name="user123[${status.index}].username" value="${user123.username }"></td>
                <td><input name="user123[${status.index}].password" value="${user123.password }"></td>
              
            </tr>
   	</c:forEach>
   </table>
   
    <br>
    <span>角色管理表</span>
    <table width="90%" border="1px" align="center">
        <tr>
           
            <td>rid</td>
            <td>rolename</td>
            <td>level_1</td>
            <td>uid</td>
           
        </tr>
        <c:forEach items="${role123}" var="role123" varStatus="status">
            <tr>
             
                <td><input name="role123[${status.index}].rid" value="${role123.rid}"></td>
                <td><input name="role123[${status.index}].rolename" value="${role123.rolename}"></td>
                <td><input name="role123[${status.index}].level_1" value="${role123.level_1}"></td>
                <td><input name="role123[${status.index}].uid" value="${role123.uid}"></td>
              
            </tr>
        </c:forEach>
    </table>
    
    <br>
    <span>菜单管理表</span>
    
    <table width="90%" border="1px" align="center">
        <tr>
         
            <td>id</td>
            <td>m_1</td>
            <td>m_2</td>
            <td>m_3</td>
            <td>m_4</td>
            <td>m_5</td>
            <td>m_6</td>
            <td>m_7</td>
            <td>m_8</td>
          
        </tr>
        <c:forEach items="${menu123}" var="menu123" varStatus="status">
            <tr>
               
                <td><input name="menu123[${status.index}].id" value="${menu123.id}"></td>
	            <td><input name="menu123[${status.index}].m_1" value="${menu123.m_1}"></td>
	            <td><input name="menu123[${status.index}].m_2" value="${menu123.m_2}"></td>
	            <td><input name="menu123[${status.index}].m_3" value="${menu123.m_3}"></td>
	            <td><input name="menu123[${status.index}].m_4" value="${menu123.m_4}"></td>
	            <td><input name="menu123[${status.index}].m_5" value="${menu123.m_5}"></td>
	            <td><input name="menu123[${status.index}].m_6" value="${menu123.m_6}"></td>
	            <td><input name="menu123[${status.index}].m_7" value="${menu123.m_7}"></td>
	            <td><input name="menu123[${status.index}].m_8" value="${menu123.m_8}"></td>
               
            </tr>
        </c:forEach>
    </table>
    
		
		
	</form>
</body>
</html>