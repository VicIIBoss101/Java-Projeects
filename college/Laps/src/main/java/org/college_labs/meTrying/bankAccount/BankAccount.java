package org.college_labs.meTrying.bankAccount;

public class BankAccount {
    String customerName;
    protected int customerNumber;
    double balance;
    boolean status;
    public static String bankName;

    public BankAccount(String name, int accNumber) {
        this.customerName = name;
        this.customerNumber = accNumber;
        status = false;
        balance = 0.0d;
        bankName = "Basrah-Bank";
    }

    void displayInfo() {
        System.out.println("=".repeat(5) + " Customer Info " + "=".repeat(5));
        System.out.println("Customer: " + customerName + "\nAccount Number: " + customerNumber + "\nStatus: " + (status ? "Activated" : " not activated") + (status ? "\nBalance " + balance : ""));
    }

    void activate() {
        System.out.println("Your Account Has Activated!!");
        status = true;
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("The deposit done!!\nYou Have Deposit  " + amount + "$" + "\nYour Balance: " + balance);
        }else
            System.out.println("Please Enter positive number!!");
    }
    void withdraw(double amount) {
        if (!(amount >= balance) && amount > 0){
            this.balance -= amount;
            System.out.println("You have withdraw: " + amount +"\nYour balance: " + balance);
        }else {
            System.out.println("invalid number entered!!");
        }
    }
}
