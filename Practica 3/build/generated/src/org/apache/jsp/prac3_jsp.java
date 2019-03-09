package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Classes.Datos;

public final class prac3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Practica 3</title>\n");
      out.write("    </head>\n");
      out.write("       <body>\n");
      out.write("        <form method=\"POST\">\n");
      out.write("            Nombre:<input type=\"text\" size=\"30\" name=\"nombre\"><br>\n");
      out.write("            Edad:<input type=\"text\" size=\"30\" name=\"edad\"><br>\n");
      out.write("            Correo:<input type=\"text\" size=\"30\" name=\"correo\"><br>\n");
      out.write("            Fecha de nacimiento:<input type=\"date\" name=\"fecha\"><br/>\n");
      out.write("            <input type=\"submit\" id=\"enviar\"><input type=\"reset\" value=\"Cancelar\">\n");
      out.write("            ");

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
            
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
