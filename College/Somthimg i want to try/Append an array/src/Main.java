import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter col value for array: ");
        int col = input.nextInt();
        System.out.print("Enter row value for A array: ");
        int rowA = input.nextInt();
        System.out.print("Enter row value for B array: ");
        int rowb = input.nextInt();
        int[][] a = new int[rowA][col];
        int[][] b = new int[rowb][col];
        fillArray(input, a, "A");
        fillArray(input, b, "B");
        printArray(a, "A");
        printArray(b, "B");
        int[][] c = appendArray(a, b);
        printArray(c, "C");
    }
    static void fillArray(Scanner input, int[][] array, String name) {
        int row = 1;
        for (int i = 0; i < array.length; i++) {
            int col = 1;
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(row + "-" + col + " Enter value for array " + name + ": ");
                array[i][j] = input.nextInt();
                col++;
            }
            row++;
        }
    }
    static int[][] appendArray(int[][] array1, int[][] array2) {
        int[][] appendedArray = new int[array1.length + array2.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < appendedArray[i].length; j++) {
                appendedArray[i][j] = array1[i][j];
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < appendedArray[i].length; j++) {
                appendedArray[array1.length + i][j] = array2[i][j];
            }
        }
        return appendedArray;
    }
    static void printArray(int[][] array, String name) {
        System.out.println("==========================" + "\n" + name);
        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
