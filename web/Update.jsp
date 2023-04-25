<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
        <link href="stylesheet.css" type="text/css" rel="stylesheet" media="all" />
        <script type="text/javascript">


            function insvalid()
            {

                if(document.form_updt.first.value == "")
                    {
                        alert("Please Enter First Name");
                        return false;
                    }
               if(document.form_updt.last.value == "")
                    {
                        alert("Please Enter Last Name");
                        return false;
                    }
               if(document.form_updt.address.value == "")
                    {
                        alert("Please Enter Address");
                        return false;
                    }
               if(document.form_updt.city.value == "")
                    {
                        alert("Please Enter City");
                        return false;
                    }
               if(document.form_updt.mobile.value == "")
                    {
                        alert("Please Enter Mobile No");
                        return false;
                    }
               if(document.form_updt.email.value == "")
                    {
                        alert("Please Enter Email Id");
                        return false;
                    }
               if(document.form_updt.pin.value == "")
                    {
                        alert("Please Enter Pin code");
                        return false;
                    }
                   return true;

            }
            function clear()
            {
                first.value = "";
                last.value = "";
                address.value = "";
                city.value = "";
                mobile.value = "";
                email.value = "";
                pin.value = "";
            }
        </script>
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

    </head>
    <body>

            <table border="0">
                <tr>
                    <td class="top">
                        <marquee>WELCOME TO TRAINING AND PLACEMENT CELL </marquee>
                    </td>
                </tr>
                <tr>
                    <td class="header">
                        <img src="images/AdminBanner copy.jpg" width="1350px" height="200px"/>
                    </td>
                </tr>
                <tr>
                    <td class="menu">
                       <ul>
                        
                        <li><a href="Admin.jsp">Add Record</a></li>
                        <li><a href="Delete.jsp">Delete Record</a></li>
                        <li><a href="Update.jsp">Update Record</a></li>
                        <li><a href="View.jsp">View Record</a></li>
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
                        <h2>Update Record</h2>
                    </td>
                </tr>
                     <tr>

                    <form name="form_updt" action="updt_valid.jsp" method="post" onsubmit="return insvalid();">
                        <table border="0" align="center">
                              
                               <tr>
                                   <td class="lbl_txt">First Name :</td>
                                   <td><input type="text" name="first" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Last Name :</td>
                                   <td><input type="text" name="last" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Address :</td>
                                   <td><input type="text" name="address" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">City :</td>
                                   <td><input type="text" name="city" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Mobile No :</td>
                                   <td><input type="text" name="mobile" class="txt" /></td>
                                   <td align abbr="right" style="font-size:20px; color:red;">
                                       Can not Change Mobile No</td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Email Id :</td>
                                   <td><input type="text" name="email" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Pin code :</td>
                                   <td><input type="text" name="pin" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td>
                                       <input type="submit" name="submit" value="Update" class="btn" />
                                   </td>
                                   <td>
                                       <input type="reset" value="Reset" name="reset"  class="btn" onclick="return clear();" />
                                   </td>
                               </tr>
                               <tr>
                                 <td align="center" colspan="2">
                                    <a href="View.jsp">View Records</a>
                                 </td>
                               </tr>
                        </table>
                    </form>
         

                </tr>
                <tr>
                    <table border="0" width="100%" height="100%">
                        <tr>
                          <td class="footer">
                            <ul class="footer_ul">
                              <li><a href="Admin.jsp">Add Record</a></li>
                              <li><a href="Delete.jsp">Delete Record</a></li>
                              <li><a href="Update.jsp">Update Record</a></li>
                              <li><a href="View.jsp">View Record</a></li>
                            </ul>

                          </td>
                       </tr>
                       <tr>
                          <td class="footer">
                            <h3>Developed by : Bhaumik Mevada &copy;2015</h3>
                          </td>
                       </tr>

                    </table>
                </tr>
          </table>

    </body>
</html>