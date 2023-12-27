package com.uopeople;

import java.util.ArrayList;

public class Course {
    
//The Course class should have private instance variables to store course information such as course code, name, and maximum capacity.
// Use appropriate access modifiers and provide public getter methods for accessing course information.
// Implement a static variable to keep track of the total number of enrolled students across all instances of the Course class.
// Design a static method to retrieve the total number of enrolled students.

 private String courseName;
 private String courseCode;
 private int courseMaxCapacity;
 private static int totalEnrolledStudents = 0;
 private ArrayList<Integer> grades = new ArrayList<>();

public Course (String courseName, String courseCode, int courseMaxCapacity) {
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.courseMaxCapacity = courseMaxCapacity;
}

//get course name
public String getCourseName(){
    return courseName;
}

//set course name
public void setCourseName(String courseName){
    this.courseName = courseName;
}

//get course code
public String getCourseCode(){
    return courseName;
}

//set course code
public void setCourseCode(String courseName){
    this.courseName = courseName;
}

//get courseMaxCapacity
public int getcourseMaxCapacity(){
    return courseMaxCapacity;
}

//set courseMaxCapacity
public void setcourseMaxCapacity(int courseMaxCapacity){
    this.courseMaxCapacity = courseMaxCapacity;
}


//get totalStudentsEnrolled
public static int getTotalEnrolledStudents(){
    return totalEnrolledStudents;
}

// get the grade for this course
public ArrayList<Integer> getGrades() {
    return grades;
}


//add a grade for a student in the course
public void addGrade(int grade) {
    grades.add(grade);
}

public int getAverageGrade() {
    if (grades.isEmpty()) {
        return 0;
    }

    int sum = 0;
    for (int grade : grades) {
        sum += grade;
    }

    return sum / grades.size();
}


}
