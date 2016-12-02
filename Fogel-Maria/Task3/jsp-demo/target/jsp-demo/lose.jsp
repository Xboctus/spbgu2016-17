<%--
  Created by IntelliJ IDEA.
  User: Полина
  Date: 26.11.2016
  Time: 5:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        Task3
    </title>
</head>
<body>
<div id="maindiv">
    <h2>LOSE!</h2>
    <form action="view.jsp" method="post">
        <input type="hidden" name="restart" value="true">
        <input name="return" type="submit" value="Return">
    </form>
</div>
</body>
</html>
