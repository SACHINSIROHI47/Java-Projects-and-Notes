class Calculator
{
	public int multiply(int a, int b)
	{
		System.out.println("Multiplying two integer values:");
		return  a * b;
		}
	public double multiply(double a, double b)
	{		
		System.out.println("Multiplying two double values:");
		return a * b;	
	}
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		System.out.println(c.multiply(5,10));
		System.out.println(c.multiply(1000.6,1000.5));
	}
}
