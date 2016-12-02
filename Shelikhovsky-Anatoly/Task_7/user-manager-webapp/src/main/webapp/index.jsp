<%@ page import="com.exigenservices.lectures.util.ViewHelper" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>MDB</title>

</head>

<body>
<h1>Message: </h1>
<form method="POST" action="send">
    <input type="text" name="message"/>
    <input type="submit"/>
</form>

    <h1>Messages</h1>
    <p><%= ViewHelper.getValuesAsString() %></p>
    <a href="javascript:location.reload(true)">Reload</a>


</body>
</html>
