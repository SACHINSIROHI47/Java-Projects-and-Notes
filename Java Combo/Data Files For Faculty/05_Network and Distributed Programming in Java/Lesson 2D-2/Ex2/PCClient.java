import java.applet.Applet;
import java.awt.*;
import java.rmi.*;
import java.rmi.server.*;
import java.io.*;

public class PCClient extends Applet
{
    	/* Initialize Choice components */
    	Choice pc_model;
    	Choice processor_type;
    	/* Initialize Button components */
    	Button button_send;
    	Button button_reset;
    	Button button_exit;
    	/* Initialize Panel and Layout components */
    	GridBagLayout gbl;
    	GridBagConstraints gbc; 
    	Panel pc_panel;
    	GridLayout gl;
    	/* Initialize Label components */
    	Label label_title;
    	Label label_model;
    	Label label_processor;
    	Label label_name;
    	Label label_address;
    	Label label_city;
    	Label label_phone;
    	Label label_email;
    	/* Initialize TextField components */
    	TextField text_name;
    	TextField text_address;
    	TextField text_city;
	TextField text_phone;
	TextField text_email;
	/* Initialize TextArea component */
	TextArea order_area;
    	/* Initialize the objects of Remote and PCRemote interfaces */
    	Remote remote_obj = null;
    	PCRemote pc_remote_obj = null;
	public void init()
    	{
		gbl = new GridBagLayout();
		setLayout(gbl);
   		gbc = new GridBagConstraints();
   	   	/* Creating title Label */
   		gbc.gridx = 1;   
   		gbc.gridy = 1;
   		gbc.gridwidth = 3;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.CENTER;
   		label_title = new Label("Online PC Shopping");
   		label_title.setFont(new Font("Arial",Font.BOLD,30));
   		add(label_title, gbc);
	   	/* Create name Label and name TextField */
   		gbc.gridx = 1;   
   		gbc.gridy = 2;
   		gbc.gridwidth = 1;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.EAST;
   		label_name = new Label("Name");
   		add(label_name, gbc);
 	   	gbc.gridx = 2;   
   		gbc.gridy = 2;
   		gbc.gridwidth = 2;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.WEST;
   		text_name = new TextField(20);
   		add(text_name, gbc);
		/* Create address Label and address TextField */
   		gbc.gridx = 1;   
   		gbc.gridy = 3;
   		gbc.gridwidth = 1;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.EAST;
   		label_address = new Label("Address");
   		add(label_address, gbc);
	  	gbc.gridx = 2;   
   		gbc.gridy = 3;
   		gbc.gridwidth = 2;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.WEST;
   		text_address = new TextField(20);
   		add(text_address, gbc);
   		/* Create city Label and city TextField */
   		gbc.gridx = 1;   
   		gbc.gridy = 4;
   		gbc.gridwidth = 1;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.EAST;
   		label_city = new Label("City");
   		add(label_city, gbc);
   		gbc.gridx = 2;   
   		gbc.gridy = 4;
   		gbc.gridwidth = 2;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.WEST;
   		text_city = new TextField(20);
   		add(text_city, gbc);
   		/* Create phone Label and phone TextField */
   		gbc.gridx = 1;   
   		gbc.gridy = 5;
   		gbc.gridwidth = 1;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.EAST;
   		label_phone = new Label("Phone");
   		add(label_phone, gbc);
   		gbc.gridx = 2;   
   		gbc.gridy = 5;
   		gbc.gridwidth = 2;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.WEST;
   		text_phone = new TextField(20);
   		add(text_phone, gbc);
    		/* Create email Label and email TextField */
   		gbc.gridx = 1;   
   		gbc.gridy = 6;
   		gbc.gridwidth = 1;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.EAST;
   		label_email = new Label("Email");
   		add(label_email, gbc);
   		gbc.gridx = 2;   
   		gbc.gridy = 6;
   		gbc.gridwidth = 2;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.WEST;
   		text_email = new TextField(20);
   		add(text_email, gbc);
   		/* Create model Label and model Choice */
   		gbc.gridx = 1;   
   		gbc.gridy = 7;
   		gbc.gridwidth = 1;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.EAST;
   		label_model = new Label("Model Name");
   		add(label_model, gbc);
   		gbc.gridx = 2;   
   		gbc.gridy = 7;
   		gbc.gridwidth = 2;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.WEST;
   		pc_model = new Choice();
		pc_model.addItem("SAMSUNG");
		pc_model.addItem("COMPAQ");
		pc_model.addItem("HCL");
		pc_model.addItem("DELL");
		pc_model.addItem("WIPRO");
		pc_model.addItem("HP");
		add(pc_model, gbc);
		/* Create processor Label and processor Choice */
   		gbc.gridx = 1;   
   		gbc.gridy = 8;
   		gbc.gridwidth = 1;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.EAST;
   		label_processor = new Label("Processor Type");
   		add(label_processor, gbc);
   		gbc.gridx = 2;   
   		gbc.gridy = 8;
   		gbc.gridwidth = 2;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.WEST;
		processor_type = new Choice();
		processor_type.addItem("Celeron");
		processor_type.addItem("Pentium-I");
		processor_type.addItem("Pentium-II");
		processor_type.addItem("Pentium-III");
		processor_type.addItem("Pentium-IV");
		add(processor_type, gbc);
		/* Create Panel and Buttons */
		pc_panel = new Panel();
		pc_panel.setLayout(new GridLayout(1,3,2,0));
		button_send = new Button("Send");
		pc_panel.add(button_send);
		button_reset = new Button("Reset");
		pc_panel.add(button_reset);
		button_exit = new Button("Exit");
		pc_panel.add(button_exit);
		gbc.gridx = 1;   
   		gbc.gridy = 9;
   		gbc.gridwidth = 3;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.EAST;
   		add(pc_panel, gbc);
		/* Create order TextArea */
		gbc.gridx = 1;
		gbc.gridy = 10;
		gbc.gridwidth = 3;
   		gbc.gridheight = 1;
   		gbc.anchor = GridBagConstraints.CENTER;
		order_area = new TextArea(8, 50);
		add(order_area, gbc);
		/* Setting security manager */
		System.setSecurityManager(new RMISecurityManager());
		/* Get the Remote object from the RMI Registry */
		try
		{
	  		System.out.println("RMI registry lookingup the server...");
      			remote_obj = Naming.lookup("rmi://192.168.0.52/PCServer");
		}
		catch(Exception e)
		{
	  		System.out.println("Error:" + e.toString());
		}
		/* Get the server reference */
		try
		{
	  		if(remote_obj instanceof PCRemote)
	  			pc_remote_obj = (PCRemote)remote_obj;
		}
		catch(Exception e)
		{
	  		System.out.println("Error: " + e.toString());
		}
	}
    	public boolean action(Event evt, Object obj)
    	{
		String name = new String();
		String address = new String(); 
		String city = new String(); 
		String email = new String();
		String phone = new String();
		String model = new String();
		String processor = new String();
		if(evt.target == button_send)
		{
	  		/* Get customer order */
	  		name = text_name.getText(); 
	  		address = text_address.getText(); 
	  		city = text_city.getText(); 
			email = text_email.getText(); 
	  		phone = text_phone.getText(); 
			model = pc_model.getSelectedItem();
			processor = processor_type.getSelectedItem();
			/* Send the order to the server */
        		order_area.setText("Your order has been sent to the server. \n");
        		String totalstring = new String();
        		try
        		{
          			totalstring = pc_remote_obj.orderPC(name, address, city, phone, email, model, processor); 
        		}
        		catch(Exception e)
        		{
          			System.out.println("Error: " + e.toString());
        		}
                	/*  Receive the total cost and display the final results */
        		order_area.append("A " + model + " computer of " + processor + " will be delivered to \n");
        		order_area.append(name + "\n" + address + city + "\n" + phone);  
        		order_area.append("\nBill: " + totalstring);
        	}
		else if(evt.target == button_reset)
		{
			/* Reset all TextField */
			order_area.setText("Select new computer");
			text_name.setText("");
			text_address.setText("");
			text_phone.setText("");
			text_city.setText("");
			text_email.setText("");
           		order_area.setText("");
		}
		else if(evt.target == button_exit)
		{
			System.exit(0);
		}
	return true;
	}
}