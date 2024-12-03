package shop;

import java.util.*;
import javax.ejb.*;

public class ShopEJB implements SessionBean {

  Vector selectedProducts;
 

   public void ejbCreate() throws CreateException {

          selectedProducts = new Vector();
  }

  public String addCart(String pname) {	  
	  
	try
	{
	if(!selectedProducts.isEmpty())
	{
    Enumeration enum = selectedProducts.elements();           
    String producttitle="";    
    while(enum.hasMoreElements()) {            	    
	    producttitle = (String)enum.nextElement();
                if(producttitle!=null)                
                {                  	                	          	        
	                if(pname.equals(producttitle))
	                {
		          return "You have already selected this product";
	                }	                
	            }
            	}               
    selectedProducts.addElement(pname);
	}
    else
    {
	    selectedProducts.addElement(pname);
	}
	}	
	catch(Exception e)
	{
		return "Error";	
	}
	return "";
  }

   public Vector getSelectedProducts() {
      return selectedProducts;
   }

   public ShopEJB() {}
   public void ejbRemove() {}
   public void ejbActivate() {}
   public void ejbPassivate() {}
   public void setSessionContext(SessionContext sc) {}

}   
