package com.uopeople;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement  extends JFrame {


    private List<Student> students;

    private JTextField studentNameField;
    private JButton addButton;
    private JButton updateButton;
    private JButton viewDetailsButton;

    //constructor
    public StudentManagement() {
        setTitle("Student Management");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.students = new ArrayList<>();

        // Create GUI components
        studentNameField = new JTextField(20);
        addButton = new JButton("Add Student");
        updateButton = new JButton("Update Student");
        viewDetailsButton = new JButton("View Student Details");

        // Set layout
        setLayout(new GridLayout(3, 1));

        // Add components to the layout
        add(new JLabel("Enter Student Name:"));
        add(studentNameField);
        add(addButton);
        add(updateButton);
        add(viewDetailsButton);

        // Add event handler for the add button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = studentNameField.getText().trim();
                addStudent(studentName);
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStudent();
            }
        });

        viewDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewStudentDetails();
            }
        });
    }

    //add student
    public void addStudent(String studentName){
        Student newstudent = new Student(studentName);
        students.add(newstudent);

    }

    //update student
    // Method to update a selected student's information
    private void updateStudent() {
        // Prompt user for selected student and new information
        String selectedStudentName = JOptionPane.showInputDialog(this, "Enter the name of the student to update:");

        if (selectedStudentName != null && !selectedStudentName.trim().isEmpty()) {
            // Find the selected student
            Student selectedStudent = findStudentByName(selectedStudentName);

            if (selectedStudent != null) {
                // Prompt user for new student name
                String newStudentName = JOptionPane.showInputDialog(this, "Enter the new name for the student:");

                if (newStudentName != null && !newStudentName.trim().isEmpty()) {
                    // Update the student's name
                    selectedStudent.setStudentName(newStudentName);

                    // Update the table to reflect changes
                    viewStudentDetails();

                    // For preview purposes, print a message
                    System.out.println("Updated student: " + selectedStudentName + " -> " + newStudentName);
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid new student name.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Student not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //view student details
    public void viewStudentDetails() {
        // Prompt user for the student's name
        String studentName = JOptionPane.showInputDialog(this, "Enter the name of the student to view details:");

        if (studentName != null && !studentName.trim().isEmpty()) {
            // Find the selected student
            Student selectedStudent = findStudentByName(studentName);

            if (selectedStudent != null) {
                // Display detailed information about the student
                JOptionPane.showMessageDialog(
                        this,
                        "Student Name: " + selectedStudent.getStudentName() + "\n" +
                                "Enrolled Courses: " + selectedStudent.getEnrolledCourses(),
                        "Student Details",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(this, "Student not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private Student findStudentByName(String studentName) {
        for (Student student : students) {
            if (student.getStudentName().equals(studentName)) {
                return student;
            }
        }
        return null;
    }

}
