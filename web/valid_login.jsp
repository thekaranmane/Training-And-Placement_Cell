<%-- 
    Document   : valid_login
    Created on : Oct 24, 2015, 8:06:02 PM
    Author     : OM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        try
         {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery("select * from login where username = '" + user + "' and password = '" + pass + "'");
            if(rs.next())
              {
                session.setAttribute("userName", user);
                response.sendRedirect("Admin.jsp");
                //out.println("You have Logged....");
              }else
              {
                response.sendRedirect("error.jsp");
              }
         }catch(Exception ex)
         {

         }
        %>
            
    </body>
</html>
