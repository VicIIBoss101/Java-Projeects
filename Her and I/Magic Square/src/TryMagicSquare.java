import java.util.Scanner;

public class TryMagicSquare {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number to generate a magic square for it : ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number must be an odd number!");
            return;
        }
        int row = 0;
        int col = number / 2;
        int[][] magicSquare = new int[number][number];
        for (int i = 1; i <= number * number; i++) {
            magicSquare[row][col] = i;
            int currentRow = row, currentCol = col;
            int nextRow = row - 1;
            int nextCol = col + 1;

            if (nextRow < 0 || nextRow > magicSquare.length) {
                row = magicSquare.length - 1;
            } else {
                row = nextRow;
            }
            if (nextCol > (magicSquare[0].length - 1)) {
                col = nextCol - (magicSquare[0].length);
            } else {
                col = nextCol;
            }
            if (magicSquare[row][col] != 0) {
                row = currentRow + 1;
                col = currentCol;
            }
        }
        for (int[] k : magicSquare) {
            for (int j : k) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}