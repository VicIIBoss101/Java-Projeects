package org.college_labs.fromSource.Constructors;

public class Main {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(); // Using default constructor
        MyPoint point2 = new MyPoint(3.0, 4.0); // Using parameterized constructor
        System.out.println("Point 1: " + point1); // Output: Point 1: (0.0, 0.0)
        System.out.println("Point 2: " + point2); // Output: Point 2: (3.0, 4.0)
    }
}
