<%-- Using the taglib attribute to use FontTag custom tag --%>
<%@ taglib uri="/WEB-INF/FontTag.tld" prefix="ftType" %>
<HTML>
<HEAD>
<TITLE>Message with font attribute specified as Arial Black</TITLE>
</HEAD> 
<Body>
	<ftType:FontTag fontType = "Arial Black">
	  <h1>	Custom Tag with Body and Attribute </h1>
	</ftType:FontTag>
</BODY>
</HTML> 
