import com.mybank.domain.*;
import java.util.*;

public class TestInvariance {

  public static void main(String[] args) {
    List<Account> la;
    List<CheckingAccount> lc = new ArrayList<CheckingAccount>();
    List<SavingsAccount> ls = new ArrayList<SavingsAccount>();
	  
	  //if the following were possible...
    la = lc;
    la.add(new CheckingAccount("Fred"));
	
	  //then the following must also be possible...
    la = ls;
    la.add(new CheckingAccount("Fred"));
	  
	  //so...
    SavingsAccount sa = ls.get(0); //aarrgghh!!
  }
}