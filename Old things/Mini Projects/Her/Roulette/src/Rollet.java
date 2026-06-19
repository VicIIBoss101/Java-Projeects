
import java.util.Scanner;

public class Rollet {
    static int players[] = new int[3];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        playGame();

    }

    static int spinRollet() {
        return (int) (Math.random() * 37);
    }

    static void playGame() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Press Enter for player " + (i + 1) + "  to spin");
            input.nextLine();
            players[i] = spinRollet();
            System.out.println("Player " + (i + 1) + " rolled : " + players[i]);
            if (players[i] == 0) {
                System.out.println("Player " + (i + 1) + " got 0 and loses!!!!!!!!!!!!!!!!!!!!!!!!!");
            } else if (players[i] % 2 == 0 && players[i] != 0) {
                players[i] *= 2;
                System.out.println("Player " + (i + 1) + " got even number , doubled to " + players[i]);
            } else {
                System.out.println("Player " + (i + 1) + " got odd number , stays " + players[i]);
            }
        }
        int max = players[0];
        int winner = 0;
        for (int i = 1; i < players.length; i++) {
            if (players[i] > max) {
                max = players[i];
                winner = i;
            }
        }
        System.out.println("Player " + (winner + 1) + "wins with score : " + max);
    }

}