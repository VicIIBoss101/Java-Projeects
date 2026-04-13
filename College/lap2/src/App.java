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

        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(count + " Enter value for a: ");
                a[i][j] = input.nextInt();
                count++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            int count = 1;
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(count + " Enter value for b: ");
                b[i][j] = input.nextInt();
                count++;
            }
        }

        System.out.println("===============================" + "\n" + "A array");
        for (int[] w : a) {
            for (int j : w) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("===============================" + "\n" + "b array");
        for (int[] q : b) {
            for (int j : q) {
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
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
