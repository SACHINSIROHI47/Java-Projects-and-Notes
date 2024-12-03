//LoginValidator.java
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.*;

public class LoginValidator extends JFrame implements LoginListener 
{
	LoginBean meb;
	public LoginValidator() 
	{
		super("Login Form");
            //Initialise the login bean
		meb = new LoginBean();

            //Add the login bean to the frame window
		getContentPane().add(meb);

            /* Register LoginValidator as a listener of the 
            LoginEvent by invoking the following method of the 
            LoginBean */
		meb.addLoginListener(this);
	}
	public void validateLogin(LoginEvent mec) 
	{
		String temp1=mec.uname;
		String temp2=mec.pass;
		if(temp1.equals(temp2))
			JOptionPane.showMessageDialog(this,new 
                    String("Invalid Login Details"));
		else
			JOptionPane.showMessageDialog(this,new 
                    String("Valid Login Details"));
	}
	public static void main(String a[]) 
	{
		LoginValidator mec = new LoginValidator();
		mec.setSize(300, 300);
		mec.setVisible(true);
	}
}