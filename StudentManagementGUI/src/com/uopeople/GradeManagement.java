package com.uopeople;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GradeManagement extends JPanel {

    private List<Student> students;

    public GradeManagement(List<Student> students) {
        this.students = students;

        // Create your GUI components and layout
        JLabel label = new JLabel("Grade Management");
        JButton assignGradeButton = new JButton("Assign Grade");
        JButton viewGradesButton = new JButton("View Student Grades");

        // Add components to the layout
        setLayout(new GridLayout(3, 1));
        add(label);
        add(assignGradeButton);
        add(viewGradesButton);

        // Add event handlers for buttons (implement logic accordingly)
        assignGradeButton.addActionListener(e -> assignGrade());
        viewGradesButton.addActionListener(e -> viewStudentGrades());
    }

    private void assignGrade() {
        // Implement logic for assigning grades
        // You can use JOptionPane or other components for user input
        // For example:
        String studentName = JOptionPane.showInputDialog(this, "Enter student name:");
        String courseName = JOptionPane.showInputDialog(this, "Enter course name:");
        int grade = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter grade:"));

        // Call your existing logic to assign the grade
        assignGrade(studentName, courseName, grade);
    }

    private void viewStudentGrades() {
        // Implement logic for viewing student grades
        // You can use JOptionPane or other components for user input
        // For example:
        String studentName = JOptionPane.showInputDialog(this, "Enter student name:");

        // Call your existing logic to view student grades
        viewStudentGrades(studentName);
    }

    // Add other methods and functionality as needed

    private void assignGrade(String studentName, String courseName, int grade) {
        // Find the student with the given name
        for (Student student : students) {
            if (student.getStudentName().equals(studentName)) {
                // Find the course in the student's enrolled courses
                for (Course course : student.getEnrolledCourses()) {
                    if (course.getCourseName().equals(courseName)) {
                        // Assign the grade to the course
                        course.setGrade(grade);
                        break; // Assuming each course is unique for a student, so we can break once found
                    }
                }
                break; // Assuming each student is unique, so we can break once found
            }
        }
    }

    private void viewStudentGrades(String studentName) {
        // Find the student with the given name
        for (Student student : students) {
            if (student.getStudentName().equals(studentName)) {
                // Display the student's grades
                System.out.println("Student: " + student.getStudentName());
                System.out.println("Enrolled Courses and Grades:");
                for (Course course : student.getEnrolledCourses()) {
                    System.out.println(course.getCourseName() + ": " + course.getGrade());
                }
                break; // Assuming each student is unique, so we can break once found
            }
        }
    }
}
