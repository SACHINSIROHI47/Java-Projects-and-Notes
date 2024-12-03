import javax.swing.*;
import java.awt.*;

public class SwingRadioCheck
{
	public static void main(String[] args) 
	{
               
		JFrame myframe1;
		myframe1 = new JFrame("Frame with & Check");
			
		JPanel panel1 = new JPanel();
					
		//panel1.setBackground(Color.red);
		Color color1 = new Color(227,214,117);
		panel1.setBackground(color1);

		JLabel lblPrinter = new JLabel("Choose Printer");
		
		JRadioButton itemPrinter1;
		itemPrinter1 = new JRadioButton("Laser Printer");
		
		JRadioButton itemPrinter2;
		itemPrinter2 = new JRadioButton("Inkjet Printer");

		panel1.add(lblPrinter);
		panel1.add(itemPrinter1);
		panel1.add(itemPrinter2);

		ButtonGroup group1 = new ButtonGroup();
		group1.add(itemPrinter1);
		group1.add(itemPrinter2);			
			
		JLabel lblSound = new JLabel("Choose Sound Feature");
		JCheckBox chkMicrophone,chkSpeaker;
		chkMicrophone = new JCheckBox("Microphone");
		chkSpeaker = new JCheckBox("Speaker");
		panel1.add(lblSound);
		panel1.add(chkMicrophone);
		panel1.add(chkSpeaker);
			
		myframe1.getContentPane().add(panel1);
		myframe1.setSize(300,250);
		myframe1.show();
		chkMicrophone.setBackground(Color.red);
	}
}
