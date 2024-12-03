<%-- 
    Document   : ChangePassword
    Created on : Feb 14, 2014, 8:23:37 PM
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

<script type="text/javascript">

 function trim(s)
 {
    return s.replace(/^\s*/,"").replace(/\s*$/,"");

 }
 function validate()
 {
       var str=/^[A-Za-z][.A-Za-z ]{0,100}$/;

       var chge="Are you sure you want to change password!";

   if((trim(document.form.Login.value)=="") || str.test(trim(document.form.Login.value))==false)
	{
	alert("Please fill your first name and should be characters only");
	document.form.Login.focus();
	return false;
        }
   else if((trim(document.form.pwd.value)==""))
        {
         alert("Please Fill the Password !");
         document.form.pwd.focus();
         return false;
        }
   else if((trim(document.form.npwd.value)==""))
        {
         alert("Please Fill the New Password !");
         document.form.npwd.focus();
         return false;
        }
   else if(trim(document.form.npwd.value).length<4)
         {
         alert("The lenght of the New password should not less than four.");
         document.form.npwd.focus();
         return false;
          }
    else if((trim(document.form.nnpwd.value)==""))
        {
         alert("Please Fill the confirm Password !");
         document.form.nnpwd.focus();
         return false;
        }
   else if(trim(document.form.npwd.value)!=trim(document.form.nnpwd.value)!="")
	{
	alert("Password and confirmation password is not matched");
	document.form.nnpwd.focus();
	return false;
	}
      if(confirm(chge)==false)
        {
         return false;
        }

  }
</script>

    </head>
    <form onSubmit="return validate()" action="" method="POST" validate="true" name="form">
    <body bgcolor="mergenta">

    <table>
        <tr>


               <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
                 <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
                 </td>
        </tr>
        <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Change Password Page </B></font></MARQUEE>

          </td>
        </TR>

        </table>
        <table align="center">
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
<p align="center"><font size="+2" color="brown">Change admin Password:</font></p>

<table align="center">

        <tr>

          <td align="left">
              Login Name:&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Login" size="30"><font color="red">&nbsp;*</font><br></br>
             Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="pwd" size="30" /><font color="red">&nbsp;*</font><br><br/>
             New Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="npwd" size="30"><font color="red">&nbsp;*</font><br><br/>

               Confirm Password:
               <input type="text" name="nnpwd" size="30"><font color="red">&nbsp;*</font><br><br/>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <Input type="submit" name="Change" value="Change">
              <Input type="reset" name="Clear" value="Clear">
              <a href="AdminInfo.jsp"><Input type="reset" name="Clear" value="Clear"></a>
             </td>
            </tr>

        </table>
    </body>
    </form>

     <%

String uname=request.getParameter("Login");
String pass=request.getParameter("pwd");
String npass=request.getParameter("npwd");

try
    {
     if((uname.equals("null") || uname.toString()=="") ||  (pass.equals("null") || pass.toString()=="") || (npass.equals("null") || npass.toString()==""))
     {
     }
 else
     {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
     Statement st=con.createStatement();
     int i=st.executeUpdate("update admin set password='"+npass+"' where adminname='"+uname+"' and password='"+pass+"' ");

      if(i!=0)
      {
           %>
        <center><font size="5" color="green"><%out.println("Admin Password has been change successfully.."); %></font></center>
         <%
      }
      else
       {
       %>
        <center><font size="5" color="red"><%out.println("Admin Password has not been change successfully.."); %></font></center>
       <%
       }
      }
     }
catch(Exception e1)
{}

%>

</html>