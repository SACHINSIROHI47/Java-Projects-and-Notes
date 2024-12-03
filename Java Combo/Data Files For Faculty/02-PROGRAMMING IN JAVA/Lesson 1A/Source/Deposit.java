
class Deposit implements Bank, FinancialInstitute
{
int sd = 125;
int bd = 256;

public void bankDeposit()
{
System.out.println(" ");
System.out.println("\t The money deposited in the bank is $" + bd);
System.out.println(" ");
}

 public void securityDeposit()
 {
  System.out.println(" ");
  System.out.println("\t The money deposited in the financial institute is $" + sd);
  System.out.println(" ");
 }
 
 public static void main(String args[])
  {
  Deposit d = new Deposit();
  d.bankDeposit();
  d.securityDeposit();
  }
}