import java.io.Serializable;
import java.rmi.RemoteException; 
import javax.ejb.EJBException;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.ejb.CreateException;
import javax.naming.*;
import javax.jms.*;
public class MyMessageDrivenBean implements MessageDrivenBean, MessageListener 
{
    private MessageDrivenContext mdc = null;
    private Context context;
    
    public MyMessageDrivenBean() 
    {
        System.out.println("Inside the constructor");
    }

    public void setMessageDrivenContext(MessageDrivenContext mdc) 
    {
        System.out.println("Inside setMessageDrivenContext()");
        this.mdc = mdc;
    }

    public void ejbCreate() 
    {
        System.out.println("Inside ejbCreate()");
    }

    public void onMessage(Message msg) 
    {
        try {
               /* Check the message type.*/
         if (msg instanceof TextMessage) 
            {
                TextMessage txtMsg = (TextMessage) msg;
                System.out.println ("The received message is : " + txtMsg.getText());
            } else 
            {
                System.out.println("Incorrect message type");
            }
        } catch (JMSException e) 
        {
            e.printStackTrace();
        } catch (Throwable te) 
        {
            te.printStackTrace();
        }
    }
    
    public void ejbRemove() 
    {
        System.out.println("Inside remove()");
    }
}
