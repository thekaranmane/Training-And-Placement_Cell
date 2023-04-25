<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Insert</title>
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
        String id1=request.getParameter("id");
        String Firstname1 = request.getParameter("Firstname");
        String Lastname1 = request.getParameter("Lastname");
        String DOB1 = request.getParameter("DOB");
        String Email1 = request.getParameter("Email");
        String Mobilenumber1 = request.getParameter("Mobilenumber");
        String Gender1 = request.getParameter("Gender");
        String Address1 = request.getParameter("Address");
        String City1 = request.getParameter("City");
        String Pincode1 = request.getParameter("Pincode");
        String State1 = request.getParameter("State");
        String Country1 = request.getParameter("Country");
        String ClassX1 = request.getParameter("ClassX");
        String ClassXII1 = request.getParameter("ClassXII");
        String Diploma1 = request.getParameter("Diploma");
        String Course1 = request.getParameter("Course");
        String Department1 = request.getParameter("Department");
        String Pursuingyear1 = request.getParameter("Pursuingyear");
        String Semester1 = request.getParameter("Semester");
        String Passorpursuing1 = request.getParameter("Passorpursuing");
        String Percentage1 = request.getParameter("Percentage");
        String Username1 = request.getParameter("Username");
        String Password1 = request.getParameter("Password");
        try
         {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            String query = "insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1,id1);
            ps.setString(2,Firstname1);
            ps.setString(3, Lastname1);
            ps.setString(4, DOB1);
            ps.setString(5, Email1);
            ps.setString(6, Mobilenumber1);
            ps.setString(7, Gender1);
            ps.setString(8, Address1);
            ps.setString(9, City1);
            ps.setString(10, Pincode1);
            ps.setString(11,State1);
            ps.setString(12,Country1);
            ps.setString(13, ClassX1);
            ps.setString(14, ClassXII1);
            ps.setString(15, Diploma1);
            ps.setString(16, Course1);
            ps.setString(17, Department1);
            ps.setString(18, Pursuingyear1);
            ps.setString(19, Semester1);
            ps.setString(20, Passorpursuing1);
            ps.setString(21, Percentage1);
            ps.setString(22, Username1);
            ps.setString(23, Password1);
            ps.executeUpdate();
            con.close();
            ps.close();
            
         }catch(Exception ex)
         {
            out.println(ex.getMessage());
            out.println("Can not Inserted Record..");
         }
       %>
        <h1>Record Inserted Successfully</h1><br>
               <center><a href="registration.jsp">Go Back</a></center>
   </body>
</html>
