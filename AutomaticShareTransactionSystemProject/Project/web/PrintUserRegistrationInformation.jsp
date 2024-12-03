<%-- 
    Document   : PrintUserRegistrationInformation
    Created on : Feb 21, 2014, 7:57:07 PM
    Author     : chaudhary
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
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
            <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Print User Registration Information</B></font></MARQUEE>
         </td>
      </TR>
   </table>
 
<br>
<table align="center">
    <tr><td><font color="green"><b>User Registration has been successfully</b></font></td></tr>

</table>
<br>
<table border="1" align="center" >


     <%
          String st1=(String)request.getParameter("t1");
          String st2=(String)request.getParameter("t2");
          String st3=(String)request.getParameter("t3");
          String st4=(String)request.getParameter("t4");
          String st5=(String)request.getParameter("t5");
          String st6=(String)request.getParameter("t6");
          String st7=(String)request.getParameter("t7");
          String st8=(String)request.getParameter("t8");
          String st9=(String)request.getParameter("t9");
          String st10=(String)request.getParameter("t10");
          String st11=(String)request.getParameter("t11");
         %>
      <tr><td width="150">User Name</td>  <td bgcolor="white" width="200"><%=st1%></td></tr>
      <tr><td>First Name</td>              <td bgcolor="white"><%=st2%></td></tr>
      <tr><td>Middle Name</td>             <td bgcolor="white"><%=st3%></td></tr>
      <tr><td>Last Name</td>               <td bgcolor="white"><%=st4%></td></tr>
      <tr><td>Password</td>                <td bgcolor="white"><%=st5%></td></tr>
      <tr><td>Email ID</td>                <td bgcolor="white"><%=st6%></td></tr>
      <tr><td>Demat Account No</td>        <td bgcolor="white"><%=st7%></td></tr>
      <tr><td>InvestMent</td>              <td bgcolor="white"><%=st8%></td></tr>
      <tr><td>DateOfBirth </td>            <td bgcolor="white"><%=st9%></td></tr>
      <tr><td>Address</td>                 <td bgcolor="white"><%=st10%></td></tr>
      <tr><td>ContactNo</td>                <td bgcolor="white"><%=st11%></td></tr>
    
     
          
         
           
  </table>
        

<p align="center"><input type="button" value="Print" onclick="printpage()">
 
    <a href="UserRegistration.jsp"><input type="button" value="Back"></a>
    
</p>


     </body>
    </FORM>
</html>