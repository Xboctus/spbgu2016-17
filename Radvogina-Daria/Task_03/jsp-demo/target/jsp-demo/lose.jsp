<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="utf-8">
    Lose
</head>
<body>
<c:set var="checked" value="${util:checkPlay()}"/>
<c:if test="${!checked}" >
           <jsp:forward page="start.jsp"/>
    </c:if>
    ${util:setPlay(false)}
	<h2 align="center">You have lost, try again, good luck!</h2>
	<a href="start.jsp" align="center">Try again</a>
</body>

</html>