<%-- Providing the location of the Mytaglib directive --%>
<%@ taglib uri="/Mytaglib.tld" prefix="first" %>
<HTML>
<HEAD>
<TITLE>Customized Tag</TITLE>
</HEAD>
<%
	/* Setting the color parameter selected by the user */
	String str = request.getParameter("r1");
	/* Comparing the color and then invoking the custom tag with attribute color and body */
	if(str.compareTo("G")==0)
	{
%>	
		<first:hello color="LIGHTGREEN">
			<%=request.getParameter("uname")%>
		</first:hello>
<%		
	}	
	if(str.compareTo("R")==0)
	{
%>
		<first:hello color="RED">
			<%=request.getParameter("uname")%>
		</first:hello>

<%
	}
	if(str.compareTo("Y")==0)
	{
%>
		<first:hello color="LIGHTYELLOW">
			<%=request.getParameter("uname")%>
		</first:hello>
<%	
	}
	if(str.compareTo("B")==0)
	{
%>
		<first:hello color="LIGHTBLUE">
			<%=request.getParameter("uname")%>
		</first:hello>
<%	
	}
%>
<BR>
<B>
</BODY>
</HTML>
