package org.apache.jsp;

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/style.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/navigation.css\" type=\"text/css\"/>\r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <div id= \"nav\">\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul class=\"nav nav-right nav fixed\">\r\n");
      out.write("            \r\n");
      out.write("            <li> <form class=\"search\" method=\"post\" action=\"search.jsp\">\r\n");
      out.write("                    <input type=\"text\" name=\"search\" placeholder=\"Search..\"/>\r\n");
      out.write("            </form></li>\r\n");
      out.write("           \r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropbtn\">SERVICES</a>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"requestpawgroom.jsp\">PawGroom</a>\r\n");
      out.write("                    <a href=\"requestpawmed.jsp\">PawMed</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"index.jsp\">HOME</a></li>\r\n");
      out.write("               \r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"banner\">\r\n");
      out.write("            <div class=\"inner-par\">\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <section class=\"home\">\r\n");
      out.write("            <div class=\"services\">\r\n");
      out.write("                <h1>Services</h1>\r\n");
      out.write("                \r\n");
      out.write("                <h2><a href=\"pawgroom.jsp\">PawGroom</a></h2>\r\n");
      out.write("                <p>For your grooming needs</p>\r\n");
      out.write("                <h2><a href=\"pawmed.jsp\">PawMed</a></h2>\r\n");
      out.write("                <p>Best health care for your pet</p>\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"home aboutus\">\r\n");
      out.write("            <div class=\"inner-par\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("       \r\n");
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
