package org.college_labs.At_Laps.lap3;
import java.util.Scanner;
public class Q1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows then columns: ");
        int row = input.nextInt();
        int col = input.nextInt();
        int [][] arr = new int[row][col];

        for (int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print("Enter value for " + (i + 1) + " - " + (j + 1) + ": ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("=".repeat(5));
        for(int [] rowR: arr){
            for(int colR: rowR){
                System.out.print(colR + "\t");
            }
            System.out.println();
        }

        int hSum = 0;
        for (int j = 0; j < arr[0].length ; j++) {
            int sum =  0 , colMax = 0 , colMin = arr[0][0];
            for(int i = 0 ; i < arr.length; i++){
                sum += arr[i][j];
                if(hSum < sum){
                    hSum = sum;
                }
//                if(colMax <arr[i][j])
//                    colMax = arr[i][j];
//                if(colMin > arr[i][j])
//                    colMin = arr[i][j];
            }
            System.out.println("=".repeat(5));
            System.out.println("the col " + (j + 1 ) + " the sum " + sum);
            System.out.println("=".repeat(5));
        }
        System.out.println("The Max Sum is: " + hSum);
    }
}
