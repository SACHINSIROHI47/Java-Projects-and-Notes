<%@page language="java" import="java.sql.*" import="java.lang.*"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Admission Form of IGNOU</title>
    </head>
    <body bgcolor="orange">

 
 <form name="f6" method="post">
      
        <table width="100%" height="10%">
            <tr bgcolor="green" width="100%" height="12%">
                <td align="middle" ><b><font size="+4" color="white">UNIVERSITY OF IGNOU</font></b>
                </td>
                
                <td colspan="2"><p align="LEFT" ><font size="+2" color="white"> <marquee>STUDENT REGISTRATION DETAILS</marquee> </font></p>
                    <font size="+2"></font>
                </td>
            </tr>
        </table>
        
                      
                        <%
   
    String id=request.getParameter("email");
    String pwd=request.getParameter("pass2");
    Connection con;
    Statement st;
    ResultSet rs;
    try
    {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("Jdbc:Odbc:mydsn2","sa","sirohi");
    st=con.createStatement();
    rs=st.executeQuery("select * from registration2 where emailid='"+id+"' and createpwd='"+pwd+"'");
    %>
    <br><br>
    <table border=""  align=center>
        <tr>
      <th>First_Name</th><th>Last_Name</th>
      <th>Date_Of_Birth</th><th>Gender</th>
      <th>Programme_Stream</th><th>Delivery_Type</th>
      <th>Session</th><th>Address</th>
      <th>Journal_No</th><th>Email_ID</th>
      <th>Password</th><th>Confirm_Password</th>
      <th>Mobile_No</th><th>Alter_No</th>
      </th>
    
    
    
    </tr>
        <%
        while(rs.next())
        {
        %>
        <tr>
            <td><%=rs.getString(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
            <td><%=rs.getString(6)%></td>
            <td><%=rs.getString(7)%></td>
            <td><%=rs.getString(8)%></td>
            <td><%=rs.getString(9)%></td>
            <td><%=rs.getString(10)%></td>
            <td><%=rs.getString(11)%></td>
            <td><%=rs.getString(12)%></td>
            <td><%=rs.getString(13)%></td>
            <td><%=rs.getString(14)%></td>
          
        </tr>
        <%
        }
        %>
    </table>
    <%
    }catch(Exception e){}
    %>

<br><br>
    <table align="center"><tr><td>
        
       <input type="submit" value="Print" name="prnt" > 
    </td></tr></table>
    
     <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
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
