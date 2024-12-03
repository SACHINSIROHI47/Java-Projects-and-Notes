class UserException extends Exception 
{
   int num1,num2,sum;
   UserException(int a,int b)
   {
	 num1 = a;   num2  = b;  sum = a + b;}
   	 public String toString()
      	 { 
	return "UserException Caught: The sum of the numbers Exceeds 20.."; }
 	 }
	 class UserExceptionDemo
	 {
		static void calculate(int a,int b) throws UserException
	  	{
		   int sum;
		   System.out.println("Calculate Method(" + a + "," + b + ")");
		   sum=a+b;
		   if(sum>20)
	 	   throw new UserException(a,b);
           	   System.out.println("The Value of the sum of two numbers is:" + sum);
		 	
	       }
		public static void main(String args[])
		{ 
  			 try 
      			 {
			    	calculate(12,1);
			    	calculate(15,7);
		         }
			 catch (UserException Obja)
     			 {
				System.out.println("Caught:" + Obja);
			 }
		}
}
