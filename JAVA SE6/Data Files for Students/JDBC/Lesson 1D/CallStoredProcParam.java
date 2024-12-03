import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CallStoredProcParam extends JFrame implements ActionListener
{
   GridBagLayout gbl;
   GridBagConstraints gbc;
   JLabel heading, id, name, address, phone;
   JTextField idField, nameField, addressField, phoneField;
   JButton select; 
   public CallStoredProcParam()
{
	   gbl = new GridBagLayout();
	   gbc = new GridBagConstraints();
	   getContentPane().setLayout(gbl);
	   setSize(400, 400);
	   gbc.gridx = 1;
	   gbc.gridy = 0;
	   heading = new JLabel("Customer Details");
	   getContentPane().add(heading, gbc);
	   gbc.gridx = 0;
	   gbc.gridy = 1;
	   id = new JLabel("ID");
	   getContentPane().add(id, gbc);
	   gbc.gridx = 1;
	   gbc.gridy = 1;
	   idField = new JTextField(10);
	   getContentPane().add(idField, gbc);
	   gbc.gridx = 2;
	   gbc.gridy = 1;
	   select = new JButton("Select");
	   select.addActionListener(this);
	   getContentPane().add(select, gbc);
	   gbc.gridx = 0;
	   gbc.gridy = 2;
	   name = new JLabel("Name");
	   getContentPane().add(name, gbc);
	   gbc.gridx = 1;
	   gbc.gridy = 2;
	   nameField = new JTextField(10);
	   getContentPane().add(nameField, gbc);
	   gbc.gridx = 0;
	   gbc.gridy = 3;
	   address = new JLabel("Address");
	   getContentPane().add(address, gbc);
	   gbc.gridx = 1;
	   gbc.gridy = 3;
	   addressField = new JTextField(10);
	   getContentPane().add(addressField, gbc);
	   gbc.gridx = 0;
	   gbc.gridy = 4;
	   phone = new JLabel("Phone");
	   getContentPane().add(phone, gbc);
	   gbc.gridx = 1;
	   gbc.gridy = 4;
	   phoneField = new JTextField(10);
	   getContentPane().add(phoneField, gbc);
/*Enter user code here*/
}
}