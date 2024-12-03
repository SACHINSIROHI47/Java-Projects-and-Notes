<%-- Import the package --%>
<%@ page import ="java.util.*" %>
<%@ page import = "test.FindAuthor" %>
<html>
<head>
<title> JSP and JavaBean </title>
<font size=4 face="Verdana" color=#112244>

<%-- Create an instance of FindAuthor class --%>

<jsp:useBean id="FA" scope="application" class="test.FindAuthor" />
<%-- Set the value of various attribute, such as authorId, url, and driverName --%>

<jsp:setProperty name="FA" property="*" />

<body>

<%-- The details about the author, <jsp:getProperty name="FA" property="authorName"/> is:<BR> --%>
<%
	/* Create an instance of type of Vector and invoking the function getResult() to return the result set*/
	Vector v = (Vector)FA.getResult();
	Enumeration enum = v.elements();
	/* Prints the elements in the vector variable */
	while(enum.hasMoreElements())
	{
		 out.println("Author Name:"+enum.nextElement());
%>
<br>
<%
	 out.println("Address:"+enum.nextElement());
%>
<br>
<%
	 out.println("City:"+enum.nextElement());
%>
<br>
<%
	 out.println("State:"+enum.nextElement());
%>
<br>
<%
	 out.println("ZIP:"+enum.nextElement());
	}
%>
</body>
</head>
