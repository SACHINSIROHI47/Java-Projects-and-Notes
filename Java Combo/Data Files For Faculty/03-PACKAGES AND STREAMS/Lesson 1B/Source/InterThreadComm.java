class Thread1
{
	int d;
	boolean flag = false; 		
      	synchronized int getData()
      	{
		if(flag==false) 
		{
            		try
		{
	      		wait();
            		}	
            		catch(InterruptedException e)
		{ 
			System.out.println(" Exception caught");            
            		}
	}
       		System.out.println("Got data:" + d);
	   	flag=false;
        	                  notify();	
		return d;	
	}
	
	synchronized void putData(int d)
	{
		if(flag==true ) 
		{
        		try
		{
			wait();
        		}	
		        catch(InterruptedException e)
			{
	 		System.out.println(" Exception caught");  
			}          
		                this.d = d;
   	     	               System.out.println("Put data with value:" + d);
 	     	                flag=true;	
		                notify();
		}
	}
}

	class producer implements Runnable
	{
   		Thread1 t;
   		public producer(Thread1 t)
   		{
			this.t = t;
			new Thread(this,"Producer").start();
			System.out.println("Put Called by producer");
   		}
		 public void run()
   		{
			int data =0;
			while(true) 
      			{
           			data=data+1;
			        t.putData(data);
      			}  
  		}
	}
	class consumer implements Runnable
	{
   		Thread1 t;
		public consumer(Thread1 t)
   		{
        		this.t = t;
			new Thread(this,"Consumer").start();

			System.out.println("Get Called by consumer");
   		}
		public void run()
   		{
	     	   while(true) 
      		   {
	     		t.getData();          
      		   }
   		}
	}
	public class InterThreadComm
	{
  		 public static void main(String args[])
  		 {
		   Thread1 obj1 = new Thread1();
		   producer p = new producer(obj1);
		   consumer c = new consumer(obj1);     
		   System.out.println("Press Ctrl+c to stop");
   		}
	}
