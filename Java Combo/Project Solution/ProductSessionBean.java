package project;
import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import java.util.*;

public class ProductSessionBean implements SessionBean {
  
  // the public business methods. these must be coded in the 
  // remote interface also. 
  
  public String[] getSuppliers(String prod) throws FinderException
  {
	  try
	  {
		Supplier sr=null;
		SupplierHome suphome=getSupplierHome();
	
		Collection coll=suphome.findByProduct(prod);
		Iterator i=coll.iterator();
		int len = coll.size()*4;
		String suppdetail[]=new String[len];	
		int j=0;
		String s = null;
		while(i.hasNext())	
			{
				sr=(Supplier)i.next();
				suppdetail[j++]=sr.getSupplierId();
			 	suppdetail[j++]=sr.getSupplierName();
	 			suppdetail[j++]=sr.getProduct();
	 			suppdetail[j++]=sr.getCity();
			}
		  return suppdetail;
	}
	
    catch (Exception ex) {
      throw new RuntimeException(ex.getMessage());
    }
  }  
		  
		  
 		  
  public String getCustomer(String custid) throws FinderException {
    try {
      CustomerHome custHome = getCustomerHome();
      Customer cust = custHome.findByPrimaryKey(custid);
      return cust.getPassword();
    }
    catch (FinderException fe) {
      throw fe;
    }
    catch (Exception ex) {
      throw new RuntimeException(ex.getMessage());
    }
  }
  
  
   
  public void addCustomer(String custid, String pwd, String name, String dept)
    throws CreateException {
    try {
      CustomerHome custHome = getCustomerHome();
      custHome.create(custid, pwd, name, dept);
    }
    catch (CreateException ce) {
      throw ce;
    }
    catch (Exception ex) {
      throw new RuntimeException(ex.getMessage());
    }
  }
   
  
  public void addPurchaseOrder(String custid, String sid, String sname, String product, String qty)
    throws CreateException {
    try {
      PurchaseOrderHome poHome = getPurchaseOrderHome();
      poHome.create(custid, sid, sname, product, qty);
    }
    catch (CreateException ce) {
      throw ce;
    }
    catch (Exception ex) {
      throw new RuntimeException(ex.getMessage());
    }
  }
   
  
  private SupplierHome getSupplierHome() throws NamingException {
    // get the initial context
    InitialContext initial = new InitialContext();
    
    // get the object reference
    Object objref = initial.lookup("java:comp/env/ejb/supplierlist");
    SupplierHome home = (SupplierHome)
      PortableRemoteObject.narrow(objref, SupplierHome.class);
    return home;
  }
  
   
  private CustomerHome getCustomerHome() throws NamingException {
    // get the initial context
    InitialContext initial = new InitialContext();
    
    // get the object reference
    Object objref = initial.lookup("java:comp/env/ejb/customerlist");
    CustomerHome home = (CustomerHome)
      PortableRemoteObject.narrow(objref, CustomerHome.class);
    return home;
  }
  
  private PurchaseOrderHome getPurchaseOrderHome() throws NamingException {
    // get the initial context
    InitialContext initial = new InitialContext();
    
    // get the object reference
    Object objref = initial.lookup("java:comp/env/ejb/purchaseorder");
    PurchaseOrderHome home = (PurchaseOrderHome)
      PortableRemoteObject.narrow(objref, PurchaseOrderHome.class);
    return home;
  }
  // standard ejb methods
  public void ejbActivate() {}
  public void ejbPassivate() {}
  public void ejbRemove() {}
  public void ejbCreate() {}
  public void setSessionContext(SessionContext context) { }
}