<%@page contentType="text/html" language="java" import="java.sql.*"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <form name="frm" method="post">
        <body>
            Name :-<input type="text"  name="f1" size="20" value="">
             <input type="submit" name="bt" value="LogIn">
           
            
             
            
        </body>
        
          <%
          String tt=request.getParameter("f1");

     try{
         
         
       Connection con;
    Statement st;
    ResultSet rs;
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("Jdbc:Odbc:mydsn","sa","sirohi");
    st=con.createStatement();
    rs=st.executeQuery("select * from onlinereg");            
         
%>
        
           <table border=""  align="center" >
        <tr>
      <th>Registration No</th>     
      <th>First Name</th><th>Last Name</th>
      <th>Date Of Birth</th>
      <th>Mobile No</th><th>Category</th>
      <th>Date Of Registration</th><th>Amount of Application Fees</th>
      </th>   
    
    </tr>
    
     <%
        
        while(rs.next())
        {
        %>
       
            <tr>
                <td> <%rs.getString(1);%> </td>
                <td> <%rs.getString(2);%> </td>
                <td> <%rs.getString(3);%> </td>
                <td> <%rs.getString(4);%> </td>
                <td> <%rs.getString(5);%> </td>
                <td> <%rs.getString(6);%> </td>
                <td> <%rs.getString(7);%> </td>
                <td> <%rs.getString(8);%> </td>
            </tr>
      
    <%} %>
      
  <% 
  }
     catch(Exception e1)
     { }
     
   %>
    </form>>
</html>
