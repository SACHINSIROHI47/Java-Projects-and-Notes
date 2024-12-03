<%@ page import="javax.ejb.*,javax.naming.*,javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,bank.BankAccount,bank.BankAccountHome"
%>
<%!
private BankAccount tran = null;
private BankAccountHome home = null;
public void jspInit()
{
try
{
InitialContext ic = new InitialContext();
Object objref = ic.lookup("java:comp/env/ejb/qlapp");
home=(BankAccountHome)PortableRemoteObject.narrow(objref,BankAccountHome.class);
}
catch(Exception ex)
{}
}
%>
<html>
<body>
<h3>Enter Customer Details</h3>
<form method="get">
<p>Enter Customer Id:</p>
<input type="text" name="custid" size="25">
<p>Enter Customer Name:</p>
<input type="text" name="custname" size="25">
<p>Enter Account Type:</p>
<input type="text" name="custaccount" size="25">
<br>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
<%
String customerid = request.getParameter("custid");
String cname = request.getParameter("custname");
String account = request.getParameter("custaccount");
tran = home.create(customerid,cname,account);
%>
</body>
</html>
