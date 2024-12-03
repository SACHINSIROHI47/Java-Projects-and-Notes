package cmrbank;

import javax.ejb.*;
import java.util.*;
public interface LocalAccountHome extends EJBLocalHome
{
  public LocalAccount create(String name) throws CreateException;
  public LocalAccount findByPrimaryKey(String acccid) throws FinderException;
}
