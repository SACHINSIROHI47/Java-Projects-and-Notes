import java.io.*;

class StreamTokenizerDemo
{
public static int words = 0;
public static int chars = 0;
public static int lines = 0;

public static void main(String args[]) throws Exception
{
	FileReader FReader = new FileReader("stream.txt");
	StreamTokenizer ST = new StreamTokenizer(FReader);
	
	ST.resetSyntax();
	ST.wordChars(33,255);
	ST.eolIsSignificant(true);
	while(ST.nextToken()  !=  ST.TT_EOF)
  	{
		switch(ST.ttype)
		{
			case StreamTokenizer.TT_EOL:
				lines++;
				break;
			case StreamTokenizer.TT_WORD:
				words++;
				break;
		}
	}
	System.out.println(" The total number of lines in stream.txt file: " + lines);
	System.out.println(" The total number of words in stream.txt file: " + words);
}
}
