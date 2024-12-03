import javax.swing.*;
class WindowComboBox
{
	public static void main(String args[])
	{
		JFrame obj = new JFrame("Welcome To RGPG");
		JPanel panel1 = new JPanel();
		JLabel lblCity = new JLabel("City");
		String strCity[]={"Delhi","Mumbai","Calcutta","Madras","Meerut","Haridwar"};
		JComboBox cmbCity = new JComboBox(strCity);
		JLabel lblState= new JLabel("State");
		String strState[]={"Andhar Pradesh","Delhi","Mahrashtra","Tamil Nadu","Uttar Pradesh","Uttarakhand"};
		JList lstState = new JList(strState);
		JButton btn1;		
		btn1 = new JButton("OK");		
		panel1.add(lblCity);
		panel1.add(cmbCity);
		panel1.add(lblState);
		panel1.add(lstState);
		panel1.add(btn1);	
		obj.getContentPane().add(panel1);
		obj.setSize(300,250);
		obj.setVisible(true);
	}
}
	