package org.college_labs.AtLab6.ConsChain1;

public class Vehicle {
    String type;
    int wheels;
    String color; // New data member

    public Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
//System.out.println(“Two Values Constructor”);
    }

    public Vehicle() {
        this("Car", 4); //default constructor by chaining
    }

    //New data members are added through a chaining process.
    public Vehicle(String type, int wheels, String color) {
        this(type, wheels); //chaining
        this.color = color;
//System.out.println(“Three Values Constructor”);
    }

    void displayInfo() {
        System.out.println("Vehicle Type: " + type + ", Wheels: " + wheels + ", Color: " + color);
    }
}
