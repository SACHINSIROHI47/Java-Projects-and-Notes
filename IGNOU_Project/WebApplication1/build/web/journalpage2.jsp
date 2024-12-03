<%@page contentType="text/html" language="java" import="java.sql.*" %>
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Admission Form of IGNOU </title>


</head>
<script>
   function validate() {
if (document.forms[0].txt1.value=="") {
alert("Please Enter the Registration NO !");
return false;
}
}
    
</script>
<form method="post" onSubmit="return validate()"">
<body topmargin="0" leftmargin="0" rightmargin="0" bgcolor="#fff5ee">



<table width="100%" cellpadding="0" cellspacing="0">
<tr bgcolor="black"> 
    <td align="middle" valign="centre" width="10%"> <img height="50" src="images/ignou-new.png" width="50"> </td>
    <td align="middle"><font color="white" size="+3" name="verdana">INDIRA GANDHI NATIONAL OPEN UNIVERSITY</font>
    </td>
  </tr>
  <tr><td colspan="2">&nbsp; </td></tr>
 <tr bgcolor="#00bfff" height="10%">

<td colspan="2" height="10%><p align="center"><font size="+2"><marquee behaviour="alteration">Welcome To Online Admission&nbsp;</marquee> </font></p>
</td>
</tr>


</tr><tr></tr>
</table>

<table align="center" >
       <tr>
           
                  <td bgcolor="mergenta" >
                     <a href="onlineadmissionform.jsp"><font size="4">&nbsp;Home Page&nbsp;</font></a>
                 </td>
                 <td bgcolor="mergenta">
                     <a href="AdmLogin.jsp"><font size="4">&nbsp;Administration&nbsp;</font></a>
                 </td>
                 <td bgcolor="mergenta">
                     <a href="Regionalcenter.jsp"><font size="4">&nbsp;RegionalCenter&nbsp;</font></a>
                 </td>
                 <td bgcolor="mergenta"><a href="Studycenter.jsp"><font size="4">&nbsp;Study center&nbsp;</font></a>
                 </td>
           <td bgcolor="mergenta" >
                 <a href="AboutUs2.jsp"><font size="4">About IGNOU  </font></a>
                
              </td>
              <td bgcolor="mergenta" >
                 <a href="Online_Admission.jsp"><font size="4">Online Registration  </font></a>
                
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

<br>
<p></p></div>
<h1>Challan Form</h1>
<table align="center">
    <tr>
        <td >
       Registration No: <input type="text" name="txt1" > 
       </td>
    </tr><br>
    
    
    <tr><td><br><br>
        &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
        <input type="submit" name="Click" value="LogIn">
        &nbsp;&nbsp;&nbsp;&nbsp;
<a href="Firstpageonline.jsp"><input type="button" name="bt3" value="Back" width="100%" height="10%"></a>
&nbsp;&nbsp;
<b> <input type="reset" name="rt" value="Reset" width="100%" height="20%" /></b>
        <td>
        </tr>
</table>

<%
String rg=request.getParameter("txt1");


     try{
             
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn", "sa", "sirohi");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select reg from onlinereg");
        

     while(rs.next())
         {
         String regt=rs.getString(1);
         
  
                
                if(rg.trim().isEmpty())
                {
                %><center><%out.println("Plz. Enter Your Valid Registration NO");%></center><%
               }
             
                   
                   
               if(rg.equals(regt))
   
             
               { 
            
             %>
             
             <jsp:forward page="journalpage.jsp" />
         <%}
         else
         %> <center><% out.println("Login Failed,Please Try Again");%></center>
        
         
         
        
         <%
     }
}catch(Exception e1)
{}

%>

</form>
</body></html>
    
 
