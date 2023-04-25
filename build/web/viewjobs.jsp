<%-- 
    Document   : registrationview
    Created on : 23 May, 2022, 6:40:19 PM
    Author     : karan Mane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Jobs</title>
        <link href="stylesheet.css" type="text/css" rel="stylesheet" media="all" />
        <style type="text/css">
            body
            {
                background-color:rgb(237,218,193);
            }
            .wel
            {
              color:rgb(121,56,250);
              font-size:24px;
            }
            .bm
            {
                color:red;
                font-size:18px;
            }
            a
            {
                text-decoration:none;
                color:maroon;
                font-size:20px;
            }
            a:hover
            {
                text-decoration:underline;
                color:rgb(90,216,210);
            }
            h2
            {
                text-align:center;
                color:olive;
                font-size:30px;
            }
           
        </style>
        <script type="text/javascript">
            function del()
            {
                if(confirm("Do you want to delete This Record ?"))
                {

                }
                else
                {
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <%
            int count=0;
                         Class.forName("com.mysql.jdbc.Driver");
                         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
                         Statement st= con.createStatement();
                         ResultSet rs = st.executeQuery("select * from addjobs");

        %>
            <table border="0">
                <tr>
                    <td class="top">
                        <marquee>WELCOME TO TRAINING AND PLACEMENT CELL</marquee>
                    </td>
                </tr>
                <tr>
                    <td class="header">
                        <img src="images/header2.png" width="1510px" height="150px"/>
                    </td>
                </tr>
                <tr>
                    <td class="menu">
                       <ul>
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="About.jsp">About</a></li>
                         <li><a href="  viewtraining.jsp">All Training</a></li>
                          <li><a href=" viewjobs.jsp">All Jobs </a></li>
                          <li><a href="Contact.jsp">Contact Us</a></li>
                        
                          <li><a href="Login.jsp">Admin</a></li>
                      </ul>
                    </td>
                </tr>
                
                <tr>
                    <td align="left">
                      
                    </td>
                </tr>

                <tr>
                    <td>
                        <h2>View Record</h2>
                    </td>
                </tr>
                    
                    <table border="0" align="center" cellpadding="2" cellspacing="2">
                        <tr class="field_name">
                            <td><div align="center"><strong>Companyid</strong></div></td>
                             <td><div align="center"><strong>Companyname</strong></div></td>
                            <td><div align="center"><strong>Companydetails</strong></div></td>
                            <td><div align="center"><strong>Companyaddress</strong></div></td>
                            <td><div align="center"><strong>Companycontactnumber</strong></div></td>
                            <td><div align="center"><strong>Requirement</strong></div></td>
                            <td><div align="center"><strong>Package</strong></div></td>
                            
                          
                        </tr>
                         <%

                         while(rs.next())
                         {
                            rs.getString("Package");
;
                        %>
                        <tr class="view_field">
                            <td><div align="center"><%=++count %></div></td>
                          
                            
                            <td><%= rs.getString("Companyname") %></td>
                            <td><%= rs.getString("Companydetails") %></td>
                            <td><%= rs.getString("Companyaddress") %></td>
                            <td><%= rs.getString("Companycontactnumber") %></td>
                            <td><%= rs.getString("Requirement") %></td>
                            <td><%= rs.getString("Package") %></td>
                                                        
                                                    </tr>
                        <% } %>
                    </table>
                  
                    <center><h1>Record Viewed</h1><br></center>
               <center><a href="registration.jsp">Register</a></center>
                       <<table border="5" width="100%" height="10%">
                        <tr>
                          <td class="footer">
                            <ul class="footer_ul">
                              <li><a href="index.jsp">Home</a></li>
                        <li><a href="About.jsp">About</a></li>
                         <li><a href="  viewtraining.jsp">All Training</a></li>
                          <li><a href=" viewjobs.jsp">All Jobs </a></li>
                          <li><a href="Contact.jsp">Contact Us</a></li>
                        
                          <li><a href="Login.jsp">Admin</a></li>
                            </ul>

                          </td>
                       </tr>
                       <tr>
                          <td class="footer">
                            <h3>Developed by : Shruti Bhongale,Karan Mane,Abhiman Kuchekar</h3>
                          </td>
                       </tr>
                    </table>
                </tr>
          </table>
        </form>
    </body>
</html>