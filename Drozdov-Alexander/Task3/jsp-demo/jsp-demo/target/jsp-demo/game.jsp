<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="util" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
    <style>

        #base {
                    text-align:center;
            font-family: Verdana, Arial, Helvetica, sans-serif;
            color: #363636
        }
    </style>
    <head>
    	<title>Third task</title>
    </head>
    <body id=base bgcolor="#F0F8FF">



        <h1>Guess the number from 1 to 100!</h1>

        <form action="game.jsp" method="get">
                    <p>Enter the number</p>
                    ${util:setVictory(true)}
                    ${util:setLose(true)}

                    <input name="firstinput" type="text" value=<%=request.getParameter("firstinput") %>>
                    <br>
                    <input type="submit" value="Try">

                    <%

                    if(request.getParameter("firstinput")!=null){
                    try {

                    long rand = java.lang.Math.round(java.lang.Math.random() * 100);
                    boolean first = (rand == Integer.parseInt(request.getParameter("firstinput")));
                    if(first){%>
                     ${util:setVictory(false)}
                     ${util:setLose(true)}
                     <c:redirect url="/victory.jsp"/>
                     <%}
                     else {%>
                                 ${util:setVictory(true)}
                                 ${util:setLose(false)}
                                 <c:redirect url="/lose.jsp"/>
                     <%}
                    out.println(first);
                    }
                    catch( Exception e ) {%>
                               <p>Please, enter suitable value</p>
                               <%}
                     }
                     %>

            </form>

        <p>
           Made by Alexander Karachev
        </p>
    </body>
</html>
