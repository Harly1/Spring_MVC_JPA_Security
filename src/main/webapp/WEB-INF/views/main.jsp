<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div align="center">
    <h2>List of Users</h2>
    <table border="1" cellpadding="5">

        <tr>
            <td>ID</td><td>LOGIN</td><td>PASSWORD</td><td>ROLE</td><td>ACTIONS</td>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.id}</td>
                <td>${list.login}</td>
                <td>${list.password}</td>
                <td>${list.role}</td>
                <td>
                <a href="<c:url value='/edit-${list.id}-user' />">edit</a>
                <a href="<c:url value='/delete-${list.id}-user' />">delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <br/>
    <a href="<c:url value='/add' />">Add New User</a>
</div>

</table>
</body>
</html>
