class AssignOp
{
	public static void main(String arr[])
	{
		int x , y, z;
		x= y = z = 5;
		x += y; // Arithmetic assignment operator
		y -= z;
		z *= x;
		System.out.println("The value of x is: " + x);
		System.out.println("The value of y is: " + y);
		System.out.println("The value of z is: " + z);
	}
}
