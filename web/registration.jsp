<%-- 
    Document   : addtraining
    Created on : 2 Jun, 2022, 7:07:22 PM
    Author     : karan Mane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
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

                if(document.form_insert.id.value == "")
                    {
                        alert("Please Enter Valid id");
                        return false;
                    }
               if(document.form_insert.Firstname.value == "")
                    {
                        alert("Please Enter First Name");
                        return false;
                    }
               if(document.form_insert.Lastname.value == "")
                    {
                        alert("Please Enter Lastname");
                        return false;
                    }
               if(document.form_insert.DOB.value == "")
                    {
                        alert("Please Enter DOB");
                        return false;
                    }
               if(document.form_insert.Email.value == "")
                    {
                        alert("Please Enter Email id");
                        return false;
                    }
               if(document.form_insert.Mobilenumber.value == "")
                    {
                        alert("Please Enter Mobilenumber");
                        return false;
                    }
               if(document.form_insert.Gender.value == "")
                    {
                        alert("Please Enter Gender");
                        return false;
                    }
                    if(document.form_insert.Address.value == "")
                    {
                        alert("Please Enter Address");
                        return false;
                    }
                    if(document.form_insert.City.value == "")
                    {
                        alert("Please Enter City");
                        return false;
                    }
                    if(document.form_insert.Pincode.value == "")
                    {
                        alert("Please Enter Pin Code");
                        return false;
                    }
                    if(document.form_insert.State.value == "")
                    {
                        alert("Please Enter State");
                        return false;
                    }
                    if(document.form_insert.Country.value == "")
                    {
                        alert("Please Enter Country");
                        return false;
                    }
                    if(document.form_insert.ClassX.value == "")
                    {
                        alert("Please Enter ClassX");
                        return false;
                    }
                    if(document.form_insert.ClassXII.value == "")
                    {
                        alert("Please Enter ClassXII");
                        return false;
                    }
                    if(document.form_insert.Diploma.value == "")
                    {
                        alert("Please Enter Diploma");
                        return false;
                    }
                    if(document.form_insert.Course.value == "")
                    {
                        alert("Please Enter Course");
                        return false;
                    }
                    if(document.form_insert.Department.value == "")
                    {
                        alert("Please Enter Department");
                        return false;
                    }
                    if(document.form_insert.Pusuingyear.value == "")
                    {
                        alert("Please Enter Pursuing Year");
                        return false;
                    }
                    if(document.form_insert.Semester.value == "")
                    {
                        alert("Please Enter Semester");
                        return false;
                    }
                    if(document.form_insert.Passorpursuing.value == "")
                    {
                        alert("Please Enter Pass Or Pursuing");
                        return false;
                    }
                    if(document.form_insert.Percentage.value == "")
                    {
                        alert("Please Enter Percentage");
                        return false;
                    }
                    if(document.form_insert.Username.value == "")
                    {
                        alert("Please Enter User Name");
                        return false;
                    }
                    if(document.form_insert.Password.value == "")
                    {
                        alert("Please Enter Password");
                        return false;
                    }
                   return true;
                   
            }
            function clear()
            {
                id.value="";
                Firstname.value = "";
                Lastname.value = "";
                DOB.value = "";
                Email.value = "";
                Mobilenumber.value = "";
                Gender.value = "";
                Address.value = "";
                City.value = "";
                Pincode.value = "";
                State.value = "";
                Country.value = "";
                ClassX.value = "";
                ClassXII.value = "";
                Diploma.value = "";
                Course.value = "";
                Department.value = "";
                Pursuingyear.value = "";
                Semester.value = "";
                Passorpursuing.value = "";
                Percentage.value = "";
                Username.value = "";
                Password.value = "";
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
                           <li><a href="index.jsp">Home</a></li>
                        <li><a href="addtraining.jsp"> </a></li>
                         <li><a href="addjobs.jsp"> </a></li>
                        <li><a href="viewjobs.jsp"></a></li>
                      </ul>
                    </td>
                </tr>
                <tr>
                    
                </tr>
                    
                <tr>
                    <td>
                        <h2>Registration</h2>
                    </td>
                </tr>
                <tr>
                    
                    <form name="form_insert" action="registrationinsert.jsp" method="post" onsubmit="return insvalid();">
                        <table border="0" align="center">
                      
                            <tr>
                                   <td class="lbl_txt">id:</td>
                                   <td><input type="text" name="id" class="txt" /></td>
                               </tr>
                               <tr>s
                                   <td class="lbl_txt">First Name  :</td>
                                   <td><input type="text" name="Firstname" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Last Name :</td>
                                   <td><input type="text" name="Lastname" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">DOB :</td>
                                   <td><input type="text" name="DOB" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Email :</td>
                                   <td><input type="text" name="Email" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Mobile Number:</td>
                                   <td><input type="text" name="Mobilenumber" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Gender:</td>
                                   <td><input type="text" name="Gender" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Address:</td>
                                   <td><input type="text" name="Address" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">City:</td>
                                   <td><input type="text" name="City" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Pin Code:</td>
                                   <td><input type="text" name="Pincode" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">State:</td>
                                   <td><input type="text" name="State" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Country:</td>
                                   <td><input type="text" name="Country" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">ClassX:</td>
                                   <td><input type="text" name="ClassX" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">ClassXII:</td>
                                   <td><input type="text" name="ClassXII" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Diploma:</td>
                                   <td><input type="text" name="Diploma" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Course:</td>
                                   <td><input type="text" name="Course" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Department:</td>
                                   <td><input type="text" name="Department" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Pursuing Year:</td>
                                   <td><input type="text" name="Pursuingyear" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Semester:</td>
                                   <td><input type="text" name="Semester" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Pass or Pursuing:</td>
                                   <td><input type="text" name="Passorpursuing" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Percentage:</td>
                                   <td><input type="text" name="Percentage" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">User Name:</td>
                                   <td><input type="text" name="Username" class="txt" /></td>
                               </tr>
                               <tr>
                                   <td class="lbl_txt">Password:</td>
                                   <td><input type="text" name="Password" class="txt" /></td>
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
                              <li><a href="addtraining.jsp"> </a></li>
                         <li><a href="addjobs.jsp"> </a></li>
                       
                        <li><a href="viewjobs.jsp"></a></li>
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
