<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://exigen.ru/students/tags" prefix="tags" %>
<html>
<head>
    <title>
       Task3
    </title>
</head>
<body>
<div id="maindiv" align="center">
    <h2 align="center">Guess the number for 1 to 100!</h2>
    <form action="start.jsp" method="post" align="center">
        <input name="number" type="text" value="">
        <input name="TRY" type="submit" value="TRY">
        <tags:generate number="${param.n}"> </tags:generate>
    </form>
    <tags:result>
        Please enter a valid number!
    </tags:result>
</div>
</body>
</html>