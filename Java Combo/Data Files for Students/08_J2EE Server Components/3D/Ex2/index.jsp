<%@ page import="javax.ejb.*,javax.naming.*,javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,product.Product,product.ProductHome"
%>
<%!
private Product pinfo = null;
ProductHome home = null;
public void jspInit()
{
try
{
InitialContext ic = new InitialContext();
Object objref = ic.lookup("java:comp/env/ejb/product");
home=(ProductHome)PortableRemoteObject.narrow(objref,ProductHome.class);
}
catch(Exception ex)
{}
}
%>
<html>
<body>
<h3>Enter Product Details </h3>
<br>
<form method="get">
<p>Enter Product Name:</p>
<input type="text" name="pname" size="25">
<p>Enter Product Type:</p>
<input type="text" name="ptype" size="25">
<p>Enter Product Quantity:</p>
<input type="text" name="amount" size="25">
<br>
<p>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
<%
  String pname = request.getParameter("pname");
  String ptype = request.getParameter("ptype");
  String amount = request.getParameter("amount");
  
  pinfo = (Product)home.create(pname,ptype,amount);

%>
</body>
</html>


