package com.uopeople;

public class Grade {

    //student name
    //course
    //grade
    //constructor to initialize a new grade
    //getters and setters

    private Student student;
    private Course course;
    private int grade;

    public Grade (Student studentName,Course course, int grade){
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    //set grade
    public void setGrade(int grade){
        this.grade = grade;

    }

    //get grade
    public int getGrade(){
        return grade;
    }


    //set student
    public void setStudent(Student student){
        this.student = student;

    }

    //get student
    public Student getStudent(){
        return student;

    }

    //set course
    public void setCourse( Course course){
        this.course = course;

    }
    //get course
    public Course getCourse(){
        return course;
    }

}
