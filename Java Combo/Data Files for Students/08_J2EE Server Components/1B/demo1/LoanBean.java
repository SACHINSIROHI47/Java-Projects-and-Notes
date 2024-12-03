import java.util.*; 
import java.io.*; 
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class LoanBean implements SessionBean { 

    private  javax.ejb.SessionContext m_ctx = null; 

    public void setSessionContext(SessionContext ctx) { 
        m_ctx = ctx; 
    } 

    public void ejbCreate() throws java.rmi.RemoteException, javax.ejb.CreateException { 
        System.out.println("ejbCreate() on obj " + this); 
    } 

    public void ejbRemove() { 
        System.out.println("ejbRemove() on obj " + this); 
    } 

    public void ejbActivate() { 
        System.out.println("ejbActivate() on obj " + this); 
    } 

    public void ejbPassivate() { 
        System.out.println("ejbPassivate() on obj " + this); 
    } 

  

    public float calculateInterest(float rate, float time, float amount) throws java.rmi.RemoteException { 
       float interest = time * amount * (rate / 100); 
       return interest; 
    } 
}
