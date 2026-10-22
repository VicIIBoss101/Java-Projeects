package org.college_labs.At_Laps.lap3;
import java.util.Scanner;
public class Q2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for N then X: ");
        int n = input.nextInt();
        int x = input.nextInt();
        int s = 0;
        for(int i = 1 ; i <= n ; i++){
            s += x;
        }
        System.out.println("S = " + s);
    }
}