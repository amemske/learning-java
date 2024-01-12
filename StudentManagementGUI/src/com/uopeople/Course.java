package com.uopeople;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private int grade;
    private List<Student> enrolledStudents;


    //constructor
    public Course( String courseName){
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
        this.grade = 0; // default
    }

    //set course
    public void setCourseName( String courseName){
        this.courseName = courseName;
    }
    //get course
    public String getCourseName( ){
        return courseName;
    }
    //add a student to list of enrolled students
    public void addEnrolledStudent(Student student){
        enrolledStudents.add(student);
    }
    //get list of enrolled students
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    //get grade
    public int getGrade(){
        return grade;
    }

    //set grade
    public void setGrade(int grade){
        this.grade = grade;
    }
}
