package org.college_labs.AtLab6.ConsChain1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Bike", 2);
        Vehicle vehicle3 = new Vehicle("Bike", 2, "Blue");
        vehicle1.displayInfo(); // Outputs: Vehicle Type: Car, Wheels: 4
        vehicle2.displayInfo(); // Outputs: Vehicle Type: Bike, Wheels: 2
        vehicle3.displayInfo(); // Outputs: Vehicle Type: Bike, Wheels: 2, Color: Blue
    }
}
