class ThrowStatement
 {
    static void throwDemo() 
        {
  		try
		{
      			throw new IllegalStateException(); 
	// creating and throwing an object of the IllegalStateException class.
	     	}	  
		catch(NullPointerException objA) 
		{
                	System.out.println("Not caught by catch block inside throwDemo()."); 
		}
  	}	
 
public static void main(String args[]) 
 	{
 		try
		{
       			throwDemo();
		} 
		catch(IllegalStateException objB) 
		{
	// catching an object of the IllegalStateException class.
	     		System.out.println(" Exception Caught in :" + objB); 
		}
  	}
}
