<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>
        Counter
    </title>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
<body>

<div id="maindiv">
    <table>
        <tr>
            <td>Символ</td>
            <td>Количество</td>
        </tr>
        <c:forEach var="i" items="${requestScope.table}">
            <tr>
                <td>${i.key}</td>
                <td>${i.value}</td>
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
