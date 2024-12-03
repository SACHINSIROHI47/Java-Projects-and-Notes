import javax.swing.*;
import java.rmi.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class ClientPS
{
	static JFrame frame;
	static JPanel panel;
	static JPanel panel1;
	
/*variables of labels*/
 	JLabel labelFirstName;
JLabel labelLastName;
JLabel labelLoan_Registeration_Id;
	JLabel labelAddress;
	JLabel labelLoanAmount;
	JLabel labelBalance;

	/*variables for data entry controls*/
 	JTextField textFirstName;
 	JTextField textLastName;
	JTextField textLoan_Registeration_Id;
	JTextField textAddress;
	JTextField textLoanAmount;
	JTextField textBalance;

	JButton btn_Display;
	JButton btn_Update;

    public static void main(String args[])
	{
		new ClientPS();
	}

	public ClientPS()
	{
		/* Add the appropriate controls to the frame in the constructor. */
		/* Create a panel and add it to the frame */
		panel = new JPanel();
		panel1 = new JPanel();

		panel.setLayout(new GridLayout(6,2));
		panel1.setLayout(new GridLayout(1,2));

		frame=new JFrame("Earnest Bank");
		frame.setVisible(true);
	 	frame.setSize(550,200);

		frame.getContentPane().setLayout(new BorderLayout());

		/* Create and add the appropriate controls */
		/* Initializing labels */

		labelLoan_Registeration_Id = new JLabel("Loan Registration ID");
		labelFirstName = new JLabel("First Name");
		labelLastName = new JLabel("Last Name");

		labelAddress = new JLabel("Address");
		labelLoanAmount = new JLabel("Total Loan Amount");
		labelBalance = new JLabel("Total Balance Amount");

		/* Initializing text boxes */

		textFirstName = new JTextField(30);
		textLastName = new JTextField(30);

		textLoan_Registeration_Id = new JTextField(20);

		textAddress = new JTextField(30);
		textLoanAmount = new JTextField(30);
		textBalance = new JTextField(30);

		btn_Display = new JButton("Display");
		btn_Update = new JButton("Update");

		/* Adding controls for Applicant Loan_Registeration_Id */
		panel.add(labelLoan_Registeration_Id);
		panel.add(textLoan_Registeration_Id);

		/* Adding controls for Applicant First Name */
		panel.add(labelFirstName);
		panel.add(textFirstName);

		/* Adding controls for Applicant Last Name */
		panel.add(labelLastName);
		panel.add(textLastName);

		/* Adding controls for Applicant Loan Amount */
		panel.add(labelLoanAmount);
		panel.add(textLoanAmount);

		/* Adding controls for Applicant Loan Balance */
		panel.add(labelBalance);
		panel.add(textBalance);

		/* Adding controls for Applicant Address */
		panel.add(labelAddress);
		panel.add(textAddress);

		/* Adding controls for Applicant Account Type */
		ButtonListener blisten = new ButtonListener();
		btn_Display.addActionListener(blisten);
		btn_Update.addActionListener(blisten);
		
		panel1.add(btn_Display);
		panel1.add(btn_Update);
		
		frame.getContentPane().add(new JPanel(),BorderLayout.WEST);
		frame.getContentPane().add(new JPanel(),BorderLayout.EAST);
		frame.getContentPane().add(panel,BorderLayout.CENTER);
		frame.getContentPane().add(panel1,BorderLayout.SOUTH);
		frame.pack();
	 }

	private void display()
 	{
		Vector vec = null;
		String sFirstName ="";
		String sLastName ="";
		String sCustomerId ="";
		String sBalance ="";
		String sAmount  ="";
		String sAddress ="";

		try
		{
			ErnstBankServer server = (ErnstBankServer)
        	        Naming.lookup("rmi://localhost/ErnstBankServer");

			sFirstName=textFirstName.getText();
			sLastName=textLastName.getText();

			sCustomerId=textLoan_Registeration_Id.getText();

if(sLastName.length()>0 || sLastName.length()>0 || sCustomerId.length()>0)
			vec = server.display(sCustomerId,sFirstName,sLastName);

			if((vec!=null) && (vec.size()>0))
			{	
				sBalance = (String) vec.elementAt(0);
				sAmount  = (String) vec.elementAt(1);
				sAddress = (String) vec.elementAt(2);
			}

			textLoanAmount.setText(sAmount);
			textBalance.setText(sBalance);
			textAddress.setText(sAddress);

			textLoanAmount.setEditable(false);
			textBalance.setEditable(false);


		 }
		catch(Exception e)
		{
			System.out.println("In Display "+e);
		}

	}

	private void update()
	{

	  	String sAddress = "";
		String sCustomerId = "";
		MyDialog myDialog ;

		try
		{

			 ErnstBankServer server = (ErnstBankServer)
                    Naming.lookup("rmi://192.168.0.52/ErnstBankServer");
			 sCustomerId=textLoan_Registeration_Id.getText();
			 sAddress = textAddress.getText();
			 String str=server.update(sCustomerId,sAddress);
			 if(str.equals("success"))
			 {
				myDialog = new MyDialog(frame,"Updated Successfully");
			 }
			 else
			 {
				myDialog = new MyDialog(frame,"No Record Updated");
			 }

			 myDialog.setVisible(true);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
class ButtonListener implements ActionListener
{

		public void actionPerformed(ActionEvent evt)
		{
			String str = evt.getActionCommand();

			JButton source=(JButton)evt.getSource();

			if(str.equals("Display"))
			{
			 display();
			}

			if(str.equals("Update"))
			{
		 	 update();
			}
		}
	}
}
class MyDialog extends Dialog implements ActionListener
{
       	MyDialog(Frame parent,String title)
		{
		  super(parent,title,false);
		  setLayout(new FlowLayout());
		  setSize(200,80);
		  add(new JLabel(title));
		  JButton btn_OK = new JButton("OK");
		  add(btn_OK);
		  btn_OK.addActionListener(this);
		}

		public void actionPerformed(ActionEvent ae)
       	{
		 dispose();
        	}
}
