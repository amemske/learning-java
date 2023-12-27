import java.util.*;

import com.uopeople.Course;
import com.uopeople.CourseManagement;
import com.uopeople.Student;

public class AdministratorInterface {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            int choiceSelected = scanner.nextInt();

            switch (choiceSelected) {
                case 1:
                    addNewCourse();
                    break;
                case 2:
                    enrollStudents();
                    break;
                case 3:
                    assignGrades();
                    break;
                case 4:
                    calculateOverallGrades();
                    break;
                case 5:
                    System.out.println("Shutting down");
                    System.exit(0);
                    break;

                default:
                    break;
            }

        }

    }

    private static void displayMenu() {
        System.out.println("==== Please select a Menu Item ====");
        System.out.println("1. Add a new course");
        System.out.println("2. Enroll students");
        System.out.println("3. Assign grades");
        System.out.println("4. Calculate overall course grades");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addNewCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String courseCode = scanner.next();
        System.out.print("Enter course name: ");
        String courseName = scanner.next();
        System.out.print("Enter maximum capacity: ");
        int maxCapacity = scanner.nextInt();
        CourseManagement.addCourse(courseCode, courseName, maxCapacity);
        System.out.println("Course added successfully.");
    }

    private static void enrollStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the course code: ");
        String courseCode = scanner.next();
        System.out.print("Enter student name: ");
        String studentName = scanner.next();
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();

        // Create a new Student object with the entered information
        Student student = new Student(studentName, studentID, new ArrayList<>());

        // Retrieve the Course object based on the courseCode
        Course course = CourseManagement.getCourseByCode(courseCode);

        // Enroll the student in the specified course
        CourseManagement.enrollStudent(student, course);

        System.out.println("Student enrolled successfully.");
    }

    private static void assignGrades() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the course code
        System.out.print("Enter the course code: ");
        String courseCode = scanner.next();

        // Retrieve the course based on the course code
        Course course = getCourseByCode(courseCode);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        // Prompt the user to enter the student ID
        System.out.print("Enter the student ID: ");
        int studentID = scanner.nextInt();

        // Retrieve the student based on the student ID
        Student student = getStudentByID(studentID);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        // Prompt the user to enter the grade
        System.out.print("Enter the grade: ");
        int grade = scanner.nextInt();

        // Assign the grade to the student in the course
        assignGrade(student, course, grade);

        System.out.println("Grade assigned successfully.");
    }

    private static void calculateOverallGrades() {

    }

}
