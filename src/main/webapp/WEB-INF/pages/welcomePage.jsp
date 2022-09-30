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
    <title> Welcome </title>
</head>
<body>
<h2>users</h2>
<table>
    <tr>
        <th>Info</th>
    </tr>
    <c:forEach var="names" items="${Names}">
            <tr>
            <td>${names.name}</td>
                <td>${names.login}</td>
                <td>${names.password}</td>
            <td>
                <a href="/edit/${names.id}">edit</a>
                <a href="/delete/${names.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
    <a href="/add">Add new user</a>
</table>
</body>
</html>
