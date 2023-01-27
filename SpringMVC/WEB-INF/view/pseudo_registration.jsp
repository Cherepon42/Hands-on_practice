<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Влад
  Date: 24.01.2023
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
</head>
<body >
<h2>Please enter your name!</h2>
<br>

<%--@elvariable id="employee" type="vlad"--%>
<form:form action="success" modelAttribute="employee">
    Name
    <form:input path="name" size="6"/>
    <form:errors path="name"/>
    <br><br>
    Salary
    <form:input path="salary"/>
    <br><br>
    Department
    <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Car
    <form:radiobuttons path="car" items="${employee.cars}"/>
    <br><br>
    Foreign languages:
    <br>
    <form:checkboxes path="languages" items="${employee.languagesMap}"/>
    <br>
    <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <input type="submit" value="Send">

</form:form>
</body>
</html>
