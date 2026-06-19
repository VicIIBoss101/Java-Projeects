package com.lesson2;

public class Main {

    public static void main(String[] args) {

        Account a1 = new Account(), a2 = new Account();
        a1.insert(4, "belal", 5300);
        a2.insert(77, "zain", 300);

        System.out.println(a1.toString());
        a1.checkBalance();
        a1.withdraw(300);
        a1.deposit(800);
        System.out.println("=============");
        System.out.println(a2.toString());
        a2.checkBalance();
        a2.withdraw(500);
        a2.deposit(100);
        a2.checkBalance();
    }
}
