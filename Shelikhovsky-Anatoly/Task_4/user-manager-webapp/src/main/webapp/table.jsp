<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
    <title>Users management</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
</head>
<body>

<div id="maindiv">
    <table>
        <tr>
            <td>Символ</td>
            <td>Количество</td>
        </tr>
        <c:forEach var="ind" items="${requestScope.table}">
            <tr>
                <td>${ind.key}</td>
                <td>${ind.value}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <form action="index.jsp" method="post">
        <input type="submit" value="Return"/>
    </form>
</div>
</body>
</html>
