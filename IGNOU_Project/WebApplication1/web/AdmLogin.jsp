
<%@ page language ="java" import="java.sql.*" %>

    
  <table width="100%" cellpadding="0" cellspacing="0">
      <tbody>
          <tr bgcolor="green" width="100%" height="100%">
             <td valign="centre" width="10%" align="middle">
                 <img alt="no image available"  src="images/1.gif" width="100" height="100">
             </td>
             <td  align="middle"><b><font size="+4" color="white">UNIVERSITY OF IGNOU</font></b>
             </td>
          </tr>
          </table>
         

            <center ><h1><marquee bgcolor="gray"><b>Online Admission System</b></marquee></h1></center>
             <table align="center" >
       <tr>
           
                  <td bgcolor="mergenta" >
                     <a href="onlineadmissionform.jsp"><font size="4">&nbsp;Home Page&nbsp;</font></a>
                 </td>
                 <td bgcolor="mergenta">
                     <a href="Regionalcenter.jsp"><font size="4">&nbsp;RegionalCenter&nbsp;</font></a>
                 </td>
                 <td bgcolor="mergenta">
                     <a href="Studycenter.jsp"><font size="4">&nbsp;StudyCenter&nbsp;</font></a>
                 </td>
                 <td bgcolor="mergenta"><a href="Online_Admission.jsp"><font size="4">&nbsp;Online Registration&nbsp;</font></a>
                 </td>
           <td bgcolor="mergenta" >
                 <a href="AboutUs2.jsp"><font size="4">&nbsp;About IGNOU  &nbsp; </font></a>
                
              </td>
            
             <td bgcolor="mergenta" >
               <a href="Sitemap2.jsp"><font size="4">&nbsp;Site Map  &nbsp; </font></a>
                </td>
           <td bgcolor="mergenta" >
               
                <a href="Contact2.jsp"><font size="4">&nbsp;Contact Us  &nbsp;&nbsp; </font></a>
             
              </td>
           <td bgcolor="mergenta" >
                 <a href="programmesearch.jsp"><font size="4">&nbsp;Courses Details &nbsp; </font></a>
               
              </td>
               <td bgcolor="mergenta" >
                 <a href="All_Programme.jsp"><font size="4">&nbsp;All Programme&nbsp; </font></a>
               
              </td>
               <td bgcolor="mergenta" >
                 <a href="IgnouProspectus.jsp"><font size="4">&nbsp;Student Zone&nbsp; </font></a>
               
              </td>
               </tr>
            
            </table>
            
<html>
    
    <head>
<title>Online Admission Form of IGNOU </title>


</HEAD>


<SCRIPT>
function validate() {
if (document.forms[0].t1.value=="") {
alert("Please Enter the Name !");
return false;
}

if (document.forms[0].t2.value=="") {
alert("Please Enter the Password !");
return false;
}

}
</SCRIPT>
<FORM onSubmit="return validate()">


<body bgcolor="#fff5ee">
<form name="f1" method="post">
<center>
    
    <table>
    <br>
    <br>

<tr>    
  
    <td> <center><b>User Name<b></b></center></td><td><center><input type="text" name="t1" ></center></td>
</tr>  <br>
<center><td><b>Password</b></td></center> 
<center><td>&nbsp;&nbsp;<input type="password" name="t2" value="" /></center>
</td>
</tr>


<tr><td></td></tr>
<tr>
    <td></td>
<td>    <input type="submit" name="b1" value="LogIn">
  <input type="reset" name="r1" value="Reset" />
 &nbsp;&nbsp;
<a href="onlineadmissionform.jsp"><input type="button" name="bt3" value="Back" width="100%" height="10%"></td>
</tr>
</table></center>



<%
String user=request.getParameter("t1");
String pass=request.getParameter("t2");

     try{
             
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn", "sa", "sirohi");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select * from loginpage");
        

     while(rs.next())
         {
         String username=rs.getString(1);
         String password=rs.getString(2);
  
                
                if(user.trim().isEmpty())
                {
                %><center><%out.println("Plz. Enter Your username");%></center><%
               }
             
                    if(pass.trim().isEmpty())
                   {
                    %><center><%out.println("Plz. Enter Your Password");%></center><%
             
                   
                    }
                   
               if(user.equals(username) && pass.equals(password))
   
             
               { 
            
             %>
             
             <jsp:forward page="admindetails.jsp" />
         <%}
         else
         %> <center><% out.println("Login Failed,Please Try Again");%></center>
        
         
         
        
         <%
     }
}catch(Exception e1)
{}

%>

</form>
<br><br><br><br><br><br><br><br><br><br><br>
  <table border="3">
    <tr>
      <td valign="centre" width="10%" align="middle"><b>
          Dear Students and Parents<br><br> University
          of IGNOU welcomes you to online Admission facility.<br>Enjoy hassle
          free, safe and secure admission. Save your precious time, energy and money. It
          is convenient. You can do it from anywhere. Use it !<br>
          We wish you a Happy admission and joyful learning.</b><br><br>
      </td>
     </tr>
   </table>
</body>

</html>

 




