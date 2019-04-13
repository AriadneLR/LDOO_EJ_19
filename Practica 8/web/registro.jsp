<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "beans.User" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <jsp:useBean id="user" scope="request" class="beans.User"></jsp:useBean>
        <h1>Registro de usuario</h1>
        <form action="RegisterController" method="post">
            <label>Nombre:</label> <input type="text" name="nombre" value="<jsp:getProperty name="user" property="nombre"/>" /><br>
            <label>Contraseña:</label><input type="password" name="pass" value="<jsp:getProperty name="user" property="password"/>" /><br>
            <label>Correo:</label><input type="text" name="correo" value="<jsp:getProperty name="user" property="correo"/>" /><br>
            <label>Fecha:</label><input type="text" name="fechanacimiento" value="<jsp:getProperty name="user" property="fecha_nacimiento"/>"><br>
            <input type="submit" value="Registrar" name="Registrar" /><input type="reset" value="Cancelar" name="Cancelar" />
        </form>
    </body>
</html>
