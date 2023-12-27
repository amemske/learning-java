package com.uopeople;
import java.util.*;

public class Student {
//private instance variables to store student information such as name, ID, and enrolled courses. - DONE
//access modifiers and provide public getter and setter methods for accessing and updating student information.
//a method to enroll students in courses. that accepts (a Course object as a parameter and add the course to the student's enrolled courses.) 
//a method to assign grades to students. that accepts (a Course object and a grade for the student and update the student's grade for that course. )

private String name;
private int ID;
private ArrayList <Course> coursesList;

//constructor
public Student( String name, int ID,  ArrayList<Course> coursesList){
     this.name = name;
     this.ID = ID;
     this.coursesList = new ArrayList<>();

}


public String getName(){
   return name;
}
public void setName(String name){
    this.name = name;
}

public int getID(){
    return ID;
}

public void setID(int ID){
    this.ID = ID;
}

public ArrayList<Course> getCourses(){
  return coursesList;
}

public void enrollStudent(Course course){
    coursesList.add(course);

}

public void assignGrade(Course course, int grade){
    for(Course enrolledCourse : coursesList){
        if (enrolledCourse.equals(course)){
            enrolledCourse.addGrade(grade);
            break;
        }

    }
}

// Method to get the average grade for all enrolled courses
public int getAverageGrade() {
    ArrayList<Course> enrolledCourses = coursesList;
    if (enrolledCourses.isEmpty()) {
        return 0;
    }

    int sum = 0;
    for (Course course : enrolledCourses) {
        sum += course.getAverageGrade();
    }

    return sum / enrolledCourses.size();
}


}
