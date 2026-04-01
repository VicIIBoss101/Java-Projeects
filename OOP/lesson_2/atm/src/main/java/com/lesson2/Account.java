package com.lesson2;

public class Account {

    private int accountNo;
    private String name;
    private float amount;

    public void insert(int accountNo, String name, float amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }

    public void deposit(float amount) {
        System.out.println("You have deposit: " + amount + "$");
        this.amount = this.amount + amount;
        System.out.println("You balance now: " + this.amount + "$");
    }

    public void withdraw(float amount) {
        if (amount > this.amount) {
            System.out.println("You don't have that amount in your account");
        } else {
            System.out.println("You withdraw: " + amount + "$");
            this.amount = this.amount - amount;
            System.out.println("You balance now: " + this.amount + "$");
        }
    }

    public void checkBalance() {
        System.out.println("You balance: " + this.amount);
    }

    public String toString() {
        return "AccountNO " + accountNo + ", Name: " + name + ", amount: " + amount;
    }

}
