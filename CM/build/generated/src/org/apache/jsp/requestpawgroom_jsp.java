package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class requestpawgroom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Request</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/navigation.css\" type=\"text/css\"/>\r\n");
      out.write("        <Link rel=\"icon\" href=\"styles/images/icon.png\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("        <meta name=\"HandheldFriendly\" content=\"true\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body class=\"pawgroom-request\">\r\n");
      out.write("        \r\n");
      out.write("          <div id= \"nav\">\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul class=\"nav nav-right nav fixed\">\r\n");
      out.write("            \r\n");
      out.write("            <li> <form class=\"search\" method=\"post\" action=\"search.jsp\">\r\n");
      out.write("                    <input type=\"text\" name=\"search\" placeholder=\"Search..\"/>\r\n");
      out.write("            </form></li>\r\n");
      out.write("            \r\n");
      out.write("             \r\n");
      out.write("                \r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropbtn\">SERVICES</a>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"pawgroom.jsp\">PawGroom</a>\r\n");
      out.write("                    <a href=\"pawmed.jsp\">PawMed</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"index.jsp\">HOME</a></li>\r\n");
      out.write("               \r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"request\">\r\n");
      out.write("        <form class=\"request-service\" method=\"post\" action=\"request.jsp\">\r\n");
      out.write("        <h2>Services</h2>\r\n");
      out.write("        <input type=\"radio\" name=\"service\" value=\"Nail Trim\"/>Nail Trim<br>\r\n");
      out.write("        <input type=\"radio\" name=\"service\" value=\"Teeth brushing\"/>Brushing of teeth<br>\r\n");
      out.write("        <input type=\"radio\" name=\"service\" value=\"Haircut\"/>Haircut<br>\r\n");
      out.write("        <input type=\"radio\" name=\"service\" value=\"Bath\"/>Bath and Blowdry<br>\r\n");
      out.write("        <input type=\"radio\" name=\"service\" value=\"Pedicure\"/>Pedicure<br>\r\n");
      out.write("        <input type=\"radio\" name=\"service\" value=\"Ear cleaning\"/>Ear Cleaning<br>\r\n");
      out.write("        </form>   \r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        <form action=\"request.jsp\">\r\n");
      out.write("        <h2>Date of Appointment</h2>\r\n");
      out.write("        Enter Month: (e.g. month: January = 01)\r\n");
      out.write("        <input type=\"text\" name=\"appMonth\" value=\"month\" ><br/>\r\n");
      out.write("        \r\n");
      out.write("        Day of month:<input type=\"text\" name=\"appDay\" value=\"day\" ><br/>\r\n");
      out.write("        \r\n");
      out.write("        Year:<input type=\"text\"  name=\"appYear\" value=\"year\"><br/>\r\n");
      out.write("        </form><br>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"request.jsp\">\r\n");
      out.write("        <h2>Time of Appointment</h2>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"time\" name=\"appointmentTime\" value=\"time\">\r\n");
      out.write("        \r\n");
      out.write("        </form><br>\r\n");
      out.write("        \r\n");
      out.write("        <form class=\"request-service\" method=\"post\" action=\"request.jsp\"/>\r\n");
      out.write("            <input type=\"submit\" class=\"button\" name=\"submit\" placeholder=\"Type service/s here...\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("    \r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("    </body>\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
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
