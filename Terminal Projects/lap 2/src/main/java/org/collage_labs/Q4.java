package org.collage_labs;
import  java.util.Scanner;
public class Q4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();
        System.out.print("Enter the value of n: ");
        int  n = input.nextInt();
        double sum = 0;
        for(int i = 1; i <= n ; i++){
            sum += (Math.pow(x, i));
        }
        System.out.println("The sum is " + sum);
    }
}
