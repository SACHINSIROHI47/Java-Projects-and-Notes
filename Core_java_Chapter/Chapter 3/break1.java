class break1
{
	public static void main(String ar[])
	{
		L1:for(int i=1;i<=3;i++)
		{
			System.out.println(i);
			for(int j=1;i<=5;j++)
			{
				System.out.println(j);
				break L1;
			}
		}
	}
}
