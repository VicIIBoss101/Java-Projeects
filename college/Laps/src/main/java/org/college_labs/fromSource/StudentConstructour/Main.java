package org.college_labs.fromSource.StudentConstructour;

public class Main {
    public static void main(String[] args) {
// Creating objects using different constructors
        Student student1 = new Student(); // Calls No-argument constructor
        Student student2 = new Student("Ali"); // Calls constructor with one parameter
        Student student3 = new Student("Mona", 20); // Calls constructor with two parameters
// Displaying student details
        student1.display(); // Name: Unknown, Age: 0
        student2.display(); // Name: Ali, Age: 0
        student3.display(); // Name: Mona, Age: 20
    }
}
