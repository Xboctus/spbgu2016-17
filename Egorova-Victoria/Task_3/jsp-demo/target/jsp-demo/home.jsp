<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Guess the number</title>
    </head>

    <body>

    <c:set var="number">
                <%= request.getParameter("req") %>
            </c:set>


        <p>
            <h1> Try to guess the number!</h1>
            <h2 from 1 to 100</h2>
            <form action="home.jsp" method="get">
                <input name="Enter the number" type="text"/>
                <input type="submit" value="submit"/>
            </form>
        </p>



        <c:if test="${(number==null)}">
        	<p>Try again</p>
        </c:if>

        <c:if test="${((number<1)||(number>100))}">
              <p>Try again</p>
        </c:if>

        <c:if test="${((number>1)&&(number<100)&&(number!=null))}">
            <c:set var="ch" value="${util:check(number)}"/>
        		<c:if test="${ch}">
        			<jsp:forward page="winner.jsp"/>
        		</c:if>
        		<c:if test="${!ch}">
        			<jsp:forward page="loser.jsp"/>
        		</c:if>
        </c:if>


    </body>
</html>