<%-- 
    Document   : registro
    Created on : 6/04/2019, 12:49:07 AM
    Author     : Francisco Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Registro de usuario</h1>
        <form action="nuevousuario" method="POST">
            <label>Nombre:</label> <input type="text" name="nombre" value="" /><br>
            <label>Contraseña:</label><input type="password" name="pass" value="" /><br>
            <label>Correo:</label><input type="text" name="correo" value="" /><br>
            <label>Fecha:</label><input type="text" name="fechanacimiento" placeholder="1994-03-29"><br>
            <input type="submit" value="Registrar" name="Registrar" /><input type="reset" value="Cancelar" name="Cancelar" />
        </form>
    </body>
</html>
