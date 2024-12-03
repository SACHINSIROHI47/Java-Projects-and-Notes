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
function printpage()
  {
  window.print()
  }
</script>
<form method="post ">
<body topmargin="0" leftmargin="0" rightmargin="0" bgcolor="#fff5ee">



<table width="100%" cellpadding="0" cellspacing="0">
<tr bgcolor="black"> 
    <td align="middle" valign="centre" width="10%"> <img height="50" src="images/ignou-new.png" width="50"> </td>
    <td align="middle"><font color="white" size="+3" name="verdana">INDIRA GANDHI NATIONAL OPEN UNIVERSITY</font>
    </td>
  </tr>
  <tr><td colspan="2">&nbsp; </td></tr>
 <tr bgcolor="#00bfff" height="10%">

<td colspan="2" height="10%><p align="center"><font size="+2"><marquee behaviour="alteration">Welcome to Students Registration Details Form&nbsp;</marquee> </font></p>
</td>
</tr>


</tr><tr>
   
</tr>
</table>
 &nbsp;&nbsp;&nbsp;&nbsp;
<a href="AdmLogin.jsp"><input type="button" name="bt3" value="Back" width="100%" height="10%">
  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
  
           <input type="button" value="Print this page" onclick="printpage()">
           
<%

     try{
         
         String reg_tion=request.getParameter("txt1");
       Connection con;
    Statement st;
    ResultSet rs;
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("Jdbc:Odbc:mydsn","sa","sirohi");
    st=con.createStatement();
    rs=st.executeQuery("select * from reg_tion ");            
         
%>

 
 
                  <table border=""  align="center" >
        <tr>
      <th>Registration No</th><th>First Name</th><th>Last Name</th>
      <th>Father Name</th><th>Mother Name</th>
      <th>Category</th><th>Date Of Birth</th>
      <th>Gender</th><th>Address</th>
      <th>District</th><th>State</th>
      <th>Country</th><th>Pincode</th>
      <th>Programme</th><th>Delivery Type</th>
      <th>Session</th><th>Journal No</th>
      <th>EmailID</th><th>Mobile NO</th>
      <th>Alternate No</th>
      <th>Exam Passed</th><th>Stream</th>
      <th>Year of passing</th><th>% of Marks</th>
      <th>Exam Passed</th><th>Stream</th>
      <th>Year of passing</th><th>% of Marks</th>
      <th>Exam Passed</th><th>Stream</th>
      <th>Year of passing</th><th>% of Marks</th>
      <th>Exam Passed</th><th>Stream</th>
      <th>Year of passing</th><th>% of Marks</th>
      
      
      
       
    
    </tr>
    
    <%
        
        while(rs.next())
        {
        %>
        <tr>
        <td > <%=rs.getString(1)%> </td>
        <td> <%=rs.getString(2)%> </td>
        <td> <%=rs.getString(3)%> </td>
        <td> <%=rs.getString(4)%> </td>
        <td> <%=rs.getString(5)%> </td>
        <td> <%=rs.getString(6)%> </td>
        <td> <%=rs.getString(7)%> </td>
        <td> <%=rs.getString(8)%> </td>
        <td > <%=rs.getString(9)%> </td>
        <td> <%=rs.getString(10)%> </td>
        <td> <%=rs.getString(11)%> </td>
        <td> <%=rs.getString(12)%> </td>
        <td> <%=rs.getString(13)%> </td>
        <td> <%=rs.getString(14)%> </td>
        <td> <%=rs.getString(15)%> </td>
        <td> <%=rs.getString(16)%> </td>
        <td > <%=rs.getString(17)%> </td>
        <td> <%=rs.getString(18)%> </td>
        <td> <%=rs.getString(19)%> </td>
        <td> <%=rs.getString(20)%> </td>
        <td> <%=rs.getString(21)%> </td>
        <td> <%=rs.getString(22)%> </td>
        <td> <%=rs.getString(23)%> </td>
        <td> <%=rs.getString(24)%> </td>
        <td > <%=rs.getString(25)%> </td>
        <td> <%=rs.getString(26)%> </td>
        <td> <%=rs.getString(27)%> </td>
        <td> <%=rs.getString(28)%> </td>
        <td> <%=rs.getString(29)%> </td>
        <td> <%=rs.getString(30)%> </td>
        <td> <%=rs.getString(31)%> </td>
        <td> <%=rs.getString(32)%> </td>
        <td > <%=rs.getString(33)%> </td>
        <td> <%=rs.getString(34)%> </td>
        <td> <%=rs.getString(35)%> </td>
        <td> <%=rs.getString(36)%> </td>
        </tr>
    <%} %>
      
  <% 
  }
     catch(Exception e1)
     { }
     
   %>
      


</form>
</body></html>
    
 
