<%-- 
    Document   : ShareTransactionReportForAll
    Created on : Feb 14, 2014, 8:50:32 PM
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

<script>
function printpage()
  {
  window.print()
  }
</script>

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
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome Share Transaction Report Page </B></font></MARQUEE>

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


        


<p align="center"><font size="+2" color="red">Share Transaction Information:</font></p>


<table align="center" border="">
     <tr bgcolor="skyblue">

        <th>&nbsp;&nbsp;UserName&nbsp;&nbsp;</th>
        <th>&nbsp;&nbsp;NoOfPurchaseShares&nbsp;&nbsp;</th>
    </tr>
    <tr>

        <td></td>
        <td></td>

    </tr>
</table>

<p align="center"><input type="button" value="Print" onclick="printpage()"></a>

    </body>
    </form>
</html>
