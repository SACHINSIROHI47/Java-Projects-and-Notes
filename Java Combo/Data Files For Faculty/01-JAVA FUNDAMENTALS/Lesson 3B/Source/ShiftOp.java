class ShiftOp
{
	public static void main(String arr[])
	{
		int a = -1;
		int b = a>>2; // Right shift operator
		int c = a<<2; // Left shift operator
		int d = a>>>24; // Unsigned shift operator
		System.out.println("The result of right shift operator is:"+b);
		System.out.println("The result of left shift operator is:" +c);
		System.out.println("The result of unsigned shift operator is:"+ d);
	}
}	
