import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter col: ");
        int m = input.nextInt();
        System.out.print("Enter rows for A array: ");
        int n = input.nextInt();
        System.out.print("Enter row for B array: ");
        int r = input.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[r][m];
        int[][] c = new int[n + r][m];
        int row = 1;
        for (int i = 0; i < a.length; i++) {
            int col = 1;
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("row - col " + row + "-" + col + " Enter value for a: ");
                a[i][j] = input.nextInt();
                col++;
            }
            row++;
        }
        row = 1;
        for (int i = 0; i < b.length; i++) {
            int col = 1;
            for (int j = 0; j < b[i].length; j++) {
                System.out.print("row - col " + row + "-" + col + " Enter value for b: ");
                b[i][j] = input.nextInt();
                col++;
            }
            row++;
        }

        System.out.println("===============================" + "\n" + "A array");
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("===============================" + "\n" + "b array");
        for (int[] i : b) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < m; j++) {
                c[n + i][j] = b[i][j];
            }
        }

        System.out.println("===============================" + "\n" + "c array");
        for (int[] i : c) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
