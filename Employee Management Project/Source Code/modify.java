import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class modify implements ActionListener
{
JFrame f1;
JLabel lh,l1,l2,l3,l4,l5,l6,l7;
JTextField t1,t2,t3,t4,t5;
JRadioButton r1,r2;
JComboBox cb1,cb2,cb3;
JButton b1,bc;
ButtonGroup bg;
String s1,s2,s3,s4,s5,s6,s7;

Connection con;
Statement stmt;
ResultSet rs;

public modify()
{
	makeconnection();
	f1 = new JFrame("Update Records");
	f1.setLayout(null);
	f1.setBounds(440,225,800,600);

	lh=new JLabel("Modify Record");
	lh.setBounds(250,25,500,100);
	lh.setFont(new Font("Lucida Calligraphy",Font.BOLD,35));
	f1.add(lh);


	l1 = new JLabel("Employee ID");
	l1.setFont(new Font("Lucida Calligraphy",Font.BOLD,20));
	l2 = new JLabel("Name");
	l2.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	l3 = new JLabel("Gender");
	l3.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	l4 = new JLabel("DOB");
	l4.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	l5 = new JLabel("Address");
	l5.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	l6 = new JLabel("Salary");
	l6.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	l7 = new JLabel("Mobile");
	l7.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	
	t1 = new JTextField();
	t1.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	t2 = new JTextField();
	t2.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	r1 = new JRadioButton("Male");
	r1.setFont(new Font("Lucida Calligraphy",Font.BOLD,15));
	r2 = new JRadioButton("Female");
	r2.setFont(new Font("Lucida Calligraphy",Font.BOLD,15));
	bg = new ButtonGroup();
	bg.add(r1);
	bg.add(r2);		

	cb1 = new JComboBox();
	cb1.setFont(new Font("Lucida Calligraphy",Font.BOLD,20));
	cb2 = new JComboBox();
	cb2.setFont(new Font("Lucida Calligraphy",Font.BOLD,20));
	cb3 = new JComboBox();
	cb3.setFont(new Font("Lucida Calligraphy",Font.BOLD,20));

	t3 = new JTextField();
	t3.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	t4 = new JTextField();
	t4.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	t5 = new JTextField();
	t5.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));

	b1 = new JButton("Search");
	b1.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	bc = new JButton("Update");
	bc.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
	b1.addActionListener(this);
	bc.addActionListener(this);

	l1.setBounds(200,100,150,30);
	l2.setBounds(200,150,150,30);
	l3.setBounds(200,200,150,30);
	l4.setBounds(200,250,150,30);
	l5.setBounds(200,300,150,30);
	l6.setBounds(200,350,150,30);
	l7.setBounds(200,400,150,30);

	t1.setBounds(410,100,150,30);
	t2.setBounds(410,150,150,30);
	r1.setBounds(410,200,75,30);
	r2.setBounds(500,200,100,30);
	cb1.setBounds(410,250,70,30);
	cb2.setBounds(490,250,70,30);
	cb3.setBounds(570,250,70,30);
	t3.setBounds(410,300,230,30);
	t4.setBounds(410,350,100,30);
	t5.setBounds(410,400,100,30);
	
	b1.setBounds(200,470,150,50);
	bc.setBounds(410,470,150,50);

	f1.add(l1);
	f1.add(l2);
	f1.add(l3);
	f1.add(l4);
	f1.add(l5);
	f1.add(l6);
	f1.add(l7);
	f1.add(t1);
	f1.add(t2);
	f1.add(r1);
	f1.add(r2);
	f1.add(cb1);
	f1.add(cb2);
	f1.add(cb3);
	f1.add(t3);
	f1.add(t4);
	f1.add(t5);
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
			t1.setText(rs.getString("emp_id"));
			t2.setText(rs.getString("emp_name"));
			String ss = rs.getString("emp_gen");
			if(ss.equals("Male")||ss.equals("male"))
			{
			r1.setSelected(true);
			}
			else
			{
			r2.setSelected(true);
			}
			String a =rs.getString("emp_dob");
			cb1.addItem(a.substring(0,2));
			cb2.addItem(a.substring(3,6));
			cb3.addItem(a.substring(7,11));
			t3.setText(rs.getString("emp_add"));
			t4.setText(rs.getString("emp_sal"));
			t5.setText(rs.getString("emp_mob"));
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
		try
		{
			s1 = t1.getText();
			s2 = t2.getText();
			if(r1.isSelected()==true)
			{
			s3 = "Male";
			}
			else
			{
			s3 = "Female";
			}
			s4 = cb1.getSelectedItem()+"-"+cb2.getSelectedItem()+"-"+cb3.getSelectedItem();			
			s5 = t3.getText();
			s6 = t4.getText();
			s7 = t5.getText();
			stmt.executeUpdate("update record set emp_id='"+s1+"',emp_name='"+s2+"',emp_gen='"+s3+"',emp_dob='"+s4+"',emp_add='"+s5+"',emp_sal='"+s6+"',emp_mob='"+s7+"' where emp_id = "+s1+")");
		}
		catch(Exception e)
		{
		}
	}
}

public void makeconnection()
{
try
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con = DriverManager.getConnection("jdbc:odbc:project");
	stmt = con.createStatement();
	rs = stmt.executeQuery("select * from record");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(f1,"Connection Not Established","Alert",JOptionPane.WARNING_MESSAGE);
}
}

}