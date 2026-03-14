import java.util.Scanner;

public class SnakeGame {
    static Scanner input = new Scanner(System.in);
    static int playerPos = 0;

    public static void main(String[] args) {
        while (true) {
            //
            System.out.println("---- Snakes and ladders ----");
            System.out.println("1. play Vs computer");
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
                    break;
                case 3:
                    System.out.println("You closed the app");
                    return ;

                default:
                    System.out.println("wrong choice !");
                    break;
            }
        }
    }

    static void singlePlayer() {
        playerPos = 0;
        System.out.println("You enterd the single player mode");
        while (true) {
            //
            int dice = (int) (Math.random() * 6) + 1;
            if (playerPos == 100) {
                System.out.println("You winnn !! ");
                return;
                //
            } else if (playerPos < 100) {
                System.out.println("press enter to roll the dice\n : ");
                input.nextLine();
                playerPos += dice;
                System.out.println("you've got " + dice);
                System.out.println("Your current postion is : " + playerPos);
                //
            } 
            if (playerPos > 100) {
                System.out.println("you have reahced over 100 try again");
                playerPos -= dice;
                continue;
            }
            // check the player if he reached trap or ladder
            playerPos = snakeTrap(playerPos);
            playerPos = ladderReach(playerPos);
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
