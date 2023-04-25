package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewtraining_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>View Training</title>\r\n");
      out.write("        <link href=\"stylesheet.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\" />\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            body\r\n");
      out.write("            {\r\n");
      out.write("                background-color:rgb(237,218,193);\r\n");
      out.write("            }\r\n");
      out.write("            .wel\r\n");
      out.write("            {\r\n");
      out.write("              color:rgb(121,56,250);\r\n");
      out.write("              font-size:24px;\r\n");
      out.write("            }\r\n");
      out.write("            .bm\r\n");
      out.write("            {\r\n");
      out.write("                color:red;\r\n");
      out.write("                font-size:18px;\r\n");
      out.write("            }\r\n");
      out.write("            a\r\n");
      out.write("            {\r\n");
      out.write("                text-decoration:none;\r\n");
      out.write("                color:maroon;\r\n");
      out.write("                font-size:20px;\r\n");
      out.write("            }\r\n");
      out.write("            a:hover\r\n");
      out.write("            {\r\n");
      out.write("                text-decoration:underline;\r\n");
      out.write("                color:rgb(90,216,210);\r\n");
      out.write("            }\r\n");
      out.write("            h2\r\n");
      out.write("            {\r\n");
      out.write("                text-align:center;\r\n");
      out.write("                color:olive;\r\n");
      out.write("                font-size:30px;\r\n");
      out.write("            }\r\n");
      out.write("           \r\n");
      out.write("        </style>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function del()\r\n");
      out.write("            {\r\n");
      out.write("                if(confirm(\"Do you want to delete This Record ?\"))\r\n");
      out.write("                {\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("                else\r\n");
      out.write("                {\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            int count=0;
                         Class.forName("com.mysql.jdbc.Driver");
                         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
                         Statement st= con.createStatement();
                         ResultSet rs = st.executeQuery("select * from addtraining");

        
      out.write("\r\n");
      out.write("            <table border=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"top\">\r\n");
      out.write("                        <marquee>WELCOME TO TRAINING AND PLACEMENT CELL</marquee>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"header\">\r\n");
      out.write("                        <img src=\"images/header2.png\" width=\"1510px\" height=\"150px\"/>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"menu\">\r\n");
      out.write("                       <ul>\r\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"About.jsp\">About</a></li>\r\n");
      out.write("                         <li><a href=\"  viewtraining.jsp\">All Training</a></li>\r\n");
      out.write("                          <li><a href=\" viewjobs.jsp\">All Jobs </a></li>\r\n");
      out.write("                          <li><a href=\"Contact.jsp\">Contact Us</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                          <li><a href=\"Login.jsp\">Admin</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                      </ul>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"left\">\r\n");
      out.write("                      \r\n");
      out.write("                       \r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <h2>View Record</h2>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <table border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"2\">\r\n");
      out.write("                        <tr class=\"Trainingname\">\r\n");
      out.write("                            <td><div align=\"center\"><strong>Trainingid</strong></div></td>\r\n");
      out.write("                             <td><div align=\"center\"><strong>Trainingname</strong></div></td>\r\n");
      out.write("                            <td><div align=\"center\"><strong>Trainingdate </strong></div></td>\r\n");
      out.write("                            \r\n");
      out.write("                            <td><div align=\"center\"><strong>Lecturer</strong></div></td>\r\n");
      out.write("                            <td><div align=\"center\"><strong>Abouttraining</strong></div></td>\r\n");
      out.write("                            \r\n");
      out.write("                          \r\n");
      out.write("                        </tr>\r\n");
      out.write("                         ");


                         while(rs.next())
                         {
                            rs.getString("Abouttraining");
;
                        
      out.write("\r\n");
      out.write("                        <tr class=\"viewefield\">\r\n");
      out.write("                            <td><div align=\"center\">");
      out.print(++count );
      out.write("</div></td>\r\n");
      out.write("                          \r\n");
      out.write("                            <td>");
      out.print( rs.getString("Trainingname") );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( rs.getString("Trainingdate") );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( rs.getString("Lecturer") );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( rs.getString("Abouttraining") );
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                                                        \r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                  \r\n");
      out.write("               <center><h1>Record Viewed</h1><br></center>\r\n");
      out.write("               <center><a href=\"registration.jsp\">Register</a></center>\r\n");
      out.write("                       <tr>\r\n");
      out.write("                    <table border=\"5\" width=\"100%\" height=\"10%\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td class=\"footer\">\r\n");
      out.write("                            <ul class=\"footer_ul\">\r\n");
      out.write("                              <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"About.jsp\">About</a></li>\r\n");
      out.write("                         <li><a href=\"  .jsp\">All Training</a></li>\r\n");
      out.write("                          <li><a href=\" .jsp\">All Jobs </a></li>\r\n");
      out.write("                          <li><a href=\"Contact.jsp\">Contact Us</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                          <li><a href=\"Login.jsp\">Admin</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                          </td>\r\n");
      out.write("                       </tr>\r\n");
      out.write("                       <tr>\r\n");
      out.write("                          <td class=\"footer\">\r\n");
      out.write("                            <h3>Developed by :Shruti Bhongale & Karan Mane & Abhiman Kuchekar</h3>\r\n");
      out.write("                          </td>\r\n");
      out.write("                       </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("        </form>\r\n");
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
