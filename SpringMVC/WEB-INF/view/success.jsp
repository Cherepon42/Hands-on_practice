<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Влад
  Date: 24.01.2023
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h2> Your registration done!</h2>
<br><br>
Your name - ${employee.name}
<br>
Your salary - ${employee.salary}
<br>
Your department - ${employee.department}
<br>
Your car - ${employee.car}
<br>
Your languages:
<ul>
<c:forEach var="language" items="${employee.languages}">
    <li>
        ${language}
    </li>
</c:forEach>
</ul>

</body>
</html>
