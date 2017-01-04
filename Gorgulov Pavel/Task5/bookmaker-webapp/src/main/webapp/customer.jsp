<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Bookmaker</title>
</head>
<body>
<table>
    <c:forEach var="customer" items="${requestScope.all}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
        </tr>
        <tr>
            <td>Ставка</td>
            <td>${customer.number}</td>
        </tr>
        <tr>
            <td>Сумма</td>
            <td>${customer.sum}</td>
        </tr>
    </c:forEach>
</table>
<form action="" method="post">
    <table>
        <tr>
            <td>Ставка</td>
            <td>
                <input type="text" name="num">
            </td>
        </tr>
        <tr>
            <td>Сумма</td>
            <td>
                <input type="text" name="sum">
            </td>
        </tr>
        <tr>
            <td>
                <input type="hidden" name="action" value="add">
                <input type="submit" name="add" value="add customer">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
