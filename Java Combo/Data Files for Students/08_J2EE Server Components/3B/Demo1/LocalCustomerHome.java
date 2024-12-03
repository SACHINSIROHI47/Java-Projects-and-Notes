package cmrbank; 
import javax.ejb.*;
import java.util.*;
public interface LocalCustomerHome extends EJBLocalHome
{
   public LocalCustomer create(String name) throws CreateException;
   public LocalCustomer findByPrimaryKey(String cid) throws FinderException;
}
