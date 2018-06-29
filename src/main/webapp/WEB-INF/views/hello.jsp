<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>

    <title>Spring Security Example </title>
</head>

<body>
<div align="center">

<table border="1">

<c:forEach var="user" items="${user}">

    <caption></caption>
    <thead>

    <tr>
    <th>Wellcome</th>
    <th>${user.login}</th>

    </tr>

    </thead>
</c:forEach>
    </table>

    </div>
</body>

</html>
