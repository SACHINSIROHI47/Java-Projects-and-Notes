<%-- Import the package --%>
<%@ page import ="java.util.*" %>
<%@ page import = "test.BankUser" %>
<html>
<head>
<title> JSP and JavaBean </title>
<font size=4 face="Verdana" color=#112244>
<%-- Create an instance of BankUser class --%>  
<%@ taglib uri="/WEB-INF/BannerTag.tld" prefix="bn" %>
<jsp:useBean id="BU" scope="application" class="test.BankUser" />
<%-- Set the value of various attribute such as, UserName and password --%>
<jsp:setProperty name="BU" property="*" />
<body>
<BR>
<%
	/* Create a variable of int type which store the value returned by the function getResult() method */
	int status= BU.getResult();
	/* If the entered user id and password is correct */
	if(status == 1)
	{
		out.println("Hello ");
%>
<jsp:getProperty name="BU" property="userId"/>
<br>
<%					
	out.println("Welcome to Online Banking System");
	}/* End of if block*/
	/* if the entered user id and password is incorrect
	if(status != 1)
	{
%>
	<%--  Display the error page --%>
	<jsp:forward page="ErrorPage.jsp" />	
<%	
	}/* End of end block */
	    	
%>
<br><br><br><br><br>
<bn:BannerTag />
</body>
</head>
</HTML>
