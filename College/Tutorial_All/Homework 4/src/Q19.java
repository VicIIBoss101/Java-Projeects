import java.util.Scanner;

public class Q19 {
    static Scanner input = new Scanner(System.in);

    static void fullArray(int[][] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Player " + (i + 1) + " Game " + (j + 1) + "\n" + "enter a vaule: ");
                array[i][j] = input.nextInt();
            }
        }
    }
    static void playerResult(int[][] array) {
        double sum;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("The avg of bowler " + (i + 1) + " " + (sum / 3));
        }
    }
        public static void main(String[] args) {
        System.out.print("Enter the number of players: ");
        int n = input.nextInt();
        int players[][] = new int[n][3];
        fullArray(players, input);
        playerResult(players);

    }
}
