import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingMenu2
{
	public JMenuItem itemOpen,itemClose,itemSave;
	public static void main(String[] args) 
	{
		JPanel panel1;
		panel1 = new JPanel();
		Color color1 = new Color(234,132,159);
		panel1.setBackground(color1);	
		
		
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
		MyMenuListener litener1 = new MyMenuListener();
		itemOpen.addActionListener(litener1);
		itemClose.addActionListener(litener1);
		itemSave.addActionListener(litener1);
		
			
		myframe1.getContentPane().add(panel1);
		myframe1.setSize(550,300);
		myframe1.show();
	}
}
class MyMenuListener  implements ActionListener
{
	public void actionPerformed(ActionEvent e) 
	{
		Object obj=(Object)e.getSource();
		if(obj==itemOpen)
		{
			JOptionPane.showMessageDialog(null,"Open is selected");
		}
		if(obj==itemSave)
		{
			JOptionPane.showMessageDialog(null,"Save is selected");
		}
		if(obj==itemClose)
		{
			JOptionPane.showMessageDialog(null,"Close is selected");
			System.exit(0);
		}
	}
}
