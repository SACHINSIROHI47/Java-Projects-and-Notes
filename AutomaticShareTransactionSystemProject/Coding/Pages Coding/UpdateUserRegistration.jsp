<%-- 
    Document   : EditProfile
    Created on : Feb 14, 2014, 9:02:43 PM
    Author     : chaudhary
--%>

<%@page contentType="text/html" language="java" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Automatic Share Transaction System</title>
         <style language="text/css">
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
  function validateEmail(emailValue)
 {
    var objRegExp  = /(^[a-z]([a-z_\.]*)@([a-z_\.]*)([.][a-z]{3})$)|(^[a-z]([a-z_\.]*)@([a-z_\.]*)(\.[a-z]{3})(\.[a-z]{2})*$)/i;

    return objRegExp.test(emailValue);
 }
  function isNumberKey(evt)
 {
    var charCode = (evt.which) ? evt.which : event.keyCode

    if (charCode > 31 && (charCode < 48 || charCode > 57))
     {
	return false;
     }
      return true;
  }
function validate()
{

 var str=/^[A-Za-z][.A-Za-z ]{0,100}$/;

       var chge="Are you sure you want to update user registration!";

   if((trim(document.form.u_name.value)=="") || str.test(trim(document.form.u_name.value))==false)
	{
	alert("Please fill user name and should be characters only");
	document.form.u_name.focus();
	return false;
        }
   if((trim(document.form.fname.value)=="") || str.test(trim(document.form.fname.value))==false)
	{
	alert("Please fill first name and should be characters only");
	document.form.fname.focus();
	return false;
        }

   if(confirm(chge)==false)
        {
         return false;
        }
    }

</script>

    </head>
    <form onSubmit="return validate()" action="" method="POST" validate="true" name="form" >
        <body bgcolor="mergenta"  >

    <table>
        <tr>


               <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
                 <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
                 </td>
        </tr>
        <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Edit Profile Page </B></font></MARQUEE>

          </td>
        </TR>

        </table>
        <table align="center">

     <tr>
       <td bgcolor="white"><a href="HomePage.jsp"><font color="green" size="5" <b>Home</b></font></a>|</td>
       <td bgcolor="white"><a href="BuyShare.jsp"><font color="brown" size="5" >Buy Share</font></a>|</td>
       <td bgcolor="white"><a href="SellShare.jsp"><font color="green" size="5" >Sale Share</font></a>|</td>
       <td <td bgcolor="white"><a href="RegistrationInfo.jsp"><font color="brown" size="5">Registration</font></a></td>
       <td <td bgcolor="white"><a href="LoginInfo.jsp"><font color="green" size="5">Login</font></a></td>
       <td bgcolor="white"><a href="AdminLogin.jsp"><font color="brown" size="5">Admin</font></a></td>
       <td bgcolor="white"><a href="UserLogout.jsp"><font color="green" size="5">Log Out</font></a></td>
    
     </tr>

        </table>
          
     <font color="brown" size="+2" > Welcome :</font> <font color="green" size="+2" ><%=session.getAttribute("uname2") %></font>

<p align="center"><font size="+2" color="brown">Update User Profile</font></p>




     <table align="center">
        <tr><td align="left">
                 User Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="u_name" size="30" id="a1"/><font color="red">&nbsp;*</font><br><br>
                 First Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="fname" size="30"/><font color="red">&nbsp;*</font><br><br>
                 Middle Name:&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="mname" size="30"/><br><br>
                 Last Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="lname" size="30"/><br><br>
                 Email Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp
                 <input type="text" name="email" size="30"/><br><br>
                 Date of Birth:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;
                 <input type="text" name="dbirth" size="30"/><br><br>
                 Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp

                 <textarea name="add"></textarea><br><br>
                 Contact No:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="mbl" size="30" maxlength="11" onKeyPress="return isNumberKey(event)" ><br></br>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp



               <input type="submit" name="bt" value="Update" width="100%" height="10%">
               <input type="Reset" name="rt" value="Cancel" width="100%" height="20%">
                
               </td>
            </tr>
        </table>

                 <%


    String user_name=request.getParameter("u_name");
    String first_name=request.getParameter("fname");
    String middle_name=request.getParameter("mname");
    String last_name=request.getParameter("lname");
    String email_id=request.getParameter("email");
    String d_birth=request.getParameter("dbirth");
    String adds=request.getParameter("add");
    String mobile=request.getParameter("mbl");


try
    {
    if((user_name.equals("null") || user_name.toString()=="") ||  (first_name.equals("null") || first_name.toString()==""))
     {
     }
 else
     {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
     Statement st=con.createStatement();
     int i=st.executeUpdate("update UserRegistration set username='"+user_name+"', firstname='"+first_name+"', middlename='"+middle_name+"', lastname='"+last_name+"', Emailid='"+email_id+"', dateofbirth='"+d_birth+"', address='"+adds+"', contactno='"+mobile+"' where username='"+user_name+"' ");
        if(i!=0)
         {
         %>
        <jsp:forward page="UserUpdatedReport.jsp" />
          <%
        }
     else
         {
         %><font color="green"><b>
         <%
         out.println("User Details are not update Successfully");

         %></b></font>

         <%

     }

    }
    }
catch(Exception e1)
        {

         }

                 %>

    </body>
    </form>
</html>

