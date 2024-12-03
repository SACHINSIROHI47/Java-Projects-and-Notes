class DBooks extends Dcd implements TBooks
{
 void display1()
 {
 System.out.println("\t The number of purchased books are :" + book);
 System.out.println("\t The number of purchased CD's are :" + cd);
 System.out.println(" ");
 }

public static void main (String args[])
 {
   // Creating an instance of DBooks class.
   DBooks db = new DBooks(); 
   TBooks t;
   t = db;
   db.display1();
 }
}