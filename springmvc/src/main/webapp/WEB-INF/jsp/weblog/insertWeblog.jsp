<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>插入weblog信息详情</title>
</head>

<body>
<a href="${pageContext.request.contextPath }/weblog/getAllWeblog.do" name="返回weblog列表" >返回weblog列表</a>
    <form id="itemForm" action="${pageContext.request.contextPath }/weblog/insertWeblog.do" method="post">
        <table width="90%" border=1 align="center">
            <tr>
                <td>给weblog录入信息</td>
            </tr>
            <tr>
                <td>valid</td>
                <td><input name="valid" value=""></td>
            </tr>
            <tr>
                <td>remote_addr</td>
                <td><input name="remote_addr" type="text" value=""></td>
            </tr>
            <tr>
                <td>remote_user</td>
                <td><input name="remote_user" type="text" value=""></td>
            </tr>
            <tr>
                <td>time_local</td>
                <td><input name="time_local" type="text" value=""></td>
            </tr>
            <tr>
                <td>request</td>
                <td><input name="request" type="text" value=""></td>
            </tr>
            <tr>
                <td>status</td>
                <td><input name="status" type="text" value=""></td>
            </tr>
            <tr>
                <td>body_bytes_sent</td>
                <td><input name="body_bytes_sent" type="text" value=""></td>
            </tr>
            <tr>
                <td>http_referer</td>
                <td><input name="http_referer" type="text" value=""></td>
            </tr>
            <tr>
                <td>http_user_agent</td>
                <td><input name="http_user_agent" type="text" value=""></td>
            </tr>
        </table>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交" /></td>
        </tr>
    </form>
</body>
</html>