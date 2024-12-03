package project;

import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;

public abstract class SupplierBean implements EntityBean {

  private EntityContext _context;

  public abstract String getSupplierId();
  public abstract void setSupplierId(String sid);
  
  public abstract String getSupplierName();
  public abstract void setSupplierName(String name);
  
  public abstract String getCity();
  public abstract void setCity(String city);

  public abstract String getProduct();
  public abstract void setProduct(String pdt);

  public String ejbCreate(String sid, String sname, String city, String product)
    throws CreateException 
   {

    setSupplierId(sid);
    setSupplierName(sname);
    setCity(city);
    setProduct(product);
    return null;
    }
         
  public void ejbPostCreate(String sid, String sname, String city, String product)
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