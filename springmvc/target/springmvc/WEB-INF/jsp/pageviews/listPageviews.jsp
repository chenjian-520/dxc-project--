<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询Pageviews列表</title>

    <script type="text/javascript">
        function deleteCheckPageviews() {
            document.PageviewsForm.action = "${pageContext.request.contextPath }/pageviews/deleteCheckPageviews.do";
            document.PageviewsForm.submit();
        }

        function getAllPageviews() {
            document.PageviewsForm.action = "${pageContext.request.contextPath }/pageviews/getAllPageviewsWhere.do";
            document.PageviewsForm.submit();
        }

        function updateAllPageviews() {
            document.PageviewsForm.action = "${pageContext.request.contextPath }/pageviews/updateAllPageviews.do";
            document.PageviewsForm.submit();
        }
    </script>
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
  <form name="PageviewsForm" action="" method="post">
    <input name="birthday" type="hidden" value="2012-12-12 14:14:14">
    <table width="90%" class="gridtable" border="1px" align="center">
        <tr>
            <td><input type="button" value="删除选中" onclick="deleteCheckPageviews()"></td>
            <td><input type="button" value="查询" onclick="getAllPageviews()"/></td>
            <td><input type="button" value="批量修改" onclick="updateAllPageviews()"/></td>
            <td><a href="${pageContext.request.contextPath}/pageviews/insertPageviews.do"><input type="button" name="11" value="插入信息"></a></td>
            <td>session<input type="text" name="session" value=""/></td>
            <td>key1<input type="text" name="key1" value=""/></td>
            <td>remote_addr<input type="text" name="remote_addr" value=""/></td>
            <td>timestr<input type="text" name="timestr" value=""/></td>
            <td>tequest<input type="text" name="tequest" value=""/></td>
            <td>step<input type="text" name="step" value="0"/></td>
            <td>staylong<input type="text" name="staylong" value="0"/></td>
            <td>referal<input type="text" name="referal" value=""/></td>
            <td>useragent<input type="text" name="useragent" value=""/></td>
            <td>bytes_send<input type="text" name="bytes_send" value=""/></td>
            <td>status<input type="text" name="status" value=""/></td>
        </tr>
    </table>

    <br/>

    <table id="idData" class="gridtable" width="60%" border="1px" align="center" >
        <tr>
            <td></td>
            <td>Session</td>
            <td>key1</td>
            <td>Remote_addr</td>
            <td>Timestr</td>
            <td>Tequest</td>
            <td>Step</td>
            <td>Staylong</td>
            <td>Referal</td>
            <td>Useragent</td>
            <td>Bytes_send</td>
            <td>Status</td>
            <td>操作</td>
        </tr>
        
        <c:forEach items="${pageviewsList}" var="pageviews">
            <tr>
                <td>
                    <input type="checkbox" name="Pageviews_ids" value="${pageviews.session}">
                </td>
                <td>
                    <a href="${pageContext.request.contextPath }/pageviews/getOnePageviews.do?session=${pageviews.session}">${pageviews.session}</a>
                </td>
                <td>${pageviews.key1 }</td>
                <td>${pageviews.remote_addr }</td>
                <td>${pageviews.timestr }</td>
                <td>${pageviews.tequest }</td>
                <td>${pageviews.step }</td>
                <td>${pageviews.staylong }</td>
                <td>${pageviews.referal }</td>
                <td>${pageviews.useragent }</td>
                <td>${pageviews.bytes_send }</td>
                <td>${pageviews.status }</td>

                <td>
                    <a href="${pageContext.request.contextPath }/pageviews/updatePageviews.do?session=${pageviews.session}">修改</a>
                    <a href="${pageContext.request.contextPath }/pageviews/deletePageviews.do?session=${pageviews.session}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>



</body>
</html>