import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ScrollCustomerInfo extends JFrame implements ActionListener
{
  JLabel heading, id, name, address, phone;
  JTextField idField, nameField, addressField,   phoneField;
  JButton next, first, last, previous;
  GridBagLayout gbl;
  GridBagConstraints gbc;
  Connection con;
  Statement stat;
  ResultSet rs;
  public ScrollCustomerInfo()
  {
	gbl = new GridBagLayout();
  	gbc = new GridBagConstraints();
	getContentPane().setLayout(gbl);
	setSize(400, 400);	
	gbc.gridx = 0;
	gbc.gridy = 0;
	gbc.gridwidth = 4;
	heading = new JLabel("Displaying Customer Table Information");
	getContentPane().add(heading, gbc);
	gbc.gridx = 1;
	gbc.gridy = 1;
	gbc.gridwidth = 1;
	id = new JLabel("Id");
	getContentPane().add(id, gbc);
	gbc.gridx = 2;
	gbc.gridy = 1;
	gbc.gridwidth = 1;
	idField = new JTextField(10);
	getContentPane().add(idField, gbc);	
	gbc.gridx = 1;
	gbc.gridy = 2;
	gbc.gridwidth = 1;
	name = new JLabel("Name");
	getContentPane().add(name, gbc);
	gbc.gridx = 2;
	gbc.gridy = 2;
	gbc.gridwidth = 1;
	nameField = new JTextField(10);
	getContentPane().add(nameField, gbc);	
	gbc.gridx = 1;
	gbc.gridy = 3;
	gbc.gridwidth = 1;
	address = new JLabel("Address");
	getContentPane().add(address, gbc);
	gbc.gridx = 2;
	gbc.gridy = 3;
	gbc.gridwidth = 1;
	addressField = new JTextField(10);
	getContentPane().add(addressField, gbc);	
	gbc.gridx = 1;
	gbc.gridy = 4;
	gbc.gridwidth = 1;
	phone = new JLabel("Phone");
	getContentPane().add(phone, gbc);
	gbc.gridx = 2;
	gbc.gridy = 4;
	gbc.gridwidth = 1;
	phoneField = new JTextField(10);
	getContentPane().add(phoneField, gbc);	
	gbc.gridx = 0;
	gbc.gridy = 5;
	gbc.gridwidth = 1;	
	first = new JButton("First");
	first.addActionListener(this);
	getContentPane().add(first, gbc);
	gbc.gridx = 1;
	gbc.gridy = 5;
	gbc.gridwidth = 1;	
	last = new JButton("Last");
	last.addActionListener(this);
	getContentPane().add(last, gbc);
	gbc.gridx = 2;
	gbc.gridy = 5;
	gbc.gridwidth = 1;	
	previous = new JButton("Previous");
	previous.addActionListener(this);
	getContentPane().add(previous, gbc);
	gbc.gridx = 3;
	gbc.gridy = 5;
	gbc.gridwidth = 1;	
	next = new JButton("Next");
	next.addActionListener(this);
	getContentPane().add(next, gbc);
	addWindowListener( new WindowAdapter(){
	public void windowClosing(WindowEvent we){
			System.exit(0);
			}
		  });

/*Enter user code here*/
}
}