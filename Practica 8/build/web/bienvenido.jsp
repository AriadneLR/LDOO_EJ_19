<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.User"%>
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
            
            User user = new User();
            user.setNombre(us);
            user.GetUser();
            
            out.print("Bienvenido ");
            out.print(user.getNombre());
            out.print(" Tu fecha de nacimiento es:");
            out.print(user.getFecha_nacimiento());
            out.print("!!!");
        %>
                
        <br><br>
        <a href="logout.jsp">Log Out</a>
        <br><br>   
                    
    </body>
</html>
