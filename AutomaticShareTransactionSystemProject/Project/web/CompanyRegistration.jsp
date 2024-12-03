<%-- 
    Document   : CompanyRegistration
    Created on : Feb 12, 2014, 9:17:16 PM
    Author     : chaudhary
--%>

<%@ page contentType="text/html" language ="java"  import="java.sql.*" pageEncoding="UTF-8" %>
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

       var chge="Are you sure you want to Registered!";

   if((trim(document.form.company.value)=="") || str.test(trim(document.form.company.value))==false)
	{
	alert("Please fill company name and should be characters only");
	document.form.company.focus();
	return false;
        }
   else if((trim(document.form.description.value)=="") || str.test(trim(document.form.description.value))==false)
	{
	alert("Please fill company description and should be characters only");
	document.form.description.focus();
	return false;
        }
  else if((trim(document.form.login.value)=="") || str.test(trim(document.form.login.value))==false)
	{
	alert("Please fill login name and should be characters only");
	document.form.login.focus();
	return false;
        }
  else if((trim(document.form.pwd.value)==""))
        {
         alert("Please Fill the password !");
         document.form.pwd.focus();
         return false;
        }
  else if(trim(document.form.pwd.value).length<4)
         {
         alert("The length of the password should not less than four.");
         document.form.pwd.focus();
         return false;
          }
  else if((trim(document.form.address.value)==""))
          {
         alert("Please fill address!");
         document.form.address.focus();
         return false;
          }
 else if((trim(document.form.contact.value)==""))
        {
         alert("Please Fill contact no!");
         document.form.contact.focus();
         return false;
        }
 else if((trim(document.form.email.value)=="") || validateEmail(document.form.email.value)==false)
          {
         alert("Please fill email value and should be email format");
         document.form.email.focus();
         return false;
          }
 else if((trim(document.form.noshare.value)==""))
        {
         alert("Please Fill the  Number of share!");
         document.form.noshare.focus();
         return false;
        }
 else if((trim(document.form.share.value)==""))
        {
         alert("Please Fill the share value!");
         document.form.share.focus();
         return false;
        }
 else if((trim(document.form.closing.value)==""))
        {
         alert("Please Fill the closing date!");
         document.form.closing.focus();
         return false;
        }
  if(confirm(chge)==false)
        {
         return false;
        }

  }
</script>



    <form onSubmit="return validate()" action = "" method="POST"  validate="true" name="form" >
    <body bgcolor="mergenta">
    <%!
     Connection con;
     Statement st;
     ResultSet rs;
     String str1;
%>
    <table>
        <tr>


               <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
                 <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
                 </td>
        </tr>
        <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Company Registration Zone</B></font></MARQUEE>

          </td>
        </TR>

        </table>
        <table align="center">
            <tr>
       <td bgcolor="white"><a href="HomePage.jsp"><font color="green" size="5" <b>Home</b></font></a>|</td>
       <td bgcolor="white"><a href="BuyShare.jsp"><font color="brown" size="5" >Buy Share</font></a>|</td>
       <td bgcolor="white"><a href="SellShare.jsp"><font color="green" size="5" >Sale Share</font></a>|</td>
       <td bgcolor="white"><a href="RegistrationInfo.jsp"><font color="green" size="5">Registration</font></a>|</td>
       <td bgcolor="white"><a href="LoginInfo.jsp"><font color="brown" size="5">Login</font></a></td>
       <td bgcolor="white"><a href="AdminLogin.jsp"><font color="green" size="5">Admin</font></a></td>
                 </tr>

        </table>
<br>


     <table align="center">
        <tr>
          <td align="left">
            <font size="+3" color="brown">Company Registration</font><br><br>

             Company Name:&nbsp;&nbsp;&nbsp; <input type="text" name="company" size="30"><font color="red">&nbsp;*</font><br><br>
             Description:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="description" size="30"><font color="red">&nbsp;*</font><br><br>
             Login Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="login" size="30"><font color="red">&nbsp;*</font><br><br>
             Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="password" name="pwd" size="30"><font color="red">&nbsp;*</font><br><br>
             Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <textarea name="address" width="30"></textarea><font color="red">&nbsp;*</font><br><br>
             Contact No:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="contact" size="30" maxlength="11" onKeyPress="return isNumberKey(event)"><font color="red">&nbsp;*</font><br><br>
             Email Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="email" size="30"><font color="red">&nbsp;*</font><br><br>
             No Of Share:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="noshare" size="30" onKeyPress="return isNumberKey(event)"><font color="red">&nbsp;*</font><br><br>
             Share Value:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="share" size="30" onKeyPress="return isNumberKey(event)"><font color="red">&nbsp;*</font><br><br>
             Closing Date:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="closing" size="30"><font color="red">&nbsp;*</font><br><br>

              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <Input type="submit" name="Submit" value="Submit">
             <Input type="reset" name="Cancel" value="Cancel">
             
               </td>
            </tr>
        

<%
    String company=request.getParameter("company");
    String desc=request.getParameter("description");
    String log=request.getParameter("login");
    String pwdd=request.getParameter("pwd");
    String add=request.getParameter("address");
    String cont=request.getParameter("contact");
    String eml=request.getParameter("email");
    String share1=request.getParameter("noshare");
    String share2=request.getParameter("share");
    String clos=request.getParameter("closing");


try
    {
    if((company.equals("null") || company.toString()=="")||(log.equals("null") || log.toString()==""))
    {

    }
    else
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
      st=con.createStatement();

      rs=st.executeQuery("select loginname from CompanyRegistration where loginname='"+log+"'");
      while(rs.next())
      {
      str1=rs.getString("loginname");
      }
      if(log.equals(str1))
        {

         %><font color="green" ><b>
         <%
         out.println("This Login Name is already Exist.Please Fill different Login Name ");

          %> </b></font>

         <%
        }
     else
         {


     int i=st.executeUpdate("insert into CompanyRegistration values('"+company+"','"+desc+"','"+log+"','"+pwdd+"','"+add+"',"
             + "'"+cont+"','"+eml+"','"+share1+"','"+share2+"','"+clos+"')");
     if(i!=0)
         {
         %>

         <jsp:forward page="PrintCompanyRegistrationInformation.jsp" />
              
         <%
         }
     else
         { 
          %>
          <font color="green"><b>
                  <%
                  out.println("Values are inserted");
                   %>
         </b> </font>
         <%
         
     }
    }
      }
      }
catch(Exception e)
    {
    %>
           <font color="green"><b>
             <%
              //out.println("Please enter the valid company information and login name");
              //out.println("Exception:-"+e);
             %>
           </b></font>
    <%
    }

%>
  </table>
    </body>
    </form>
</html>