<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.Administrador"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
   <body>
                <%  
            HttpSession sessionUser=request.getSession(false);  
            String us=(String)sessionUser.getAttribute("user");
            
            Administrador user = new Administrador();
            user.setUsserName(us);
            user.GetUser();
            
            out.print("Bienvenido ");
            out.print(user.getUsserName());
            out.print(" Tu fecha de nacimiento es:");
            out.print(user.getFecha_nacimiento());
            out.print("!!!");
        %>
                
        <br><br>
        <a href="logout.jsp">Log Out</a>
        <br><br>   
                    
    </body>
</html>