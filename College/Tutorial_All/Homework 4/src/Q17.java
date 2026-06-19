import java.util.Scanner;

public class Q17 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of experiments: ");
        int n = input.nextInt();
        int exp[][] = new int[n][6];
        fullArray(exp, input);
        compute(exp);

    }

    static void fullArray(int[][] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("exp " + (i + 1) + " result " + (j + 1) + "\n" + "enter a vaule: ");
                array[i][j] = input.nextInt();
            }
        }
    }

    static void compute(int[][] array) {
        double sum;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("The avg of exp " + (i + 1) + " " + (sum / 6));
        }
    }

}
