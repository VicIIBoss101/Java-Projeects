package MeTryingAgain;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("=".repeat(5) + " Mini Java Projects " + "=".repeat(5));
                System.out.println("1.try arrays addition\n2.try to find array max and min number\n3.exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        int[][] arr1 = makeArr(input, "array1");
                        int[][] arr2 = makeArr(input, "array2");
                        System.out.print("Do you want to print those arrays? Y|N: ");
                        String decide = input.next();
                        if (decide.equalsIgnoreCase("y")) {
                            printArrays("Array 1", arr1);
                            printArrays("Array 2", arr2);
                        } else if (decide.equalsIgnoreCase("n")) {
                        } else {
                            System.out.println("Wrong choice entered!!");
                        }
                        arraysAddition(arr1, arr2);
                        break;
                    case 2:
                        int [][] arr = makeArr(input, "array");
                        printArrays("array", arr);
                        maxAndMinNumber(arr);
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Wrong number entered!!");
                        break;
                }
            }
        }
    }
    static void printMenu(String menuName , String [] menu){

    }
    static int[][] makeArr(Scanner input ,String arrName){
        System.out.print("Enter the rows then col of the "+ arrName + " : ");
        int rowArr1 = input.nextInt();
        int colArr1 = input.nextInt();
        return fullArrays(rowArr1, colArr1, input);
    }
    static int[][] fullArrays(int row, int col, Scanner input) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print((1 + i) + "-" + (j + 1) + " Enter value: ");
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    static void printArrays(String arrName, int[][] arr) {
        if ((arr == null) || (arr.length == 0))
            System.out.println("The Array Is Empty!!");
        else {
            System.out.println("=".repeat(3) + " " + arrName + " " + "=".repeat(3));
            for (int[] i : arr) {
                for (int j : i) {
                    System.out.print(j + "\t");
                }
                System.out.println();
            }
        }
    }

    static void arraysAddition(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            System.out.println("The addition can't happen !!");
        } else {
            int[][] arrSum = new int[arr1.length][arr1[0].length];
            for (int i = 0; i < arrSum.length; i++) {
                for (int j = 0; j < arrSum[i].length; j++) {
                    System.out.println(arr1[i][j] + " + " + arr2[i][j] + " = " + (arrSum[i][j] = arr1[i][j] + arr2[i][j]));
                }
            }
            printArrays("The Sum Array", arrSum);
        }
    }

    static void maxAndMinNumber(int[][] arr) {
        int max = 0, min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j])
                    max = arr[i][j];
                if (min > arr[i][j])
                    min = arr[i][j];
            }
        }
        System.out.println("The max " + max + "\nThe min is " + min);
    }
}