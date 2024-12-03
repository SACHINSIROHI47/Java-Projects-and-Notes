package simple;

import javax.ejb.EJBObject;

public interface SimpleInterest extends EJBObject { 
    public float calculateInterest(float rate, float time, float amount) throws java.rmi.RemoteException; 
}
