<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询Visits列表</title>

    <script type="text/javascript">
        function deleteCheckVisits() {
            document.VisitsForm.action = "${pageContext.request.contextPath }/visits/deleteCheckVisits.do";
            document.VisitsForm.submit();
        }

        function getAllVisits() {
            document.VisitsForm.action = "${pageContext.request.contextPath }/visits/getAllVisitsWhere.do";
            document.VisitsForm.submit();
        }

        function updateAllVisits() {
            document.VisitsForm.action = "${pageContext.request.contextPath }/visits/updateAllVisits.do";
            document.VisitsForm.submit();
        }
    </script>
</head>

<body>
<form name="VisitsForm" action="" method="post">
    <input name="birthday" type="hidden" value="2012-12-12 14:14:14">
    <table width="90%" border="1px" align="center">
        <tr>
            <td><input type="button" value="删除选中" onclick="deleteCheckVisits()"></td>
            <td><input type="button" value="查询" onclick="getAllVisits()"/></td>
            <td><input type="button" value="批量修改" onclick="updateAllVisits()"/></td>
            <td><a href="${pageContext.request.contextPath}/visits/insertVisits.do"><input type="button" name="11" value="插入信息"></a></td>
            <td>session<input type="text" name="session" value=""/></td>
            <td>remote_addr<input type="text" name="remote_addr" value=""/></td>
            <td>inTime<input type="text" name="inTime" value=""/></td>
            <td>outTime<input type="text" name="outTime" value=""/></td>
            <td>inPage<input type="text" name="inPage" value=""/></td>
            <td>outPage<input type="text" name="outPage" value=""/></td>
            <td>referal<input type="text" name="referal" value=""/></td>
            <td>pageVisits<input type="text" name="pageVisits" value="0"/></td>

        </tr>
    </table>

    <br/>

    <table id="idData" width="60%" border="1px" align="center" >
        <tr>
            <td></td>
            <td>session</td>
            <td>remote_addr</td>
            <td>inTime</td>
            <td>outTime</td>
            <td>inPage</td>
            <td>outPage</td>
            <td>referal</td>
            <td>pageVisits</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${visitsList}" var="visits">
            <tr>
                <td>
                    <input type="checkbox" name="visits_ids" value="${visits.session}">
                </td>
                <td>
                    <a href="${pageContext.request.contextPath }/visits/getOneVisits.do?session=${visits.session}">${visits.session}</a>
                </td>
                <td>${visits.remote_addr }</td>
                <td>${visits.inTime }</td>
                <td>${visits.outTime }</td>
                <td>${visits.inPage }</td>
                <td>${visits.outPage }</td>
                <td>${visits.referal }</td>
                <td>${visits.pageVisits }</td>

                <td>
                    <a href="${pageContext.request.contextPath }/visits/updateVisits.do?session=${visits.session}">修改</a>
                    <a href="${pageContext.request.contextPath }/visits/deleteVisits.do?session=${visits.session}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>