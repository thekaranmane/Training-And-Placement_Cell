<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h1
            {
                color:red;
                font-style:italic;
                text-align:center;
            }
            a
            {
                text-decoration:none;
                color:maroon;
                font-size:20px;
                text-align:center;
            }
            a:hover
            {
                text-decoration:underline;
                font-weight:bolder;
            }
        </style>
    </head>
    <body>
       <%
                    
        String Trainingname  = request.getParameter("Trainingname");               
        String Trainingdate = request.getParameter("Trainingdate");
       
        String Lecturer = request.getParameter("Lecturer");
        String Abouttraining = request.getParameter("Abouttraining");
       

        try
         {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            String query = "insert into addtraining values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
     
            ps.setString(1,Trainingname);
            ps.setString(2,Trainingdate);
            
            ps.setString(3,Lecturer );
            ps.setString(4, Abouttraining);
         
            ps.executeUpdate();
            con.close();
            ps.close();
            
         }catch(Exception ex)
         {
            out.println(ex.getMessage());
            out.println("Can not Inserted Record..");
         }
       %>

                <h1>Record Inserted...</h1><br>
               <center><a href="Admin.jsp">Go Back</a></center>
    </body>
</html>
