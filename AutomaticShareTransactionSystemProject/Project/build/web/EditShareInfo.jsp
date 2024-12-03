<%-- 
    Document   : UpdateShareInfo
    Created on : Feb 14, 2014, 8:37:40 PM
    Author     : chaudhary
--%>

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
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Edit Share Info Page </B></font></MARQUEE>

          </td>
        </TR>

        </table>
        <table align="center">
            <tr>
                <td bgcolor="mergenta">
                <td bgcolor="mergenta"> <a href="HomePage.jsp"><font color="black" size="5" <b>Home</b></font></a>|</td>
                <td bgcolor="mergenta"><a href=""><font color="black" size="5">Company</font></a>|</td>
                <td bgcolor="mergenta"><a href=""><font color="black" size="5" >Share</font></a>|</td>
                <td bgcolor="mergenta"><a href=""><font color="black" size="5" >Reports</font></a>|</td>
                <td bgcolor="mergenta"><a href="Login.jsp"><font color="black" size="5">Login</font></a>|</td>
                <td bgcolor="mergenta"><a href=""><font color="black" size="5">LogOut</font></a></td>

                 </tr>

        </table>
<br>
<p align="center"><font size="+2" color="red">Edit Share:</font></p>

<table align="center">

        <tr>

          <td align="left">
            No Of Share:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="noshare" size="30"><br></br>
             Share Value:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="share" size="30"><br></br>
             Closing Date:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="closing" size="30"><br></br>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <Input type="submit" name="Update" value="Update">
              <Input type="reset" name="Clear" value="Clear">
             </td>
            </tr>

        </table>
    </body>
    </form>
</html>