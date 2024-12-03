import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class deleterec implements ActionListener
{
JFrame f1;
JLabel l1;
JTextField t1;
JButton b1,bc;
String s1;

Connection con;
Statement stmt;
ResultSet rs;

public deleterec()
{
	makeconnection();
	f1 = new JFrame("Delete Record");
	f1.setLayout(null);
	f1.setBounds(640,425,400,200);

	l1 = new JLabel("Enter ID");
	l1.setFont(new Font("Segoe Print",Font.BOLD,20));
	
	t1 = new JTextField();
	t1.setFont(new Font("Segoe Print",Font.BOLD,20));
		

	b1 = new JButton("Delete");
	b1.setFont(new Font("Segoe Print",Font.BOLD,20));
	bc = new JButton("Cancel");
	bc.setFont(new Font("Segoe Print",Font.BOLD,20));
	b1.addActionListener(this);
	bc.addActionListener(this);

	l1.setBounds(50,25,100,30);
	t1.setBounds(200,25,150,30);
	b1.setBounds(50,100,100,50);
	bc.setBounds(220,100,100,50);

	f1.add(l1);
	f1.add(t1);
	f1.add(b1);
	f1.add(bc);

	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
	int z=0,m=0;
		try
		{
		String sid = t1.getText();
		rs = stmt.executeQuery("select * from record where emp_id="+sid+"");
		rs.next();
		if(rs.getString("emp_id").equals(t1.getText()))
		{
		m=1;
		z=JOptionPane.showConfirmDialog(f1,"Record found do you want to delete record","Information",JOptionPane.OK_CANCEL_OPTION);
		if(z==0)
		{
		f1.dispose();
		stmt.executeQuery("delete from record where emp_id="+sid+"");
		}
		}
		}
		catch(Exception e)
		{
		if(m==0)
		{
		JOptionPane.showMessageDialog(f1,"Record Not Found","Alert",JOptionPane.WARNING_MESSAGE);
		}
		}	
	}

	if(ae.getSource()==bc)
	{
	f1.dispose();
	}
}

public void makeconnection()
{
try
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con = DriverManager.getConnection("jdbc:odbc:project");
	stmt = con.createStatement();
}
catch(Exception e)
{
	JOptionPane.showMessageDialog(f1,"Connection Not Established","Alert",JOptionPane.WARNING_MESSAGE);
}
}

}