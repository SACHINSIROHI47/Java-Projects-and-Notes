<%-- 
    Document   : PrintCompanyRegistrationInformation
    Created on : Feb 23, 2014, 11:38:19 AM
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
            <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Print Company Registration Information</B></font></MARQUEE>
         </td>
      </TR>
   </table>

<br>
<table align="center">
    <tr><td><font color="green"><b>Company Registration has been successfully</b></font></td></tr>

</table>
<br>
<table border="1" align="center" >
         
    <%
          String st1=(String)request.getParameter("company");
          String st2=(String)request.getParameter("description");
          String st3=(String)request.getParameter("login");
          String st4=(String)request.getParameter("pwd");
          String st5=(String)request.getParameter("address");
          String st6=(String)request.getParameter("contact");
          String st7=(String)request.getParameter("email");
          String st8=(String)request.getParameter("noshare");
          String st9=(String)request.getParameter("share");
          String st10=(String)request.getParameter("closing");

          %>

      <tr><td width="150">Company Name</td>  <td bgcolor="white" width="200"><%=st1%></td></tr>
      <tr><td>Description</td>               <td bgcolor="white"><%=st2%></td></tr>
      <tr><td>Login Name</td>                <td bgcolor="white"><%=st3%></td></tr>
      <tr><td>Password</td>                  <td bgcolor="white"><%=st4%></td></tr>
      <tr><td>Address</td>                   <td bgcolor="white"><%=st5%></td></tr>
      <tr><td>Contact No</td>                <td bgcolor="white"><%=st6%></td></tr>
      <tr><td>Email ID</td>                  <td bgcolor="white"><%=st7%></td></tr>
      <tr><td>NoOfShare</td>                 <td bgcolor="white"><%=st8%></td></tr>
      <tr><td>Share Value</td>               <td bgcolor="white"><%=st9%></td></tr>
      <tr><td>Closing Date</td>              <td bgcolor="white"><%=st10%></td></tr>





  

          
          
  </table>


<p align="center"><input type="button" value="Print" onclick="printpage()">
<a href="CompanyRegistration.jsp"><input type="button" value="Back"></a>

</p>


     </body>
    </FORM>
