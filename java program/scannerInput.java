import java.util.Scanner;
public class scannerInput
{
  public static void main(String[]arg)
{
  int qty;
  float price;
  float amount;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter quantity:");
  qty=sc.nextInt();
  System.out.println("enter unit price");
  price=sc.nextFloat();
  amount=qty*price;
  System.out.println("the total sale is"+amount);
  sc.close();
 }
}