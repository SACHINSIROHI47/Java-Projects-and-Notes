import javax.jms.*;
import javax.naming.*;
public class MessageProducerClient 
{
    public static void main(String[] args) 
    {
        /* Create initial context.*/
        InitialContext     jndiContext = null;
        ConnectionFactory  conFact = null;
        Connection         con = null;
        Session            session = null;
        Destination        dest = null;
        MessageProducer    msgPrd = null;
        TextMessage        msg = null;

        try {
            jndiContext = new InitialContext();
        } catch (NamingException e) {
            System.out.println("Could not create JNDI " + "context: " + e.toString());
        }

        try {
/*Perform the look up of the connection factory object that is bound with java:comp/env/jms/BankConnectionFactory.*/
            conFact = (ConnectionFactory) jndiContext.lookup ("java:comp/env/jms/BankConnectionFactory");

	/* Perform the look up of the physical destination.*/	
            dest = (Queue) jndiContext.lookup("java:comp/env/jms/BankPhysicalDest");
        } catch (NamingException e) 
        {
            System.out.println("Could not find the object: " + e.toString());
        }

        try {
            /* Create a connection object. */
            con = conFact.createConnection();
            /* Create a session object. */
            session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
  /* Create the message producer object.*/     
            msgPrd = session.createProducer(dest);
              /* Create a TextMessage object. */
            msg = session.createTextMessage();

            msg.setText("This is the first message " );
            System.out.println("Sending message: " + msg.getText());
            /* Send the message. */ 
            msgPrd.send(msg);
           
            msg.setText("This is the second message " );
            System.out.println("Sending message: " + msg.getText());
            msgPrd.send(msg);

        } catch (JMSException e) 
        {
            System.out.println("Exception : " + e.toString());
        }
	finally {
 	    if (con != null) 
	    {
                try {
                    con.close();
                } catch (JMSException e) {}
            }
        }
    }
} 
