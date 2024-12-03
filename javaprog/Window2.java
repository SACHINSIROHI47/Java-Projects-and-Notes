import java.awt.*;
import javax.swing.*;

public class Window2	
{	
	
	public static void main(String args[]) 
	{
		JFrame f = new JFrame("Welcome To RGPG");
		FlowLayout flayout = new FlowLayout(FlowLayout.RIGHT);
		f.setLayout(flayout);
		JLabel lblUserID = new JLabel("User ID");
		JLabel lblPassword = new JLabel("Password");
		JTextField txtUserID = new JTextField(25);
		JPasswordField passPassword = new JPasswordField(15);
		JButton btnOK = new JButton("OK");

		f.add(lblUserID);
		f.add(txtUserID);
		f.add(lblPassword);
		f.add(passPassword);
		f.add(btnOK);
		

		f.setSize(400,200);
		f.setVisible(true);
	}
}
