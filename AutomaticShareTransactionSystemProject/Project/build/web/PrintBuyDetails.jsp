<%-- 
    Document   : PrintBuyDetails
    Created on : Mar 11, 2014, 3:10:56 PM
    Author     : 6
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
<script type="text/javascript">
  function printpage()
  {
  window.print()
  }

  function closeCurrentWindow()
    {
    window.close();
    }

</script>

<FORM  name="forms">
  <body bgcolor="mergenta" >
    <table>
      <tr>
          <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
             <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
          </td>
      </tr>
      <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
            <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Print Share Information</B></font></MARQUEE>
         </td>
      </TR>
   </table>

<br>
<table align="center">
    <tr><td><font color="green"><b>Share buy Successfully</b></font></td></tr>

</table>
<br>
<%
        String st1=request.getParameter("h1");
        String k1=request.getParameter("fname");
        String k2=request.getParameter("mname");
        String k3=request.getParameter("lname");
        String k4=request.getParameter("noshare");
        String k5=request.getParameter("svalue");
        String k6=request.getParameter("buy");
%>

<table border="1" align="center" >
      <tr><td width="120" >Company Name</td>        <td bgcolor="white" width="200"><%=st1%></td></tr>
      <tr><td width="120">First Name</td>           <td bgcolor="white"><%=k1%></td></tr>
      <tr><td width="120">Middle Name</td>          <td bgcolor="white"><%=k2%></td></tr>
      <tr><td width="120">Last Name</td>            <td bgcolor="white"><%=k3%></td></tr>
      <tr><td width="120">NoOfShareAvailable</td>   <td bgcolor="white"><%=k4%></td></tr>
      <tr><td width="120">Share Value</td>          <td bgcolor="white"><%=k5%></td></tr>
      <tr><td width="120">Buy Share</td>            <td bgcolor="white"><%=k6%></td></tr>




         
  </table>


<p align="center">
    <input type="button" value="Print" onclick="printpage()">
    <input type="button" value="close" onclick="closeCurrentWindow()">
   <a href="BuyShare.jsp"><input type="button" value="Back"></a>

</p>


     </body>
    </FORM>