<%@ page contentType="text/html; charset=utf-8" import="Classes.Datos" errorPage=""%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 3</title>
    </head>
       <body>
        <form method="POST">
            Nombre:<input type="text" size="30" name="nombre"><br>
            Edad:<input type="text" size="30" name="edad"><br>
            Correo:<input type="text" size="30" name="correo"><br>
            Fecha de nacimiento:<input type="date" name="fecha"><br/>
            <input type="submit" id="enviar"><input type="reset" value="Cancelar">
            <%
                try{
                    if(request.getParameter("nombre")!=null){
                        Datos d=new Datos();
                        d.setNombre(request.getParameter("nombre"));
                        d.setEdad(Integer.parseInt(request.getParameter("edad")));
                        d.setCorreo(request.getParameter("correo"));
                        d.setFecha(Integer.parseInt(request.getParameter("fecha")));
                        out.println("<br>Tu Nombre es: "+d.getNombre());
                        out.println("<br>Tu Edad es: "+d.getEdad());
                        out.println("<br>Tu Correo es: "+d.getCorreo());
                        out.println("<br>Tu Fecha de nacimiento es: "+d.getFecha());
                    }
                }
                catch(Exception ex){
                    out.println("");
                }
            %>
        </form>
    </body>
</html>
