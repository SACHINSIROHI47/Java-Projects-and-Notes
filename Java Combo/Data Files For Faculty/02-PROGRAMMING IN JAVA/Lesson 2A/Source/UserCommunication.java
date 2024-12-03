import javax.swing.*;
import java.io.File;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class UserCommunication extends JFrame implements ActionListener 
{
	private JMenuBar menubar;
	private JMenu filemenu;
	private JMenu propertmenu;
	private JTextArea sendertextarea;
	
	private JScrollPane senderscrollpane;
	
	private JMenuItem openmenuitem,savemenuitem,exitmenuitem,propertymenuitem,loadproperty,saveproperty;
	JPanel buttonpanel;
	JButton openportbutton;
	JButton closeportbutton;
	JPanel textareapanel;
	JComboBox comportcombo;

	public UserCommunication()
	{
		super("User Commnucation");
		createGUI();
	}
	public void	createGUI()
	{
		Dimension  scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((scrnSize.width / 2) - 250, (scrnSize.height / 2) - 250);
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e)
		{
			System.out.println("Error in setting WLAF"+e);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentpane=getContentPane();
		filemenu=new JMenu("File");
		menubar=new JMenuBar();
		filemenu.setMnemonic('f');
		openmenuitem=new JMenuItem("Open");
		openmenuitem.addActionListener(this);
		openmenuitem.setActionCommand("open");
		openmenuitem.setMnemonic('o');
		filemenu.add(openmenuitem);
		savemenuitem=new JMenuItem("Save");
		savemenuitem.addActionListener(this);
		savemenuitem.setMnemonic('s');
		savemenuitem.setActionCommand("save");
		filemenu.add(savemenuitem);
		exitmenuitem=new JMenuItem("Exit");
		exitmenuitem.addActionListener(this);
		exitmenuitem.setActionCommand("Exit");
		exitmenuitem.setMnemonic('e');
		filemenu.add(exitmenuitem);
		propertmenu=new JMenu("Properties");
		propertymenuitem=new JMenuItem("Open Property Page");
		propertymenuitem.addActionListener(this);
		propertymenuitem.setActionCommand("open_property");
		propertymenuitem.setMnemonic('o');
		loadproperty=new JMenuItem("Load From File");
		loadproperty.addActionListener(this);
		loadproperty.setActionCommand("load_file");
		loadproperty.setMnemonic('l');
		saveproperty=new JMenuItem("Save Properties");
		saveproperty.addActionListener(this);
		saveproperty.setActionCommand("save_property");
		saveproperty.setMnemonic('s');
		propertmenu.add(propertymenuitem);
		propertmenu.add(loadproperty);
		propertmenu.add(saveproperty);
		menubar.add(filemenu);
		menubar.add(propertmenu);
		setJMenuBar(menubar);
		buttonpanel=new JPanel();
		openportbutton=new JButton("<html>O<u>p</u>en</html>");
		openportbutton.setMnemonic('p');
		openportbutton.setActionCommand("open_port");
		closeportbutton=new JButton("<html><u>C</u>lose</html>");
		closeportbutton.setMnemonic('C');
		
		closeportbutton.setActionCommand("close_port");
		GridBagLayout gridbaglayout=new GridBagLayout();
		GridBagConstraints gridbagconstraint=new GridBagConstraints();
		buttonpanel.setLayout(gridbaglayout);
		gridbagconstraint.fill = GridBagConstraints.HORIZONTAL;
		gridbagconstraint.insets=new Insets(5,5,5,5);
		gridbagconstraint.gridx=0;
		gridbagconstraint.gridy=0;
		gridbagconstraint.anchor=GridBagConstraints.CENTER;
		gridbaglayout.setConstraints(openportbutton,gridbagconstraint);
		buttonpanel.add(openportbutton);
		
		gridbagconstraint.gridx=1;
		gridbagconstraint.gridy=0;
		gridbagconstraint.anchor=GridBagConstraints.CENTER;
		gridbaglayout.setConstraints(closeportbutton,gridbagconstraint);
		buttonpanel.add(closeportbutton);
		contentpane.add(buttonpanel,BorderLayout.SOUTH);
		textareapanel=new JPanel(new GridLayout(2,1,5,5));

		sendertextarea=new JTextArea();


		senderscrollpane=new JScrollPane(sendertextarea);
	
		textareapanel.add(senderscrollpane);
	
		contentpane.add(textareapanel,BorderLayout.CENTER);

		setSize(400,300);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		UserCommunication UserCommunication=new UserCommunication();
	}
	 public void actionPerformed(ActionEvent ae)
    {
		String componentid=ae.getActionCommand();
		if (componentid=="open_port")
		{
			openportbutton.setEnabled(false);
			if(openPort())
			{
				closeportbutton.setEnabled(false);			
			}
			else
			{
				openportbutton.setEnabled(true);
			}
		}
		if (componentid=="close_port")
		{
			closeportbutton.setEnabled(false);
			closePort();
		}
	}
	public boolean openPort()
	{
	return true;	
	}
	public boolean closePort()
	{
		return true;
	}
};