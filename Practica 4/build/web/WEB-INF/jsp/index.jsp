<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%response.sendRedirect("index.htm"); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 3</title>
    </head>
       <body>
        <form action="hacer">
            Nombre:<input type="text" size="30" name="nombre"><br>
            Apellido:<input type="text" size="30" name="nombre"><br>
            Edad:<input type="text" size="30" name="edad"><br>
            Correo:<input type="text" size="30" name="correo"><br>
            <input type="submit" id="enviar"><input type="reset" value="Cancelar">
         </form>
           
           <c:if test="${user!=null}">
               <br>Nombre: ${user.nombre}
               <br>Apellido: ${user.apellido}
               <br>Correo: ${user.correo}
               <br>Edad: ${user.edad}
           </c:if>
    </body>
</html>
