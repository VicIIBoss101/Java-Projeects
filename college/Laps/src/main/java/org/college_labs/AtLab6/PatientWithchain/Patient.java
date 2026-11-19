package org.college_labs.AtLab6.PatientWithchain;

class Patient {
    String name;
    int age;

    Patient() {
        this("Unknown", 0);
    }

    Patient(String name) {
        this(name, 0);
    }

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Patient(Patient other) {
        this(other.name, other.age);
    }

    void displayInformation() {
        System.out.println(
                "Name: " + name + ", Age: " +
                        age);
    }
}
