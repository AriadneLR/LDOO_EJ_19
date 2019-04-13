<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
    </head>
       <body>

        <h1>Registro Administrador</h1>
        <form action="RegisterController" method="post">
            <label>Nombre:</label> <input type="text" name="nombre" /><br>
            <label>Contraseña:</label><input type="password" name="pass"  /><br>
            <label>Correo:</label><input type="text" name="correo"  /><br>
            <label>Fecha:</label><input type="text" name="fechanacimiento" /><br>
            <label>Id Empleado:</label><input type="text" name="id_empleado" /><br>
            <input type="submit" value="Registrar" name="Registrar" /><input type="reset" value="Cancelar" name="Cancelar" />
        </form>
    </body>
</html>
