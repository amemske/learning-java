package com.uopeople;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CourseEnrollment extends JFrame {
    private List<Course> courses;
    private List<Student> students;

    private JComboBox<String> courseDropdown;
    private JList<String> studentList;
    private JButton enrollButton;

    public CourseEnrollment(){
        setTitle("Course Enrollment");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();

        // Create GUI components
        courseDropdown = new JComboBox<>();
        studentList = new JList<>();
        enrollButton = new JButton("Enroll");

        // Set layout
        setLayout(new GridLayout(3, 2));

        // Add components to the layout
        add(new JLabel("Select Course:"));
        add(courseDropdown);
        add(new JLabel("Select Student(s):"));
        add(new JScrollPane(studentList));
        add(new JLabel()); // Empty label for spacing
        add(enrollButton);

        // Add event handler for the enroll button
        enrollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enrollSelectedStudents();
            }
        });
    }


    // Logic to enroll selected students in the chosen course
    private void enrollSelectedStudents() {
        String selectedCourse = (String) courseDropdown.getSelectedItem();
        List<String> selectedStudents = studentList.getSelectedValuesList();

        // Implement logic to find Course and Student objects and perform enrollment
        Course course = findCourseByName(selectedCourse);
        List<Student> enrolledStudents = findStudentsByName(selectedStudents);

        for (Student student : enrolledStudents) {
            enrollStudentInCourse(student, course);
        }

        // Display a message or perform any other necessary actions
        System.out.println("Enrolled students in " + selectedCourse + ": " + selectedStudents);
    }

    // Method to find a Course object by name
    private Course findCourseByName(String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                return course;
            }
        }
        return null; // Handle case when course is not found
    }

    // Method to find Student objects by names
    private List<Student> findStudentsByName(List<String> studentNames) {
        List<Student> foundStudents = new ArrayList<>();
        for (String studentName : studentNames) {
            for (Student student : students) {
                if (student.getStudentName().equals(studentName)) {
                    foundStudents.add(student);
                    break; // Assuming each student has a unique name
                }
            }
        }
        return foundStudents;
    }

    //enroll a student to a course
    public void enrollStudentInCourse(Student student, Course course){
        course.addEnrolledStudent(student);
        student.addEnrolledCourse(course);
    }

    //display students eligible for enrollment in a course
    public List<Student> getEligibleStudentsForCourses(Course course){
        return students;
    }

    
}
