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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index</title>\n");
      out.write("        <link href=\"stylesheet.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"top\">\n");
      out.write("                       <marquee>WELCOME TO TRAINING AND PLACEMENT CELL </marquee>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <center>\n");
      out.write("                            <td class=\"header\">\n");
      out.write("                        <img src=\"images/header2.png\" width=\"1510px\"  height=\"150px\" alt=\"\" />\n");
      out.write("                    </td>\n");
      out.write("                    </center>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"menu\">\n");
      out.write("                       <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"About.jsp\">About</a></li>\n");
      out.write("                         <li><a href=\"  viewtraining.jsp\">All Training</a></li>\n");
      out.write("                          <li><a href=\" viewjobs.jsp\">All Jobs </a></li>\n");
      out.write("                          <li><a href=\"Contact.jsp\">Contact Us</a></li>\n");
      out.write("                        \n");
      out.write("                          <li><a href=\"Login.jsp\">Admin</a></li>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                      </ul>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" class=\"img_slide\">\n");
      out.write("                       \n");
      out.write("                       <marquee>\n");
      out.write("\n");
      out.write("                        <img src=\"images/clg1.jpg\" width=\"1000px\" height=\"350px\" />\n");
      out.write("                         <img src=\"images/clg2.jpg\" width=\"1000px\" height=\"350px\" />\n");
      out.write("                         <img src=\"images/clg4.jpg\" width=\"1000px\" height=\"350px\" />\n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </marquee>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <table border=\"5\" width=\"100%\" height=\"10%\">\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"footer\">\n");
      out.write("                            <ul class=\"footer_ul\">\n");
      out.write("                              <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"About.jsp\">About</a></li>\n");
      out.write("                         <li><a href=\"viewtraining  .jsp\">All Training</a></li>\n");
      out.write("                          <li><a href=\"viewjobs.jsp\">All Jobs </a></li>\n");
      out.write("                          <li><a href=\"Contact.jsp\">Contact Us</a></li>\n");
      out.write("                        \n");
      out.write("                          <li><a href=\"Login.jsp\">Admin</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                       </tr>\n");
      out.write("                       <tr>\n");
      out.write("                          <td class=\"footer\">\n");
      out.write("                            <h3>Developed by :Shruti Bhongale & Karan Mane & Abhiman Kuchekar</h3>\n");
      out.write("                          </td>\n");
      out.write("                       </tr>\n");
      out.write("                    </table>\n");
      out.write("                </tr>\n");
      out.write("          </table>\n");
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
