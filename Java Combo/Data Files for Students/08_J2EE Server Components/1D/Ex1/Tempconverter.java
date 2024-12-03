package temp;

import java.rmi.RemoteException;
import javax.ejb.EJBObject;
import java.math.*;

public interface Tempconverter extends EJBObject {
	public BigDecimal toCentigrade(BigDecimal ftemp) throws RemoteException;
	public BigDecimal toFarenheit(BigDecimal ctemp) throws RemoteException;
}
