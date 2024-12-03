<%-- 
    Document   : CompanyLogout
    Created on : Mar 13, 2014, 3:39:19 PM
    Author     : 6
--%>

<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <%

        session.setAttribute("uname2", null);
        session.invalidate();
        response.sendRedirect("CompanyLogin.jsp");


         %>
        <p>
            You have successfully logout:
        </p>



    </body>
</html>
