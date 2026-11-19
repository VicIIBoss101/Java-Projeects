package org.college_labs.AtLab6.SameClassChain;

public class Employee {
    // Default constructor
    Employee() {
// Constructor Chaining Within the Same Class
        this(2023);
        System.out.println("In Default Constructor Of Employee Class");
    }

    // Parameterized constructor with Integer Parameter
    Employee(int employeeId) {
// Constructor Chaining Within the Same Class
        this("Ali");
        System.out.println("In Parameterized Constructor with Integer Parameter: " + employeeId);
    }

    // Parameterized constructor with String Parameter
    Employee(String employeeName) {
        System.out.println("In Parameterized constructor With String Parameter: " + employeeName);
    }
}
