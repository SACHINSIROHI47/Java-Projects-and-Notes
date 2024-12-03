<%@ page import="javax.ejb.*,javax.naming.*,javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,player.Player,player.PlayerHome"
%>
<%!
private Player playerinfo = null;
PlayerHome home = null;
public void jspInit()
{
try
{
InitialContext ic = new InitialContext();
Object objref = ic.lookup("java:comp/env/ejb/player");
home=(PlayerHome)PortableRemoteObject.narrow(objref,PlayerHome.class);
}
catch(Exception ex)
{}
}
%>
<html>
<body>
<center><h2>Enter Player Details </h2></center>
<br>
<form method="get">
<p>Enter Player Name:</p>
<input type="text" name="pname" size="25">
<p>Enter Player Position:</p>
<input type="text" name="pposition" size="25">
<p>Enter Player's Club:</p>
<input type="text" name="club" size="25">
<br>
<p>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
<%
  String pname = request.getParameter("pname");
  String pposition = request.getParameter("pposition");
  String club = request.getParameter("club");
  
  playerinfo = (Player)home.create(pname,pposition,club);

%>
</body>
</html>
