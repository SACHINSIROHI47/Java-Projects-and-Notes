package com.mybank.gui;

import com.mybank.domain.*;
import com.mybank.data.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class ATMClient {
    
    private static final String USAGE
            = "USAGE: java com.mybank.gui.ATMClient <dataFilePath>";
    
    public static void main(String[] args) {
        
        // Retrieve the dataFilePath command-line argument
        if ( args.length != 1 ) {
            System.out.println(USAGE);
        } else {
            String dataFilePath = args[0];
            
            try {
                System.out.println("Reading data file: " + dataFilePath);
                // Create the data source and load the Bank data
                DataSource dataSource = new DataSource(dataFilePath);
                dataSource.loadData();
                
                // Run the ATM GUI
                ATMClient client = new ATMClient();
                client.launchFrame();
                
            } catch (IOException ioe) {
                System.out.println("Could not load the data file.");
                System.out.println(ioe.getMessage());
                ioe.printStackTrace(System.err);
            }
        }
    }
    
    // PLACE YOUR GUI CODE HERE
    
    // GUI component instance variables
    private JFrame frame;
    private JPanel pLeftHalf;
    private JPanel pRightHalf;
    private JTextField entryField;
    private JTextField messageField;
    private JTextArea outputArea;
    
    public ATMClient() {
        frame = new JFrame("First Java Bank ATM");
        initializeFrameComponents();
    }
    
    public void launchFrame() {
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    private void initializeFrameComponents() {
        initLeftHalf();
        initRightHalf();
    }
    
    private void initLeftHalf() {
        pLeftHalf = new JPanel();
        pLeftHalf.setLayout(new GridLayout(2, 1));
        initTopLeft();
        initBottomLeft();
        frame.add(pLeftHalf, BorderLayout.WEST);
    }
    
    private void initTopLeft() {
        JPanel topLeftPanel = new JPanel();
        topLeftPanel.setLayout(new GridLayout(3, 1));
        JButton[] menuButtons = new JButton[]
        {new JButton("Display account balance"),
                 new JButton("Make a deposit"),
                 new JButton("Make a withdrawal")};
                 for (int i=0; i<3; i++) {
                     topLeftPanel.add(menuButtons[i]);
                 }
                 pLeftHalf.add(topLeftPanel);
    }
    
    private void initBottomLeft() {
        // Initialize entry text field and keypad grid panel
        JPanel entryKeyPadPanel = new JPanel();
        entryKeyPadPanel.setLayout(new BorderLayout());
        // Create and add entry text field
        entryField = new JTextField(10);
        entryKeyPadPanel.add(entryField, BorderLayout.NORTH);
        // Create keypad grid and buttons
        JPanel keyPadGrid = new JPanel();
        keyPadGrid.setLayout(new GridLayout(4, 3));
        JButton[] keyPadButtons = new JButton[]
        {new JButton("1"),
                 new JButton("2"),
                 new JButton("3"),
                 new JButton("4"),
                 new JButton("5"),
                 new JButton("6"),
                 new JButton("7"),
                 new JButton("8"),
                 new JButton("9"),
                 new JButton("0"),
                 new JButton("."),
                 new JButton("ENTER")};
                 for (int i=0; i<12; i++) {
                     keyPadGrid.add(keyPadButtons[i]);
                 }
                 entryKeyPadPanel.add(keyPadGrid, BorderLayout.SOUTH);
                 // Add entry/keypad panel to left-half panel
                 pLeftHalf.add(entryKeyPadPanel);
    }
    
    private void initRightHalf() {
        pRightHalf = new JPanel();
        pRightHalf.setLayout(new BorderLayout());
        outputArea = new JTextArea(10, 75);
        pRightHalf.add(outputArea, BorderLayout.CENTER);
        messageField = new JTextField(75);
        pRightHalf.add(messageField, BorderLayout.SOUTH);
        pRightHalf.setEnabled(false);
        frame.add(pRightHalf, BorderLayout.EAST);
    }
}
