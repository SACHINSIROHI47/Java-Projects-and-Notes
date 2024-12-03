<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Automatic Share Transaction System</title>
         <style laguage="text/css">
            		body
			{
				background-image:url(image/.jpg);
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
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Login Zone</B></font></MARQUEE>

          </td>
        </TR>

        </table>
        <table align="center">
            <tr>
                <td bgcolor="mergenta">
                <td bgcolor="mergenta"> <a href="HomePage.jsp"><font color="black" size="5" <b>Home</b></font></a>|</td>
                <td bgcolor="mergenta"><a href="About_Us.jsp"><font color="black" size="5">About Us</font></a>|</td>
                <td bgcolor="mergenta"><a href="Contact_Us.jsp"><font color="black" size="5" >Contact Us</font></a>|</td>
                <td bgcolor="mergenta"><a href="SiteMap.jsp"><font color="black" size="5" >Site Map</font></a>|</td>
                <td bgcolor="mergenta"><a href="Registration.jsp"><font color="black" size="5">Register</font></a>|</td>
                <td bgcolor="mergenta"><a href="Login.jsp"><font color="black" size="5">Login</font></a></td>

                 </tr>

        </table>
<br>

        <p align="middle" border="1" height="100" width="100">
            <font size="+3" color="red">LOGIN</font></br><br>
            <input type="radio" name="login" value="UserLogin" color="white" checked><i>UserLogin</i>&nbsp;&nbsp;
                <input type="radio" name="login" value="CompanyLogin" color="white"><i>CompanyLogin</i><br><br>
             <label> User Name:<input type="text" name="id"/></label><br><br>
             <label>Password:&nbsp;&nbsp;&nbsp<input type="password" name="pwd"/></label><br><br>
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
            
        <Input type="submit" name="login" value="Login">
        <Input type="reset" name="Cancel" value="Cancel">
        <a href="UserRegistration.jsp">NewUser?</a>&nbsp;
        <a href="CompanyRegistration.jsp">NewCompanyRegistration?</a>
        </p>
    </body>
</form>
</html>