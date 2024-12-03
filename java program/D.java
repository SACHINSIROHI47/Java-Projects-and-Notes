import java.io.*;
 class A
 {
  A()
  {
    System.out.println("class a constructor");
  }
 }
  B()extendsA
  {
  {
    System.out.println("class b constructor");
  }
}
 
  C()extends B
{
  {
    System.out.println("class c constructor");
  }
}
 
   D()extends C
  {
  {
    System.out.println("class d constructor");
  }
}
   public static void main(String arg[])
  {
   D obj=new D();
  }
}
}

