class Array5
{
	public static void main(String []args)
	{
		int [ ][ ] twoDim = new int [2][];
		twoDim[0] = new int[2];
		twoDim[1] = new int[3];

		twoDim[0][0]=100;
		twoDim[0][1]=200;	

		twoDim[1][0]=300;
		twoDim[1][1]=400;
		twoDim[1][2]=500;	

		System.out.print(twoDim[0][0]+" ");
		System.out.println(twoDim[0][1]);
		System.out.print(twoDim[1][0]+" ");
		System.out.print(twoDim[1][1]+" ");
		System.out.println(twoDim[1][2]);	
	}
}
		