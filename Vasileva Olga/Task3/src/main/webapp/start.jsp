<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<c:set var="num">
    <%= request.getParameter("req") %>
</c:set>

<c:set var="empt" value="null">
</c:set>

<c:set var="e" value="">
</c:set>

<c:if test="${(num==e)}">
    ÐÐ¸Ñ‡ÐµÐ³Ð¾ Ð½Ðµ Ð²Ð²ÐµÐ´ÐµÐ½Ð¾
</c:if>

<c:if test="${(num==empt)||(num==e)}">
    <p>
    <h2>Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ Ñ‡Ð¸ÑÐ»Ð¾ Ð¾Ñ‚ 1 Ð´Ð¾ 100</h2>
    <form action="start" method="POST">
        <input type="text" name="req">
        <input type="submit">
    </form>
    </p>
</c:if>

<c:if test="${(num!=e)&&(num!=empt)}">
    <c:set var="checkr" value="${util:check(num)}"/>
    <c:if test="${checkr}">
        <jsp:forward page="win.jsp"/>
    </c:if>
    <c:if test="${!checkr}">
        <jsp:forward page="lose.jsp"/>
    </c:if>
</c:if>


</body>
</html>