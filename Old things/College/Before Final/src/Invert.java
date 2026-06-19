import java.util.Scanner;

public class Invert {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array rows and columns: ");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] array = new int[row][col];
        fillArray(array, input);
        printArray(array);
        inverArray(array);

    }

    static void fillArray(int[][] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((i + 1) + "-" + (j + 1) + " Enter value:");
                array[i][j] = input.nextInt();
            }
        }
    }

    static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    static void inverArray(int[][] array) {
        int invertedarray[][] = new int[array[0].length][array.length];
        for (int i = 0 ; i < invertedarray.length ; i++){
            for ( int j = 0 ; j < invertedarray[i].length; j++){
                invertedarray[i][j] = array[j][i];
            }
        }
        System.out.println("==================");
        printArray(invertedarray);
    }
}