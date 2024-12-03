/* Import Packages */
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;
public class TransformBookXslt
{
	public static void main(String[] argv) throws TransformerException, TransformerConfigurationException, FileNotFoundException, IOException
	{
		/* Create an instance of TransformerFactory */
		TransformerFactory transFactory = TransformerFactory.newInstance();
		/* Create an instance of Transformer */
		Transformer transformer = transFactory.newTransformer(new StreamSource(argv[1]));
		/* Invoking the transform method of Transformer class */
		transformer.transform(new StreamSource(argv[0]), new StreamResult(new FileOutputStream(argv[2])));
		/* Message displayed that the output is written to the file*/ 
System.out.println("** The generated HTML file is: "+ argv[2]+" **");
	}
}
