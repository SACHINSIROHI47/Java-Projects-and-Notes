/* JAXP packages */
import javax.xml.parsers.*;
/* Defines all the interfaces for the SAX parser */
import org.xml.sax.*;
/* Defines the class that will handle the SAX events */
import org.xml.sax.helpers.*;
/* Provides interface for DOM API */
import org.w3c.dom.*;
/* Needed for the output operation */
import java.io.*;
public class DisplayBookDom
{
	static final String outputEncoding = "UTF-8";
	private PrintWriter out;
	private int indent = 0;
	/* Declaring a constructor */
	DisplayBookDom(PrintWriter out)
	{
		this.out = out;
	}
	/* Declaring a method that displays the node name and node value */
	private void println_Com(Node nd)
	{
		/* Retrieve the node name */
		String nodeName = nd.getNodeName();
		if(nodeName != " ")
			out.print("Node Name = \"" + nodeName + "\"");
		/* Retrieve the node value */
		String nameSpace = nd.getNodeValue();
		if(nameSpace != null )
		{
			out.print("nodeValue=");
			/* Display the node value */
			out.print("\"" + nameSpace+ "\"");
		}
		out.println();
	}
	/* Declaring method for displaying the error message */
	private static void errorMethod()
	    {
			System.err.println("File handling error ");
			System.exit(1);
		}
	/* Display various types of nodes */
	private void printNode(Node nd)
    {
		/* Retrieve the type of node */
		int type = nd.getNodeType();
		switch (type)
		{
			
			/* Identify the ELEMENT NODE */
			case Node.ELEMENT_NODE:
				out.print("ELEMENT NODE:");
				println_Com(nd);
				break;
			
			case Node.TEXT_NODE:
				out.print("TEXT NODE:");
				println_Com(nd);
				break;
			
		}
		/* Display a child node if any */
		indent++;
		for(Node child = nd.getFirstChild(); child != null;child = child.getNextSibling())
		{
			printNode(child);
		}
		indent--;
	}
	/* Declaring the main method */
	public static void main(String[] args) throws Exception
	{
		String filename = null;
		boolean dtdValidate = false;
		boolean xsdValidate = false;
		for(int i = 0; i < args.length; i++)
		{
				filename = args[i];
				if(i != args.length - 1)
				{
					System.out.print("Error");
				}
		}
		if(filename == null)
		{

			errorMethod();
		}
        /* Creating an instance of DocumentBuilderFactory class */
        DocumentBuilderFactory docbuilderfactory = DocumentBuilderFactory.newInstance();
        /* Creating an instance of document builder class */
        DocumentBuilder docBuilder = docbuilderfactory.newDocumentBuilder();
		/* Parse the input file */
		Document doc = docBuilder.parse(new File(filename));
		/* Print out the DOM tree */
		OutputStreamWriter outWriterStream = new OutputStreamWriter(System.out, outputEncoding);
		new DisplayBookDom(new PrintWriter(outWriterStream, true)).printNode(doc);
	}
}
