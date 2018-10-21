<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 10/20/18
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Changing color</title>
</head>
<body>
<span style="color: ${cookie.color.value}">Welcome to home</span>
<form method="post" action="/home">
    <label for="color">
        <select name="color" id="color">
            <option value="red">Red</option>
            <option value="black">Black</option>
            <option value="blue">Blue</option>
        </select>
    </label>
    <input type="submit" value="Color send">
</form>

</body>
</html>
