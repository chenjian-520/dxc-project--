<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <title>root 管理界面</title>

    <script type="text/javascript">
        function deleteCheckStudents() {
            document.AllForm.action = "${pageContext.request.contextPath }/Menu/deleteCheckUsers.do";
            document.AllForm.submit();    
        }

        function getAllWhere() {
            document.AllForm.action = "${pageContext.request.contextPath }/Menu/getAllWhere.do";
            document.AllForm.submit();
        }

        function updateAll() {
            document.AllForm.action = "${pageContext.request.contextPath }/Menu/updateAll.do";
            document.AllForm.submit();
        }
    </script>
    
</head>
<body>
欢迎你：${user}.<br>
${role}

<br>
<br>
<style type="text/css">
.not-arrow{
padding: 5px 10px;
border:1px solid #dcd8d8;
-webkit-appearance:none;
-moz-appearance:none;
appearance:none; /*去掉下拉箭头*/
}
/*清除ie的默认选择框样式清除，隐藏下拉箭头*/
.not-arrow::-ms-expand { display: none; }
</style>

<%-- <a href="${pageContext.request.contextPath }/users/showAll"> 查询</a> --%>
<br>
root用户界面：用户登录页面，菜单总览	<br>   
	*	菜单管理：菜单信息查询，菜单新增，菜单信息修改，删除菜单<br>
	*	用户管理：用户信息查询，用户新增，用户信息修改，删除用户，修改密码<br> 
	*	角色管理：角色信息查询，角色新增，删除角色<br>
	*	用户角色管理：用户角色信息查询，新增用户角色信息，删除用户角色信息<br>
	*	角色权限管理：角色权限信息查询，新增角色权限信息，删除角色权限信息 <br>
	*	实现要求：用户可以有多个角色，角色可以有多个菜单权限，不同的用户登录展示不同的菜单列表。<br>
<br>

<span style="size: 40px ;height: 40px;width: 80px;color: red">菜单总览：</span>
<select name="" id="" class="not-arrow">
<option>${menu123[0].id}</option>
<option>${menu123[0].m_1}</option>
<option>${menu123[0].m_2}</option>
<option>${menu123[0].m_3}</option>
<option>${menu123[0].m_4}</option>
<option>${menu123[0].m_5}</option>
<option>${menu123[0].m_6}</option>
</select>

&nbsp;&nbsp;&nbsp;&nbsp;

<select name="" id="" class="not-arrow">
<option>${menu123[1].id}</option>
<option>${menu123[1].m_1}</option>
<option>${menu123[1].m_2}</option>
<option>${menu123[1].m_3}</option>
<option>${menu123[1].m_4}</option>
<option>${menu123[1].m_5}</option>
<option>${menu123[1].m_6}</option>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;

<select name="" id="" class="not-arrow">
<option>${menu123[2].id}</option>
<option>${menu123[2].m_1}</option>
<option>${menu123[2].m_2}</option>
<option>${menu123[2].m_3}</option>
<option>${menu123[2].m_4}</option>
<option>${menu123[2].m_5}</option>
<option>${menu123[2].m_6}</option>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;

<select name="" id="" class="not-arrow">
<option>${menu123[3].id}</option>
<option>${menu123[3].m_1}</option>
<option>${menu123[3].m_2}</option>
<option>${menu123[3].m_3}</option>
<option>${menu123[3].m_4}</option>
<option>${menu123[3].m_5}</option>
<option>${menu123[3].m_6}</option>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;

<select name="" id="" class="not-arrow">
<option>${menu123[4].id}</option>
<option>${menu123[4].m_1}</option>
<option>${menu123[4].m_2}</option>
<option>${menu123[4].m_3}</option>
<option>${menu123[4].m_4}</option>
<option>${menu123[4].m_5}</option>
<option>${menu123[4].m_6}</option>
</select>
<br>
<br>
<br>
<form name="AllForm" action="" method="post">
    <input name="birthday" type="hidden" value="2019-3-20 14:14:14">
    <table width="90%" border="1px" align="center">
        <tr>
            <td><input type="button" value="删除选中" onclick="deleteCheckStudents()"></td>
            <td><input type="button" value="查询" onclick="getAllWhere()"/></td>
            <td><input type="button" value="批量修改" onclick="updateAll()"/></td>
            <td>uid<input type="text" name="uid" value=""/></td>
            <td>rolename<input type="text" name="rolename" value=""/></td>
            <td>rid<input type="text" name="rid" value=""/></td>
            <td>level_1<input type="text" name="level_1" value=""/></td>
            <td>password<input type="text" name="password" value=""/></td>
            <td>username<input type="text" name="username" value=""/></td>
            <td>menuid<input type="text" name="menuid" value=""/></td>
        </tr>
    </table>
 <a href="${pageContext.request.contextPath }/insert/insertMenu.jsp">给menu表添加信息</a>
 <a href="${pageContext.request.contextPath }/insert/insertRole.jsp">给role表添加信息</a>
 <a href="${pageContext.request.contextPath }/insert/insertUsers.jsp">给users表添加信息</a>
    <br/>
    <span>角色管理表</span>
	   <table width="90%" border="1px" align="center">
   	<tr>
   		<td></td>
   		<td>uid</td>
   		<td>username</td>
   		<td>password</td>
   		<td>操作</td>
   	</tr>
   	<c:forEach items="${user123}" var="user">		
   			   <tr>
                <td>
                    <input type="checkbox" name="user_uid" value="${user.uid }">
                </td>
                <td>${user.uid }</td>
                <td>${user.username }</td>
                <td>${user.password }</td>
                <td>
                    <a href="${pageContext.request.contextPath }/Menu/updateUser?id=${user.uid}">修改</a>
                    <a href="${pageContext.request.contextPath }/Menu/deleteUser?id=${user.uid}">删除</a>
                </td>
            </tr>
   	</c:forEach>
   </table>
   <br>
    <span>用户管理表</span>
    <table width="90%" border="1px" align="center">
        <tr>
            <td></td>
            <td>rid</td>
            <td>rolename</td>
            <td>level_1</td>
            <td>uid</td>
            <td>操作</td>
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
                <td>
                    <a href="${pageContext.request.contextPath }/Menu/updateRole123?id=${role123.rid}">修改</a>
                    <a href="${pageContext.request.contextPath }/Menu/deleteRole123?id=${role123.rid}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
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
            <td>操作</td>
        </tr>
        <c:forEach items="${menu123}" var="menu123">
            <tr>
                <td>
                    <input type="checkbox" name="menu123" value="${menu123.id }">
                </td>
                <td>${menu123.id}</td>
	            <td>${menu123.m_1}</td>
	            <td>${menu123.m_2}</td>
	            <td>${menu123.m_3}</td>
	            <td>${menu123.m_4}</td>
	            <td>${menu123.m_5}</td>
	            <td>${menu123.m_6}</td>
	            <td>${menu123.m_7}</td>
	            <td>${menu123.m_8}</td>
                <td>
                    <a href="${pageContext.request.contextPath }/Menu/updateMenu123?id=${menu123.id}">修改</a>
                    <a href="${pageContext.request.contextPath }/Menu/deleteMenu123?id=${menu123.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    
</form>

</body>
</html>