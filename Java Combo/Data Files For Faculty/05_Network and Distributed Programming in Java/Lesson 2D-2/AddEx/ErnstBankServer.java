import java.rmi.*;
import java.util.*;
public interface ErnstBankServer extends Remote
{
	Vector display(String sLoan_registration_id,String sFirstName,String sLastName) throws RemoteException;
String update(String sLoan_registration_id,String sAddress) throws RemoteException;
}
