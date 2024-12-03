/* Import the packages */
import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
/* Extends the interfaces DefaultHandler */
public class DisplayStudentSax extends DefaultHandler
{
    static private Writer writerOut;
    /* Create an object of StringBuffer class */
    StringBuffer stringBuffer;
    static int count=0;
    public static void main(String fileName[])
    {
        if (fileName.length != 1)
        {
            System.err.println("Usage: cmd filename");
            System.exit(1);
        }
        DefaultHandler defaultHandler = new DisplayStudentSax();
        /* Create an object of the class SAXParserFactory */
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try
        {
            writerOut = new OutputStreamWriter(System.out,"UTF8");
            /* Create an object of SAXParser */
            SAXParser Sax_Parser = saxParserFactory.newSAXParser();
            /* Parse the input file */
            Sax_Parser.parse( new File(fileName[0]), defaultHandler);
            System.out.println("Total number of unique XML elments are: " + count);  
        }
        catch (Throwable thr)
        {
            thr.printStackTrace();
        }
        System.exit(0);
    }
    /* Declare a method to handle the start of the document event */
    public void startDocument() throws SAXException 
    {
        IOHandler("<?xml version = '1.0' encoding = 'UTF-8'?>");
        /* For inserting a new line  */
        newLine();
    }
	/* Declare a method to handle the end of the document event */
    public void endDocument() throws SAXException 
    {
        try
        {
            newLine();
            writerOut.flush();
        }
        catch (IOException e)
        {
            throw new SAXException("I/O error", e);
        }
    }
	/* Declare a method to handle the start of the element event */
    public void startElement(String namespaceURI, String sName, String qName, Attributes attrs) throws SAXException 
    {
        display();
        String eName = sName;
        if ("".equals(eName))
        	eName = qName;
        IOHandler("<" + eName);
        if (attrs != null)
        {
            /* Get the length of the attribute */
            for (int i = 0; i < attrs.getLength(); i++)
            {
                String aName = attrs.getLocalName(i);
                if ("".equals(aName))
                	aName = attrs.getQName(i);
                IOHandler(" ");
                
                IOHandler(aName + "=\"" + attrs.getValue(i) + "\"");
            }
        }
        IOHandler(">");
        count++;
    }
	/* Declare a method to handle the end of the element event */
    public void endElement(String namespaceURI, String sName, String qName) throws SAXException     {
        display();
        String eName = sName;
        if ("".equals(eName))
        	eName = qName;
        IOHandler("</" + eName + ">");
    }
	/* Declare a method to handle the character event */
    public void characters(char buf[], int offset, int len) throws SAXException 
    {
        String s = new String(buf, offset, len);
        if (stringBuffer == null)
        {
           stringBuffer = new StringBuffer(s);
        }
        else
        {
           stringBuffer.append(s);
        }
    }
    /* Declare a display the content in the StringBuffer */ 
   	private void display() throws SAXException
    {
        if (stringBuffer == null)
        return;
        String s = ""+stringBuffer;
        IOHandler(s);
        stringBuffer = null;
    }
    
    private void IOHandler(String s) throws SAXException
    {
        try
        {
            writerOut.write(s);
            writerOut.flush();
        }
        catch (IOException IOExcep)
        {
            throw new SAXException("I/O error", IOExcep); 
        }
    }
    /* Declare a method to insert a new line */    
    private void newLine() throws SAXException
    {
        String lineEnd =  System.getProperty("line.separator");
        try
        {
            writerOut.write(lineEnd);
        }
        catch (IOException e)
        {
            throw new SAXException("I/O error", e);
        }
    }
}
