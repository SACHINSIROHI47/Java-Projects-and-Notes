class Array6
{
		
	public static void main(String []args)
	{
		// original array
		int[] myArray = { 1, 2, 3, 4, 5, 6 };

		// new larger array
		int[] hold = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		// copy all of the myArray array to the hold
		// array, starting with the 0th index


 		System.arraycopy(myArray, 0, hold,0,6);

		System.out.println("Array1");
		for(int element : myArray)
		{
			System.out.println(element);
		}
		System.out.println("Array2");
		for(int element : hold)
		{
			System.out.println(element);
		}
	}
}
		