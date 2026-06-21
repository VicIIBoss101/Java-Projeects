package com.oop_030;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.print("Enter car name, price, model: ");
        c1.setName(input.nextLine());
        c1.setPrice(input.nextFloat());
        c1.setModel(input.nextInt());
        System.out.printf("%n%s%s%n%s%,.2f%n%s%d" , "The car: " , c1.getName() , "price: " , c1.getPrice(), "Model: " , c1.getModle());
    }
}