package org.college_labs.AtLab6.Car;

public class Main {
    public static void main (String[] args){
        Car car1 = new Car();
        car1.display();
        Car car2 = new Car("Toyota" , 2021);
        System.out.println();
        car2.display();
    }
}
