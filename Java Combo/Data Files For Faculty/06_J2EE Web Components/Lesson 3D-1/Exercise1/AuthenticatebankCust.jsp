<html>
<%-- Imports various packages --%>
<%@ page errorPage="LoginErrorPage.jsp" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<font face ="verdana">
<%
	/* Loading the driver */
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Specifying the driver to be used.
	/* Creating a connection with the database */
	Connection con = DriverManager.getConnection("jdbc:odbc:UserLoginDataSource", "test", "password");
	/* Creating a prepared statement to fetch the results */
	PreparedStatement stat = con.prepareStatement( "SELECT * FROM User_Login WHERE user_id = ? AND user_password = ?");
	stat.setString(1,request.getParameter("uname")); 
	stat.setString(2,request.getParameter("password"));
	/* Getting the result set */
	ResultSet rs = stat.executeQuery();
	if(rs.next())
	{
		out.println("Hello "+ rs.getString("user_id")+ "!" );
%>
<br>
<%					
			
		out.println("Welcome to Online Banking System");
	}/* End of if block */
	else 
    	{
%>
	<%-- Forwarding the user to the error page --%>
	<jsp:forward page="ErrorPage.htm" /> 
<%
	}/* End of end block */
    	
%>
</font>
</body>
</html>
