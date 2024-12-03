import javax.swing.*;
import java.rmi.*;
import java.awt.event.*;
import java.awt.*;
public class EmpClient
{
	/* Declare the private variables of Jframe and JPanel */
	static JFrame empframe;
	static JPanel pan1;
	static JPanel pan2;
	/* Variables of labels */
	JLabel label_fname;
	JLabel label_lname;
	JLabel label_address;
	JLabel label_city;
	JLabel label_phone;
	JLabel label_salary;
	JLabel label_designation;
	JLabel label_dept_type;
	/* Variables for data entry controls */
	JTextField text_fname;
	JTextField text_lname;
	JTextField text_address;
	JTextField text_city;
	JTextField text_phone;
	JTextField text_salary;
	JTextField text_designation;
	JComboBox combo_dept_type;
	JButton submit;
	/* Declare the string variables */ 
	static String fname;
	static String lname;
	static String address;
	static String city;
	static String phone;
	static String salary;
	static String designation;
	static String depttype;
	/* Define the constructor of the EmpClient class */
	public EmpClient()
	{
		/* Define and set the panel */ 
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan1.setLayout(new GridLayout(8,2));
		pan2.setLayout(new GridLayout(1,1));
		/* Define the JFrame */	
		empframe=new JFrame("Employee Information System");
		/* Set the visibility of the frame */
		empframe.setVisible(true);
		/* Set the size of the frame */
		empframe.setSize(500, 350);
		empframe.getContentPane().setLayout(new BorderLayout());
		/* Add a window listener */
		empframe.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	
		/* Initialize labels */
		label_fname = new JLabel("First Name ");
		label_lname = new JLabel("Last Name");
		label_address = new JLabel("Address");
		label_city = new JLabel("City");
		label_phone = new JLabel("Phone");
		label_salary = new JLabel("Annual Salary ($)");
		label_designation = new JLabel("Designation");
		label_dept_type = new JLabel("Department");
		/* Initialize text boxes, button, and combo box */
		text_fname = new JTextField(30);
		text_lname = new JTextField(30);
		text_address = new JTextField(30);
		text_city = new JTextField(30);
		text_phone = new JTextField(30);
		text_salary = new JTextField(30);
		text_designation = new JTextField(30);
		submit = new JButton("Submit");
		String type[] = {"Human Resources", "Finance", "Production", "Sales", "Development"};
		combo_dept_type = new JComboBox(type);
		/* Add controls for first name of the employee */
		pan1.add(label_fname);
		pan1.add(text_fname);
		/* Add controls for first name of the employee */
		pan1.add(label_lname);
		pan1.add(text_lname);
		/* Add controls for address of the employee */
		pan1.add(label_address);
		pan1.add(text_address);
		/* Add controls for city of the employee */
		pan1.add(label_city);
		pan1.add(text_city);
		/* Add controls for phone number of the employee */
		pan1.add(label_phone);
		pan1.add(text_phone);
		/* Add controls for salary of the employee */
		pan1.add(label_salary);		
		pan1.add(text_salary);
		/* Add controls for designation of the employee */
		pan1.add(label_designation);
		pan1.add(text_designation);
		/* Add controls for department type of the employee */
		pan1.add(label_dept_type);
		pan1.add(combo_dept_type);
		/* Add button */
		pan2.add(submit);
		ButtonListener blisten = new ButtonListener();
		submit.addActionListener(blisten);
		empframe.getContentPane().add(pan1, BorderLayout.CENTER);
		empframe.getContentPane().add(pan2, BorderLayout.SOUTH);
		empframe.pack();
	}
	class ButtonListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent ae)
		{
			JButton source = (JButton)ae.getSource();
			EmpDialog empdialog;
			try
			{	
				/* Find the remote object at specified URL */
				EmpRemote server = (EmpRemote)Naming.lookup("rmi://192.168.0.52/EmpInfo");
				fname=text_fname.getText();
				lname=text_lname.getText();
				address=text_address.getText();
				city=text_city.getText();
				phone=text_phone.getText();
				salary=text_salary.getText();
				designation=text_designation.getText();
				depttype=(String)combo_dept_type.getSelectedItem();
				String str = server.insertInformation(fname, lname, address, city, phone, salary, designation, depttype);
				System.out.println(str);
				if(str.equals("SUCCESS!"))
				{
					empdialog = new EmpDialog(empframe, "Information inserted successfully.");
				}	
				else
				{
					empdialog = new  EmpDialog(empframe, "No information inserted.");
				}
			empdialog.setVisible(true);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	} /* End of the EmpClient class */
	public static void main(String args[])
	{
		new EmpClient();
	}
}

/* Define the EmpDialog class */
class EmpDialog extends Dialog implements ActionListener
{
	/* Define the constructor */
	EmpDialog(Frame parent, String title)
	{
		super(parent, title, false);
		setLayout(new FlowLayout());
		setSize(200, 85);
		/* Add a button on then dialog box */
		add(new JLabel (title));
		JButton button_OK  = new JButton("OK");
		add(button_OK);
		button_OK.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		dispose();
	}
}
