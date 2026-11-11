package org.college_labs.fromSource.Constructors;

public class MyPoint {
    // Data members
    private double x;
    private double y;
    // No-argument constructor
    public MyPoint() {
        this.x = 0.0; // Initialize x to 0.0
        this.y = 0.0; // Initialize y to 0.0
    }
    // Parameterized constructor
    public MyPoint(double x, double y) {
        this.x = x; // Set x to the provided value
        this.y = y; // Set y to the provided value
    }
    // Getter for x and y
    public double getX() { return x; }
    public double getY() { return y; }
    // toString method to represent the point as a string
    public String toString() { return "(" + x + ", " + y + ")";}
}
