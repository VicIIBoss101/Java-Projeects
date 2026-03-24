import java.util.Scanner;

public class MagicSquare {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number to generate a magic square: ");
        int n = input.nextInt();
        int[][] magic = new int[n][n];
        int row = 0;
        int col = n / 2;
        for (int i = 1; i <= n * n; i++) {
            magic[row][col] = i;
            int nextRow = (row - 1 +n) %n ;
            int nextCol = (col + 1) %n;
            if (magic[nextRow][nextCol] != 0) {
                row = (row + 1);
            } else {
                row = nextRow;
                col = nextCol;
            }
        }
        for (int[] r : magic) {
            for (int c : r) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}