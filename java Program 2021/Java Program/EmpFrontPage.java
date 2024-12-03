import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class EmpFrontPage implements ActionListener
{
	private JFrame f, frame;
	private JMenuBar mb;
	private JMenu m_aboutus, m_personal, m_saving, m_current, m_trans, m3, m_Account, m_Cash, m_view;
	private JMenuItem mi_profile, mi_vision, mi_open_saving, mi_saving, mi_open_current, mi_current, mi_cdeposit, mi_cwithdraw, mi_Ssaving, mi_Ccurrent, mi_exit;
	private JPanel p1;
	private JLabel lb_welcome;
	private JLabel image1, image2;
	private JButton logout;

public EmpFrontPage()
{
	f = new JFrame("WELCOME TO PUNJAB NATIONAL BANK");
	frame = new JFrame();

	p1 = new JPanel();
	lb_welcome = new JLabel("<html><body><p align:center>Welcome <br> To <br> punjab national bank</p></body></html>");

	mb = new JMenuBar();
	m_aboutus = new JMenu("About Us");

	m_personal = new JMenu("Personal Banking");
	m_saving = new JMenu("Saving Account");
	m_current = new JMenu("Current Account");
	m_trans = new JMenu("Transactions");
	m_view = new JMenu("View");
	m3 = new JMenu("Help");
	m_Account = new JMenu("Account Details");
	m_Cash = new JMenu("Cash Details");


	mi_profile = new JMenuItem("Profile");
	mi_vision = new JMenuItem("Vision & Mission");
	mi_exit = new JMenuItem("Exit");

	mi_open_saving = new JMenuItem("Open New Saving Account");
	mi_open_current = new JMenuItem("Open New Current Account");
	mi_saving = new JMenuItem("Saving Account");
	mi_current = new JMenuItem("Current Account");
	mi_Ssaving = new JMenuItem("Saving Account");
	mi_Ccurrent = new JMenuItem("Current Account");

	mi_cdeposit = new JMenuItem("Cash Deposit");
	mi_cwithdraw = new JMenuItem("Cash Withdrawal");

	logout = new JButton("Log Out");
	
                   image1 = new JLabel(new ImageIcon("E:\\Software\\Sachin Software\\java project\\java\\pnb4.jpg"));
                   image2 = new JLabel(new ImageIcon("E:\\Software\\Sachin Software\\java project\\java\\pnb_logo1.gif"));

}

public void launchFrame()
{

	m_aboutus.add(mi_profile);
	mi_profile.addActionListener(this);

	m_aboutus.add(mi_vision);
	mi_vision.addActionListener(this);

	m_aboutus.addSeparator();
	m_aboutus.add(mi_exit);
	mi_exit.addActionListener(this);

	m_personal.add(m_saving);
	m_personal.add(m_current);

	m_saving.add(mi_open_saving);
	mi_open_saving.addActionListener(this);

	m_Account.add(mi_saving);
	mi_saving.addActionListener(this);
	m_Account.add(mi_current);
	mi_current.addActionListener(this);
	m_Cash.add(mi_Ssaving);
	mi_Ssaving.addActionListener(this);
	m_Cash.add(mi_Ccurrent);
	mi_Ccurrent.addActionListener(this);

	m_view.add(m_Account);
	m_view.add(m_Cash);

	m_current.add(mi_open_current);
	mi_open_current.addActionListener(this);

	m_trans.add(mi_cdeposit);
	mi_cdeposit.addActionListener(this);
	m_trans.add(mi_cwithdraw);
	mi_cwithdraw.addActionListener(this);


	mb.add(m_aboutus);
	mb.add(m_personal);
	mb.add(m_trans);
	mb.add(m_view);
	mb.add(m3);

	f.add(p1);

	p1.add(image1);
	p1.add(lb_welcome);
	p1.add(logout);

	p1.setSize(1080, 750);

	p1.setBackground(Color.orange);
	p1.setLayout(null);


	p1.add(image2);

	p1.setBackground(Color.orange);

	image1.setBounds(520, 90, 500, 550);

	image2.setBounds(0, 0, 1080, 100);

	Color clr = new Color(255, 50, 50);

	lb_welcome.setBounds(50, 150, 600, 300);
	lb_welcome.setFont(new Font("Bauhaus 93", Font.PLAIN, 50));
	lb_welcome.setForeground(clr);

	logout.setBounds(150, 500, 250, 35);
	logout.setFont(new Font("Times New Roman", Font.BOLD, 20));
	logout.addActionListener(this);

	f.setJMenuBar(mb);
	f.setSize(1080, 750);
	f.setVisible(true);

}

public void actionPerformed(ActionEvent e)
{

	if (e.getSource() == mi_exit)
	{
		System.exit(0);
	}

	if (e.getSource() == mi_cdeposit)
	{
		//CashDeposit cash = new CashDeposit();
		//cash.launchFrame();
		//f.setVisible(false);
	}

	if (e.getSource() == mi_cwithdraw)
	{
		//CashWithdrawal with = new CashWithdrawal();
		//with.launchFrame();
		//f.setVisible(false);
	}

	if (e.getSource() == mi_profile)
	{
		//Profile pfile = new Profile();
		//pfile.launchFrame();
		//f.setVisible(false);
	}

	if (e.getSource() == mi_vision)
	{
		//Mission mis = new Mission();
		//mis.launchFrame();
		//f.setVisible(false);
	}

	if (e.getSource() == mi_open_saving)
	{
		SavingAc save = new SavingAc();
		save.launchFrame();
		f.setVisible(false);
	}

	if (e.getSource() == mi_open_current)
	{
		CurrentAc curr = new CurrentAc();
		curr.launchFrame();
		f.setVisible(false);
	}

	if (e.getSource() == logout)
	{
		Login lg = new Login();
		lg.launchFrame();
		f.setVisible(false);
	}

	if (e.getSource() == mi_saving)
	{
		//EPrintSaving eps = new EPrintSaving();
		//eps.launchFrame();
		//f.setVisible(false);
	}

	if (e.getSource() == mi_current)
	{
		//EPrintCurrent epc = new EPrintCurrent();
		//epc.launchFrame();
		//f.setVisible(false);
	}

	if (e.getSource() == mi_Ssaving)
	{
		SavingCashDetails scd = new SavingCashDetails();
		scd.launchFrame();
		f.setVisible(false);
	}

	if (e.getSource() == mi_Ccurrent)
	{
		CurrentCashDetails ccd = new CurrentCashDetails();
		ccd.launchFrame();
		f.setVisible(false);
	}

	
}

public static void main(String[] args)
{
	EmpFrontPage efp = new EmpFrontPage();
	efp.launchFrame();
}
}
