class CallByReference
{
  int x;
  public static void increment  (CallByReference n)
  {
      System.out.println("value of n.x before increment x is "+n.x);
      n.x=n.x+1;
      System.out.println("value of n.x after increment x is "+n.x);
  }
  public static void main(String[]args)
  {
      CallByReference a=new  CallByReference();
      a.x=3;
      System.out.println("value of a.x before calling increment() is "+a.x);
      increment(a);
      System.out.println("value of a.x after calling increment() is "+a.x);
  }
}
      
