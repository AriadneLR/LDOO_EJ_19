<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>

        <h1>Registro de usuario</h1>
        <form action="RegistroNormal" method="post">
            <label>Nombre:</label> <input type="text" name="nombre" /><br>
            <label>Contraseña:</label><input type="password" name="pass" /><br>
            <label>Correo:</label><input type="text" name="correo" /><br>
            <label>Fecha:</label><input type="text" name="fechanacimiento" /><br>
            <select name="tipo_suscripcion">
                <option>Normal</option>
                <option>Premium</option>
            </select>
            <label>Domicilio: </label><input type="text" name="domicilio" value="" />
            <input type="submit" value="Registrar" name="Registrar" /><input type="reset" value="Cancelar" name="Cancelar" />
        </form>
    </body>
</html>
