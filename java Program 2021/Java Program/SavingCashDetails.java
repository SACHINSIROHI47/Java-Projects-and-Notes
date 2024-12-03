import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SavingCashDetails implements ActionListener, WindowListener
{
	Connection con;
	Statement stmt;
	PreparedStatement ps, ps1;
	ResultSet rs;
private JFrame f;
private JPanel p1;
private JLabel lb_heading, lb_acNo, lb_name, lb_deposit, lb_withdraw, lb_balance;
private JLabel lb_acNo1, lb_name1, lb_deposit1, lb_withdraw1, lb_balance1, image;
private JComboBox cb;

private JButton btn_print, btn_cancel;

public SavingCashDetails()
{
f = new JFrame("Cash Details");
p1 = new JPanel();

lb_heading = new JLabel("Cash Details of Saving Account");
lb_acNo = new JLabel("Account Number :");
lb_name = new JLabel("Name of Account Holder :");
lb_deposit = new JLabel("Last Deposit Amount :");
lb_withdraw = new JLabel("Last Withdraw Amount :");
lb_balance = new JLabel("Balance Amount	:");

lb_acNo1 = new JLabel();
lb_name1 = new JLabel();
lb_deposit1 = new JLabel();
lb_withdraw1 = new JLabel();
lb_balance1 = new JLabel();
cb = new JComboBox();

btn_print = new JButton("Print Details");
btn_cancel = new JButton("Cancel");

image = new JLabel(new ImageIcon("D:\\java\\java\\PNB_1_0.jpg"));

}

public void launchFrame()
{
f.add(p1);

p1.add(image);
p1.setSize(700, 500);

p1.setBackground(Color.orange);
p1.setLayout(null);

p1.add(lb_heading);

p1.add(lb_acNo);
p1.add(cb);

p1.add(lb_name);
p1.add(lb_name1);

p1.add(lb_deposit);
p1.add(lb_deposit1);

p1.add(lb_withdraw);
p1.add(lb_withdraw1);

p1.add(lb_balance);
p1.add(lb_balance1);

p1.add(btn_print);
p1.add(btn_cancel);

image.setBounds(0, 0, 50, 50);

lb_heading.setBounds(200, 30, 400, 30);
lb_heading.setFont(new Font("Times New Roman", Font.BOLD, 22));

lb_acNo.setBounds(100, 100, 200, 30);
lb_acNo.setFont(new Font("Times New Roman", Font.BOLD, 16));
cb.setBounds(330, 105, 200, 20);
cb.setFont(new Font("Times New Roman", Font.BOLD, 16));

lb_name.setBounds(100, 150, 200, 30);
lb_name.setFont(new Font("Times New Roman", Font.BOLD, 16));
lb_name1.setBounds(330, 150, 400, 30);
lb_name1.setFont(new Font("Times New Roman", Font.PLAIN, 16));

lb_deposit.setBounds(100, 200, 200, 30);
lb_deposit.setFont(new Font("Times New Roman", Font.BOLD, 16));
lb_deposit1.setBounds(330, 200, 400, 30);
lb_deposit1.setFont(new Font("Times New Roman", Font.PLAIN, 16));

lb_withdraw.setBounds(100, 250, 200, 30);
lb_withdraw.setFont(new Font("Times New Roman", Font.BOLD, 16));
lb_withdraw1.setBounds(330, 250, 200, 30);
lb_withdraw1.setFont(new Font("Times New Roman", Font.PLAIN, 16));

lb_balance.setBounds(100, 300, 200, 30);
lb_balance.setFont(new Font("Times New Roman", Font.BOLD, 16));
lb_balance1.setBounds(330, 300, 400, 30);
lb_balance1.setFont(new Font("Times New Roman", Font.PLAIN, 16));

btn_print.setBounds(150, 400, 150, 30);
btn_print.setFont(new Font("Times New Roman", Font.BOLD, 16));
btn_print.addActionListener(this);

btn_cancel.setBounds(400, 400, 150, 30);
btn_cancel.setFont(new Font("Times New Roman", Font.BOLD, 16));
btn_cancel.addActionListener(this);

cb.addActionListener(this);
f.setSize(700, 500);
f.addWindowListener(this);
f.setVisible(true);
}

	public void windowOpened(WindowEvent e)
	{
		cb.removeAllItems();
		lb_acNo1.setText("");
		lb_name1.setText("");
		lb_deposit1.setText("");
		lb_withdraw1.setText("");
		lb_balance1.setText("");

		try
		{
			/*
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:bank");
			stmt = con.createStatement();
			rs = stmt.executeQuery("Select Account_No from saving");

			while (rs.next())
			{
				String ac = rs.getString("Account_No");
				cb.addItem(ac);
			}
			con.close();
			*/
		}
		catch (Exception ec)
		{
			System.out.println(ec);
		}
	}
	public void windowClosed(WindowEvent e)	{}
	public void windowClosing(WindowEvent e) { }
	public void windowActivated(WindowEvent e) { }
	public void windowDeactivated(WindowEvent e) { }
	public void windowIconified(WindowEvent e) { }
	public void windowDeiconified(WindowEvent e) { }

	public void actionPerformed(ActionEvent ae)
	{
		String s1, s2, s3, s4, s5,ss;
		if (ae.getSource() == cb)
		{
			try
			{
				/*
				ss = cb.getSelectedItem().toString();
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con = DriverManager.getConnection("jdbc:odbc:bank");
				stmt = con.createStatement();
				ResultSet rs1 = stmt.executeQuery("Select AccountNo, AccountName, LastCashDeposit, LastCashWithdraw, ClosingBalance from CashDetails where AccountNo='"+ss+"'");

				while (rs1.next())
				{
					s5 = rs1.getString("AccountNo");
					s1 = rs1.getString("AccountName");
					s2 = rs1.getString("LastCashDeposit");
					
					s3 = rs1.getString("LastCashWithdraw");
					s4 = rs1.getString("ClosingBalance");
					
						
						lb_name1.setText(s1);
						lb_deposit1.setText(s2);
						lb_withdraw1.setText(s3);
						lb_balance1.setText(s4);
					
				}
				con.close();
				*/
			}
			catch (Exception c)
			{
				System.out.println(c);
			}
		}

		if (ae.getSource() == btn_print)
		{
			JOptionPane.showMessageDialog(f, "Page has been printed");
		}
		if (ae.getSource() == btn_cancel)
		{
			FrontPage fp = new FrontPage();
			fp.launchFrame();
			f.setVisible(false);
		}
	}

public static void main(String[] args)
{
SavingCashDetails scd = new SavingCashDetails();
scd.launchFrame();
}
}