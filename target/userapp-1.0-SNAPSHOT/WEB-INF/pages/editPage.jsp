<%--
  Created by IntelliJ IDEA.
  User: shev4
  Date: 15.09.2022
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty specialUs.name}">
        <title> Add </title>
    </c:if>
    <c:if test="${!empty specialUs.name}">
        <title> Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty specialUs.name}">
    <c:url value="/add" var="var"></c:url>
</c:if>
<c:if test="${!empty specialUs.name}">
    <c:url value="/edit" var="var"></c:url>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty specialUs.name}">
        <input type="hidden" name="id" value="${specialUs.id}">
    </c:if>
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <label for="login">Login</label>
    <input type="text" name="login" id="login" >
    <label for="password">Password</label>
    <input type="text" name="password" id="password">
    <c:if test="${empty specialUs.name}">
        <input type="submit" value="Add new user">
    </c:if>
    <c:if test="${!empty specialUs.name}">
        <input type="submit" value="Edit user">
    </c:if>
</form>
</body>
</html>
