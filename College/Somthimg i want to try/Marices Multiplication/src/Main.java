import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter rows for Martix A: ");
        int rowA = input.nextInt();
        System.out.print("Enter columns for Martix A: ");
        int colA = input.nextInt();
        System.out.print("Enter rows for Martix B: ");
        int rowB = input.nextInt();
        System.out.print("Enter columns for Martix B: ");
        int colB = input.nextInt();
        int[][] a = new int[rowA][colA];
        int[][] b = new int[rowB][colB];
        fillArray(a, "A", input);
        fillArray(b, "B", input);
        printArray(a, "A");
        printArray(b, "B");
        arrayMulti(a, b);

    }

    static void printArray(int array[][], String name) {
        System.out.println(name);
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    static void fillArray(int[][] array, String name, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((i + 1) + "-" + (j + 1) + " Enter value for Martix " + name + ": ");
                array[i][j] = input.nextInt();
            }
        }
    }

    static void arrayMulti(int[][] array1, int[][] array2) {
        if (array1[0].length == array2.length) {
            int[][] multiArray = new int[array1.length][array2[0].length];
            for (int i = 0; i < multiArray.length; i++) {
                for (int j = 0; j < multiArray[i].length; j++) {
                    multiArray[i][j] = 0;
                    for (int k = 0; k < array1[0].length; k++) {
                        multiArray[i][j] += (array1[i][k] * array2[k][j]);
                    }
                }
            }
            printArray(multiArray, "multiplication");
        } else {
            System.out.println("The columns of array1 must equa to rows for array2 !");
        }
    }
}
