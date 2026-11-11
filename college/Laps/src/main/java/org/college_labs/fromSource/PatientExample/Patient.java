package org.college_labs.fromSource.PatientExample;

class Patient {
    // State
    String name;
    int age;
    double temperature;
    boolean admitted;
    // Displays the object's state
    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        System.out.println("Admission status: " +
                (admitted ? "Admitted" : "Not admitted") );
    }
    void admit() {
        admitted = true;
    }
    boolean hasFever() {
        return temperature >= 38.0;
    }
}
