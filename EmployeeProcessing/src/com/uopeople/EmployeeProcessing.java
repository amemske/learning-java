package com.uopeople;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeProcessing {

    public static void main(String[] args){
        //Read the data and store it in a collection
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Antony", 40, "IT", 90000));
        employees.add(new Employee("Jane", 24, "Marketing", 60000));
        employees.add(new Employee("Andrew", 45, "Management", 108000));
        employees.add(new Employee("Peter", 30, "Customer care", 75000));

        //Write a function using Functional interface
        Function<Employee, String> concatNameAndDepartment = employee -> "Name: " + employee.getName() + " Department: " + employee.getDepartment();

        //Use streams to generate a new collection of concatenated strings
        List<String> concetenatedList = employees.stream().map(concatNameAndDepartment).collect(Collectors.toList());

        //Average salary of all the employees
        double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);

        //Filter employees above a certain age
        int ageThreshhold = 28;
        List<String> filteredList = employees.stream().filter(employee -> employee.getAge() > ageThreshhold)
        .map(concatNameAndDepartment).collect(Collectors.toList());


        //print the results
        System.out.println("Concatenated List: " + concetenatedList);
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Filtered List: " + filteredList );

    }

}

/*
We start by reading the data and adding it into an ArrayList as the collection to store the employee data.
We create a list called employees to store instances of the Employee class. Four employee objects are created and added to the list, each with different values for name, age, department, and salary.
,
Next, we define a function (concatNameAndDepartment ). Using the Function interface represents a function that takes an argument of one type ( Employee) and returns a result of another type (String).
Next, we use  the Java Stream API to transform the employees list. It applies the concatNameAndDepartment function to each Employee object in the list, generating a new collection of concatenated strings. The resulting strings are collected into a new list called concatenatedList.
Next, we calculate the average salary of all employees. Using the Stream API to map each Employee object to its salary, converts the salaries to doubles, calculates the average, and stores the result in the averageSalary variable. If the list is empty, the orElse method sets the default value to 0.
Finally, we filter the employees list based on a certain age threshold. We use the Stream API to filter the list, keeping only the employees whose age is greater than the ageThreshold value. Then it maps the filtered employees to their concatenated name and department strings using the concatNameAndDepartment function. The resulting strings are collected into a new list called filteredList.

 */
