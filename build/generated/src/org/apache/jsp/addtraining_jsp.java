package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addtraining_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Training</title>\n");
      out.write("        <link href=\"stylesheet.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-color:rgb(234,234,234);\n");
      out.write("            }\n");
      out.write("            .wel\n");
      out.write("            {\n");
      out.write("              color:rgb(121,56,250);\n");
      out.write("              font-size:24px;\n");
      out.write("            }\n");
      out.write("            .bm\n");
      out.write("            {\n");
      out.write("                color:red;\n");
      out.write("                font-size:18px;\n");
      out.write("            }\n");
      out.write("            a\n");
      out.write("            {\n");
      out.write("                text-decoration:none;\n");
      out.write("                color:maroon;\n");
      out.write("                font-size:20px;\n");
      out.write("            }\n");
      out.write("            a:hover\n");
      out.write("            {\n");
      out.write("                text-decoration:underline;\n");
      out.write("                color:rgb(102,160,50);\n");
      out.write("            }\n");
      out.write("            h2\n");
      out.write("            {\n");
      out.write("                text-align:center;\n");
      out.write("                color:olive;\n");
      out.write("                font-size:30px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            function insvalid()\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                if(document.form_insert.first.value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please Enter First Name\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("               if(document.form_insert.last.value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please Enter Last Name\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("               if(document.form_insert.address.value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please Enter Address\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("               if(document.form_insert.city.value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please Enter City\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("               if(document.form_insert.mobile.value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please Enter Mobile No\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("               if(document.form_insert.email.value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please Enter Email Id\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("               if(document.form_insert.pin.value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please Enter Pin code\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                   return true;\n");
      out.write("                   \n");
      out.write("            }\n");
      out.write("            function clear()\n");
      out.write("            {\n");
      out.write("                id.value=\"\";\n");
      out.write("                first.value = \"\";\n");
      out.write("                last.value = \"\";\n");
      out.write("                address.value = \"\";\n");
      out.write("                city.value = \"\";\n");
      out.write("                mobile.value = \"\";\n");
      out.write("                email.value = \"\";\n");
      out.write("                pin.value = \"\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"top\">\n");
      out.write("                        <marquee>WELCOME TO TRAINING AND PLACEMENT </marquee>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"header\">\n");
      out.write("                        <img src=\"images/header2.png\" width=\"1510px\" height=\"150px\"/>                    \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"menu\">\n");
      out.write("                       <ul>\n");
      out.write("                        <li><a href=\"Admin.jsp\">Add Training </a></li>\n");
      out.write("                         <li><a href=\"addjobs.jsp\">Add Jobs </a></li>\n");
      out.write("                        \n");
      out.write("                      </ul>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"left\">\n");
      out.write("                      <strong class=\"wel\">Welcome&nbsp;</strong><strong class=\"bm\">");
      out.print( session.getAttribute("userName") );
      out.write("</strong><br>\n");
      out.write("                       <a href=\"Login.jsp\">Logout</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                    \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <h2>Add Training</h2>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <form name=\"form_insert\" action=\"insertraining.jsp\" method=\"post\" onsubmit=\"return insvalid();\">\n");
      out.write("                        <table border=\"0\" align=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                                   <td class=\"lbl_txt\">Training Name :</td>\n");
      out.write("                                   <td><input type=\"text\" name=\"Trainingname\" class=\"txt\" /></td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <td class=\"lbl_txt\">Training Date :</td>\n");
      out.write("                                   <td><input type=\"text\" name=\"Trainingdate\" class=\"txt\" /></td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                  \n");
      out.write("                                   \n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   \n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <td class=\"lbl_txt\">Lecturer :</td>\n");
      out.write("                                   <td><input type=\"text\" name=\"Lecturer\" class=\"txt\" /></td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <td class=\"lbl_txt\">About Training:</td>\n");
      out.write("                                   <td><input type=\"text\" name=\"Abouttraining\" class=\"txt\" /></td>\n");
      out.write("                               </tr>\n");
      out.write("                               \n");
      out.write("                               <tr>\n");
      out.write("                                   <td>\n");
      out.write("                                       <input type=\"submit\" name=\"submit\" value=\"Insert\" class=\"btn\" />\n");
      out.write("                                   </td>\n");
      out.write("                                   <td>\n");
      out.write("                                       <input type=\"reset\" value=\"Reset\" name=\"reset\"  class=\"btn\" onclick=\"return clear();\" />\n");
      out.write("                                   </td>\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                 <td align=\"center\" colspan=\"2\">\n");
      out.write("                                    <a href=\"viewtraining.jsp\">View Records</a>\n");
      out.write("                                 </td>\n");
      out.write("                               </tr>\n");
      out.write("                        </table>                   \n");
      out.write("                    </form>\n");
      out.write("                  \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <table border=\"0\" width=\"100%\" height=\"10%\">\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"footer\">\n");
      out.write("                            <ul class=\"footer_ul\">\n");
      out.write("                              <li><a href=\"Admin.jsp\">Add Record</a></li>\n");
      out.write("                              <li><a href=\"Delete.jsp\">Delete Record</a></li>\n");
      out.write("                              \n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                       </tr>\n");
      out.write("                       <tr>\n");
      out.write("                          <td class=\"footer\">\n");
      out.write("                            <h3>Developed by : Karan Mane,Shruti Bhongale,Abhiman Kuchekar</h3>\n");
      out.write("                          </td>\n");
      out.write("                       </tr>\n");
      out.write("                       \n");
      out.write("                    </table>\n");
      out.write("                </tr>\n");
      out.write("          </table>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>");
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
