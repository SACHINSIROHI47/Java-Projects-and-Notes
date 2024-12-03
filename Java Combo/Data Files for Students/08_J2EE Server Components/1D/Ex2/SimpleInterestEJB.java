package simple;

import java.util.*; 
import java.io.*; 
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class SimpleInterestEJB implements SessionBean { 

    private  javax.ejb.SessionContext m_ctx = null; 

    public void setSessionContext(SessionContext ctx) { 
        m_ctx = ctx; 
    } 

    public void ejbCreate() throws java.rmi.RemoteException, javax.ejb.CreateException {}   
     
    public void ejbRemove() {} 
 
    public void ejbActivate() {} 

    public void ejbPassivate() {} 

   public float calculateInterest(float rate, float time, float amount) throws java.rmi.RemoteException { 
       float interestvalue = (time * amount * rate) / 100; 
       return interestvalue; 
    } 
} 
