<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>





<html>
<style>

	#base {
                text-align:center;
		font-family: Verdana, Arial,
Helvetica, sans-serif;
		color: #602C1F
	}
</style>
<head>
	<title>Task3</title>
</head>
<body id=base bgcolor="#FFDAB9">
<h1>You lose.</h1>
<c:if test="${util:checkLose()}" >
   <c:redirect url="/index.jsp"/>
</c:if>
        <p>
            <a href="${pageContext.request.contextPath}">Try again.</a>
        </p>
</body>
</html>