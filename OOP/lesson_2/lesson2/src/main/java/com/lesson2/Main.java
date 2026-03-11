package com.lesson2;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(), c2 = new Circle();
        c1.setRadius(3.0);
        c1.setColor("Black");
        c2.setColor("White");
        c2.setRadius(4);
        //
        System.out.println(c1.toString());
        System.out.println("area = " + c1.getArea());
        System.out.println("Circumference = " + c1.getCircumference());
        System.out.println("==============");
        //
        System.out.println(c2.toString());
        System.out.println("area = " + c2.getArea());
        System.out.println("Circumference = " + c2.getCircumference());

    }
}