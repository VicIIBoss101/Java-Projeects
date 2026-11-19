package org.college_labs.AtLab6.ConsOverLoad;

public class Main {
    public static void main(String[] args) {
// Calls the no-argument constructor
        Patient p1 = new Patient();
// Calls the constructor with one parameter
        Patient p2 = new Patient("Ali");
// Calls the constructor with two parameters
        Patient p3 = new Patient("Sara", 25);
// Calls the copy constructor
        Patient p4 = new Patient(p3);
        System.out.print("p1: ");
        p1.displayInformation();
        System.out.print("p2: ");
        p2.displayInformation();
        System.out.print("p3: ");
        p3.displayInformation();
        System.out.print("p4: ");
        p4.displayInformation();
    }
}
