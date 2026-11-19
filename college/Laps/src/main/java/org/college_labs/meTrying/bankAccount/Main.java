package org.college_labs.meTrying.bankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount acc1 = null;
        while (true) {
            System.out.println("=".repeat(5) + " Basrah-Bank" + "=".repeat(5));
            System.out.println("1. Add Account" + "\n2. Activate Account " + "\n3. deposit " + "\n4. Withdraw" + "\n5. Display Info" + "\n6. exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    acc1 = addAccount(input);
                    break;
                case 2:
                    if (checkEmpty(acc1))
                        acc1.activate();
                    break;
                case 3:
                    if (checkEmpty(acc1))
                        System.out.print("Enter the amount: ");
                    double amount = input.nextDouble();
                    acc1.deposit(amount);
                    break;
                case 4:
                    if (checkEmpty(acc1))
                        System.out.print("Enter the amount: ");
                    double amountWithDraw = input.nextDouble();
                    acc1.withdraw(amountWithDraw);
                    break;
                case 5:
                    if (checkEmpty(acc1))
                        acc1.displayInfo();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Your Entered Wrong Number!!");
                    break;
            }
        }


    }

    static BankAccount addAccount(Scanner input) {
        System.out.print("Enter Customer name: ");
        String name = input.nextLine();
        System.out.print("Enter Account Number: ");
        int accNum = input.nextInt();
        BankAccount acc1 = new BankAccount(name, accNum);
        return acc1;
    }

    static boolean checkEmpty(BankAccount acc) {
        if (acc == null) {
            System.out.println("There is no account entered!! ");
            return false;
        } else return true;
    }
    
}

