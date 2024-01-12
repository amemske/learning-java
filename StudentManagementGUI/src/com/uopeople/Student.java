package com.uopeople;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String studentName;
    private List<Course> enrolledCourses;

    //constructor
    public Student (String studentName){
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
        defaultCourses();
    }

    //get student name
    public String getStudentName() {
        return studentName;
    }

    //set student name
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //intialize default
    public void defaultCourses(){
        Course mathCourse = new Course("Mathematics");
        Course englishCourse = new Course("English");

        addEnrolledCourse(mathCourse);
        addEnrolledCourse(englishCourse);
    }

    //add a course
    public void addEnrolledCourse(Course course){
        enrolledCourses.add(course);
    }

    //List of enrolled courses
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    //display courses


}
