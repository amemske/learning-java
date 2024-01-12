package com.uopeople;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class App extends JFrame {

    private List<Student> students;

    public App() {
        setTitle("School Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.students = new ArrayList<>();

        // Create buttons for each management section
        JButton gradeManagementButton = new JButton("Grade Management");
        JButton studentManagementButton = new JButton("Student Management");
        JButton courseEnrollmentButton = new JButton("Course Enrollment");

        // Add action listeners to the buttons
        gradeManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGradeManagement();
            }
        });

        studentManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openStudentManagement();
            }
        });

        courseEnrollmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCourseEnrollment();
            }
        });

        // Set layout to a grid layout
        setLayout(new GridLayout(3, 1));

        // Add buttons to the layout
        add(gradeManagementButton);
        add(studentManagementButton);
        add(courseEnrollmentButton);

        setVisible(true);
    }

    private void openGradeManagement() {
        // Create an instance of GradeManagement
        GradeManagement gradeManagement = new GradeManagement(students);

        // Create a JFrame to hold the GradeManagement panel
        JFrame frame = new JFrame("Grade Management");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the Grade Management window
        frame.getContentPane().add(gradeManagement);
        frame.pack();
        frame.setVisible(true);
    }

    private void openStudentManagement() {
        // Create an instance of StudentManagement and display it
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.setVisible(true);
    }

    private void openCourseEnrollment() {
        // Create an instance of CourseEnrollment and display it
        CourseEnrollment courseEnrollment = new CourseEnrollment();
        courseEnrollment.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SwingUtilities.invokeLater(() -> new App());
    }
}
