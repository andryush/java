<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 10/21/18
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="../css/loginstyle.css" rel="stylesheet" type="text/css">
</head>
<body>

<form method="post" action="/login" class="login">
    <h1 class="login-title">Please login</h1>
    <input type="text" id="name" name="name" placeholder="Username or email" class="login-input" autofocus>
    <input type="password" id="password" name="password" placeholder="Password" class="login-input">
    <input type="submit" value="Login" class="login-button">
</form>

</body>
</html>
