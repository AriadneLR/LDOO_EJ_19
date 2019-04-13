<%-- 
    Document   : logout
    Created on : 12/04/2019, 08:12:30 PM
    Author     : Francisco Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <% session.invalidate(); %>
        <br><br>
        <br><br>
        <br><br>
        <br><br>
        <center><b>Sesion finalizada exitosamente!</b></center>
        <br>
        <center><a href="login_form.jsp">Log in</a></center>
        
    </body>
</html>
