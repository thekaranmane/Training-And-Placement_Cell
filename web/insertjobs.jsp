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
                    
        String Companyname  = request.getParameter("Companyname");               
        String Companydetails = request.getParameter("Companydetails");
        String Companyaddress= request.getParameter("Companyaddress");
        String Companycontactnumber = request.getParameter("Companycontactnumber");
        String Requirement = request.getParameter("Requirement");
        String Package = request.getParameter("Package");
       

        try
         {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            String query = "insert into addjobs values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
     
            ps.setString(1,Companyname);
            ps.setString(2,Companydetails);
            ps.setString(3,Companyaddress);
            ps.setString(4,Companycontactnumber );
            ps.setString(5,Requirement);
            ps.setString(6, Package);
         
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
