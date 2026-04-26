import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array colunm: ");
        int col = input.nextInt();
        System.out.print("Enter rows for array A: ");
        int rowsA = input.nextInt();
        System.out.print("Etner rows for array B: ");
        int rowsB = input.nextInt();

    }

    static void printArrya(int array[][]) {
        for (int[] rows : array) {
            for (int var : rows) {
                System.out.print(var + "\t");
            }
            System.out.println();
        }
    }

    static void fullArray(int array[][], Scanner input) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((i + 1) + "-" + (j + 1) + " Enter vaule : ");
                array[i][j] = input.nextInt();
            }
        }
    }
}
