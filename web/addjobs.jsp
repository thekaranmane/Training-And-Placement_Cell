<%-- 
    Document   : addtraining
    Created on : 2 Jun, 2022, 7:07:22 PM
    Author     : karan Mane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Jobs</title>
        <link href="stylesheet.css" type="text/css" rel="stylesheet" media="all" />
        <style type="text/css">
            body
            {
                background-color:rgb(234,234,234);
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
                color:rgb(102,160,50);
            }
            h2
            {
                text-align:center;
                color:olive;
                font-size:30px;
            }
        </style>
        <script type="text/javascript">

            function insvalid()
            {

                if(document.form_insert.first.value == "")
                    {
                        alert("Please Enter First Name");
                        return false;
                    }
               if(document.form_insert.last.value == "")
                    {
                        alert("Please Enter Last Name");
                        return false;
                    }
               if(document.form_insert.address.value == "")
                    {
                        alert("Please Enter Address");
                        return false;
                    }
               if(document.form_insert.city.value == "")
                    {
                        alert("Please Enter City");
                        return false;
                    }
               if(document.form_insert.mobile.value == "")
                    {
                        alert("Please Enter Mobile No");
                        return false;
                    }
               if(document.form_insert.email.value == "")
                    {
                        alert("Please Enter Email Id");
                        return false;
                    }
               if(document.form_insert.pin.value == "")
                    {
                        alert("Please Enter Pin code");
                        return false;
                    }
                   return true;
                   
            }
            function clear()
            {
                id.value="";
                first.value = "";
                last.value = "";
                address.value = "";
                city.value = "";
                mobile.value = "";
            
        </script>
    </head>
    <body>
       
            <table border="0">
                <tr>
                    <td class="top">
                        <marquee>WELCOME TO TRAINING AND PLACEMENT </marquee>
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
                            <li><a href="Admin.jsp">Home </a></li>
                        <li><a href="addtraining.jsp">Add Training </a></li>
                         <li><a href="addjobs.jsp">Add Jobs </a></li>
                       
                      </ul>
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
                        <h2>Add Jobs</h2>
                    </td>
                </tr>
                <tr>
                    
                    <form name="form_insert" action="insertjobs.jsp" method="post" onsubmit="return insvalid();">
                        <table border="0" align="center">
                      
                            <tr>
                                   <td class="lbl_txt">Company Name :</td>
                                   <td><input type="text" name="Companyname" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Company Details :</td>
                                   <td><input type="text" name="Companydetails" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Company Address:</td>
                                   <td><input type="text" name="Companyaddress" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Company Contact Number:</td>
                                   <td><input type="text" name="Companycontactnumber" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Requirement:</td>
                                   <td><input type="text" name="Requirement" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Package:</td>
                                   <td><input type="text" name="Package" class="txt" /></td>
                               </tr>
                               
                               <tr>
                                   <td>
                                       <input type="submit" name="submit" value="Insert" class="btn" />
                                   </td>
                                   <td>
                                       <input type="reset" value="Reset" name="reset"  class="btn" onclick="return clear();" />
                                   </td>
                               </tr>
                               <tr>
                                 <td align="center" colspan="2">
                                    <a href="viewjobs.jsp">View Records</a>
                                 </td>
                               </tr>
                        </table>                   
                    </form>
                  
                </tr>
                <tr>
                    <table border="0" width="100%" height="10%">
                        <tr>
                          <td class="footer">
                            <ul class="footer_ul">
                              <li><a href="addtraining.jsp">Add Training </a></li>
                         <li><a href="addjobs.jsp">Add Jobs </a></li>
                       
                       
                            </ul>

                          </td>
                       </tr>
                       <tr>
                          <td class="footer">
                            <h3>Developed by : Karan Mane,Shruti Bhongale,Abhiman Kuchekar</h3>
                          </td>
                       </tr>
                       
                    </table>
                </tr>
          </table>
       
    </body>
</html>
