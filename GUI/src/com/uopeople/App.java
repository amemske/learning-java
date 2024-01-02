package com.uopeople;
import javax.swing.*;

public class App {

   
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       // SwingDisplayText swingDisplay = new SwingDisplayText();
       // swingDisplay.Swing();

        SwingUtilities.invokeLater(() -> { //used where events and updates are involved
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    });

    }
}
