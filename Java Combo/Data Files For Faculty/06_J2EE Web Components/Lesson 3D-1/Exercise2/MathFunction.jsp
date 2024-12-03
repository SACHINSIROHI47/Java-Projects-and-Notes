<html>
<head>
<title> JSP and JavaBean </title>
<font size=4 face="Verdana" color=#112244>
<%-- Importing the OptionBean class --%>
<%@ page import = "test.OptionBean" %>
<jsp:useBean id="optionbean" scope="session" class="test.OptionBean" />
<body>
<%
	/* Retrieve the value of the radio button selected */
	String str =request.getParameter("r1");
	/* Retrieve the value entered in the text box  */
	String str1=request.getParameter("t1");
	int num1=0;
	int num2=0;
	/* Converting the value of str1 in to integer */
	num1 = Integer.parseInt(str1);
	optionbean.setStr(str);
	optionbean.setnum3(num1);
%>
The result of the function selected by you is: 	<%=optionbean.getnum3()%>
</body>
</head>
