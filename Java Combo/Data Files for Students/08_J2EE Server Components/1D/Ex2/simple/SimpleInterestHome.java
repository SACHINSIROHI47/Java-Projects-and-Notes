package simple;

import javax.ejb.EJBHome;

public interface SimpleInterestHome extends EJBHome 
{ 
    public SimpleInterest create() throws java.rmi.RemoteException, javax.ejb.CreateException; 
}
