import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MainFrm implements ActionListener
{
 JFrame Jf;
 JMenuBar mb;
 JMenu m_CreateAc, m_Trans, m_Details;
 
 JPanel p1;
 JLabel image;
 JButton btn_logout;

public MainFrm()
{
 Jf = new JFrame ("Main Form");
Jf.setLayout(null);
Jf.setSize(615,550);
Jf.setBackground(Color.white);



p1 = new JPanel();
p1.setLayout(null);
p1.setSize(400,400);
p1.setBackground(Color.blue);

mb = new JMenuBar();
m_CreateAc = new JMenu("Create Account");
m_Trans = new JMenu ("Transactions");
m_Details = new JMenu ("Account Details");

image = new JLabel(new ImageIcon("D:\\Java\\Syndicate Bank\\Bank-services.jpg"));
image.setBounds(0,0,600,450);


btn_logout = new JButton("Log Out");
btn_logout.setBounds(200,200,130,30);
btn_logout.setFont(new Font("Times New Roman", Font.BOLD, 20));
}

public void lounchFrame()
{
  mb.add(m_CreateAc);
  mb.add(m_Trans);
  mb.add(m_Details);

p1.add(image);
p1.add(btn_logout);

Jf.add(p1);
Jf.setJMenuBar(mb);

Jf.setVisible(true);

}

public void actionPerformed(ActionEvent e)
{
  if(e.getSource() == m_CreateAc)
  {
 /*   SyndicateBank create = new SyndicateBank();
    create.launchFrame();
    Jf.setVisible(false); */
  }

if(e.getSource() == m_Trans)
  {
  /*  Transactions Trans = new Transactions();
    Trans.launchFrame();
    Jf.setVisible(false); */
  }

if(e.getSource() == m_Details)
  {
  /*  AccountDetalis AcDetails = new AccountDetalis();
    AcDetails.launchFrame();
    Jf.setVisible(false); */
  }

if(e.getSource() == btn_logout)
  {
  /*  LoginAcHolder logAc = new LoginAcHolder();
    logAc.launchFrame();
    Jf.setVisible(false); */
  }
}

public static void main(String[] arge)
{
 MainFrm Mf = new MainFrm();
 Mf.lounchFrame();
}
}
