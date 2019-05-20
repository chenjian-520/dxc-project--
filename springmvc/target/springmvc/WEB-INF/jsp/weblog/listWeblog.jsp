<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询Weblog列表</title>

    <script type="text/javascript">
        function deleteCheckWeblog() {
            document.WeblogForm.action = "${pageContext.request.contextPath }/weblog/deleteCheckWeblog.do";
            document.WeblogForm.submit();
        }

        function getAllWeblog() {
            document.WeblogForm.action = "${pageContext.request.contextPath }/weblog/getAllWeblogWhere.do";
            document.WeblogForm.submit();
        }

        function updateAllWeblog() {
            document.WeblogForm.action = "${pageContext.request.contextPath }/weblog/updateAllWeblog.do";
            document.WeblogForm.submit();
        }
    </script>
</head>

<body>
<form name="WeblogForm" action="" method="post">
    <input name="birthday" type="hidden" value="2012-12-12 14:14:14">
    <table width="90%" border="1px" align="center">
        <tr>

            <td><input type="button" value="删除选中" onclick="deleteCheckWeblog()"></td>
            <td><input type="button" value="查询" onclick="getAllWeblog()"/></td>
            <td><input type="button" value="批量修改" onclick="updateAllWeblog()"/></td>
            <td><a href="${pageContext.request.contextPath}/weblog/insertWeblog.do"><input type="button" name="11" value="插入信息"></a></td>
            <td>valid<input type="text" name="valid" value=""/></td>
            <td>remote_addr<input type="text" name="remote_addr" value=""/></td>
            <td>remote_user<input type="text" name="remote_user" value=""/></td>
            <td>time_local<input type="text" name="time_local" value=""/></td>
            <td>request<input type="text" name="request" value=""/></td>
            <td>status<input type="text" name="status" value=""/></td>
            <td>body_bytes_sent<input type="text" name="body_bytes_sent" value=""/></td>
            <td>http_referer<input type="text" name="http_referer" value=""/></td>
            <td>http_user_agent<input type="text" name="http_user_agent" value=""/></td>
        </tr>
    </table>

    <br/>

    <table id="idData" width="60%" border="1px" align="center" >
        <tr>
            <td></td>
            <td>valid</td>
            <td>remote_addr</td>
            <td>remote_user</td>
            <td>time_local</td>
            <td>request</td>
            <td>status</td>
            <td>body_bytes_sent</td>
            <td>http_referer</td>
            <td>http_user_agent</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${weblogList}" var="weblog">
            <tr>
                <td>
                    <input type="checkbox" name="weblog_ids" value="${weblog.remote_addr}">
                </td>
                <td>${weblog.valid }</td>
                <td>
                    <a href="${pageContext.request.contextPath }/weblog/getOneWeblog.do?remote_addr=${weblog.remote_addr}">${weblog.remote_addr}</a>
                </td>
                <td>${weblog.remote_user }</td>
                <td>${weblog.time_local }</td>
                <td>${weblog.request }</td>
                <td>${weblog.status }</td>
                <td>${weblog.body_bytes_sent }</td>
                <td>${weblog.http_referer }</td>
                <td>${weblog.http_user_agent }</td>

                <td>
                    <a href="${pageContext.request.contextPath }/weblog/updateWeblog.do?remote_addr=${weblog.remote_addr}">修改</a>
                    <a href="${pageContext.request.contextPath }/weblog/deleteWeblog.do?remote_addr=${weblog.remote_addr}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>