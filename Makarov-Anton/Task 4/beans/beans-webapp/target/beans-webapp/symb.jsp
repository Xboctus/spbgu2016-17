<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Symbol counter</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
</head>

<body>

<a href="${pageContext.request.contextPath}/users">Users list</a>
 <form action="SymbolServlet" method="post">
     <input name="firstinput" type="text" value=<%=request.getParameter("firstinput") %>>
     <br>
     <input type="submit" value="Try">
    </form>

</body>
</html>
