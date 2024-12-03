/*Import the required packages*/
import java.util.* ;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.*;
/*Define the JavaBean to fire the custom event,LoginEvent */
public class LoginBean extends JPanel implements ActionListener 
{
	JLabel l1=new JLabel("Login Name:");
	JLabel l2=new JLabel("Password:");
	JTextField tf1 = new JTextField(15);
	JPasswordField tf2 = new JPasswordField(15);
	JButton ok = new JButton("LOGIN");
	/*Create the user interface for the JavaBean that fires the custom JavaBean event*/
public LoginBean() 
	{
		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(ok);
		ok.addActionListener(this);
	}

/*Create an object of event listener interface*/
LoginListener mel;

      /* Method to register login listeners*/
	public void addLoginListener(LoginListener mel) 
	{
		this.mel = mel;
	}
/*Create an object of custom event class*/
	LoginEvent mec;
	public void fireLoginEvent(LoginEvent mec) 
	{
		mel.validateLogin(mec);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if (ae.getSource()==ok) 
		{
/* When the user clicks the ‘ok’ button, create an event object and store the login information. Then, fire an event that can be used by listeners to use the login information */
			String temp1=tf1.getText();
			String temp2=new String(tf2.getPassword());
			mec = new LoginEvent(ok,temp1,temp2);
			fireLoginEvent(mec);
		}
	}
}
