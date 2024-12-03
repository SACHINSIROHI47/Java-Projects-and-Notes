import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingMenu implements ActionListener
{
	JTextField txtUser;
	JMenuItem itemOpen,itemClose,itemSave;
	JMenuItem itemCopy,itemCut,itemPaste;
	
	public SwingMenu()
	{
		JPanel panel1;
		panel1 = new JPanel();
		Color color1 = new Color(234,132,159);
		panel1.setBackground(color1);	
		JLabel lblUser,lblPassword,lblAddress;
		lblUser = new JLabel("User Id");
		lblPassword = new JLabel("Password");
		lblAddress = new JLabel("Address");

		
		txtUser = new JTextField(15);
			
		txtUser.setText("USER1");
		txtUser.setEditable(true);

		JPasswordField passPassword;
		passPassword = new JPasswordField(14);

		JTextArea textareaAddress;
		textareaAddress = new JTextArea(4,12);

		JButton btnShow;
		btnShow = new JButton("Show");

		panel1.add(lblUser);
		panel1.add(txtUser);
		panel1.add(lblPassword);
		panel1.add(passPassword);
		panel1.add(lblAddress);
		panel1.add(textareaAddress);
		panel1.add(btnShow);
////////////////////////////////Menu////////////////////////////
		JFrame myframe1;
		myframe1 = new JFrame("Welcome to Swing");

		JMenuBar menubar1;
		menubar1 = new JMenuBar();
		myframe1.setJMenuBar(menubar1);

		JMenu menuFile,menuEdit,menuHelp;
		menuFile = new JMenu("File");
		menuEdit = new JMenu("Edit");
		menuHelp = new JMenu("Help");
		menubar1.add(menuFile);
		menubar1.add(menuEdit);
		menubar1.add(menuHelp);

		
		itemOpen = new JMenuItem("Open");
		itemClose = new JMenuItem("Close");
		itemSave = new JMenuItem("Save");
		menuFile.add(itemOpen);
		menuFile.add(itemClose);
		menuFile.add(itemSave);

		menuFile.addSeparator();

		JCheckBoxMenuItem itemPrint;
		itemPrint = new JCheckBoxMenuItem("Print");
		menuFile.add(itemPrint);

		JRadioButtonMenuItem itemPrinter1;
		itemPrinter1 = new JRadioButtonMenuItem("Laser Printer");
		menuFile.add(itemPrinter1);

		JRadioButtonMenuItem itemPrinter2;
		itemPrinter2 = new JRadioButtonMenuItem("Inkjet Printer");
		menuFile.add(itemPrinter2);

		ButtonGroup group1 = new ButtonGroup();
		group1.add(itemPrinter1);
		group1.add(itemPrinter2);

		JMenu menuPicture;
		menuPicture = new JMenu("Picture");
		menuFile.add(menuPicture);

		JMenuItem itemClipArt,itemFromFile;
		itemClipArt = new JMenuItem("Clip Art");
		itemFromFile = new JMenuItem("From File");

		menuPicture.add(itemClipArt);
		menuPicture.addSeparator();
		menuPicture.add(itemFromFile);

		JMenuItem itemCopy,itemCut,itemPaste;
		itemCopy = new JMenuItem("Copy");
		itemCut = new JMenuItem("Cut");
		itemPaste = new JMenuItem("Paste");
		menuEdit.add(itemCopy);
		menuEdit.add(itemCut);
		menuEdit.add(itemPaste);

	    	itemOpen.addActionListener(this);
	   	itemClose .addActionListener(this);
		
			
		myframe1.getContentPane().add(panel1);
		myframe1.setSize(550,300);
		myframe1.show();
	}
	public static void main(String[] args) 
	{
		SwingMenu obj = new SwingMenu();
	}

	public void actionPerformed(ActionEvent evt)
	{
	Object obj = evt.getSource();
		
	    if(obj == itemOpen)
	    {
		
	      txtUser.setText("File Open is selected");
	    }
	  if(obj == itemClose )
                    {
		
		   txtUser.setText("Close is selected");
	    }
	 
	  }
 }//END OF ButtonListener inner class
