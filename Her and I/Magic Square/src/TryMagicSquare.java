import java.text.CollationElementIterator;
import java.util.Scanner;

public class TryMagicSquare {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number to generate a magic square for it : ");
        int number = input.nextInt();
        int row = 0;
        int col = number / 2;
        int[][] magicSquare = new int[number][number];
        for (int i = 1; i <= number * number; i++) {
            magicSquare[row][col] = i;
            System.out.print(magicSquare[row][col] + "  ");
            int nextRow = row - 1;
            int nextCol = col + 1;
            if (nextRow > magicSquare.length || nextRow < magicSquare.length) {
                row = magicSquare.length - 1;
            } else {
                row = nextRow;
            }
            if (nextCol > (magicSquare[0].length -1)) {
                col = magicSquare[0].length - 1;
            } else {
                col = nextCol;
            }


            System.out.println();
        }
        for (int[] i : magicSquare) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}