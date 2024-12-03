class ThrowsClass 
{
	static void throwMethod() throws ClassNotFoundException
        { 
                System.out.println("In throwMethod");
  		  throw new ClassNotFoundException();
        }
        public static void main(String args[])
        {
      	  	try
         	{ 
             	 throwMethod();
         	}
         	catch(ClassNotFoundException Obja)
           	{
             		 System.out.println("throwMethod has thrown an Exception:" + Obja);
            }
      }
}
