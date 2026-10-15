package org.collage_labs;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the terms of N: ");
        int n = input.nextInt();
        double s = 0;
        for(int i = 1 ; i <= n ; i++){
            s += (1)/ ((double) i);
        }
        System.out.printf("The value of S is : %.2f" , s);
    }
}