<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Being Java Guys | Hello World</title>
    <style>
        .form {
            text-align: center;
        }
    </style>
</head>
<body>
<form class="form">
        <h2>Being Java Guys | Hello World</h2>
        <h4>${string}</h4>
        <h2>
            Click To | <a href="<c:url value="j_spring_security_logout" />">
            Logout</a>
        </h2>
</form>

</body>
</html>

