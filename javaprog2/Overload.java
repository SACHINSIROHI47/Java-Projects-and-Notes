class Statistics 
{
	public float average(int  nums[]) 
	{
		int sum = 0;
		for ( int x : nums ) 
		{
			sum += x;
		}
		return ((float) sum) / nums.length;
	}
	public int average(int num1,int num2) 
	{
		int sum = 0;
		sum=(num1+num2);			
		return  sum / 2;
	}
	public int average(int num1,int num2,int num3) 
	{
		int sum = 0;
		sum=(num1+num2+num3);
		return  sum / 3;
	}
	public float average(float num1,float num2) 
	{
		float sum = 0;
		sum=(num1+num2);			
		return  sum / 2;
	}	
}
class Overload 
{
	public static void main(String args[])
	{
		Statistics obj = new Statistics();
		int array1[] = new int[4];
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		float result1;	
		result1=obj.average(array1);
		System.out.println("Average of Array : "+result1);
		
		int result2;
		result2=obj.average(70,80);
		System.out.println("Average of Two Integer Numbers : "+result2);

		int result3;
		result3=obj.average(60,180,200);
		System.out.println("Average of Three Integer Numbers : "+result3);

		float result4;
		result4=obj.average(52.3F,705.22F);
		System.out.println("Average of Two Float Numbers : "+result4);
	}
}
