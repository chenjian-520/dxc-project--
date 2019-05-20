<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>插入visits信息详情</title>
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/visits/insertVisits.do" method="post">
    <a href="${pageContext.request.contextPath }/visits/getAllVisits.do" name="返回visits列表" >返回visits列表</a>
    <table width="90%" border=1 align="center">
        <tr>
            <td>给visits录入信息</td>
        </tr>
        <tr>
            <td>session</td>
            <td><input name="session" value=""></td>
        </tr>
        <tr>
            <td>remote_addr</td>
            <td><input name="remote_addr" type="text" value=""></td>
        </tr>
        <tr>
            <td>inTime</td>
            <td><input name="inTime" type="text" value=""></td>
        </tr>
        <tr>
            <td>outTime</td>
            <td><input name="outTime" type="text" value=""></td>
        </tr>
        <tr>
            <td>inPage</td>
            <td><input name="inPage" type="text" value=""></td>
        </tr>
        <tr>
            <td>outPage</td>
            <td><input name="outPage" type="text" value=""></td>
        </tr>
        <tr>
            <td>referal</td>
            <td><input name="referal" type="text" value=""></td>
        </tr>
        <tr>
            <td>pageVisits</td>
            <td><input name="pageVisits" type="text" value=""></td>
        </tr>
    </table>
    <tr>
        <td colspan="2" align="center"><input type="submit" value="提交" /></td>
    </tr>
</form>
</body>
</html>