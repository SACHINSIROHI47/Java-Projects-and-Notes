import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;

public class Login implements ActionListener
{
	Connection con;
	Statement stmt;
	ResultSet rs;

private JFrame f, frame;
private JPanel p1, p2;
private JButton b1, b2;
private JLabel l1, l2, l3, l5;
private JLabel image1, image2;
private JTextField tf;
private JPasswordField pf;
private JEditorPane jep;
private JComboBox cb;
String[] user = {"Manager", "Employee"};

public Login()
{
f = new JFrame ("LOGIN");
frame = new JFrame();

p1 = new JPanel();
p2 = new JPanel();

b1 = new JButton("Login");
b2 = new JButton("Close");
l1 = new JLabel("Login");
l2 = new JLabel("Username:");
l3 = new JLabel("Password:");
tf = new JTextField();
pf = new JPasswordField();
image2 = new JLabel(new ImageIcon("E:\\Software\\Sachin Software\\java project\\java\\pnb_logo1.gif"));

l5 = new JLabel("User:");
cb = new JComboBox(user);


}

public void launchFrame()
{

f.add(p1);

p1.setSize(1080, 750);

p1.setBackground(Color.orange);
p1.setLayout(null);


p1.add(image2);

p1.add(l5);
p1.add(cb);
p1.add(l1);
p1.add(l2);
p1.add(tf);

p1.add(l3);
p1.add(pf);

p1.add(b1);
p1.add(b2);




p1.add(p2);

p2.setLayout(null);

p2.setBorder(BorderFactory.createTitledBorder("                   "));

p2.setBackground(Color.orange);

f.setLayout(null);
p2.setBounds(200, 150, 600, 440);

image2.setBounds(0, 0, 1080, 100);

l1.setBounds(210, 135, 120, 40);
l1.setFont(new Font("Times New Roman", Font.BOLD, 20));

l5.setBounds(360, 240, 120, 40);
l5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
cb.setBounds(470, 250, 150, 25);
cb.setFont(new Font("Times New Roman", Font.PLAIN, 17));

l2.setBounds(360, 290, 120, 40);
l2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
tf.setBounds(470, 300, 150, 25);
tf.setFont(new Font("Times New Roman", Font.PLAIN, 17));

l3.setBounds(360, 340, 120, 40);
l3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
pf.setBounds(470, 350, 150, 25);
pf.setFont(new Font("Times New Roman", Font.PLAIN, 17));

b1.setBounds(380, 420, 100, 30);
b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
b1.addActionListener(this);

b2.setBounds(510, 420, 100, 30);
b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
b2.addActionListener(this);


f.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
f.setSize(1080, 750);
f.setVisible(true);

}

public void actionPerformed(ActionEvent e)
{


if (e.getSource() == b1)
{
	int j = 0;
	String s1, s2, s3, uname, upass, utype;
	try
	{
		s3 = cb.getSelectedItem().toString();
		s1 = tf.getText().trim();
		s2 = pf.getText().trim();

		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//con = DriverManager.getConnection("jdbc:odbc:bank");
		//stmt = con.createStatement();
		//rs = stmt.executeQuery("select UserType, Username, Password from SignUp");
		//while(s3.next())
		//{	//utype = rs.getString("UserType");
			//uname = rs.getString("Username");
			//upass = rs.getString("Password");
			
                                     if((s1.equals("user")) && (s2.equals("123")))
			{
			j = 1;
				
			}
		//}

		if (j == 1 && cb.getSelectedItem().equals("Manager"))
		{
			JOptionPane.showMessageDialog(frame, "Login Successfully");
			FrontPage fp = new FrontPage();
			 fp.launchFrame();
			 f.setVisible(false);
		}

		else if (j == 1 && cb.getSelectedItem().equals("Employee"))
		{
			JOptionPane.showMessageDialog(frame, "Login Successfully");
			EmpFrontPage efp = new EmpFrontPage();
			efp.launchFrame();
			f.setVisible(false);
		}
		else
		{
			JOptionPane.showMessageDialog(frame, "Incorrect Username or Password.", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	catch (Exception ex)
	{
		//JOptionPane.showMessageDialog("Error" + ex);
	}
}
//}

if(e.getSource()==b2)
{
System.exit(0);
}
}



public static void main(String[] args)
{
Login log = new Login();
log.launchFrame();
}
}
