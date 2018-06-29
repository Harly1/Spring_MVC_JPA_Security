<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <h1>Please login</h1>
    <title>Spring Security Example </title>
</head>
<body>
<%--<div th:if="${param.error}">
    Invalid username and password.
</div>
<div th:if="${param.logout}">
    You have been logged out.
</div>--%>
<form action="/login" method="POST">
    <div><label> User Name: <input type="text" name="username"/> </label></div>
    <div><label> Password: &nbsp;&nbsp;&nbsp;<input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Sign In"/></div>
</form>
</body>
</html>
