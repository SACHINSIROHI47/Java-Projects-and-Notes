<%@ page import="javax.ejb.*,javax.naming.*, javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,temp.Tempconverter,temp.TempconverterHome" 
%>
<%!
  private Tempconverter converter = null;
  public void jspInit()  
  {
    try {
      InitialContext ic = new InitialContext();
      Object objRef = ic.lookup("java:comp/env/ejb/tempconverter");
      TempconverterHome home=(TempconverterHome)PortableRemoteObject.narrow(objRef, TempconverterHome.class);
      converter = home.create();
    } catch (RemoteException ex) {
      
    }
     catch(CreateException ex)
{}
catch(NamingException ex)
{} 
  }
  
%>
<html>
<head>
   <title>Temperature Converter</title>
</head>

<body bgcolor="white">
<h1><center>Temperature Converter</center></h1>
<hr>
<br>
<form method="get">
Enter centigrade temperature
<input type="text" name="ctemp" size="25">
<br>
<p>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
<%
  String centt = request.getParameter("ctemp");
  if ( centt != null && centt.length() > 0 ) {
    BigDecimal d = new BigDecimal(centt);
    %>
  <p><%= centt %> degree centigrade is   
    <%= converter.toFarenheit(d) %>  degree farenheit.
  
<%
   }
%>  
</body>
</html>
