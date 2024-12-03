package project;

import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;

public abstract class PurchaseOrderBean implements EntityBean {

  private EntityContext _context;

  public abstract String getPurchaseOrderId();
  public abstract void setPurchaseOrderId(String poid);

  public abstract String getCustomerId();
  public abstract void setCustomerId(String cid);

  public abstract String getSupplierId();
  public abstract void setSupplierId(String sid);

  public abstract String getSupplierName();
  public abstract void setSupplierName(String sname);
  
  public abstract String getProduct();
  public abstract void setProduct(String product);

  public abstract String getQuantity();
  public abstract void setQuantity(String qty);
  
  
  
  public String ejbCreate(String custid, String sid, String sname, String product, String qty)
    throws CreateException 
   {
    String poid = getUniqueId(); 
    setPurchaseOrderId(poid);
    setCustomerId(custid);
    setSupplierId(sid);
    setSupplierName(sname);
    setProduct(product);
    setQuantity(qty);
    return null;
    }
         
  public void ejbPostCreate(String custid, String sid, String sname, String product, String qty)
    throws CreateException { }

  public void setEntityContext(EntityContext ctx) {
      _context = ctx;
  }
    
  public void unsetEntityContext() {
      _context = null;
  }
    
  String getUniqueId()
  {
      return new Long(System.currentTimeMillis()).toString();	  
     }
  public void ejbRemove() { }
  public void ejbLoad() { }
  public void ejbStore() { }
  public void ejbPassivate() { }
  public void ejbActivate() { }
}