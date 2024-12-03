import java.io.*;
class PBIStreamClass
{
	public static void main(String args[]) throws IOException
	{
		String str ="(a+b)+c";
		byte buf[] = str.getBytes();
		ByteArrayInputStream OStream = new ByteArrayInputStream(buf);
		PushbackInputStream PStream = new PushbackInputStream(OStream);
		int ch;
		while((ch = PStream.read()) != -1)
		{
			switch(ch)
			{
			case 'a' : 
				PStream.unread(2);
				break;
			case 'b' : 
				PStream.unread(3);
				break;
			case 'c' : 
				PStream.unread(4);
				break;
			case ')'  : 
				System.out.print((char)ch);
				break;
			case '('  :
				System.out.print((char)ch);
				break;   
			case '+'  :
				System.out.print((char)ch);
				break;
			default : 
				System.out.print(ch);
				
			}
		}
	}	
}
