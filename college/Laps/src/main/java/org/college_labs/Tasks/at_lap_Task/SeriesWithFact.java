package org.college_labs.Tasks.at_lap_Task;

import java.util.Scanner;

public class SeriesWithFact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms (N) : ");
        int n = input.nextInt();

        double s = 0;
        for (int i = 1; i <= n; i++) {
            double term;
            if (i % 2 != 0) {
                term = 1.0 / fact(2 * i - 1);
            } else {
                term = -1.0 / fact(2 * i - 1);
            }

            s += term;
        }
        System.out.println("S = " + s);
    }

    static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
