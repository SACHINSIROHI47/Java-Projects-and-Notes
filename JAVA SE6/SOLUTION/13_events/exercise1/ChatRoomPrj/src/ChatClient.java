import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatClient {
    
    private JTextArea output;
    private JTextField input;
    private JButton sendButton;
    private JButton quitButton;
    
    public ChatClient() {
        output = new JTextArea(10,50);
        input = new JTextField(50);
        sendButton = new JButton("Send");
        quitButton = new JButton("Quit");
    }
    
    public void launchFrame() {
        JFrame frame = new JFrame("Chat Room");
        
        // Use the Border Layout for the frame
        frame.setLayout(new BorderLayout());
        
        frame.add(output, BorderLayout.WEST);
        frame.add(input, BorderLayout.SOUTH);
        
        // Create the button panel
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2,1));
        p1.add(sendButton);
        p1.add(quitButton);
        
        // Add the button panel to the center
        frame.add(p1, BorderLayout.CENTER);
        
        // Attach listener to the appropriate components
        sendButton.addActionListener(new SendHandler());
        input.addActionListener(new SendHandler());
        frame.addWindowListener(new CloseHandler());
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private class SendHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = input.getText();
            output.append(text + "\n");
            input.setText("");
        }
    }
    
    private class CloseHandler extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        ChatClient c = new ChatClient();
        c.launchFrame();
    }
}
