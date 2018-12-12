<%--
  Created by IntelliJ IDEA.
  User: jarik
  Date: 12.12.2018
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<form action="j_security_check" method="post">
Username: <input type="text" name="j_username"/><br/>
Password: <input type="password" name="j_password"/><br/>
<input type="submit" name="Login"><br/>
</form>
</body>
</html>
