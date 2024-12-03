

<%@ page contentType="text/html" language ="java"  import="java.sql.*" pageEncoding="UTF-8" %>
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

   if((trim(document.form.t1.value)=="") || str.test(trim(document.form.t1.value))==false)
	{
	alert("Please fill user name and should be characters only");
	document.form.t1.focus();
	return false;
        }
   else if((trim(document.form.t2.value)=="") || str.test(trim(document.form.t2.value))==false)
	{
	alert("Please fill your first name and should be characters only");
	document.form.t2.focus();
	return false;
        }
   else if((trim(document.form.t5.value)==""))
        {
         alert("Please Fill the Password !");
         document.form.t5.focus();
         return false;
        }
  else if(trim(document.form.t5.value).length<4)
         {
         alert("The length of the password should not less than four.");
         document.form.t5.focus();
         return false;
          }
  else if((trim(document.form.t6.value)=="") || validateEmail(document.form.t6.value)==false)
          {
         alert("Please fill email value and should be email format");
         document.form.t6.focus();
         return false;
          }  
  else if((trim(document.form.t7.value)==""))
        {
         alert("Please Fill the DematAccount Number!");
         document.form.t7.focus();
         return false;
        }
  else if((trim(document.form.t8.value)==""))
        {
         alert("Please Fill the Investment!");
         document.form.t8.focus();
         return false;
        }
  else if((trim(document.form.t9.value)==""))
        {
         alert("Please Fill the DateOfBirth!");
         document.form.t9.focus();
         return false;
        }
  else if((trim(document.form.t10.value)==""))
          {
         alert("Please fill address!");
         document.form.t10.focus();
         return false;
          }
   else if((trim(document.form.t11.value)==""))
        {
         alert("Please Fill contact no!");
         document.form.t11.focus();
         return false;
        }

  if(confirm(chge)==false)
        {
         return false;
        }

  }
</script>


<FORM onSubmit="return validate()" action="" method="POST"  validate="true" name="form" >
    <body bgcolor="mergenta" onload="Load();" >
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
            <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to User Registration Zone</B></font></MARQUEE>
         </td>
      </TR>
   </table>
   <table align="center">
     <tr>
       <td bgcolor="mergenta">
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
       <td align="left"><font size="+3" color="brown">User Registration</font><br><br>
                 User Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="t1" size="30" id="f1" /><font color="red">&nbsp;*</font><br><br>
                 First Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="t2" size="30" id="f2"/><font color="red">&nbsp;*</font><br><br>
                 Middle Name:&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="t3" size="30" id="f3"/><br><br>
                 Last Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="t4" size="30" id="f4"/><br><br>
                 Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp
                 <input type="password" name="t5" size="30" id="f5"/><font color="red">&nbsp;*</font><br><br>
                 Email Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp
                 <input type="text" name="t6" size="30" id="f6"/><font color="red">&nbsp;*</font><br><br>
                 Demat Account:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="t7" size="30" id="f7" onKeyPress="return isNumberKey(event)"/><font color="red">&nbsp;*</font><br><br>
                 Investment:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="t8" size="30" id="f8" onKeyPress="return isNumberKey(event)"/><font color="red">&nbsp;*</font><br><br>
                 Date of Birth:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;
                 <input type="text" name="t9" size="30" id="f9"/><font color="red">&nbsp;*</font><br><br>
                 Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <textarea name="t10" width="30" id="f10"></textarea><font color="red">&nbsp;*</font><br><br>
                 Contact No:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="text" name="t11" size="30" maxlength="11" id="f11" onKeyPress="return isNumberKey(event)"><font color="red">&nbsp;*</font><br><br><br>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                 <input type="submit" name="bt" value="Submit" width="100%" height="10%">
                 <input type="Reset" name="rt" value="Cancel" width="100%" height="20%">
                 
                 <br>
               </td>
            </tr>
        
<%
    String user_name=request.getParameter("t1");
    String first_name=request.getParameter("t2");
    String middle_name=request.getParameter("t3");
    String last_name=request.getParameter("t4");
    String pass_word=request.getParameter("t5");
    String email_id=request.getParameter("t6");
    String demat_account=request.getParameter("t7");
    String invest_ment=request.getParameter("t8");
    String date_of_birth=request.getParameter("t9");
    String add_ress=request.getParameter("t10");
    String contact_no=request.getParameter("t11");


    
try
    {
    if((user_name.equals("null") || user_name.toString()=="")||(first_name.equals("null") || first_name.toString()==""))
    {
      
    }

    
    else
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
      st=con.createStatement();
      rs=st.executeQuery("select username from UserRegistration where username='"+user_name+"'");
     while(rs.next())
      {
      str1=rs.getString("username");
      }
      if(user_name.equals(str1))
        {

           %><font color="green" ><b>
         <%
         out.println("This User Name is already Exist.Please Fill different User Name ");

          %> </b></font>

         <%
        }
     else
         {
     int i=st.executeUpdate("insert into UserRegistration values('"+user_name+"','"+first_name+"','"+middle_name+"','"+last_name+"','"+pass_word+"','"+email_id+"','"+demat_account+"','"+invest_ment+"','"+date_of_birth+"','"+add_ress+"','"+contact_no+"')");
     if(i!=0)
         {
         %><jsp:forward page="PrintUserRegistrationInformation.jsp" />
         
         <%
         }
     else
         { %><font color="green"><b>
         <%
         out.println("User Registration Not Successfully");

          %> </b></font>
         
         <%
     }}
     }
    }
catch(Exception e)
    {
    %>
           <font color="green"><b>
             <%
             //ut.println("Please enter the valid UserName and Information !");
              //out.println("Exception:-"+e);
             %>
           </b></font>
    <%
    }

%>
    </table>
    </body>
    </FORM>
</html>