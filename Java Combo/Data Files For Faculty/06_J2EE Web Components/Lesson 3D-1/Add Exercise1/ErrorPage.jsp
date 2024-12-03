<html>
<body>
<font face ="verdana">
<%-- Using the taglib directive --%>
<%@ taglib uri="/WEB-INF/BannerTag.tld" prefix="bn" %>
<h3> Incorrect CustomerID or Password </h3>
Click Login Page button to go back to the login page
<form name="login1" action="LoginPage.htm">
<input type="submit" name="button1" value="Login Page">
</form>
<%-- Using the BannerTag --%>
<bn:BannerTag />
</body>
</html>
