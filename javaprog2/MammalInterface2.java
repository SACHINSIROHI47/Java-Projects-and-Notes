interface Animal
{
//declaration

   public void eat();
   public void travel();
}
interface Birds
{
   public void fly();
}
public class MammalInterface2 implements Animal,Birds
{
//definition
   public void eat()
{
      System.out.println("Mammal eats");
   }

   public void travel()
{
      System.out.println("Mammal travels");
   } 
  public void fly()
{
      System.out.println("Birds fly");
   } 
   public static void main(String args[])
{
      MammalInterface2 m = new MammalInterface2();
     m.eat();
      m.travel();
      m.fly();
   }
} 