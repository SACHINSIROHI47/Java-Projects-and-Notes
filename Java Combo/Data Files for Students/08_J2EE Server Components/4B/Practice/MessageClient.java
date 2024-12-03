import javax.jms.*;
import javax.naming.*;
public class MessageClient 
{
    public static void main(String[] args) 
    {
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
            conFact = (ConnectionFactory) jndiContext.lookup ("java:comp/env/jms/NewConnectionFactory");
	      dest = (Queue) jndiContext.lookup("java:comp/env/jms/newqueue");
        } catch (NamingException e) 
        {
            System.out.println("Could not find the object: " + e.toString());
        }

        try {
            con = conFact.createConnection();
            session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
            msgPrd = session.createProducer(dest);
            msg = session.createTextMessage();

            msg.setText("Hello, this is my first message. " );
            System.out.println("Sending message: " + msg.getText());
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
