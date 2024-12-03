
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

       var chge="Are you sure you want to update company registration!";

   if((trim(document.form.company.value)=="") || str.test(trim(document.form.company.value))==false)
	{
	alert("Please fill company name and should be characters only");
	document.form.company.focus();
	return false;
        }



       /*
    if (document.forms[0].description.value=="")
        {alert("Please Enter the Description !");
         return false;
        }
    if (document.forms[0].address.value=="")
        {alert("Please Enter the address !");
        return false;
        }
    if (document.forms[0].contact.value=="")
        {alert("Please Enter the contact no !");
        return false;
        }
    if (document.forms[0].email.value=="")
        {alert("Please Enter the EmailID !");
        return false;
        }
        */
        if(confirm(chge)==false)
        {
         return false;
        }
    }

</script>

    </head>
    <form onSubmit="validate()" action="" method="POST"  name="form">
    <body bgcolor="mergenta">

    <table>
        <tr>


               <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
                 <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
                 </td>
        </tr>
        <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Company Info Page </B></font></MARQUEE>

          </td>
        </TR>

        </table>
   <table align="center">
     <tr>
       <td bgcolor="white"><a href="HomePage.jsp"><font color="green" size="5" <b>Home</b></font></a>|</td>
       <td bgcolor="white"><a href="BuyShare.jsp"><font color="brown" size="5" >Buy Share</font></a>|</td>
       <td bgcolor="white"><a href="SellShare.jsp"><font color="green" size="5" >Sale Share</font></a>|</td>
       <td <td bgcolor="white"><a href="LoginInfo.jsp"><font color="brown" size="5">Login</font></a></td>
       <td bgcolor="white"><a href="RegistrationInfo.jsp"><font color="green" size="5">Registration</font></a>|</td>
       <td bgcolor="white"><a href="AdminLogin.jsp"><font color="brown" size="5">Admin</font></a></td>
      <td bgcolor="white"><a href="CompanyLogout.jsp"><font color="green" size="5">Log Out</font></a></td>
     </tr>

   </table>
          <font color="brown" size="+2" > Welcome :</font> <font color="green" size="+2" ><%=session.getAttribute("uname2") %></font>
<p align="center"><font size="+2" color="brown">Update Company Profile</font></p>
        

<table align="center">
    
        <tr>            
          <td align="left">
             Company Name:&nbsp;&nbsp;&nbsp; <input type="text" name="company" size="30"><font color="red">&nbsp;*</font><br><br>
             Description:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="description" size="30"><br><br>
             Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <textarea name="address" ></textarea><br><br>
             Contact No:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="contact" size="30" maxlength="11" onKeyPress="return isNumberKey(event)"><br><br>
             Email Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="email" size="30"><br><br>





             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <Input type="submit" name="Update" value="Update">
              <Input type="reset" name="Clear" value="Clear">
             </td>
            </tr>
    
        </table>
 <%


    String com_pany=request.getParameter("company");
    String desc_ription=request.getParameter("description");
    String add_ress=request.getParameter("address");
    String con_tact=request.getParameter("contact");
    String email_id=request.getParameter("email");

try
    {
      if(com_pany.equals("null") || com_pany.toString()=="")
     {
     }
 else
     {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
     Statement st=con.createStatement();
     int i=st.executeUpdate("update CompanyRegistration set companyname='"+com_pany+"', description='"+desc_ription+"', address='"+add_ress+"', contactno='"+con_tact+"', emailid='"+email_id+"' where companyname='"+com_pany+"' ");
        if(i!=0)
         {
             %>
        <jsp:forward page="CompanyUpdatedReport.jsp" />
          <%
         }
     else
         { %><font color="green"><b>
         <%
         out.println("Company Details are Not updated Successfully");

          %> </b></font>

         <%

     }
     }
      }
   catch(Exception ee)
        {
         }

                 %>
    </body>
    </form>
</html>