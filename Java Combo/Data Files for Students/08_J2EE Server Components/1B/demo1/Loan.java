import javax.ejb.EJBObject;

public interface Loan extends EJBObject { 
    public float calculateInterest(float rate, float time, float amount) throws java.rmi.RemoteException; 
}
