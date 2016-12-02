<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>View</title>
</head>
<body>
<h3>Message</h3>
<table>
    <tr>
        <td>Symbols</td>
        <td>Count</td>
    </tr>
    <c:forEach var="message" items="${requestScope.symbols}">
        <tr>
            <td>${message.getKey()}</td>
            <td>${message.getValue()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
