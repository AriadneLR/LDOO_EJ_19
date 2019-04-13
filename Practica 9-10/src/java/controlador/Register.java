package controlador;

import beans.Administrador;
import beans.Invitado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import beans.Normal;
import javax.servlet.http.HttpSession;

public class Register extends HttpServlet {

    protected void processRequestNormal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          Normal user = new Normal();
          
          user.setUsserName(request.getParameter("ussername"));
          user.setPassword(request.getParameter("password"));
          user.setCorreo(request.getParameter("correo"));
          user.setFecha_nacimiento(request.getParameter("fecha_nacimiento"));
          user.setTipo_suscripcion(request.getParameter("tipo_suscripcion"));
          user.setDomicilio(request.getParameter("domicilio"));
          
          user.RegistroUser();
          
          out.println("<br>");
          out.println("Gracias por tu registro");
          RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
          rd.forward(request, response);
        }finally {out.close();}
    }
    
     protected void processRequestAdmin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          Administrador user = new Administrador();
          
          user.setUsserName(request.getParameter("ussername"));
          user.setPassword(request.getParameter("password"));
          user.setCorreo(request.getParameter("correo"));
          user.setFecha_nacimiento(request.getParameter("fecha_nacimiento"));
          user.setNumero_empleado(Integer.parseInt(request.getParameter("numero_empleado")));

          
          user.RegistroUser();
          
          out.println("<br>");
          out.println("Gracias por tu registro");
          RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
          rd.forward(request, response);
        }finally {out.close();}
    }
    
     protected void processRequestInvitado(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          Invitado user = new Invitado();
          
          user.setUsserName(request.getParameter("ussername"));
          user.setPassword(request.getParameter("password"));
          user.setCorreo(request.getParameter("correo"));
          user.setFecha_nacimiento(request.getParameter("fecha_nacimiento"));
          user.setNombre(request.getParameter("nombre"));
          user.setFecha_registro((int) request.getDateHeader("fecha_registro"));

          
          user.RegistroUser();
          
          out.println("<br>");
          out.println("Gracias por tu registro");
          RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
          rd.forward(request, response);
        }finally {out.close();}
    }

}
