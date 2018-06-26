<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/edit-{id}-user" modelAttribute="user">

    <table>
        <tr>
            <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
        </tr>

        <tr>

            <td>
                <%--@declare id="login"--%><label for="login">login:    </label>
                <input type="text" name="login" size="45" value="<c:out value='${user.login}'/>"/>
            </td>

        </tr>

        <tr>
            <td>
                <%--@declare id="password"--%><label for="password">password: </label>
                <input type="text" name="password" size="45" value="<c:out value='${user.password}'/>"/>
            </td>
        </tr>

        <tr>
            <td>
                <%--@declare id="role"--%><label for="role">role:     </label>
                <%--<td><form:input path="role" value="role"/></td>--%>
                <input type="text" name="role" size="45" value="<c:out value='${user.role}'/>"/>
            </td>
        </tr>

    </table>

    <input type="submit" value="submit"/>

</form>
Go back to <a href="<c:url value='/list' />">List of All Users</a>
</body>
</html>