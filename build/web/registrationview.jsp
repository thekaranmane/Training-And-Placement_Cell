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
        <title>Admin</title>
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
                         ResultSet rs = st.executeQuery("select * from registration");

        %>
            <table border="0">
                <tr>
                    <td class="top">
                        <marquee>WELCOME TO TRAINING AND PLACEMENT CELL</marquee>
                    </td>
                </tr>
                <tr>
                    <td class="header">
                        <img src="images/AdminBanner copy.jpg" width="1350px" height="200px"/>
                    </td>
                </tr>
                
                <tr>
                    <td align="left">
                      <strong class="wel">Welcome&nbsp;</strong><strong class="bm"><%= session.getAttribute("userName") %></strong><br>
                       <a href="Login.jsp">Logout</a>
                    </td>
                </tr>

                <tr>
                    <td>
                        <h2>View Record</h2>
                    </td>
                </tr>
                    
                    <table border="0" align="center" cellpadding="2" cellspacing="2">
                        <tr class="field_name">
                             <td><div align="center"><strong>id</strong></div></td>
                            <td><div align="center"><strong>Firstname</strong></div></td>
                            <td><div align="center"><strong>Lastname</strong></div></td>
                            <td><div align="center"><strong>DOB</strong></div></td>
                            <td><div align="center"><strong>Email</strong></div></td>
                            <td><div align="center"><strong>Mobilenumber</strong></div></td>
                            <td><div align="center"><strong>Gender</strong></div></td>
                            <td><div align="center"><strong>Address</strong></div></td>
                            <td><div align="center"><strong>City</strong></div></td>
                            <td><div align="center"><strong>Pincode</strong></div></td>
                            <td><div align="center"><strong>State</strong></div></td>
                            <td><div align="center"><strong>Country</strong></div></td>
                            <td><div align="center"><strong>ClassX</strong></div></td>
                            <td><div align="center"><strong>ClassXII</strong></div></td>
                            <td><div align="center"><strong>Diploma</strong></div></td>
                            <td><div align="center"><strong>Course</strong></div></td>
                            <td><div align="center"><strong>Department</strong></div></td>
                            <td><div align="center"><strong>Pursuingyear</strong></div></td>
                            <td><div align="center"><strong>Semester</strong></div></td>
                            <td><div align="center"><strong>Passorpursuing</strong></div></td>
                            <td><div align="center"><strong>Percentage</strong></div></td>
                            
                            <td colspan="2"><div align="center"><strong>Action</strong></div></td>
                        </tr>
                         <%

                         while(rs.next())
                         {
                            rs.getString("Firstname");

                        %>
                        <tr class="view_field">
                            <td><div align="center"><%=++count %></div></td>
                           
                            <td><%= rs.getString("Firstname") %></td>
                            <td><%= rs.getString("Lastname") %></td>
                            <td><%= rs.getString("DOB") %></td>
                            <td><%= rs.getString("Email") %></td>
                            <td><%= rs.getString("Mobilenumber") %></td>
                            <td><%= rs.getString("Gender") %></td>
                            <td><%= rs.getString("Address") %></td>
                            <td><%= rs.getString("City") %></td>
                            <td><%= rs.getString("Pincode") %></td>
                            <td><%= rs.getString("State") %></td>
                            <td><%= rs.getString("Country") %></td>
                            <td><%= rs.getString("ClassX") %></td>
                            <td><%= rs.getString("ClassXII") %></td>
                            <td><%= rs.getString("Diploma") %></td>
                            <td><%= rs.getString("Course") %></td>
                            <td><%= rs.getString("Department") %></td>
                            <td><%= rs.getString("Pursuingyear") %></td>
                            <td><%= rs.getString("Semester") %></td>
                            <td><%= rs.getString("Passorpursuing") %></td>
                            <td><%= rs.getString("Percentage") %></td>
                             
                            <td><div align="center"><a href="Update.jsp">Update</a></div></td>
                            
                        </tr>
                        <% } %>
                    </table>
                  
               <h1>Record Viewed...</h1><br>
               <center><a href="registration.jsp">Go Back</a></center>
                       <tr>
                          <td class="footer">
                            <h3>Developed by : Karan Mane</h3>
                          </td>
                       </tr>

                    </table>
                </tr>
          </table>

    </body>
</html>
