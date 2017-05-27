package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class request_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Request Sent</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Your request has been sent!</h1>\r\n");
      out.write("       \r\n");
      out.write("         \r\n");
      out.write("        ");

            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/petcare";
            String dbname = "root";
            String pw = "root";
         
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,dbname,pw);
            PreparedStatement services = con.prepareStatement("select * from appointment");
            
            ResultSet rs = services.executeQuery();
            while (rs.next()) {
      
            
      out.write("\r\n");
      out.write("             <table style=\"width: 50%; border: 2px solid black;\"> \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(rs.getInt("appointment_id"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getString("appointmentDate") );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(rs.getInt("status") );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("          ");

              }
          
      out.write("\r\n");
      out.write("             </table>\r\n");
      out.write("        ");

                con.close();
                rs.close();
                services.close();
         
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
