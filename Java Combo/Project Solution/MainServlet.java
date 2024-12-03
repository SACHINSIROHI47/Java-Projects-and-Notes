import javax.servlet.*;
import javax.servlet.http.*;
import project.ProductSession;
import project.ProductSessionHome;
import javax.ejb.*;
import javax.naming.*;
import javax.rmi.*;
import project.ProductSession;
import project.ProductSessionHome;
import java.io.*;

public class MainServlet extends HttpServlet
{

public void doPost(HttpServletRequest req,HttpServletResponse res)
{
PrintWriter pw=null;
	try{

ProductSession ps = null;
ProductSessionHome home = null;
pw=res.getWriter();
String custid = req.getParameter("custid");
String pwd = req.getParameter("pwd");
String action = req.getParameter("action");
			

InitialContext ic = new InitialContext();
	Object objref = ic.lookup("java:comp/env/ejb/productsession");
	home=(ProductSessionHome)PortableRemoteObject.narrow(objref,ProductSessionHome.class);
	ps = home.create();

	if (action.equals("register"))
	{
		String dpwd = req.getParameter("dpwd");
		String sname = req.getParameter("name");
		String dept = req.getParameter("dept");
		
		if(pwd.equals(dpwd)) 
			{
				ps.addCustomer(custid, pwd, sname, dept);
				String part1="<html><head> <title>Successful Login !</title><meta http-equiv='Refresh' content='2; url=http://localhost:8080/projectctx/product.jsp'></head><body bgcolor='lightyellow' text='Navy'>"; 
				String part2="<h1>You have been successfully registered.</h1> <br><br>You should be transferred automatically to the Product selection page. If not please click <a href='http://localhost:8080/projectctx/product.jsp'> this link</a>. </body> </html> ";
				pw.println(part1+part2);
			}else{
				pw.println("<html><body bgcolor='lightyellow'><br><center>");	
				pw.println("<h3>Sorry you are not registered because the passwords do not match.</h3>");
                pw.println("<br><br><a href='http://localhost:8080/projectctx/index.html'> Click Here for Reregistration</a>");
				pw.println("</center></body></html>");  
				}
	}else{
			
			
        	String storedpwd  = ps.getCustomer(custid);
			if(pwd.equals(storedpwd)) 
			{
				pw.println("You have been successfully logged in.");
				String part1="<html><head> <title>Successful Login !</title><meta http-equiv='Refresh' content='2; url=http://localhost:8080/projectctx/product.jsp'></head><body bgcolor='lightyellow' text='Navy'>"; 
				String part2="<h3>You should be transferred automatically to the Product selection page. If not please click <a href='http://localhost:8080/projectctx/product.jsp'> this link</a>. </h3></body> </html> ";
				pw.println(part1+part2);

			}else{
					pw.println("<html><body bgcolor='lightyellow'><br><center>");
				    pw.println("<h3>Sorry you are not autenticated</h3>");
					pw.println("<br><br><a href='http://localhost:8080/projectctx/Login.html'> Click Here to ReLogin </a>");
					pw.println("</center></body></html>");
		 		}
	 	}
		
	 	
	 	}catch(FinderException e2)
	 	{
		 	pw.println("Invalid customer id");
		 	}
	 	catch(Exception e)
		{}
}



public void doGet(HttpServletRequest req, HttpServletResponse res)
{
PrintWriter pw=null;
	try{
			ProductSession ps = null;
			ProductSessionHome home = null;
			String action = req.getParameter("action");
			pw=res.getWriter();
			String prodname=req.getParameter("prod");
						
			InitialContext ic = new InitialContext();
			Object objref = ic.lookup("java:comp/env/ejb/productsession");
			home=(ProductSessionHome)PortableRemoteObject.narrow(objref,ProductSessionHome.class);
			ps = home.create();
			
			
			if(action.equals("product"))
			{
			String details[]=ps.getSuppliers(prodname);
			
			pw.println("<html><body bgcolor='lightyellow'><center><h3>Supplier details</h3>");
			pw.println("<table border=1>");
			pw.println("<tr><th>Supplier Id</th>");
			pw.println("<th>Supplier Name</th>");
			pw.println("<th>Product Type</th>");
			pw.println("<th>City</th></tr>");
			for (int j=0;j<details.length;j++)
			{
				if(j%4 == 0) 
				 {
				    pw.println("<tr>");
				    pw.println("<td>" + details[j] + "</td>");	 
				 }
				else
				{ 	
					pw.println("<td>" + details[j] + "</td>");
					if(j%4 == 0 && j != 0)
					 pw.println("</tr>");
				}
			
			}
			pw.println("</table>");
			pw.println("<br><br>");
			pw.flush();
			pw.println("<h3>Fill the purchase order form for storing purchase order details in the database.</h3>");
			
			
			
			
			pw.println("<form method='get'>");
			
			pw.println("<table>");
			pw.println("<tr><td colspan=2>Supplier Id:</td>");
			pw.println("<td><input type='text' name='sid' size='25'></td></tr>");
			
			pw.println("<tr><td colspan=2>Customer Id:</td>");
			pw.println("<td><input type='text' name='cid' size='25'></td></tr>");
			
			pw.println("<tr><td colspan=2>Supplier Name:</td>");
			pw.println("<td><input type='text' name='sname' size='25'></td></tr>");
			
			pw.println("<tr><td colspan=2>Product Type:</td>");
			pw.println("<td><input type='text' name='ptype' size='25'></td></tr>");
			
			pw.println("<tr><td colspan=2>Quantity:</td>");
			pw.println("<td><input type='text' name='qty' size='25'></td></tr>");
			
			pw.println("<tr><td colspan=2></td>");
			pw.println("<td><input type='submit' value='Generate Purchase Order' size='25'>");
			pw.println("<td><input type='hidden' name='action' value='purchase'>");
			pw.println("</body></html>");
					}
		else
		  {  
			
			String supid = req.getParameter("sid");
			String supname = req.getParameter("sname");
			String product = req.getParameter("ptype");
			String quantity = req.getParameter("qty");  
			String custid = req.getParameter("cid");  
			ps.addPurchaseOrder(supid,custid,supname,product,quantity);	
			pw.println("<html><body bgcolor='lightyellow'><center>");
			pw.println("<h3>Purchase order details succesfully stored in the database.<h3>");		
			
		}
			pw.flush();
			
	}catch(Exception e){
			pw.println(e.getMessage());	
		}	
	
}


}

