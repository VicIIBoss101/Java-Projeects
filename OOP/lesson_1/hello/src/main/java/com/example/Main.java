package com.example;

public class Main {
    public static void main(String[] args) {
        Car obj;
        // حجزنا مكان في الذاكرة من خلال new
        obj = new Car();
         //obj.name = "toyota";
         //obj.maxSpeed = 120;
        // اعطينا قيم للكائن اوبجيكت
        // System.out.println(obj.name);
        // نقدر نعطي و نطبع القيم من خلال الدوال
        obj.setName("tesla");
        System.out.println(obj.getName());

    }
}