<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Login Page</title>
    <style>
        .button {
            background-color: black; /* Green */
            /*border: none;*/
            color: yellow;
            font-size: 16px;
        }
    </style>
</head>
<body bgcolor="#f5f5dc">
<h1 align="center" style="color:black">Register</h1>
<form action="userpage" method="post">
    User Name :<input type="text" name="userName" placeholder="Enter Username"><br>
    Date of birth: <input type="date" name="userDob" placeholder="DD/MM/YY"><br/>

    <button class="button">login</button>
</form>
</body>
</html>