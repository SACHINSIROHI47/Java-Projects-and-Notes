<%@ page import="javax.ejb.*,javax.naming.*,java.util.*,javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,bank.BankAccount,bank.BankAccountHome"
%>
<%!
private BankAccount tran = null;
BankAccountHome home = null;
String acc = null;
String cid = null;
String cname = null;
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
<h3> Using EJB-QL query to search customer detail by name.</h3>
<br>
<form method="get">
<p>Enter Customer Name:</p>
<input type="text" name="custname" size="25">
<br>
<input type="submit" value="Submit">
</form>
<%
String cname = request.getParameter("custname");
Collection c = home.findByName(cname);
Iterator i = c.iterator();
try{          
	  while (i.hasNext()) 
	  {
             tran = (BankAccount) i.next();
	     cid = tran.getCustomerId();
             cname = tran.getCustomerName();
             acc = tran.getAccount();
                                 
%>
<br>
Customer Name : <%=cname%>
<br>
Customer Id : <%=cid%>
<br>
Account Type : <%=acc%>  
<%
}
}catch(Exception ex)
{}
%>

</body>
</html>
