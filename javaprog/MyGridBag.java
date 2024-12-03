import java.awt.*;
import javax.swing.*;

public class MyGridBag extends JFrame
{	
	JPanel panel1;
	JLabel lblTitle,lblID,lblPassword,lblFirstName,lblLastName,lblEmailID;
	JTextField txtID,txtFirstName,txtLastName,txtEmailID;
	JPasswordField txtPassword;
	JButton btnSubmit,btnClear;

	GridBagLayout gbl;
	GridBagConstraints gbc;



	MyGridBag()
	{

//////////////////////PANEL 1/////////////////////////////////
		super("Shopper paradise");
		panel1 = new JPanel();
		
		gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		panel1.setLayout(gbl);

		panel1.setBackground(Color.cyan);

 		lblTitle=new JLabel("Welcome to Shoppers Paradise");
		lblID=new JLabel("Shoppers ID");
		lblPassword=new JLabel("Password");
		lblFirstName=new JLabel("First Name");
        		lblLastName=new JLabel("Last Name");
        		lblEmailID=new JLabel("Email ID");
		
		txtID=new JTextField(6);
		txtPassword=new JPasswordField(10);
	 	  txtFirstName=new JTextField(20);
        		txtLastName=new JTextField(20);
        		txtEmailID=new JTextField(30);
		txtFirstName.setText("Mr./Mrs ");

		btnSubmit=new JButton("Submit");
		btnClear=new JButton("Clear");
		
		gbc.anchor=GridBagConstraints.CENTER;
		gbc.gridx=3;
		gbc.gridy=3;
		gbl.setConstraints(lblTitle,gbc);
		panel1.add(lblTitle);
		
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=8;
		gbl.setConstraints(lblID,gbc);
		panel1.add(lblID);

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=5;
		gbc.gridy=8;
		gbl.setConstraints(txtID,gbc);
		panel1.add(txtID);

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=11;
		gbl.setConstraints(lblPassword,gbc);
		panel1.add(lblPassword);

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=5;
		gbc.gridy=11;
		gbl.setConstraints(txtPassword,gbc);
		panel1.add(txtPassword);
		
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=14;
		gbl.setConstraints(lblFirstName,gbc);
		panel1.add(lblFirstName);

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=5;
		gbc.gridy=14;
		gbl.setConstraints(txtFirstName,gbc);
		panel1.add(txtFirstName);

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=17;
		gbl.setConstraints(lblLastName,gbc);
		panel1.add(lblLastName);

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=5;
		gbc.gridy=17;
		gbl.setConstraints(txtLastName,gbc);
		panel1.add(txtLastName);
		
		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=20;
		gbl.setConstraints(lblEmailID,gbc);
		panel1.add(lblEmailID);

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=5;
		gbc.gridy=20;
		gbl.setConstraints(txtEmailID,gbc);
		panel1.add(txtEmailID);

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=3;
		gbc.gridy=23;
		gbl.setConstraints(btnSubmit,gbc);
		panel1.add(btnSubmit); 

		gbc.anchor=GridBagConstraints.NORTHWEST;
		gbc.gridx=6;
		gbc.gridy=23;
		gbl.setConstraints(btnClear,gbc);
		panel1.add(btnClear);

	   getContentPane().add(panel1);
		
		setSize(300,400);
		setVisible(true);	
				
	}


	public static void main(String arr[])
	{
		MyGridBag MGB1 = new MyGridBag();
	}

}//end of MyGridBag.java program
