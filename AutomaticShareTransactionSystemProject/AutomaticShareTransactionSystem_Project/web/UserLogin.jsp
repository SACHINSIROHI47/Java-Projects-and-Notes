

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
				background-image:url(image/103.jpg);
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
function validate() {

 var str=/^[A-Za-z][.A-Za-z ]{0,100}$/;

       var chge="Are you sure you want to login!";

   if((trim(document.form.id.value)=="") || str.test(trim(document.form.id.value))==false)
	{
	alert("Please fill login name and should be characters only");
	document.form.id.focus();
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
     if(confirm(chge)==false)
        {
         return false;
        }
}
</script>

    </head>
    <form name="form" onSubmit="return validate()" action="" method="POST"  validate="true" >
    <body bgcolor="mergenta">

    <table>
        <tr>


               <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
                 <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
                 </td>
        </tr>
        <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Login Zone</B></font></MARQUEE>

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
     </tr>

        </table>


<br>

        <p align="middle" border="1" height="100" width="100">
            <font size="+2" color="brown">USER LOGIN</font></br><br>
             <label> User Name:<input type="text" name="id"/></label><br><br>
             <label>Password:&nbsp;&nbsp;&nbsp<input type="password" name="pwd"/></label><br><br>
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             
 <%

String uname=request.getParameter("id");
String pass=request.getParameter("pwd");


try
    {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select username,password from UserRegistration where username='"+uname+"' and password='"+pass+"' ");

          while(rs.next())
         {
         String uname2=rs.getString("username");
         String pass2=rs.getString("password");


                if(uname.trim().isEmpty())
                {
                %><center><%out.println("Plz. Enter Your username");%></center><%
               }

                    if(pass.trim().isEmpty())
                   {
                    %><center><%out.println("Plz. Enter Your Password");%></center><%


                    }

            if(uname.equals(uname2) && pass.equals(pass2))
             {
                   session.setAttribute("uname2", uname2);

                %><jsp:forward page="UpdateUserRegistration.jsp" /><%
             }
             else
             {
                out.println("Login Failed,Please Try Again");
                break;
             }
         }
     }
catch(Exception e1)
{}

%>




        <Input type="submit" name="login" value="Login">
        <Input type="reset" name="Cancel" value="Cancel">
        

        </p>
    </body>
</form>
</html>
