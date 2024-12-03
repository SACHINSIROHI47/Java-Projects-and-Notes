<%-- 
    Document   : newjsp
    Created on : Jul 17, 2021, 4:30:15 PM
    Author     : hp
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
             Class.forName("com.mysql.cj.jdbc.Driver"); 
             out.println("driver login");
       
            }
            catch(Exception ex)
            {
                
            }
        %>
    </body>
</html>
