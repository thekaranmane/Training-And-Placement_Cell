


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
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
        

            
    </head>
    <body>
       
            <table border="0">
                <tr>
                    <td class="top">
                        <marquee>WELCOME TO TRAINING AND PLACEMENT CELL</marquee>
                    </td>
                </tr>
                <tr>
                    <td class="header">
                        <img src="images/header1.png" width="1350px" height="200px"/>                    
                    </td>
                </tr>
               
                    
                
                <tr>
                    
                   <form name="form_login" action="valid_login.jsp" method="post" onsubmit="return valid_form();">
                        <table border="0" align="center" cellpadding="2" cellspacing="2">
                               <h2 align="center">Login here</h2>
                            <tr>
                                <td width="28%" rowspan="3">
                                    <div align="center">
                                        <img src="images/admin1.png" width="50" height="50"/>
                                            
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td class="lbl_txt">Username :</td>
                                <td><input type="text" name="uname" class="txt"></td>
                            </tr>
                            <tr>
                                <td class="lbl_txt">Password :</td>
                                <td><input type="password" name="pwd" class="txt"></td>
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
                    <table border="0" width="100%" height="100%">
                       
                       <tr>
                          <td class="footer">
                            <h3>Developed by : karan mane</h3>
                          </td>
                       </tr>
                       
                    </table>
                </tr>
          </table>
       
    </body>
</html>