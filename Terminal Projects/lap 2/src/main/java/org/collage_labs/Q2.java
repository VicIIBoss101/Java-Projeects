package org.collage_labs;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vale of n ");
        int n = input.nextInt();
        int sum = 0 ;
        for(int i = 1;  i <= n ; i++){
            sum += (2* i -1) ;
        }
        System.out.println("S = " + sum );
    }
}
