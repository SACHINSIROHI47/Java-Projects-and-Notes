<%--
    Document   : RejectedUserRegistration
    Created on : Mar 6, 2014, 7:58:52 PM
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
		background-image:url(image/.jpg);
		background-repeat:repeat-y;
		background-attachment:fixed;
		background-position:top center
		}

           </style>
   </head>

<script type="text/javascript">
   function trim(s)
 {
    return s.replace(/^\s*/,"").replace(/\s*$/,"");

 }
function validate()
{

 var str=/^[A-Za-z][.A-Za-z ]{0,100}$/;

       var chge="Are you sure you want to reject user registration!";

   if((trim(document.form.t1.value)=="") || str.test(trim(document.form.t1.value))==false)
	{
	alert("Please fill user name and should be characters only");
	document.form.t1.focus();
	return false;
        }

     if(confirm(chge)==false)
        {
         return false;
        }
    }
    </script>

  <body bgcolor="mergenta" >
      <form name="form" onsubmit="validate()">



    <table>
      <tr>
          <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
             <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
          </td>
      </tr>
      <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
            <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Reject User Registration Information</B></font></MARQUEE>
         </td>
      </TR>
   </table>
 </table>
    <table align="center" >
      <tr>
       <td bgcolor="white"><a href="HomePage.jsp"><font color="green" size="5" <b>Home</b></font></a>|</td>
       <td bgcolor="white"><a href="BuyShare.jsp"><font color="brown" size="5" >Buy Share</font></a>|</td>
       <td bgcolor="white"><a href="SellShare.jsp"><font color="green" size="5" >Sale Share</font></a>|</td>
       <td <td bgcolor="white"><a href="RegistrationInfo.jsp"><font color="brown" size="5">Registration</font></a></td>
       <td bgcolor="white"><a href="AdminLogin.jsp"><font color="green" size="5">Admin</font></a></td>
       <td bgcolor="white"><a href="LoginInfo.jsp"><font color="brown" size="5">Login</font></a></td>
      </tr>
   </table>
<br>
<table align="center">
    <tr>
        <td><font color="green" size="5"><b>Reject User Registration </b></font></td></tr>

</table>
 <br>
  <table align="center">
    <tr>
        <td>
    Enter User Name: <input type="text" name="t1">


   <p align="center"><input type="Submit" value="Reject" >
   <a href="AdminInfo.jsp"><input type="button" value="Back"></a>

      </p>
    </td>
  </tr>
</table>

      </form>

     </body>
     <%


 try
     {

       String uname=request.getParameter("t1");

       if((uname.equals("null") || uname.toString()==""))
     {
     }
 else
     {
     
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
     Statement st=con.createStatement();
     int i=st.executeUpdate("delete UserRegistration where username='"+uname+"'");
        if(i!=0)
         {
         %>
        <center><font size="5" color="green"><%out.println("User Registration has been Rejected.."); %></font></center>
         <%
         }
        else
         {
          %>
         <center> <font size="5" color="red"><%out.println("User Registration has not been Rejected.."); %></font></center>
         <%
         }
        }
      }
catch(Exception e)
    {
    }

%>
</html>
