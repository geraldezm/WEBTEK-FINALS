package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pg_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/style.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/style2.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/navigation.css\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id= \"nav\">\n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"nav nav-right nav fixed\">\n");
      out.write("            \n");
      out.write("            <li> <form class=\"search\" method=\"post\" action=\"search.jsp\">\n");
      out.write("                    <input type=\"text\" name=\"search\" placeholder=\"Search..\"/>\n");
      out.write("            </form></li>\n");
      out.write("           \n");
      out.write("               \n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropbtn\">SERVICES</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"requestpawgroom.jsp\">PawGroom</a>\n");
      out.write("                    <a href=\"requestpawmed.jsp\">PawMed</a>\n");
      out.write("                </div>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"container4\">\n");
      out.write("    \t\t\t\t<div id=\"container3\">\n");
      out.write("        \t\t\t\t<div id=\"container2\">\n");
      out.write("            \t\t\t\t<div id=\"container1\">\n");
      out.write("\t\t\t\t\t\t        <div id=\"col1\">\n");
      out.write("\t\t\t\t\t\t            <!-- Column one start -->\n");
      out.write("\t\t\t\t\t\t            <h2>Grooming</h2>\n");
      out.write("\t\t\t\t\t\t            <img src =\"images/Petcessories/soap1.jpg\" alt = \"groom\" style=\"width:80%\"/>\n");
      out.write("\t\t\t\t\t\t            <li>For pets who needs haircut.</li>\n");
      out.write("\t\t\t\t\t\t            <h3>Service Includes</h3>\n");
      out.write("\t\t\t\t\t\t            <li> Ear Cleaning</li>\n");
      out.write("\t\t\t\t\t\t            <li> Anal Gland Cleaning </li>\n");
      out.write("\t\t\t\t\t\t            <li> Shampooing</li>\n");
      out.write("\t\t\t\t\t\t            <!-- Column one end -->\n");
      out.write("\t\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t        <div id=\"col2\">\n");
      out.write("\t\t\t\t\t\t            <!-- Column two start -->\n");
      out.write("\t\t\t\t\t\t            <h2>Bathing</h2>\n");
      out.write("\t\t\t\t\t\t            <img src =\"images/Petcessories/hygiene.jpg\" alt = \"Bathing\" style=\"width:80%\"/>\n");
      out.write("\t\t\t\t\t\t            <li>Refresh your pets.</li>\n");
      out.write("\t\t\t\t\t\t            <h3>Service Includes</h3>\n");
      out.write("\t\t\t\t\t\t            <li>Shampooing</li>\n");
      out.write("\t\t\t\t\t\t            <li> Hot Oil </li>\n");
      out.write("\t\t\t\t\t\t            <!-- Column two end -->\n");
      out.write("\t\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t        <div id=\"col3\">\n");
      out.write("\t\t\t\t\t\t            <!-- Column three start -->\n");
      out.write("\t\t\t\t\t\t            <h2>Clothing</h2>\n");
      out.write("\t\t\t\t\t\t            <img src =\"images/Petcessories/costumes.jpg\" alt = \"Clothing\" style=\"width:80%\"/>\n");
      out.write("\t\t\t\t\t\t            <li>For you fashionista styling needs.</li>\n");
      out.write("\t\t\t\t\t\t            <h3>Service Includes</h3>\n");
      out.write("\t\t\t\t\t\t            <li> Costume</li>\n");
      out.write("\t\t\t\t\t\t            <li> Shoes </li>\n");
      out.write("\t\t\t\t\t\t            <li> Ribbons </li>\n");
      out.write("\t\t\t\t\t\t            <!-- Column three end -->\n");
      out.write("\t\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t        <div id=\"col4\">\n");
      out.write("\t\t\t\t\t\t            <!-- Column four start -->\n");
      out.write("\t\t\t\t\t\t            <h2>Brush</h2>\n");
      out.write("\t\t\t\t\t\t            <img src =\"images/Petcessories/pettoothbrush-toothpaste.jpg\" alt = \"Clothing\" style=\"width:80%\"/>\n");
      out.write("\t\t\t\t\t\t            <li>Dont let tangled hairs on your pets</li>\n");
      out.write("\t\t\t\t\t\t            <h3> Service Includes </h3>\n");
      out.write("\t\t\t\t\t\t            <li> Hair Brushing </li> \n");
      out.write("\t\t\t\t\t\t            <!-- Column four end -->\n");
      out.write("\t\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t        <!-- End Of Container 1 -->\n");
      out.write("            \t\t\t\t</div>\n");
      out.write("            \t\t\t\t<!-- End Of Container 2 -->\n");
      out.write("        \t\t\t\t</div>\n");
      out.write("        \t\t\t\t<!-- End Of Container 3 -->\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t\t<!-- End Of Container 4 -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
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
