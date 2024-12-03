import com.mybank.domain.*;
import java.util.*;

public class TestTypeSafety {

  public static void main(String[] args) {
    List<CheckingAccount> lc = new ArrayList<CheckingAccount>();
  
    lc.add(new CheckingAccount("Fred")); // OK
    lc.add(new SavingsAccount("Fred"));  // Compile error!
  
    // therefore... 
    CheckingAccount ca = lc.get(0);      // Safe, no cast required
  }
}