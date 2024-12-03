/* Needed for the output operation */
import java.io.*;
/* Defines all the interfaces for the SAX parser */
import org.xml.sax.*;
/* Defines the class that will handle the SAX events */
import org.xml.sax.helpers.DefaultHandler;
/* Creates the instance you will use */
import javax.xml.parsers.SAXParserFactory;
/* Throws an exception if the application is unable to produce a parser that matches the configuration option */
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
public class DisplayBookSax extends DefaultHandler//Implementing the contentHandler interface by extending DefaultHanlder defined in org.xml.sax.helpers package
{
    static private Writer writerOut;
    StringBuffer stringBuffer;
    /* Accepts input for the XML file */
    public static void main(String fileName[])
    {
        if (fileName.length != 1)
        {
            System.err.println("Usage: cmd filename");
            System.exit(1);
        }
        DefaultHandler defaultHandler = new DisplayBookSax();
        /* Creating an instance of SAXParserFactory class */
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try
        {
            /* Set up output stream */
            writerOut = new OutputStreamWriter(System.out,"UTF8");
            /* Create an instance of SAXParser class */
            SAXParser Sax_Parser = saxParserFactory.newSAXParser();
            /* Parse the XML file */
            Sax_Parser.parse( new File(fileName[0]), defaultHandler);//Identify the name of the file to be processed.
        }
        catch (Throwable thr)
        {
            thr.printStackTrace();
        }
        System.exit(0);
    }
    /* Method that handles the start document event notification */
    public void startDocument() throws SAXException /*For handling start-document event.*/
    {
        IOHandler("<?xml version = '1.0' encoding = 'UTF-8'?>");
        /* To print a new line character */
        newLine();
    }
	/* Method that handles the end document event notification */
    public void endDocument() throws SAXException 
/*For handling end-document event. */
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
	/* Method that handles the start element event notification */
    public void startElement(String namespaceURI, String sName, String qName, Attributes attrs) throws SAXException /*For handling start-element event. */
    {
        displayText();
        String eName = sName;
        if ("".equals(eName))
        	eName = qName;
        IOHandler("<" + eName);
        if (attrs != null)
        {
            /* Get the length of the attribute */
            for (int i = 0; i < attrs.getLength(); i++)
            {
                /* Gets the attribute local name */
                String aName = attrs.getLocalName(i);
                if ("".equals(aName))
                	aName = attrs.getQName(i);
                IOHandler(" ");
                /* Retrieve the value of an attribute */
                IOHandler(aName + "=\"" + attrs.getValue(i) + "\"");
            }
        }
        IOHandler(">");
    }
	/* Method that handles the end element event notification */
    public void endElement(String namespaceURI, String sName, String qName) throws SAXException /*For handling end-element event. */
    {
        displayText();
        String eName = sName;
        if ("".equals(eName))
        	eName = qName;
        IOHandler("</" + eName + ">");
    }
	/* Method that handles the character data event */
    public void characters(char buf[], int offset, int len) throws SAXException /*For handling character event.*/
    {
        String s = new String(buf, offset, len);
        /* if the string buffer is empty */
        if (stringBuffer == null)
        {
           stringBuffer = new StringBuffer(s);
        }
        else
        {
           /* Add the character to the string buffer */
           stringBuffer.append(s);
        }
    }
    /* Display text accumulated in the string buffer */
    private void displayText() throws SAXException
    {
        /* If the string buffer is empty */
        if (stringBuffer == null)
        return;
        String s = ""+stringBuffer;
        IOHandler(s);
        stringBuffer = null;
    }
    /* Write the content in the string buffer to the output console */
    private void IOHandler(String s) throws SAXException
    {
        try
        {
            writerOut.write(s);
            writerOut.flush();
        }
        catch (IOException IOExcep)
        {
            throw new SAXException("I/O error", IOExcep); /* Any I/O error is wrapped in SAXException. The generated Exception is thrown back to the SAX parser*/
        }
    }
    /* Prints a new line character */
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
