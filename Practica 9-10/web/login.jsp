<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>

        
        <h1>Iniciar sesión</h1>
        <form action="LoginController" method="post">
            <label>Nombre:</label> <input type="text" name="nombre" value=""><br>
            <label>Contraseña:</label> <input type="password" name="pass" value="" /><br>
              <select name="Rol">
                <option>Administrador</option>
                <option>Invitado</option>
                <option>Usuario</option>
            </select>
            <input type="submit" value="Iniciar sesión" />
        </form>
        <br>
        Si no tienes cuenta..<a href="registro.jsp">Registrate</a>
    </body>
</html>
