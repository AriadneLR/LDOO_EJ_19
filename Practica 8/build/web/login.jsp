<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.User"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <jsp:useBean id="nombre" scope="request" class="beans.User"></jsp:useBean>
        
        <h1>Iniciar sesión</h1>
        <form action="LoginController" method="post">
            <label>Nombre:</label> <input type="text" name="nombre" value=""><br>
            <label>Contraseña:</label> <input type="password" name="pass" value="" /><br>
            <input type="submit" value="Iniciar sesión" />
        </form>
        <br>
        Si no tienes cuenta..<a href="registro.jsp">Registrate</a>
    </body>
</html>
