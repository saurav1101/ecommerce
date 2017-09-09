<%-- 
    Document   : index
    Created on : Aug 28, 2017, 10:11:04 AM
    Author     : Saurav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! Saurav</h1>
        <h1> <%out.println("hello world by scriptlet, not good practice though");%> </h1> <!--Scriptlet -->
        <h1> ${el} </h1> <!-- Expression language -->
        <h1> <c:out value = "learning jstl way of printing"/> </h1> <!-- Using JSTL Only -->
        <h1> <c:out value = "${el}"/> </h1> <!--unified expression language (using JSTL and Expression language)-->
        
        
        
    </body>
</html>
