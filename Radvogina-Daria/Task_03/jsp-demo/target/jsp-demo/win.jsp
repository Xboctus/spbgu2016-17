<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="utf-8">
    Win
</head>
<c:set var="checked" value="${util:checkPlay()}"/>
<c:if test="${!checked}" >
           <c:redirect url="/start.jsp"/>
        </c:if>
<body>
    ${util:setPlay(false)}
	<h2 align="center">Hurray, take a sweet from a shelf</h2>
	<a href="start.jsp" align="center">Back</a>
</body>
</html>