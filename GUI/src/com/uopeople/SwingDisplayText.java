package com.uopeople;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDisplayText {

    public void Swing(){

        // Create the main frame
    JFrame frame = new JFrame("Simple Swing Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);

    // Create the components
    JTextField textField = new JTextField(20);
    JLabel label = new JLabel("Your Text will appear here");
    JButton button = new JButton("Display Text");

    // Add action listener to the button
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get text from the text field and set it on the label
            String inputText = textField.getText();
            label.setText(inputText);
        }
    });

    // Set layout manager
    frame.setLayout(new FlowLayout());

    // Add components to the frame
    frame.add(textField);
    frame.add(button);
    frame.add(label);

    // Make the frame visible
    frame.setVisible(true);

    }
    
}
