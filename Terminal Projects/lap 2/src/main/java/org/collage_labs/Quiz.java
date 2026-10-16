package org.collage_labs;
import java.util.Scanner;
public class Quiz {
    public static void main (String [] args){
        System.out.print("Enter row then col: ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ;j++){
                System.out.print((i+1) +" - " + (j+1) + " Enter value: ");
                arr[i][j] = input.nextInt();
            }
        }
        for(int [] rows : arr){
            for(int value : rows){
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        for (int j = 0; j < arr[0].length ; j++) {
            int sum =  0 , colMax = 0 , colMin = arr[j][0];
            for(int i = 0 ; i < arr.length; i++){
                sum += arr[i][j];
                if(colMax <arr[i][j])
                    colMax = arr[i][j];
                if(colMin > arr[i][j])
                    colMin = arr[i][j];
            }

            System.out.println("the col " + j + " the sum " + sum + "\nthe max " + colMax + "\nthe min is " + colMin);
        }

    }
}
