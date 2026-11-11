package org.college_labs.fromSource.PatientExample;

import org.college_labs.At_lap5.Patient;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        patient1.name = "Ali";
        patient1.age = 20;
        patient1.temperature = 38.5;
        patient1.admitted = false;
        System.out.println("Before admission:");
        patient1.displayInformation();
        patient1.admit();
        System.out.println("\nAfter admission:");
        patient1.displayInformation();
        if (patient1.hasFever()) {
            System.out.println("The patient has a fever.");
        } else {
            System.out.println("The patient does not have a fever.");
        }
    }
}
