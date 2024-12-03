class NewThread implements Runnable
{
	Thread t;
	NewThread() 
	{
		t = new Thread(this, "ChildThread");
		System.out.println("Child Thread:" + t);
		t.start();
	}
	public void run()
	{ // Implementing the run() method of the Runnable interface
      	 	System.out.println("Child Thread Started");
		System.out.println("Exiting the child thread");
	}
}
class ThreadClass 
{
	public static void main(String args[]) 
	{
	   new NewThread();
	   System.out.println("Main thread Started");
	   try
	   {
        	Thread.sleep(5000);
     	   }
    	   catch(InterruptedException e)
     	   {
		System.out.println("The main thread interrupted");}
		System.out.println("Exiting the main thread");
  	   }
}
