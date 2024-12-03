import javax.ejb.EJBHome;

public interface LoanHome extends EJBHome 
{ 
    public Loan create() throws java.rmi.RemoteException, javax.ejb.CreateException; 
}
