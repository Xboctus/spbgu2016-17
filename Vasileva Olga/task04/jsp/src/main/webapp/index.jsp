<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>
        Return on Intelligence; Task 04
    </title>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
<div id="maindiv">
    <h1>
        Letter counter
    </h1>
    <textarea form="mainform" name="text" placeholder="Enter your text" rows="20" cols="50"></textarea>
    <form id="mainform" action="${pageContext.request.contextPath}/submit" method="post">
        <input type="submit" value="Submit"/>
    </form>
</div>
</body>
</html>