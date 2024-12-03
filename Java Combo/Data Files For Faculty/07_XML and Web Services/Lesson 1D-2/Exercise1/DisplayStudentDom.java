/* Import the packages */
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import org.w3c.dom.*;
import java.io.*;
public class DisplayStudentDom
{
    static int count=0;
    static final String outputEncoding = "UTF-8";
	private PrintWriter out;
	/* Declaring a constructor */
	DisplayStudentDom(PrintWriter out)
	{
		this.out = out;
	}
	/* Declaring a method to display the element in a XML file */
	private void displayNode(Node nd)
	{
		/* Get the node */
		String nodeName = nd.getNodeName();
		if(nodeName != " ")
			out.print("Node Name = \"" + nodeName + "\"");
        /* Get the value of the node */
		String nameSpace = nd.getNodeValue();
		if(nameSpace != null )
		{
			out.print("nodeValue=");

			out.print("\"" + nameSpace+ "\"");
		}
		out.println();

	}
	/* Declare a method for displaying error message */
	private static void errorMethod()
	{
			System.err.println("File handling error ");
			System.exit(1);
	}

	private void printNode(Node nd)
    {
	    /* Get the node type */
	    int type = nd.getNodeType();
		switch (type)
		{

		       /* If the node type is element */
		       case Node.ELEMENT_NODE:
				out.print("ELEMENT NODE:");
				displayNode(nd);
				count++;
				break;
		}

		for(Node child = nd.getFirstChild(); child != null;child = child.getNextSibling())
		{
			printNode(child);
        }
	}
	/* Declaring main method */
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
		/* create an object of DocumentBuilderFactory class */
        DocumentBuilderFactory docbuilderfactory = DocumentBuilderFactory.newInstance();
		/* Create an object of DocumentBuilder class */
        DocumentBuilder docBuilder = docbuilderfactory.newDocumentBuilder();
		/* Create an object of Document */
		Document doc = docBuilder.parse(new File(filename));
		OutputStreamWriter outWriterStream = new OutputStreamWriter(System.out, outputEncoding);
		new DisplayStudentDom(new PrintWriter(outWriterStream, true)).printNode(doc);
System.out.println("Total number of Element Nodes in the XML file: " + count);
	}
}
