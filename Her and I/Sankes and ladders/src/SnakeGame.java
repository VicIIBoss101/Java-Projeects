import java.util.Scanner;

public class SnakeGame {
    static Scanner input = new Scanner(System.in);
    public static int playerPos = 0;

    public static void main(String[] args) {
        while (true) {
            //
            System.out.println("---- Snakes and ladders ----");
            System.out.println("1. single player");
            System.out.println("2. play Vs your friend (up to 4 players )");
            System.out.println("3. exit");
            //
            System.out.print("Enter your choice: ");
            int menuChoice = input.nextInt();
            input.nextLine();
            //
            switch (menuChoice) {
                case 1:
                    singlePlayer();
                    break;
                case 2:
                    multiPlayer();
                    break;
                case 3:
                    System.out.println("You closed the app");
                    return;
                default:
                    System.out.println("wrong choice !");
                    break;
            }
        }
    }

    static void singlePlayer() {
        System.out.println("You enterd the single player mode");
        Player player1 = new Player("user");
        while (true) {
            if (player1.getPosition() == 100) {
                System.out.println("you winnn ! ");
                return;
            }
            System.out.print("\nPress enter to roll the dice");
            input.nextLine();
            int dice = player1.rollDice();
            System.out.println("You rolled the dice and got: " + dice);
            player1.move(dice);
            System.out.println("You current postion: " + player1.getPosition());
            player1.checkPositon();
        }
    }

    static void multiPlayer() {
        System.out.print("How many players will be playing: ");
        int numberOfPlayers = input.nextInt();
        input.nextLine();
        Player[] players = new Player[numberOfPlayers];
        // store the names
        for (int i = 0; i < players.length; i++) {
            System.out.print("name of player number " + (i + 1) + ". : ");
            String playerName = input.nextLine();
            players[i] = new Player(playerName);
        }
        while (true) {
            for (int i = 0; i < players.length; i++) {
                if (players[i].getPosition() == 100) {
                    System.out.println(players[i].getName() + " winnn !");
                    return;
                }
                System.out.println("\nNow its " + players[i].getName() + " turn ");
                System.out.println("\nPress enter to roll the dice");
                input.nextLine();
                int dice = players[i].rollDice();
                System.out.println("you've got: " + dice);
                players[i].move(dice);
                System.out.println("Your current position: " + players[i].getPosition());
                players[i].checkPositon();
            }
        }
    }

    static int snakeTrap(int pos) {
        int[] trap = new int[101];
        trap[17] = 7;
        trap[54] = 34;
        trap[62] = 19;
        trap[64] = 60;
        trap[87] = 24;
        trap[93] = 73;
        trap[95] = 75;
        trap[98] = 79;
        // now let's check
        if (trap[pos] != 0) {
            System.out.println("oops ! the snakc ate you :(");
            pos = trap[pos];
            System.out.println("your current postion now is : " + pos);
            return pos;
        } else {
            return pos;
        }
    }

    static int ladderReach(int pos) {
        int[] ladder = new int[101];
        ladder[1] = 38;
        ladder[4] = 14;
        ladder[21] = 42;
        ladder[71] = 91;
        ladder[80] = 100;
        // now let's check
        if (ladder[pos] != 0) {
            System.out.println("you've reached the ladder :o");
            pos = ladder[pos];
            System.out.println("Your current postion is : " + pos);
            return pos;
        } else {
            return pos;
        }
    }
}
