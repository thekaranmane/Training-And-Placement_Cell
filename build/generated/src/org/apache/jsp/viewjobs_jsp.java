package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewjobs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Jobs</title>\n");
      out.write("        <link href=\"stylesheet.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-color:rgb(237,218,193);\n");
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
      out.write("                color:rgb(90,216,210);\n");
      out.write("            }\n");
      out.write("            h2\n");
      out.write("            {\n");
      out.write("                text-align:center;\n");
      out.write("                color:olive;\n");
      out.write("                font-size:30px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function del()\n");
      out.write("            {\n");
      out.write("                if(confirm(\"Do you want to delete This Record ?\"))\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            int count=0;
                         Class.forName("com.mysql.jdbc.Driver");
                         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
                         Statement st= con.createStatement();
                         ResultSet rs = st.executeQuery("select * from addjobs");

        
      out.write("\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"top\">\n");
      out.write("                        <marquee>WELCOME TO TRAINING AND PLACEMENT CELL</marquee>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"header\">\n");
      out.write("                        <img src=\"images/header2.png\" width=\"1510px\" height=\"150px\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
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
      out.write("                      </ul>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"left\">\n");
      out.write("                      \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <h2>View Record</h2>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                    \n");
      out.write("                    <table border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"2\">\n");
      out.write("                        <tr class=\"field_name\">\n");
      out.write("                            <td><div align=\"center\"><strong>Companyid</strong></div></td>\n");
      out.write("                             <td><div align=\"center\"><strong>Companyname</strong></div></td>\n");
      out.write("                            <td><div align=\"center\"><strong>Companydetails</strong></div></td>\n");
      out.write("                            <td><div align=\"center\"><strong>Companyaddress</strong></div></td>\n");
      out.write("                            <td><div align=\"center\"><strong>Companycontactnumber</strong></div></td>\n");
      out.write("                            <td><div align=\"center\"><strong>Requirement</strong></div></td>\n");
      out.write("                            <td><div align=\"center\"><strong>Package</strong></div></td>\n");
      out.write("                            \n");
      out.write("                          \n");
      out.write("                        </tr>\n");
      out.write("                         ");


                         while(rs.next())
                         {
                            rs.getString("Package");
;
                        
      out.write("\n");
      out.write("                        <tr class=\"view_field\">\n");
      out.write("                            <td><div align=\"center\">");
      out.print(++count );
      out.write("</div></td>\n");
      out.write("                          \n");
      out.write("                            \n");
      out.write("                            <td>");
      out.print( rs.getString("Companyname") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("Companydetails") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("Companyaddress") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("Companycontactnumber") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("Requirement") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("Package") );
      out.write("</td>\n");
      out.write("                                                        \n");
      out.write("                                                    </tr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                  \n");
      out.write("                    <center><h1>Record Viewed</h1><br></center>\n");
      out.write("               <center><a href=\"registration.jsp\">Register</a></center>\n");
      out.write("                       <<table border=\"5\" width=\"100%\" height=\"10%\">\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"footer\">\n");
      out.write("                            <ul class=\"footer_ul\">\n");
      out.write("                              <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"About.jsp\">About</a></li>\n");
      out.write("                         <li><a href=\"  viewtraining.jsp\">All Training</a></li>\n");
      out.write("                          <li><a href=\" viewjobs.jsp\">All Jobs </a></li>\n");
      out.write("                          <li><a href=\"Contact.jsp\">Contact Us</a></li>\n");
      out.write("                        \n");
      out.write("                          <li><a href=\"Login.jsp\">Admin</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                       </tr>\n");
      out.write("                       <tr>\n");
      out.write("                          <td class=\"footer\">\n");
      out.write("                            <h3>Developed by : Shruti Bhongale,Karan Mane,Abhiman Kuchekar</h3>\n");
      out.write("                          </td>\n");
      out.write("                       </tr>\n");
      out.write("                    </table>\n");
      out.write("                </tr>\n");
      out.write("          </table>\n");
      out.write("        </form>\n");
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
