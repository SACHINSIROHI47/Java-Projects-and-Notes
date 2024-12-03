package cmrbank;
import javax.ejb.*;
import java.util.*;
public interface LocalAccount extends EJBLocalObject
{ 
  public String getAccountId();
  public String getAccountType();
  public void setAccountType(String name);

}
