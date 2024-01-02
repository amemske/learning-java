package com.uopeople;
import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
private JTextField usernameField;
private JTextField emailField;
private JPasswordField passwordField;
private JCheckBox agreeCheckBox;

public LoginForm() {
    setTitle("Login Form");
    setSize(800, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null); // Center the frame

    initUI();
}

private void initUI() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    addField(panel, "Username:", usernameField = new JTextField());
    addField(panel, "Email:", emailField = new JTextField());
    addField(panel, "Password:", passwordField = new JPasswordField());

    agreeCheckBox = new JCheckBox("I agree to the terms and conditions");
    panel.add(agreeCheckBox);

    panel.add(new JButton("Login")); // Just a button for illustration

    add(panel); // Add the panel to the JFrame
}

private void addField(JPanel panel, String labelName, JComponent component) {
    JPanel fieldPanel = new JPanel();
    fieldPanel.setLayout(new BoxLayout(fieldPanel, BoxLayout.X_AXIS));

    JLabel label = new JLabel(labelName);
    fieldPanel.add(label);

    fieldPanel.add(component);
    component.setMaximumSize(new Dimension(Integer.MAX_VALUE, component.getPreferredSize().height));

    panel.add(fieldPanel);
}

private void onLoginButtonClick() {
    // Handle login button click event
    System.out.println("Login button clicked");
}

}
