<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<body>

	<c:set var="number">
		 <%= request.getParameter("req") %>
	</c:set>

	<c:set var="nothing" value="null">
	</c:set>

	<c:set var="no" value="">
	</c:set>


	<c:if test="${(number==nothing)||(number==no)}">
	<p>
	<h1> Try to guess the number from 1 to 100!</h1>
	<form action="home" method="POST">
				<input type="text" name="req">
				<input type="submit">
	</form>
	</p>
	</c:if>

	<c:if test="${(number==no)}">
    	<p>Try again!</p>
    </c:if>



	<c:if test="${(number!=no)&&(number!=nothing)}">
	    <c:set var="cor" value="${util:correct(number)}"/>
	    <c:if test="${cor}">
        	    <c:set var="ch" value="${util:check(number)}"/>
            	<c:if test="${ch}">
            		<jsp:forward page="winner.jsp"/>
            	</c:if>
            	<c:if test="${!ch}">
            		<jsp:forward page="loser.jsp"/>
            	</c:if>
        </c:if>
        <c:if test="${!cor}">
         	<p>Your number is not in [1,100]. Try again!</p>
        </c:if>

	</c:if>




</body>
</html>
