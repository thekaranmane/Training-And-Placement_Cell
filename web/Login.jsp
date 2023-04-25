




<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="stylesheet.css" type="text/css" rel="stylesheet" media="all" />
        <script type="text/javascript">

        <!--
            function valid_form()
            {
                if(document.form_login.username.value == "")
                    {
                        alert("Please Enter Username");
                        return false;
                    }
                if(document.form_login.password.value =="")
                    {
                        alert("Please Enter Password");
                        return false;
                    }
                 return true;
            }
        </script>
        <style type="text/css">
            html,body
            {
                background-color:rgb(234,234,234);
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
                        <img src="images/header2.png" width="1510px"  height="150px" alt="" />
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
                    
                    <form name="form_login" action="valid_login.jsp" method="post" onsubmit="return valid_form();">
                        <table border="0" align="center" cellpadding="2" cellspacing="2">
                               <h2 align="center">Login here</h2>
                            <tr>
                                <td width="28%" rowspan="3">
                                    <div align="center">
                                        <img src="images/admin1.png" width="50" height="100"/>
                                            
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td class="lbl_txt">Username :</td>
                                <td><input type="text" name="username" class="txt"></td>
                            </tr>
                            <tr>
                                <td class="lbl_txt">Password :</td>
                                <td><input type="password" name="password" class="txt"></td>
                            </tr>
                            <tr>
                                <td align="center" colspan="4">
                                    <input type="submit" name="submit" value="Login" class="btn">
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
                            <h3>Developed by :Shruti Bhongale, Karan Mane,Abhiman Kuchekar </h3>
                          </td>
                       </tr>
                    </table>
                </tr>
          </table>
    </body>
</html>
