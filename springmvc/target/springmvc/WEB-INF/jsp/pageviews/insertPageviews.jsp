<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>插入pageviews信息详情</title>
    <style type="text/css">
        table.gridtable {
            font-family: verdana,arial,sans-serif;
            font-size:11px;
            color:#333333;
            border-width: 1px;
            border-color: #666666;
            border-collapse: collapse;
        }
        table.gridtable th {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background:#b5cfd2 ;
        }
        table.gridtable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background:#dcddc0 ;

        }
    </style>
</head>

<body>
<a href="${pageContext.request.contextPath }/pageviews/getAllPageviews.do" name="返回pageviews列表" >返回pageviews列表</a>
<form id="itemForm" action="${pageContext.request.contextPath }/pageviews/insertPageviews.do" method="post" >
    <table width="90%" class="gridtable" border=1 align="center">
        <tr>
            <td>给pageviews录入信息</td>
        </tr>
        <tr>
            <td>session</td>
            <td><input name="session" value=""></td>
        </tr>
        <tr>
            <td>key1</td>
            <td><input name="key1" type="text" value=""></td>
        </tr>
        <tr>
            <td>remote_addr</td>
            <td><input name="remote_addr" type="text" value=""></td>
        </tr>
        <tr>
            <td>timestr</td>
            <td><input name="timestr" type="text" value=""></td>
        </tr>
        <tr>
            <td>tequest</td>
            <td><input name="tequest" type="text" value=""></td>
        </tr>
        <tr>
            <td>step</td>
            <td><input name="step" type="text" value=""></td>
        </tr>
        <tr>
            <td>staylong</td>
            <td><input name="staylong" type="text" value=""></td>
        </tr>
        <tr>
            <td>referal</td>
            <td><input name="referal" type="text" value=""></td>
        </tr>
        <tr>
            <td>useragent</td>
            <td><input name="useragent" type="text" value=""></td>
        </tr>
        <tr>
            <td>bytes_send</td>
            <td><input name="bytes_send" type="text" value=""></td>
        </tr>
        <tr>
            <td>status</td>
            <td><input name="status" type="text" value=""></td>
        </tr>
    </table>
    <tr>
        <td colspan="2" align="center"><input type="submit" value="提交" /></td>
    </tr>
</form>
</body>
</html>