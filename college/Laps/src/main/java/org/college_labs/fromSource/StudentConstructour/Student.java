package org.college_labs.fromSource.StudentConstructour;

public class Student {
    String name;
    int age;

    // No-argument constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor with one parameter
    public Student(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    // Parameterized constructor with two parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
