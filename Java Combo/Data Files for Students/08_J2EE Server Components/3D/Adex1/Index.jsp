<%@ page import="javax.ejb.*,javax.naming.*,javax.rmi.PortableRemoteObject,java.rmi.RemoteException,java.math.*,book.Book,book.BookHome" %>

<%!

private Book book = null;
private BookHome home = null;
	
public void jspInit()
{
	try	
	{
	   InitialContext ic = new InitialContext();
	   Object objref = ic.lookup("java:comp/env/ejb/qlapp");
	   home=(BookHome)PortableRemoteObject.narrow(objref,BookHome.class);
    	}catch(Exception ex)
	{}
}

%>

<html>
<body>
	<h3>Enter Book Details</h3>

	<form method="get">
		<p>Enter Book Id:</p>
			<input type="text" name="bookid" size="25">
		<p>Enter Book Name:</p>
			<input type="text" name="bookName" size="25">
		<p>Enter Book Type:</p>
			<input type="text" name="bookCategory" size="25">
			<br>
			<input type="submit" value="Submit">
			<input type="reset" value="Reset">  | <a href= "http://localhost:8080/bookCntx"> Home </a>
	</form>	

	<%
		String bkid = request.getParameter("bookid");
	
		if (bkid != null)
		{
		
			String bkname = request.getParameter("bookName");
			String bkctg = request.getParameter("bookCategory");
			book = home.create(bkid,bkname,bkctg);
		}
	%>
</body>
</html>
