<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>权限2</title>
</head>
<body>
欢迎你：${user}.<br>
${role}

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

<br>
root用户界面：用户登录页面，菜单总览	<br>   
	*	角色管理：用户注册信息查询，<br>
	*	用户角色管理：用户角色信息查询，<br>
	*	角色权限管理：菜单信息查询， <br>
	*	实现要求：用户可以有多个角色，角色可以有多个菜单权限，不同的用户登录展示不同的菜单列表。<br>

<span style="size: 40px ;height: 40px;width: 80px;color: red">菜单总览：</span>
<select name="" id="" class="not-arrow">
<option>${menu2[0].id}</option>
<option>${menu2[0].m_1}</option>
<option>${menu2[0].m_3}</option>
<option>${menu2[0].m_5}</option>
</select>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<select name="" id="" class="not-arrow">
<option>${menu2[1].id}</option>
<option>${menu2[1].m_1}</option>
<option>${menu2[1].m_3}</option>
<option>${menu2[1].m_5}</option>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<select name="" id="" class="not-arrow">
<option>${menu2[2].id}</option>
<option>${menu2[2].m_1}</option>
<option>${menu2[2].m_6}</option>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<br>
<br>
<br>
<div style="color:red ; highlight:100px ;background-color: #ffffff ">
<a href="<%=request.getContextPath()%>/users/showAll"> 用户注册信息查询</a>
<%="     " %>>>>>>
<a href="<%=request.getContextPath()%>/users/showMenuAll"> 菜单信息查询</a>
<%="     " %>>>>>>
<a href="<%=request.getContextPath()%>/users/showRolerAll">用户角色信息查询 </a>
<%="     " %>>>>>>
</div>
<br><br>


</body>
</html>