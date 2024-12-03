interface Animal 
{

   public void eat();
   public void travel();
}
public class MammalInterface implements Animal
{

   public void eat()
{
      System.out.println("Mammal eats");
 }

   public void travel()
{
      System.out.println("Mammal travels");
 } 

   public static void main(String args[])
{
      MammalInterface m = new MammalInterface();
     m.eat();
      m.travel();
   }
} 