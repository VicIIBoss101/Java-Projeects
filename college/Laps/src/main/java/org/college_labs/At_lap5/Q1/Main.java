package org.college_labs.At_lap5.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restan orderOne = new Restan();
        final double Price = 50.0d;
        final double DeliveryPrice = 5.5d;

        while (true){
            System.out.println("=".repeat(5) + " Java Restaurant "+  "=".repeat(5));
            System.out.print("Enter numbers of meals: ");
            int meals = input.nextInt();
            input.nextLine();
            System.out.print("Are you student? Y/N: ");
            String checkStud = input.nextLine();
            System.out.print("Do you to delivery? Y/N: ");
            char checkDlvr = input.nextLine().charAt(0);

            if (checkStud.equalsIgnoreCase("y")) {
                double total = orderOne.setOrder(meals, Price, true);
                System.out.println("The total is: " + total);
            } else if (checkDlvr == 'y') {
                double total = orderOne.setOrder(meals, Price, DeliveryPrice);
                System.out.println("The total : " + total);
            } else {
                double total = orderOne.setOrder(meals, Price);
                System.out.println("The total " + total);
            }
            System.out.print("Set Another Order? Y/N: ");
            char checkState = input.nextLine().charAt(0);
            if(checkState  == 'n')
                return;
        }
    }
}
