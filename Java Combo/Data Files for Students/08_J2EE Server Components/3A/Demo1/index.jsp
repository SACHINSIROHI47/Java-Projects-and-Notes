<%@ page import="javax.ejb.*,javax.naming.*,javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,bank.BankTransaction,bank.BankTransactionHome"
%>
<%!
private BankTransaction tran = null;
BankTransactionHome home = null;
public void jspInit()
{
try
{
InitialContext ic = new InitialContext();
Object objref = ic.lookup("java:comp/env/ejb/bankcmp");
home=(BankTransactionHome)PortableRemoteObject.narrow(objref,BankTransactionHome.class);
}
catch(Exception ex)
{}
}
%>
<html>
<body>
<form method="get">
<p>Enter Customer Id:</p>
<input type="text" name="custid" size="25">
<p>Enter Transaction Type:</p>
<input type="text" name="trantype" size="25">
<p>Enter Trannsaction Amount:</p>
<input type="text" name="amount" size="25">
<br>
<p>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
<%
  String customerid = request.getParameter("custid");
  String transaction = request.getParameter("trantype");
  String amt = request.getParameter("amount");  

tran = home.create(customerid,transaction,amt);

%>
</body>
</html>
