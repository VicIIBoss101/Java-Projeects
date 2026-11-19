package org.college_labs.AtLab6.Car;

public class Car {
    private String model;
    private int year;

    public Car() {
        this.model = "Unknown Model";
        this.year = 0;
    }

    public Car(String model1, int year1) {
        model = model1;
        year = year1;
    }

    public void display() {
        System.out.println("model: " + model + " , Year: " + year);
    }
}
