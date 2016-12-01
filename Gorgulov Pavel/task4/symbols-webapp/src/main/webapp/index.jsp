<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Welcome</title>
</head>
<body>
<div class="message_form">
    <h3>Enter your message</h3>
    <form action="symbols.jsp" method="post">
        <input type="text" name="message">
        <input type="hidden" name="action" value="enter">
        <input type="submit" name="enter" value="enter">
    </form>
</div>
</body>
</html>
