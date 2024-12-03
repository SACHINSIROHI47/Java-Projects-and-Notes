<%@ page import="javax.ejb.*,javax.naming.*,java.util.*,javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,book.Book,book.BookHome"
%>

<%!

	private Book book = null;
	BookHome home = null;

	String bkid = null;
	String bkName = null;
	String bkCatg = null;

	public void jspInit()
	{
	        try
	        {
			InitialContext ic = new InitialContext();
			Object objref = ic.lookup("java:comp/env/ejb/qlapp");
			home=(BookHome)PortableRemoteObject.narrow(objref,BookHome.class);
	         }catch(Exception ex)
	         { }
	}
%>

<html>
<body>
	<h3> Using EJB-QL query to search Book by name.</h3>
	<br>
		<form method="get">
		<p>Enter Book Name:</p>
		<input type="text" name="bkname" size="25">
	<br>
		<input type="submit" value="Submit"> | <a href = "http://localhost:8080/bookCntx"> Home </a>
	</form>
	<%
		bkName = request.getParameter("bkname");
		
		if (bkName != null)
		{
			Collection c = home.findByName(bkName);
			Iterator i = c.iterator();

			try{          
	
			  while (i.hasNext()) 
	  		  {
	            	book = (Book) i.next();
				bkid = book.getBookId();
				bkName = book.getBookName();
				bkCatg = book.getBookCategory();
      %>
		
		<br>

		Book Name : <%=bkName%>
		<br>
		Book ID : <%=bkid%>
		<br>
		Book Category : <%=bkCatg%>  
	<%
			 }
	               }catch(Exception ex){} 
		}
	%>
</body>
</html>
