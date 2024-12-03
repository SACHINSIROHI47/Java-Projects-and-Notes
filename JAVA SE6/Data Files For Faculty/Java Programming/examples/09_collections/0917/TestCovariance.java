import com.mybank.domain.*;
import java.util.*;

public class TestCovariance {

  public static void printNames(List <? extends Account> lea) {
	  for (int i=0; i < lea.size(); i++) {
		  System.out.println(lea.get(i).getName());
	  }
  }
  
  public static void main(String[] args) {
    List<CheckingAccount> lc = new ArrayList<CheckingAccount>();
    List<SavingsAccount> ls = new ArrayList<SavingsAccount>();
  
    printNames(lc);
    printNames(ls);

    //but...
    List<? extends Object> leo = lc; 	//OK
    leo.add(new CheckingAccount("Fred"));	//Compile error!
  }
}