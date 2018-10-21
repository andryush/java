<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 10/21/18
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/loginstyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please Sign Up!
    </div>
    <form method="post" action="${pageContext.request.contextPath}/signUp">
        <label for="name">User name
            <input class="login-input" type="text" id="name" name="name">
        </label>
        <label for="birthDate">Birth date
            <input class="login-input" type="text" id="birthDate" name="birthDate">
        </label>
        <label for="password">Password
            <input class="login-input" type="password" id="password" name="password">
        </label>
        <input type="submit" value="Sign Up" class="login-button">
    </form>
</div>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already registered!
    </div>
    <table>
        <tr>
            <th>User name</th>
            <th>Birth Date</th>
        </tr>
        <c:forEach items="${usersFromServer}" var="user">
            <tr>
                <td>${user.name}</td>
                <td>${user.birthDate}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
