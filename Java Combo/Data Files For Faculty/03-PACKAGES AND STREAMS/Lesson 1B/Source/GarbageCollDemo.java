public class GarbageCollDemo
{ 

	int mem = 30000; 
	int[] ArrayA = new int[mem]; 
    
   	void occupyMemory()
	{ 
   
      		for (int i=0; i<mem; i++) 
		{ 
			ArrayA[i] = i; 
      		} 
   	}
 
   	void DiscardArray() 
	{ 
	      	for (int i=0; i<mem; i++)
		{ 
	        		ArrayA[i] = 0; 
      		} 
   	}
 	 public static void main (String[] args)
	 { 
	      	GarbageCollDemo gc = new GarbageCollDemo(); 

      		Runtime r = Runtime.getRuntime(); 
      
      		//Determine the current amount of free memory.

      		long freeMem = r.freeMemory(); 
      		System.out.println("Initial free memory before creating array: " + freeMem); 
      
		// Determine the amount of memory after garbage collection.

		r.gc();      
		freeMem = r.freeMemory();
		System.out.println("Free memory after garbage collection: " + freeMem); 

      		//Consume some memory.
      		gc.occupyMemory(); 

      		//Determine amount of memory left after consumption.
      		freeMem = r.freeMemory(); 
                                   System.out.println("free memory after creating array:  " + freeMem); 
	                 System.out.println("Discarding the Array..........."); 
 
		// Discard the array.
		gc.DiscardArray();

     		//Run the garbage collector.
	      	r.gc(); 
      		freeMem = r.freeMemory(); 
     		System.out.println("free memory after running gc():    " + freeMem); 

   	 } 

}

