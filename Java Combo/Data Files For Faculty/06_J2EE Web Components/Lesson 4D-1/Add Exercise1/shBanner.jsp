<%@ taglib uri="/WEB-INF/shBanner.tld" prefix="shBan" %>
<HTML>
<HEAD>
<TITLE>Show banner</TITLE>
</HEAD>
<B>
<%-- Using the shBanner tag --%>
<shBan:shBanner banner = "<%= request.getParameter("uname")%>" >
		Welcome to our Web site
</shBan:shBanner>
</BODY>
</HTML>
