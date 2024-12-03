<%@ page import="javax.ejb.*,javax.naming.*,javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,beans.Stock,beans.StockHome"
%>
<%!
private Stock stockinfo = null;
StockHome home = null;
public void jspInit()
{
try
{
InitialContext ic = new InitialContext();
Object objref = ic.lookup("java:comp/env/ejb/stockinfo");
home=(StockHome)PortableRemoteObject.narrow(objref,StockHome.class);
stockinfo = (Stock)home.create("S001256","Computers");
}
catch(Exception ex)
{}
}
%>
<html>
<body>
<h3>Stock information added in the database </h3>
<br>
</body>
</html>
