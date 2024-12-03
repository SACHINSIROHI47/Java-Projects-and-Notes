package cmrbank;
import javax.ejb.*;
import java.util.*;
public interface LocalCustomer extends EJBLocalObject
{
  public void addAccount(LocalAccount acc);
  public String getCustomerId();
  public String getCustomerName();
  public void setCustomerName(String name);
  public Collection setCMRAccounts();
}
