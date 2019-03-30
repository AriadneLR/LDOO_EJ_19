<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%response.sendRedirect("index.htm"); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 5y6</title>
    </head>
       <body>
           <form action="login" method="POST">
               <table>
                   <tbody>
                       <tr>
                           <th>Nombre:</th>
                           <th><input type="text" name="nombre" value="" /></th>
                       </tr>
                       <tr>
                           <td>Contraseña:</td>
                           <td><input type="password" name="contra" value="" /></td>
                       </tr>
                       <tr>
                           <td>Fecha nacimiento:</td>
                           <td><input type="date" name="fecha"></td>
                       </tr>
                       <tr>
                           <td>Correo:</td>
                           <td><input type="text" name="correo" value="" /></td>
                       </tr>
                       <tr>
                           <td><input type="submit" value="Enviar" /></td>
                       </tr>
                       <tr>
                           <td><input type="reset" value="Cancelar" /></td>
                       </tr>
                   </tbody>
               </table>

           </form>          
    </body>
</html>
