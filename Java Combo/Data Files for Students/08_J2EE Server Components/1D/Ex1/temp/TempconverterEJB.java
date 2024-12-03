package temp;


import javax.ejb.SessionBean;
import java.rmi.RemoteException;
import javax.ejb.SessionContext;
import java.math.*;

public class TempconverterEJB implements SessionBean {

	public BigDecimal toCentigrade(BigDecimal ftemp) 
          { 
                BigDecimal val1 = new BigDecimal("32.00");
                BigDecimal val2 = new BigDecimal("9.00"); 
		   BigDecimal temp = ftemp.subtract(val1);
                BigDecimal result = temp.divide(val2, 2);
                return result.setScale(2,BigDecimal.ROUND_UP);
	     }
 
 	public BigDecimal toFarenheit(BigDecimal ctemp) 
	  {
		BigDecimal val1 = new BigDecimal("9.00");
                BigDecimal val2 = new BigDecimal("5.00");
                BigDecimal val3 = new BigDecimal("32.00"); 
		BigDecimal temp = ctemp.multiply(val1);
                BigDecimal temp2 = temp.divide(val2, 2);
		BigDecimal result = temp2.add(val3);
                return result.setScale(2,BigDecimal.ROUND_UP);
             }
 
public TempconverterEJB() {}
public void ejbCreate() {}
public void ejbRemote() {}
public void ejbRemove() {}
public void ejbActivate() {}
public void ejbPassivate() {}
public void setSessionContext(SessionContext sc) {}
}
