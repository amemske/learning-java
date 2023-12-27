package com.uopeople;

import java.util.ArrayList;

public class CourseManagement {

private static ArrayList <Course> courseList = new ArrayList<>();
private static ArrayList <Student> courseGrades = new ArrayList<>();




// Implement static methods to add new courses, enroll students, assign grades, and calculate overall course grades for each student.

public static void addCourse(String name, String code, int maxCapacity) {
    Course newCourse = new Course(name, code, maxCapacity);
    courseList.add(newCourse);

}

public static void enrollStudent(Student student, Course course) {
    student.enrollStudent(course);
    
}

public static Course getCourseByCode(String courseCode) {
    for (Course course : courseList) {
        if (course.getCourseCode().equals(courseCode)) {
            return course;
        }
    }
    return null; // Course not found
}

public static void assignGrade (Student student, Course course, int grade) {
    student.assignGrade(course, grade);
    
}

public static double calculateOverallGrade(Student student) {
    ArrayList<Course> studentCourses = student.getCourses();
    double sum = 0.0;
    int totalItems = 0;

    for (Course course : studentCourses) {
        ArrayList<Integer> grades = course.getGrades();
        for (int grade : grades) {
            sum += grade;
            totalItems++;
        }
    }

    double overallGrade = (totalItems > 0) ? sum / totalItems : 0.0;

    return overallGrade;
}


}
