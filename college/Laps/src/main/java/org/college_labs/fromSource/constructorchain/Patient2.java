package org.college_labs.fromSource.constructorchain;

public class Patient2 {
        String name;
        int age;
        // No-argument constructor
        Patient2() {
            this.name = "Unknown";
            this.age = 0;
        }
        // Constructor with one parameter
        Patient2(String name) {
            this.name = name;
            this.age = 0;
        }
        // Constructor with two parameters
        Patient2(String name, int age) {
            this.name = name;
            this.age = age;
        }
        // Copy constructor
        Patient2(Patient2 other) {
            this.name = other.name;
            this.age = other.age;
        }
        void displayInformation() {
            System.out.println( "Name: " + name + ", Age: "
                    + age );
        }
}
