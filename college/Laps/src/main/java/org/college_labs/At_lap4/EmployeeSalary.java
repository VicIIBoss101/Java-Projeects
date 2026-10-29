package org.college_labs.At_lap4;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TRANSPORT = 500;
        // read employee info
        System.out.print("Enter Employee name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter Employee Age: ");
        int employeeAge = input.nextInt();
        System.out.print("Enter Employee Basic Salary: ");
        double basicSalary = input.nextDouble();
        System.out.print("Enter Employee Bonus: ");
        double bonus = input.nextDouble();
        // Calculate total salary
        double totalSalary = basicSalary + bonus + TRANSPORT;
        /*
        here we print a formated text to show the info
        * */
        System.out.println("\n" + employeeName + " is a " + employeeAge + " years old");
        System.out.println("Total Salary = " + totalSalary);

    }
}
