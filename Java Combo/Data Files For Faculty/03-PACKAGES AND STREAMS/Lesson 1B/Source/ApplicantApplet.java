import javax.swing.*;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ApplicantApplet extends JApplet implements Runnable
{
     /* Declare panels */
     static JPanel panel;
     
     /* Declare labels */
	JLabel labelAppId;
	JLabel labelAppName;
	JLabel labelAppPosition;
     
     /* Declare TextArea */
     JTextField textAppID;
     JTextField textAppName;

     JComboBox comboAppPosition;

     /* Declare a Thread variable */
     Thread datimeThread;
     /* Declare a Date variable */
     Date date;
     /* Declare a GregorianCalendar variable */
     GregorianCalendar calendar; 
     /* Declare String variables to store date time and status bar messages. */
          String strDate, strTime, strStatus;
    /* init method of applet */
    public void init()
    {
	panel = new JPanel();
	getContentPane().add(panel);
	labelAppId = new JLabel("Applicant ID");
	labelAppName = new JLabel("Applicant Name");
	labelAppPosition = new JLabel("Position");

	textAppID = new JTextField(5);
	textAppName = new JTextField(5);
	
	String positions[] = {"Manager", "Executive", "Associate"};
	comboAppPosition = new JComboBox(positions);

	panel.add(labelAppId);
	panel.add(textAppID);

	panel.add(labelAppName);
	panel.add(textAppName);

	panel.add(labelAppPosition);
	panel.add(comboAppPosition);
	
	dateTime();
	
}
		     
     public void dateTime()
    {
       /* Initialize thread */
       datimeThread = new Thread(this);
         
       /* Starting thread */                        
       datimeThread.start(); 
    }

    public void run() /* body of the thread */
    {
        while(datimeThread != null)
        {
                display();// This method displays date
                try
                {
                     datimeThread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                     showStatus("Thread interrupted");
                }
        } /*end of while loop */
    } /* end of run method */

    /* displays date and time on the status bar */
    public void display() 
    {                     
         date = new Date();
         calendar = new GregorianCalendar();
         calendar.setTime(date);
         strTime = calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND);
         strDate = (calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.DATE)+"/"+calendar.get(Calendar.YEAR);
         strStatus=strTime+"      "+strDate;
         showStatus(strStatus);
    }
    
}/* end of program */
