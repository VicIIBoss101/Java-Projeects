package com.oop_030;

import java.util.Scanner;

public class Car {
    static Scanner input = new Scanner(System.in);
    private String name;
    private float price;
    private int model;

    void setName(String n) {
        name = n;
    }

    void setPrice(float p) {
        price = p;
    }

    void setModel(int m) {
        while(m < 2015){
            System.out.println("we olny except newer models!");
            System.out.print(": ");
            m = input.nextInt();
        }
        model = m;
    }

    String getName() {
        return name;
    }

    float getPrice() {
        return price;
    }

    int getModle() {
        return model;
    }
}
