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
    static void arrayMulti(int[][] array1 , int [][] array2){
        
    }
}
