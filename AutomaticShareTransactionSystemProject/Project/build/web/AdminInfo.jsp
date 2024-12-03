<%--
    Document   : AdminInfo
    Created on : Mar 5, 2014, 7:34:16 PM
    Author     : chaudhary
--%>

<%@page contentType="text/html" language="java" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Automatic Share Transaction System</title>
         <style laguage="text/css">
            		body
			{
				background-image:url(image/103.jpg);
				background-repeat:repeat-y;
				background-attachment:fixed;
				background-position:top center
			}

    </style>



    </head>
    <form>
    <body bgcolor="mergenta">

    <table>
        <tr>


               <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
                 <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
                 </td>
        </tr>
        <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Admin Zone</B></font></MARQUEE>

          </td>
        </TR>

        </table>
     <table align="center" >
       <tr>
       <td bgcolor="white"><a href="HomePage.jsp"><font color="green" size="5" <b>Home</b></font></a>|</td>
       <td bgcolor="white"><a href="BuyShare.jsp"><font color="brown" size="5" >Buy Share</font></a>|</td>
       <td bgcolor="white"><a href="SellShare.jsp"><font color="green" size="5" >Sale Share</font></a>|</td>
       <td <td bgcolor="white"><a href="RegistrationInfo.jsp"><font color="brown" size="5">Registration</font></a></td>
       <td bgcolor="white"><a href="AdminLogin.jsp"><font color="green" size="5">Admin</font></a></td>
       <td bgcolor="white"><a href="LoginInfo.jsp"><font color="brown" size="5">Login</font></a></td>
       <td bgcolor="white"><a href="AdminLogout.jsp"><font color="green" size="5">Log Out</font></a></td>
      </tr>
      <br/>
     </table>
        <center><font color="brown" size="+3" > Welcome :</font> <font color="red" size="+3" ><%=session.getAttribute("uname2") %></font></center>
        <table align="">
            <tr>
                <td align="left">

  <p>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="UserRegistration.jsp"><font size="5" color="black">UserRegistration</font></a><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="UpdateUserRegistration.jsp"><font size="5" color="black">UpdateUserRegistration</font></a><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="RejectedUserRegistration.jsp"><font size="5" color="black">DeleteUserRegistration</font></a><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="UserRegistrationReport.jsp"><font size="5" color="black">ShowUserReport</font></a><br>
   </p>
    <p>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="CompanyRegistration.jsp"><font size="5" color="blue">CompanyRegistration</font></a><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="EditCompanyInfo.jsp"><font size="5" color="blue">UpdateCompanyRegistration</font></a><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="RejectedCompanyRegistration.jsp"><font size="5" color="blue">DeleteCompanyRegistration</font></a><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="CompanyRegistrationReport.jsp"><font size="5" color="blue">ShowCompanyReport</font></a><br>
   </p>
 <p>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="ChangeAdminPassword.jsp"><font size="5" color="purple">ChangeAdminPassword</font></a><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="ChangeCompanyPassword.jsp"><font size="5" color="purple">ChangeCompanyPassword</font></a><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp <a href="ChangeUserPassword.jsp"><font size="5" color="purple">ChangeUserPassword</font></a><br>

   </p>


    </td>
    <td width="100"></td>

    <td align="right">
        <img src="image/a1.jpg" height="500" width="800">
    </td>

       </tr>
        </table>




        <br><br>

       <table border="1">
    <tr>
        <td valign="centre" width="10%" align="middle"><font color="">
          Dear Customer and All People<br><br>
          welcomes you to Automatic Share Transaction facility.<br>Enjoy hassle
          free, safe and secure Share Transaction. Save your precious time and energy. It
          is convenient. You can do it from anywhere. Use it !<br>
          We wish you a Happy Transaction and joyful learning.</font><br><br>
      </td>
     </tr>
   </table>
    </body>
</form>
</html>
