package org.college_labs.AtLab6.ConsOverLoad;

class Patient {
    String name;
    int age;

    // No-argument constructor
    Patient() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    Patient(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Patient(Patient other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void displayInformation() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
