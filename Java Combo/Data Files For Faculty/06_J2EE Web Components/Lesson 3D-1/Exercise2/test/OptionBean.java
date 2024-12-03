/* Specify the package name */
package test;
import java.io.Serializable;
import java.lang.Math;
public class OptionBean implements Serializable
{
	String Str;
	double num3;
	String final_output;
	/* Declaring the constructor */
	public OptionBean()
	{
	}
	/* Initialize the value of the String variable Str */
	public void setStr( String string)
	{
		Str=string;
	}
	/* Returns the value of the String variable Str */
	public String getStr()
	{
		return Str;
	}
	/* Returns the value of the double variable num3 */
	public double getnum3()
	{
		return num3;
	}
	/* Initialize the value of the double variable num3 */
	public void setnum3(int num1)
	{
			if(Str.equals("Cube"))
			{
				num3 = Math.pow(num1,3);
				final_output="Cube";
			}
			if(Str.equals("Square"))
			{
				num3 = Math.pow(num1,2);
				final_output="Square";
			}
			if(Str.equals("SquareRoot"))
			{
				num3 = Math.sqrt(num1);
				final_output="Square Root";
			}
	}
}
