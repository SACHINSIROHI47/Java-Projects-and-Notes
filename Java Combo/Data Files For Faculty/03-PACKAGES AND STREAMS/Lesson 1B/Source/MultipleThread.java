class newThreadClass implements Runnable
{
	String ThreadName;
      newThreadClass(String name) 
        {
	  	ThreadName = name;
		Thread t = new Thread(this, ThreadName); 
		System.out.println("Thread created: " + t);
		t.start();
        }
	public void run()
	{
	         try
		 {
			for(int i=1;i<=5;i++)
			{ 
				System.out.println(ThreadName + "loop :" + i);
				Thread.sleep(100);
			}
		 }
		catch( InterruptedException obj)
		{
			System.out.println("Thread :" + ThreadName + "interrupted");
		}
		System.out.println(ThreadName + "is exiting");
	}
}
class MultipleThread 
{
	public static void main(String args[])
 	{
		new newThreadClass("FirstChildThread");       //Creating first Thread
		new newThreadClass("SecondChildThread"); //Creating second Thread
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Main Thread loop:" + i);
				Thread.sleep(300);
			}
	   	}
		catch(InterruptedException obj)
		{
			System.out.println("Main thread is interrupted");
		}
	   	System.out.println("Main Thread is terminating now");
       	}
}
