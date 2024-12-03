class CallByValue
{
  public static void increment(int a)
  {
    System.out.println("value of before increment is "+a);
     a=a+1;
    System.out.println("value of after increment is "+a);
  }
 public static void main(String[]args)
{
  int x=3;
  System.out.println("value of a before calling increment() is "+x);
  increment (x);
  System.out.println("value of x after calling increment() is "+x);
 }
}
