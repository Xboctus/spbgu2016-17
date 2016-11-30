<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
        <title>Game</title>
    </head>

<body>


	<c:set var="num">
    		 <%= request.getParameter("number") %>
    	</c:set>


	<c:set var="empt" value="null">
	</c:set>

	<c:set var="e" value="">
	</c:set>


	<c:if test="${(num==empt)||(num==e)}">
	<p>

	<form action="start.jsp" method="POST" align="center">
					<label for="display-name">Enter the number from interval [1, 100]</label><br />
                    <input type="text" name="number" id="number" placeholder="your number" /><br />
					<input type="submit" value ="Submit" title="check if your choice is successful">
	</form>

	</p>
	</c:if>

	<c:if test="${(num!=e)&&(num!=empt)}">
		<c:set var="check" value="${util:numberChecker(num)}"/>
		<c:if test="${(check==0)}">

		<jsp:forward page="win.jsp"/>

		</c:if>
		<c:if test="${(check==1)}">

		<jsp:forward page="lose.jsp"/>

		</c:if>

	</c:if>

	<c:if test ="${(check==-1)}">
    		<a href="start.jsp"/>
                		<p align="center">Input is incorrect. Back</p>
                        </c:if>
	
	<c:if test ="${(num==e)}">
	<p align ="center">Input is empty</p>
	</c:if>

</body>
</html>