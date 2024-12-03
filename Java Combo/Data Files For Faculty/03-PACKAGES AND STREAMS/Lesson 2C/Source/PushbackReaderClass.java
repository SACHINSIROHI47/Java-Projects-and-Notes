import java.io.*;
class PushbackReaderClass
{
	public static void main(String args[]) throws IOException
	{
		String s ="(a+b)+c";
		char buf[] = new char[s.length()];
		s.getChars(0,s.length(),buf,0);
		CharArrayReader CReader = new CharArrayReader(buf);
		PushbackReader PReader = new PushbackReader(CReader);
		int ch;
		while((ch = PReader.read()) != -1)
		{
			switch(ch)
			{
			case 'a' : 
				PReader.unread(2);
				break;
			case 'b' : 
				PReader.unread(3);
				break;
			case 'c' : 
				PReader.unread(4);
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
