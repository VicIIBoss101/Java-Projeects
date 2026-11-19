package org.college_labs.AtLab6.PatientWithchain;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient("Ali");
        Patient p3 = new Patient("Sara", 25);
        Patient p4 = new Patient(p3);
        p1.displayInformation();
        p2.displayInformation();
        p3.displayInformation();
        p4.displayInformation();
    }
}
