package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
response.sendRedirect("index.htm"); 
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Practica 3</title>\r\n");
      out.write("    </head>\r\n");
      out.write("       <body>\r\n");
      out.write("           <form action=\"validar.jsp\" method=\"POST\">\r\n");
      out.write("               <table border=\"1\">\r\n");
      out.write("                   <tbody>\r\n");
      out.write("                       <tr>\r\n");
      out.write("                           <th>Nombre:</th>\r\n");
      out.write("                           <th><input type=\"text\" name=\"nombre\" value=\"\" /></th>\r\n");
      out.write("                       </tr>\r\n");
      out.write("                       <tr>\r\n");
      out.write("                           <td>Contraseña:</td>\r\n");
      out.write("                           <td><input type=\"password\" name=\"contra\" value=\"\" /></td>\r\n");
      out.write("                       </tr>\r\n");
      out.write("                       <tr>\r\n");
      out.write("                           <td>Fecha nacimiento:</td>\r\n");
      out.write("                           <td><input type=\"date\" name=\"fecha\"></td>\r\n");
      out.write("                       </tr>\r\n");
      out.write("                       <tr>\r\n");
      out.write("                           <td>Correo:</td>\r\n");
      out.write("                           <td><input type=\"text\" name=\"correo\" value=\"\" /></td>\r\n");
      out.write("                       </tr>\r\n");
      out.write("                       <tr>\r\n");
      out.write("                           <td><input type=\"submit\" value=\"Enviar\" /></td>\r\n");
      out.write("                       </tr>\r\n");
      out.write("                       <tr>\r\n");
      out.write("                           <td><input type=\"reset\" value=\"Cancelar\" /></td>\r\n");
      out.write("                       </tr>\r\n");
      out.write("                   </tbody>\r\n");
      out.write("               </table>\r\n");
      out.write("\r\n");
      out.write("           </form> \r\n");
      out.write("       \r\n");
      out.write("           \r\n");
      out.write("          \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
