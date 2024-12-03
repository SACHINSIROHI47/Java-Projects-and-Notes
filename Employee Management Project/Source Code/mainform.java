import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class mainform implements ActionListener
{
public JFrame f1;
BackgroundMenuBar mb;
JMenu op;
JLabel l1,l2;
JMenuItem ar,dr,sr,mr,pr,cl,jar,jdr,jsr,jmr,jpr,jcr;
JMenuItem sp1,sp2,sp3,sp4,sp5;
JPopupMenu pm;
JToolBar toolbar;
JColorChooser cc;
Color col;
ImageIcon ig;
JButton nr,rr,fr,ur,prr,clr;

	public mainform()
	{
		f1 = new JFrame("Employee Management System");
		f1.setBounds(160,55,1360,940);
		f1.setLayout(null);
		
		ig = new ImageIcon("D:\\project\\images\\ems.jpg");
		l2 = new JLabel(ig);
		l2.setBounds(30,30,1300,820);
		f1.add(l2);	
		

		mb = new BackgroundMenuBar();
		pm = new JPopupMenu();

		op = new JMenu("Operations");
		op.setFont(new Font("Segoe Script",Font.BOLD,18));
		op.setMnemonic ((int)'O');
		
		ar = new JMenuItem("Add Record  ");
		ar.setIcon(new ImageIcon("D:\\project\\images\\add.gif"));
		ar.setFont(new Font("Segoe Script",Font.BOLD,16));
		ar.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
		ar.setMnemonic ((int)'A');
		ar.addActionListener(this);
				
		dr = new JMenuItem("Delete Record  ");
		dr.setIcon(new ImageIcon("D:\\project\\images\\delete.gif"));
		dr.setFont(new Font("Segoe Script",Font.BOLD,16));
		dr.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_D, Event.CTRL_MASK));
		dr.setMnemonic ((int)'D');
		dr.addActionListener(this);

		sr = new JMenuItem("Search Record  ");
		sr.setIcon(new ImageIcon("D:\\project\\images\\find.gif"));
		sr.setFont(new Font("Segoe Script",Font.BOLD,16));
		sr.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK));
		sr.setMnemonic ((int)'S');
		sr.addActionListener(this);

		mr = new JMenuItem("Modify Record  ");
		mr.setIcon(new ImageIcon("D:\\project\\images\\update.png"));
		mr.setFont(new Font("Segoe Script",Font.BOLD,16));
		mr.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK));
		mr.setMnemonic ((int)'M');
		mr.addActionListener(this);

		pr = new JMenuItem("Display Record  ");
		pr.setIcon(new ImageIcon("D:\\project\\images\\hp.gif"));
		pr.setFont(new Font("Segoe Script",Font.BOLD,16));
		pr.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK));
		pr.setMnemonic ((int)'P');
		pr.addActionListener(this);

		cl = new JMenuItem("Choose Color  ");
		cl.setIcon(new ImageIcon("D:\\project\\images\\color.png"));
		cl.setFont(new Font("Segoe Script",Font.BOLD,16));
		cl.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));
		cl.setMnemonic ((int)'C');
		cl.addActionListener(this);

		jar = new JMenuItem("Add Record  ");
		jar.setFont(new Font("Segoe Script",Font.BOLD,15));
		jdr = new JMenuItem("Delete Record  ");
		jdr.setFont(new Font("Segoe Script",Font.BOLD,15));
		jsr = new JMenuItem("Search Record  ");
		jsr.setFont(new Font("Segoe Script",Font.BOLD,15));
		jmr = new JMenuItem("Modify Record  ");
		jmr.setFont(new Font("Segoe Script",Font.BOLD,15));
		jpr = new JMenuItem("Display Record  ");
		jpr.setFont(new Font("Segoe Script",Font.BOLD,15));
		jcr = new JMenuItem("Color Chooser ");
		jcr.setFont(new Font("Segoe Script",Font.BOLD,15));
		jar.addActionListener(this);
		jpr.addActionListener(this);
		jcr.addActionListener(this);
		jdr.addActionListener(this);
		jsr.addActionListener(this);
		jmr.addActionListener(this);

		pm.add(jar);
		pm.addSeparator();
		pm.add(jdr);
		pm.addSeparator();
		pm.add(jsr);
		pm.addSeparator();
		pm.add(jmr);
		pm.addSeparator();
		pm.add(jpr);
		pm.addSeparator();
		pm.add(jcr);

		op.add(ar);
		op.insertSeparator(1);
		op.add(dr);
		op.insertSeparator(3);
		op.add(sr);
		op.insertSeparator(5);
		op.add(mr);
		op.insertSeparator(7);
		op.add(pr);
		op.insertSeparator(9);
		op.add(cl);
		mb.add(op);

		toolbar = new JToolBar();
		
		nr = new JButton (new ImageIcon ("D:\\project\\images\\add3.png"));
		nr.setToolTipText ("Add Record");
		nr.addActionListener (this);
	
		rr = new JButton (new ImageIcon ("D:\\project\\images\\Basket.gif"));
		rr.setToolTipText ("Delete Record");
		rr.addActionListener (this);

		fr = new JButton (new ImageIcon ("D:\\project\\images\\Mirror.gif"));
		fr.setToolTipText ("Search Record");
		fr.addActionListener (this);

		ur = new JButton (new ImageIcon ("D:\\project\\images\\updt.png"));
		ur.setToolTipText ("Update Record");
		ur.addActionListener (this);

		prr = new JButton (new ImageIcon ("D:\\project\\images\\Hp.gif"));
		prr.setToolTipText ("Display Record");
		prr.addActionListener (this);

		clr = new JButton (new ImageIcon ("D:\\project\\images\\coloor.png"));
		clr.setToolTipText ("Color Chooser");
		clr.addActionListener (this);

		toolbar.add(nr);
		toolbar.addSeparator();
		toolbar.add(rr);
		toolbar.addSeparator();
		toolbar.add(fr);
		toolbar.addSeparator ();
		toolbar.add(ur);
		toolbar.addSeparator();
		toolbar.add(prr);
		toolbar.addSeparator();
		toolbar.add(clr);


		mb.setBounds(0,0,1360,30);
		toolbar.setBounds(0,850,1360,50);
		
		f1.add(mb);
		f1.add(toolbar);		

		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f1.addMouseListener (new MouseAdapter () {
		public void mousePressed (MouseEvent me) { checkMouseTrigger (me); }
		public void mouseReleased (MouseEvent me) { checkMouseTrigger (me); }
		private void checkMouseTrigger (MouseEvent me) {
		if (me.isPopupTrigger ())
		pm.show (me.getComponent (), me.getX (), me.getY ());
		}
		}
		);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==ar || ae.getSource()==jar || ae.getSource()==nr)
		{
			//f1.setEnabled(false);
			addrecord ob1 = new addrecord();
		}

		if(ae.getSource()==pr || ae.getSource()==jpr || ae.getSource()==prr)
		{
			display ob2 = new display();
		}


		if(ae.getSource()==cl || ae.getSource()==jcr || ae.getSource()==clr)
		{
			col = JColorChooser.showDialog(f1, "Select a Background Color", col);
           		f1.getContentPane().setBackground(col);
		}

		if(ae.getSource()==dr || ae.getSource()==jdr || ae.getSource()==rr)
		{
			deleterec ob3 = new deleterec();
		}

		if(ae.getSource()==sr || ae.getSource()==jsr || ae.getSource()==fr)
		{
			search ob4 = new search();
		}

		if(ae.getSource()==mr || ae.getSource()==jmr || ae.getSource()==ur)
		{
			modify ob5 = new modify();
		}

	}

	public static void main(String args[])
	{
		mainform ob = new mainform();
	}
}



class BackgroundMenuBar extends JMenuBar
{
    Color bgColor=Color.WHITE;

    public void setColor(Color color)
    {
        bgColor=color;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.pink);
        g2d.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
    }
}


