 import javax.swing.*;
import java.awt.event.*;
	public class swap extends JFrame
	{
	   JLabel labelFirst;
	   JLabel labelSecond;
	   JTextField textFirst;
	   JTextField textSecond;
	   JButton buttonDisplay; 
	   JPanel panel;
       public static void main(String args[])
	   {
	      swap f = new swap();
	   }
	   public swap()
	   {
	      super("Swapping Text");
	      panel = new JPanel();
	      getContentPane().add(panel);
	      labelFirst=new JLabel("First");
		textFirst=new JTextField(10);
	      labelSecond=new JLabel("Second");
	      textSecond=new JTextField(10);
	      buttonDisplay=new JButton("Display"); 
           panel.add(labelFirst);
	      panel.add(textFirst);
	      panel.add(labelSecond);
	      panel.add(textSecond);
	      panel.add(buttonDisplay);
	    ButtonListener blisten= new ButtonListener();
	    buttonDisplay.addActionListener(blisten);
      setVisible(true);
	    setSize(200,200);
	   }
 class ButtonListener implements ActionListener
 {
	public void actionPerformed(ActionEvent evt)
	{
	Object obj = evt.getSource();
	    if(obj == buttonDisplay)
	    {
			String str;
			str = textFirst.getText();
	       textSecond.setText(str);
	    }
	  }
 }//END OF ButtonListener inner class
}//End of swap class


