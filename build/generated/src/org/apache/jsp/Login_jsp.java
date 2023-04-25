package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"stylesheet.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\" />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("            function valid_form()\n");
      out.write("            {\n");
      out.write("                if(document.form_login.username.value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please Enter Username\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                if(document.form_login.password.value ==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please Enter Password\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                 return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            html,body\n");
      out.write("            {\n");
      out.write("                background-color:rgb(234,234,234);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"top\">\n");
      out.write("                        <marquee>WELCOME TO TRAINING AND PLACEMENT CELL </marquee>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"header\">\n");
      out.write("                        <img src=\"images/header1.png\" width=\"1350px\"  height=\"150px\" alt=\"\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"menu\">\n");
      out.write("                       <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"Login.jsp\">Admin</a></li>\n");
      out.write("                        <li><a href=\"Login.jsp\">Student Login</a></li>\n");
      out.write("                        <li><a href=\"Contact.jsp\">Contact Us</a></li>\n");
      out.write("                        <li><a href=\"About.jsp\">About</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <form name=\"form_login\" action=\"valid_login.jsp\" method=\"post\" onsubmit=\"return valid_form();\">\n");
      out.write("                        <table border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"2\">\n");
      out.write("                               <h2 align=\"center\">Login here</h2>\n");
      out.write("                            <tr>\n");
      out.write("                                <td width=\"28%\" rowspan=\"3\">\n");
      out.write("                                    <div align=\"center\">\n");
      out.write("                                        <img src=\"images/admin1.png\" width=\"50\" height=\"50\"/>\n");
      out.write("                                            \n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"lbl_txt\">Username :</td>\n");
      out.write("                                <td><input type=\"text\" name=\"username\" class=\"txt\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"lbl_txt\">Password :</td>\n");
      out.write("                                <td><input type=\"password\" name=\"password\" class=\"txt\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"center\" colspan=\"4\">\n");
      out.write("                                    <input type=\"submit\" name=\"submit\" value=\"Login\" class=\"btn\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <table border=\"0\" width=\"100%\" height=\"100%\">\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"footer\">\n");
      out.write("                            <ul class=\"footer_ul\">\n");
      out.write("                              <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                              <li><a href=\"Login.jsp\">Admin</a></li>\n");
      out.write("                              <li><a href=\"Login.jsp\">Student Login</a></li>\n");
      out.write("                              <li><a href=\"Contact.jsp\">Contact Us</a></li>\n");
      out.write("                              <li><a href=\"About.jsp\">About</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                       </tr>\n");
      out.write("                       <tr>\n");
      out.write("                          <td class=\"footer\">\n");
      out.write("                            <h3>Developed by :Shruti Nitin Bhongale & Karan Mohan Mane </h3>\n");
      out.write("                          </td>\n");
      out.write("                       </tr>\n");
      out.write("                    </table>\n");
      out.write("                </tr>\n");
      out.write("          </table>\n");
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
