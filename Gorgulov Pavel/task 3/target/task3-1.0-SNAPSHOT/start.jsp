<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Start</title>
</head>
<body>
<div class="startPage">
    <h1 align="center">
        Hello, I want to play a game.
    </h1>
    <br>
    <h3 align="center">
        I put forth a number from 1 to 100. Your task is to guess it.
    </h3>
    <form name="count" action="/mainServlet" method="POST" align="center">
        <input type="text" name="count" value="" size="30">
        <br>
        <input type="hidden" name="action" value="start">
        <input type="submit" name="start" value="start">
    </form>
</div>
<%--<div class="startPage">--%>
<%--<div class="description">--%>
<%--<h2><strong>Угадай число от 0 до 100</strong></h2>--%>
<%--</div>--%>

<%--<div class="input-field">--%>
<%--<form action="" method="post">--%>
<%--&lt;%&ndash;<label class="active" for="value"><h3>Value</h3></label>&ndash;%&gt;--%>
<%--<input id="value" type="text"  name="count">--%>
<%--</form>--%>
<%--</div>--%>
<%--<div>--%>
<%--<form action="" method="POST">--%>
<%--<input type="hidden" name="action" value="start">--%>
<%--<input type="submit" name="start" value="start">--%>
<%--</form>--%>
<%--</div>--%>
<%--</div>--%>
</body>
</html>