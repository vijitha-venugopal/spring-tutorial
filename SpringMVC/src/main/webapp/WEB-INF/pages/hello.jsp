<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<%--<h2>${hello}</h2>--%>
<h1>Register</h1>
<form method="POST">
    First Name: <input type="text" name="firstName" /><br/>
    Last Name: <input type="text" name="lastName" /><br/>
    Username: <input type="text" name="username" /><br/>
    Password: <input type="password" name="password" /><br/>
    <input type="submit" value="Register" >
</form>
</body>
</html>