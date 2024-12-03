class Precedence
{
	public static void main(String args[])
	{
		int x=10;
		boolean b =true;


		if(b)
		{
			x =  x++ + 1 -2 * 3 + 4 << 2 / 2 ; 
// Various operators used
			System.out.println("The value of x is:" + x);
		}
		else
		{
			x = 4<<2 - 10;
			System.out.println("The value of x is:" + x);
		}
	}
}
