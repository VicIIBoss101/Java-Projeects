package com.lesson2;

public class Circle {

    private double radius;
    private String color;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 3.14 * radius * radius;
        // or retrun Math.PI * radius * radius
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    public String toString () {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
}
