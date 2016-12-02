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
<div id="maindiv">
    <h2>Guess the number for 1 to 100!</h2>
    <form action="view.jsp" method="post">
        <input name="number" type="text" value="">
        <input name="OK" type="submit" value="OK">
        <tags:generate number="${param.n}"> </tags:generate>
    </form>
    <tags:result>
        Please enter a valid number!
    </tags:result>
</div>
</body>
</html>