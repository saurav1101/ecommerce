<%-- 
    Document   : login
    Created on : Sep 16, 2017, 9:57:29 AM
    Author     : SAURAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Please Login</h1>
        <form action="${pageContext.request.contextPath}/login" method="POST">
            <p> Username: <input type="text" name="username"/> </p>
            <p> Password: <Input type="password" name="password"/> </p>
            <p> <input type="submit" value="Login"/> </p>
        </form>
    </body>
</html>
