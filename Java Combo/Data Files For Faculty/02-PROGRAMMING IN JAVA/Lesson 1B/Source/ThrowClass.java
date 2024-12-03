class ThrowClass 
{
 	 static void throwDemo()
	 {
    		try
		{
      			throw new IllegalStateException("MyException");
	     	}	  
		catch(IllegalStateException objA)       	
	        {
		System.out.println("Caught:" + objA); 
		}
    	 } // End of throwDemo() method.
	 public static void main(String args[]) 
	 {
	      throwDemo();
         }
}// End of the ThrowClass.


