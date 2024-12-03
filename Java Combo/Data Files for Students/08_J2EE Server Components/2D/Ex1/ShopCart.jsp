<%@ page import="javax.ejb.*,javax.naming.*, javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,shop.Shop,shop.ShopHome,java.util.*" 
%>
<%!
  private Shop sp = null;
  ShopHome home=null;
  public void jspInit()  
  {
    try {
      InitialContext ic = new InitialContext();
      Object objRef = ic.lookup("java:comp/env/ejb/shopcart");
      home=(ShopHome)PortableRemoteObject.narrow(objRef, ShopHome.class);      
      sp = home.create();	
    }
     catch(Exception ex)
{}
  }
%>
<html>
<head>
   <title>Shopping Cart Application</title>
</head>

<body bgcolor="white">
<form method="get" name="f1">
<H1>Shopping Cart Application</h1>
  <p>
  Please select a Product to add to cart
  		 <select name=pr size=1>
  		 <option>--</option>
  		<option>Computer</option>
  		<option>DVD Player</option>
  		<option>Football</option>
  		<option>Bicycle</option>
  		</select>
  	<br>
  	<%
  		int i=1;
  		String productchoice=request.getParameter("pr");
  		if(productchoice!=null)
  		{
	  		if(!productchoice.equals("--"))
	  		{
  	  		String pstr=sp.addCart(productchoice);             %>
  	  		<p><%=pstr%>
  	  		<%
    		}
		}  	  		
  	  	
  	  		
  	    Vector productList = new Vector();
            productList = sp.getSelectedProducts();
            Enumeration penum = productList.elements();           %>
            <form method="get" name="f2">
            <p><p>
            <table border=1>
                <th>      
                	Product Name
                </th>
                                <%
            while (penum.hasMoreElements()) {
                String title = (String) penum.nextElement();
                if (title!=null)
                {
	             %>          
                <tr>
                <td>
                <%=title%>
                </td>
                </tr>                
         
       <%}                
            }                   
	
	%>
	</table>
<br> 
<input type="submit" value="Add to Cart">

</form>
	
</body>
</html>
