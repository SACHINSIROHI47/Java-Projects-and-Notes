<%-- 
    Document   : CompanyRegistrationReport
    Created on : Mar 7, 2014, 2:46:14 PM
    Author     : 6
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
  function printpage()
  {
  window.print()
  }

  function closeCurrentWindow()
    {
    window.close();
    }

</script>

<FORM  name="forms">
  <body bgcolor="mergenta" >
    <table>
      <tr>
          <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
             <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
          </td>
      </tr>
      <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
            <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome to Print Company Registration Information</B></font></MARQUEE>
         </td>
      </TR>
   </table>

<br>
<table align="center">
    <tr><td><font color="green"><b>Company Registration Information</b></font></td></tr>

</table>
<br>
<table border="1" align="center" >
      <tr bgcolor="brown" >
      <th>Company Name</th>
      <th>Description</th>
      <th>Login Name</th>
      <th>Password</th>
      <th>Address</th>
      <th>Contact No</th>
      <th>Email-ID</th>
      <th>NoOfShare</th>
      <th>Share Value</th>
      <th>Closing Date</th>
      </tr>


 <%
 try
     {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select * from CompanyRegistration");
     while(rs.next())
         {
         %>
           <tr bgcolor="white" >
           <td > <%=rs.getString(1)%> </td>
           <td > <%=rs.getString(2)%> </td>
           <td > <%=rs.getString(3)%> </td>
           <td > <%=rs.getString(4)%> </td>
           <td > <%=rs.getString(5)%> </td>
           <td > <%=rs.getString(6)%> </td>
           <td > <%=rs.getString(7)%> </td>
           <td > <%=rs.getString(8)%> </td>
           <td > <%=rs.getString(9)%> </td>
           <td > <%=rs.getString(10)%> </td>
           </tr>
         <%
         }
     }
catch(Exception e)
    {
    }

%>





</table>


<p align="center"><input type="button" value="Print" onclick="printpage()">
   <a href="AdminInfo.jsp"><input type="button" value="Back"></a>

</p>


     </body>
    </FORM>
</html>
