<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Users management</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
</head>

<body>

<div id="maindiv">
    <h2>
        Enter your text here!
    </h2>
    <textarea form="mainform" name="texttoparse"  rows="15" cols="50"></textarea>
    <form id="mainform" action="${pageContext.request.contextPath}/submit" method="post">
        <input type="submit" value="OK"/>
    </form>
</div>

</body>
</html>
