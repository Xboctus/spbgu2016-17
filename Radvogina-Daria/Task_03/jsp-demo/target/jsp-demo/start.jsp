<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
<head>
        Start
    </head>
<body>
    ${util:setPlay(false)}

	<c:set var="num">
		 <%= request.getParameter("number") %>
	</c:set>

	<c:set var="empt" value="null">
	</c:set>

	<c:set var="e" value="">
	</c:set>


	<c:if test="${(num==empt)||(num==e)}">
	<p>
	<h2 align="center">Enter the number in [1, 100]</h2>

	<form align="center">
					<input type="text" name="number">
					<input type="submit" value ="Submit">
	</form>
	</p>
	</c:if>

	<c:if test="${(num!=e)&&(num!=empt)}">
		<c:set var="checkit" value="${util:numberChecker(num)}"/>
		<c:if test="${checkit}">
		${util:setPlay(true)}
              <c:redirect url="/win.jsp"/>
		</c:if>
		<c:if test="${!checkit}">
		${util:setPlay(true)}
			<c:redirect url="/lose.jsp"/>
		</c:if>
	</c:if>


	<c:if test="${(num==e)}">
	<p align="center">Input is empty</p>
	</c:if>

</body>
</html>