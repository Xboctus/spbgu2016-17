<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>
        Counter
    </title>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body bgcolor="#F0F8FF">

<div id="maindiv">
    <h2>
        Enter your text
    </h2>
    <textarea form="mainform" name="texttoparse"  rows="15" cols="50"></textarea>
    <form id="mainform" action="${pageContext.request.contextPath}/submit" method="post">
        <input type="submit" value="OK"/>
    </form>
</div>

</body>
</html>
