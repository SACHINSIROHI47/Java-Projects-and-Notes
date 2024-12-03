import javax.swing.*;
import java.awt.*;
public class SwingTabbedPane
{
	public static void main(String[] args) 
	{
		JPanel panel1;
		panel1 = new JPanel();
		panel1.setBackground(Color.pink);
		JLabel lblUser,lblPassword;
		lblUser = new JLabel("User Id");
		lblPassword = new JLabel("Password");
		JTextField txtUser;
		txtUser = new JTextField(15); 
		JPasswordField passPassword;
		passPassword = new JPasswordField(14);
		JButton btnShow;
		Icon img1 = new ImageIcon("APPINSTALLED.gif");
		btnShow = new JButton("Show",img1);
		btnShow.setToolTipText("This Button shows a Meesage");
		panel1.add(lblUser);
		panel1.add(txtUser);
		panel1.add(lblPassword);
		panel1.add(passPassword);
		panel1.add(btnShow);
		///////////////////////panel2///////////////////
		JLabel lblItemNo,lblName,lblPrice,lblItemType,lblCity;
		lblItemNo = new JLabel("Item No.");
		lblName = new JLabel("Name");
		lblPrice = new JLabel("Price");
		lblItemType = new JLabel("Item Type");
		lblCity = new JLabel("Delivery City");
		JTextField txtItemNo,txtName,txtPrice;
		txtItemNo = new JTextField(6);
		txtName = new JTextField(15);
		txtPrice = new JTextField(4);
		String itemType[]={"SATATIONARY","FOOD","COSMETICS","GAMES","COMPUTERS"};
		JList lstType;
		lstType = new JList(itemType);
		lstType.setSelectionMode(2);
		lstType.setVisibleRowCount(3);
		String strCity[]={"Meerut","Delhi","Dehradoon","Mussoorie","Mumbai","New York","London","Paris"};
		JComboBox comboCity;
		comboCity = new JComboBox(strCity);
		comboCity.setEditable(true);
		comboCity.setMaximumRowCount(3);
		JButton btnSave;
		btnSave = new JButton("Save");
		JPanel panel2;
		panel2 = new JPanel();
		panel2.setBackground(Color.orange);
		panel2.add(lblItemNo);
		panel2.add(txtItemNo);
		panel2.add(lblName);
		panel2.add(txtName);
		panel2.add(lblPrice);
		panel2.add(txtPrice);
		panel2.add(lblItemType);
		panel2.add(lstType);
		panel2.add(lblCity);
		panel2.add(comboCity);
		panel2.add(btnSave);
		/////////////////////tabbedpane/////////////////
		JTabbedPane tabbedpane1;
		tabbedpane1 = new JTabbedPane();
		Icon img2 = new ImageIcon("APPINSTALLED.gif");
		tabbedpane1.addTab("User Information",img2,panel1,"Stores User Information");
		tabbedpane1.addTab("Item Information",null,panel2,"Stores Item Information");
		JFrame myframe1;
		myframe1 = new JFrame("Welcome to Swing");
		myframe1.getContentPane().add(tabbedpane1);
		myframe1.setSize(400,300);
		myframe1.show();
	}
}

