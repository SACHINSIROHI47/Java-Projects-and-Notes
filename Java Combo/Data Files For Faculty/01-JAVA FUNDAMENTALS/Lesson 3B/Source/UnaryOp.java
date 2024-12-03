class UnaryOp
{
	public static void main(String args[])
	{
		int x=5;
		int y=10;
		int a,b,c,d;
		
		a=x++; // Postfix increment operator
		b=y--; // Postfix decrement operator
		c=++x; // Prefix increment operator
		d=--y; // Prefix decrement operator
		System.out.println("The value of variable a is:" + a);
		System.out.println("The value of variable b is:" + b);
		System.out.println("The value of variable c is:" + c);
		System.out.println("The value of variable d is:" + d);
	}
}
