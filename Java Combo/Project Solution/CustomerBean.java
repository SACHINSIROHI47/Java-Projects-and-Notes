package project;

import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;

public abstract class CustomerBean implements EntityBean {

  private EntityContext _context;

  public abstract String getCustomerId();
  public abstract void setCustomerId(String custid);
  
  public abstract String getPassword();
  public abstract void setPassword(String pwd);
  
  public abstract String getCustomerName();
  public abstract void setCustomerName(String name);

  public abstract String getDepartment();
  public abstract void setDepartment(String dept);

  public String ejbCreate(String custid, String pwd, String name, String dept)
    throws CreateException 
   {

    setCustomerId(custid);
    setPassword(pwd);
    setCustomerName(name);
    setDepartment(dept);
    return null;
    }
         
  public void ejbPostCreate(String custid, String pwd, String name, String dept)
    throws CreateException { }

  public void setEntityContext(EntityContext ctx) {
      _context = ctx;
  }
    
  public void unsetEntityContext() {
      _context = null;
  }
    
  public void ejbRemove() { }
  public void ejbLoad() { }
  public void ejbStore() { }
  public void ejbPassivate() { }
  public void ejbActivate() { }
}