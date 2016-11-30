<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<html>
<style>

	#base {
                text-align:center;
		font-family: Verdana, Arial,
Helvetica, sans-serif;
		color: #363636
	}
</style>
<head>
	<title>Third task</title>
</head>
<body id=base bgcolor="#F0F8FF">
<h1>YOU HAVE WON!</h1>
<c:if test="${util:checkVictory()}" >
   <c:redirect url="/index.jsp"/>
</c:if>
        <p>
            Congratulations! You have made it! Let's do it again!
        </p>
        <p>
            <a href="${pageContext.request.contextPath}">Try again</a>
        </p>
</body>
</html>