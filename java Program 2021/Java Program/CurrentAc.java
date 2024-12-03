import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CurrentAc implements ActionListener, KeyListener
{
	Connection con;
	PreparedStatement ps, ps1;
	Statement stmt;
	ResultSet rs;
private JFrame f, frame;
private JPanel p1;
private JLabel lb_heading, lb_acNo, lb_name, lb_father, lb_dob, lb_add1, lb_mob, lb_amt, lb_nomName, lb_nomAdd, lb_nomMob, lb_docs, lb_date;
private JTextField tf_acNo, tf_name, tf_father, tf_dob, tf_mob, tf_amt, tf_nomName, tf_nomMob;
private JTextArea ta_add1, ta_nomAdd;
private JLabel image2;
private JButton btn_submit, btn_reset, btn_back;
private JCheckBox ch_dl, ch_rc, ch_id, ch_ps, ch_ebill, ch_pan;
static JTextField tf_date;

public CurrentAc()
{
f = new JFrame ("Current Account Form");
frame = new JFrame();

p1 = new JPanel();
lb_heading = new JLabel("New Current Account Form");
lb_acNo = new JLabel("Account Number:");
lb_name = new JLabel("Name:");
lb_father = new JLabel("S/o.D/o.W/o:");
lb_dob = new JLabel("Date of Birth:");
lb_add1 = new JLabel("Address:");
lb_mob = new JLabel("Contact No.:");
lb_amt = new JLabel("Opening Balance:");
lb_nomName = new JLabel("Name of Nominee:");
lb_nomAdd = new JLabel("Address of Nominee:");
lb_nomMob = new JLabel("Contact No.:");
lb_docs = new JLabel("Document Enclosed (Choose one only):");
lb_date = new JLabel("Date:");

tf_acNo = new JTextField();
tf_name = new JTextField();
tf_father = new JTextField();
tf_dob = new JTextField();
tf_mob = new JTextField();
tf_amt = new JTextField("5000");
tf_nomName = new JTextField();
tf_nomMob = new JTextField();
tf_date = new JTextField();

ta_add1 = new JTextArea();
ta_nomAdd = new JTextArea();

ch_dl = new JCheckBox("Driving License");
ch_rc = new JCheckBox("Ration Card");
ch_ps = new JCheckBox("Passport");
ch_ebill = new JCheckBox("Electricity Bill");
ch_pan = new JCheckBox("PAN Card");
ch_id = new JCheckBox("Voter Card");

btn_submit = new JButton("Submit");
btn_reset = new JButton("Reset");
btn_back = new JButton("Back");


  image2 = new JLabel(new ImageIcon("E:\\Software\\Sachin Software\\java project\\java\\pnb_logo1.gif"));
}

	public static String now(String dateFormat)
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(cal.getTime());
	}

public void launchFrame()
{

f.add(p1);

p1.setSize(1080, 750);

p1.setBackground(Color.orange);
p1.setLayout(null);


p1.add(image2);

p1.add(lb_heading);

p1.add(lb_acNo);
p1.add(tf_acNo);

p1.add(lb_date);
p1.add(tf_date);

p1.add(lb_name);
p1.add(tf_name);

p1.add(lb_father);
p1.add(tf_father);

p1.add(lb_dob);
p1.add(tf_dob);

p1.add(lb_nomMob);
p1.add(tf_nomMob);

p1.add(lb_add1);
p1.add(ta_add1);

p1.add(lb_nomName);
p1.add(tf_nomName);

p1.add(lb_nomAdd);
p1.add(ta_nomAdd);

p1.add(lb_docs);

p1.add(ch_pan);
p1.add(ch_dl);
p1.add(ch_rc);
p1.add(ch_id);
p1.add(ch_ebill);
p1.add(ch_ps);

p1.add(lb_mob);
p1.add(tf_mob);

p1.add(lb_amt);
p1.add(tf_amt);

p1.add(btn_submit);
p1.add(btn_reset);
p1.add(btn_back);

image2.setBounds(0, 0, 1080, 100);

lb_heading.setBounds(400, 130, 400, 30);
lb_heading.setFont(new Font("Times News Roman", Font.BOLD, 20));

lb_acNo.setBounds(100, 200, 200, 30);
lb_acNo.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_acNo.setBounds(300, 200, 200, 30);
tf_acNo.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_acNo.setEnabled(false);

lb_name.setBounds(100, 240, 200, 30);
lb_name.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_name.setBounds(300, 240, 200, 30);
tf_name.setFont(new Font("Times News Roman", Font.PLAIN, 18));

lb_date.setBounds(550, 200, 200, 30);
lb_date.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_date.setBounds(750, 200, 200, 30);
tf_date.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_date.setEditable(false);

lb_nomName.setBounds(550, 240, 200, 30);
lb_nomName.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_nomName.setBounds(750, 240, 200, 30);
tf_nomName.setFont(new Font("Times News Roman", Font.PLAIN, 18));

lb_nomAdd.setBounds(550, 280, 200, 30);
lb_nomAdd.setFont(new Font("Times News Roman", Font.PLAIN, 18));
ta_nomAdd.setBounds(750, 280, 200, 100);
ta_nomAdd.setFont(new Font("Times News Roman", Font.PLAIN, 18));

lb_father.setBounds(100, 280, 200, 30);
lb_father.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_father.setBounds(300, 280, 200, 30);
tf_father.setFont(new Font("Times News Roman", Font.PLAIN, 18));

lb_nomMob.setBounds(550, 390, 200, 30);
lb_nomMob.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_nomMob.setBounds(750, 390, 200, 30);
tf_nomMob.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_nomMob.addKeyListener(this);

lb_dob.setBounds(100, 320, 200, 30);
lb_dob.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_dob.setBounds(300, 320, 200, 30);
tf_dob.setFont(new Font("Times News Roman", Font.PLAIN, 18));

lb_add1.setBounds(100, 360, 200, 30);
lb_add1.setFont(new Font("Times News Roman", Font.PLAIN, 18));
ta_add1.setBounds(300, 360, 200, 100);
ta_add1.setFont(new Font("Times News Roman", Font.PLAIN, 18));

lb_docs.setBounds(550, 430, 400, 30);
lb_docs.setFont(new Font("Times News Roman", Font.PLAIN, 18));

ch_pan.setBounds(550, 470, 130, 30);
ch_pan.setFont(new Font("Times News Roman", Font.PLAIN, 18));
ch_pan.setBackground(Color.orange);

ch_dl.setBounds(690, 470, 150, 30);
ch_dl.setFont(new Font("Times News Roman", Font.PLAIN, 18));
ch_dl.setBackground(Color.orange);

ch_ebill.setBounds(850, 470, 150, 30);
ch_ebill.setFont(new Font("Times News Roman", Font.PLAIN, 18));
ch_ebill.setBackground(Color.orange);

ch_id.setBounds(550, 510, 130, 30);
ch_id.setFont(new Font("Times News Roman", Font.PLAIN, 18));
ch_id.setBackground(Color.orange);

ch_rc.setBounds(690, 510, 150, 30);
ch_rc.setFont(new Font("Times News Roman", Font.PLAIN, 18));
ch_rc.setBackground(Color.orange);

ch_ps.setBounds(850, 510, 150, 30);
ch_ps.setFont(new Font("Times News Roman", Font.PLAIN, 18));
ch_ps.setBackground(Color.orange);

lb_mob.setBounds(100, 470, 200, 30);
lb_mob.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_mob.setBounds(300, 470, 200, 30);
tf_mob.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_mob.addKeyListener(this);

lb_amt.setBounds(100, 510, 200, 30);
lb_amt.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_amt.setBounds(300, 510, 200, 30);
tf_amt.setFont(new Font("Times News Roman", Font.PLAIN, 18));
tf_amt.setEditable(false);

btn_submit.setBounds(270, 600, 150, 35);
btn_submit.setFont(new Font("Times News Roman", Font.PLAIN, 18));
btn_submit.addActionListener(this);

btn_reset.setBounds(470, 600, 150, 35);
btn_reset.setFont(new Font("Times News Roman", Font.PLAIN, 18));
btn_reset.addActionListener(this);

btn_back.setBounds(670, 600, 150, 35);
btn_back.setFont(new Font("Times News Roman", Font.PLAIN, 18));
btn_back.addActionListener(this);

f.setSize(1080, 750);
f.setVisible(true);
}

public void keyTyped(KeyEvent ke)
{
char c = ke.getKeyChar();
if(!((c>='0') && (c<='9') || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)))
{
JOptionPane.showMessageDialog(f, "Please Enter Integer Value", "Error", JOptionPane.ERROR_MESSAGE);
//Toolkit.getDefaultToolkit().beep();
ke.consume();
}
}

public void keyPressed(KeyEvent ke)
{
}

public void keyReleased(KeyEvent ke)
{
}

public void actionPerformed(ActionEvent ae)
{
	String account=null, date, name, f_name, add, dob, contact, nom_name, nom_add, nom_contact, open_bal, doc="";
	String Ldeposit = "0";
	String Lwithdraw = "0";
	String Tdeposit = "0";
	String Twithdraw = "0";
	String clos_bal = "5000";
	String ac_type = "Current Account";
	String Depby = "";
	String Withby = "";
	int a=0;
	if(ae.getSource()==btn_submit)
	{
		try
		{  
                                                 /*
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:bank");
			stmt = con.createStatement();
			rs = stmt.executeQuery("Select Top 1 Account_No from CurrentAc order by Account_No desc");
			while (rs.next())
			{
				account = rs.getString("Account_No");
				account = account.trim();
			}
			if (account== null)
			{
				account = "5000";
			}
			else
			{
				a = Integer.parseInt(account);
				a++;
				account = String.valueOf(a);
				
			}
			con.close();
				name = tf_name.getText().trim();
				f_name = tf_father.getText();
				dob = tf_dob.getText();
				add = ta_add1.getText();
				contact = tf_mob.getText();
				nom_name = tf_nomName.getText();
				nom_add = ta_nomAdd.getText();
				nom_contact = tf_nomMob.getText();
				open_bal = tf_amt.getText().trim();
				date = tf_date.getText().trim();

				if (ch_dl.isSelected() == true)
				{
					doc += ch_dl.getText().trim();
				}
				if (ch_rc.isSelected() == true)
				{
					doc += ch_rc.getText().trim();
				}
				if (ch_ps.isSelected() == true)
				{
					doc += ch_ps.getText().trim();
				}
				if (ch_ebill.isSelected() == true)
				{
					doc += ch_ebill.getText().trim();
				}
				if (ch_pan.isSelected() == true)
				{
					doc += ch_pan.getText().trim();
				}
				if (ch_id.isSelected() == true)
				{
					doc += ch_id.getText().trim();
				}

				if (date.length() == 0 || name.length() == 0 || f_name.length() == 0 || dob.length() == 0 || add.length() == 0 || contact.length() == 0 || nom_name.length() == 0 || nom_add.length() == 0 || nom_contact.length() == 0 || doc == null)
				{
					JOptionPane.showMessageDialog(f, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					con = DriverManager.getConnection("jdbc:odbc:bank");
					ps = con.prepareStatement("Insert into CurrentAc values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
					ps1 = con.prepareStatement("Insert into CashDetails values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

					ps.setString(1, account);
					ps.setString(2, open_bal);
					ps.setString(3, name);
					ps.setString(4, f_name);
					ps.setString(5, dob);
					ps.setString(6, add);
					ps.setString(7, contact);
					ps.setString(8, nom_name);
					ps.setString(9, nom_add);
					ps.setString(10, nom_contact);
					ps.setString(11, doc);
					ps.setString(12, date);

					ps1.setString(1, account);
					ps1.setString(2, name);
					ps1.setString(3, add);
					ps1.setString(4, open_bal);
					ps1.setString(5, Ldeposit);
					ps1.setString(6, Lwithdraw);
					ps1.setString(7, Tdeposit);
					ps1.setString(8, Twithdraw);
					ps1.setString(9, clos_bal);
					ps1.setString(10, ac_type);
					ps1.setString(11, Depby);
					ps1.setString(12, Withby);

					ps.executeUpdate();
					ps1.executeUpdate();
					JOptionPane.showMessageDialog(frame, "Successfully Submit.");
					con.close();

					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					con = DriverManager.getConnection("jdbc:odbc:bank");
					stmt = con.createStatement();
					ResultSet rs1 = stmt.executeQuery("Select Top 1 * from CurrentAc order by Account_No desc");

					while (rs1.next())
					{
						String acc = rs1.getString("Account_No");

						if (account.equals(account.trim()))
						{
							JOptionPane.showMessageDialog(frame, "New Account Number is: " + acc);
							tf_acNo.setText(acc);
						}
					}
					con.close();
				}
			*/
		}
		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(frame, "Error: "+ex, "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}

	if(ae.getSource()== btn_back)
	{
		FrontPage fp = new FrontPage();
		fp.launchFrame();
		f.setVisible(false);
	}

	if(ae.getSource()== btn_reset)
	{
		tf_acNo.setText("");
		tf_name.setText("");
		tf_father.setText("");
		tf_dob.setText("");
		tf_mob.setText("");
		tf_nomName.setText("");
		tf_nomMob.setText("");
		ta_add1.setText("");
		ta_nomAdd.setText("");
	}
}

public static void main(String[] args)
{
CurrentAc curr = new CurrentAc();
curr.launchFrame();
tf_date.setText(curr.now("dd.MM.yyyy"));
}
}
