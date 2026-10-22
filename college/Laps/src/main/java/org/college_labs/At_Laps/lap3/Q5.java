package org.college_labs.At_Laps.lap3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for rows: ");
        int rows = input.nextInt();
        System.out.print("Enter value for columns : ");
        int cols = input.nextInt();
        int[][] arr = readArr(input, rows, cols);
        printArr(arr);

        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0)
                    evenSum += arr[i][j];
            }
        }
        System.out.println("Even sum = " + evenSum);
    }

    static void printArr(int[][] arr) {
        System.out.println("=".repeat(5) + " The Even Numbers " + "=".repeat(5));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0)
                    System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] readArr(Scanner input, int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter value for " + (i + 1) + " - " + (j + 1) + ": ");
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}