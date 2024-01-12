package com.uopeople;

public class Employee {

    private String name;

    private int age;
    private String department;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    public Employee(String name, int age, String department, double salary){
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    /*
The Employee class represents an individual in a company, with details such as name, age, department, and salary.
    The employee class creates the employee object with name, age , department and salary
    It also includes getters and setters for the fields and also a constructor
     */


}
