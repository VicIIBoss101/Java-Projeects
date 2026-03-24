import java.util.Scanner;

public class Game {

    static Scanner input = new Scanner(System.in);
    static int playerPositon, computerPositon = 0;
    static int playerScore, computerScore = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.println("---- Snackes And Ladders ----");
            System.out.println("1. start the game (VS computer)");
            System.out.println("2. exit");
            System.out.print("Enter your choice: ");
            int select = input.nextInt();
            input.nextLine();
            switch (select) {
                case 1:
                    game();
                    break;
                case 2:
                    System.out.println("You closed the app");
                    return;
                default:
                    System.out.println("Wrong choice !");
                    break;
            }
        }
    }

    public static int dice() {
        return (int) (Math.random() * (6));
    }

    public static void game() {
        int playerPositon = 0;
        while (true) {
            int dice = (int) (Math.random() * 6) + 1;
            if (playerPositon > 100){
                playerPositon = playerPositon - dice;
            } else if ( playerPositon < 100) {
                System.out.println("dice : " + dice);
                playerPositon = playerPositon + dice;
                if (playerPositon > 100){
                    playerPositon = playerPositon - dice;
                } 
                System.out.println("you pos : " + playerPositon);
                //snackeTrap(playerPositon);
                playerPositon = snackeTrap(playerPositon);
                playerPositon = ladder(playerPositon);
            } else {
                System.out.println("you win");
                return;
            }
        }
    }

    public static int snackeTrap(int pPosition) {
        int [] trap = new int[101];
        trap[17] = 7;
        trap[54] = 34;
        trap[62] = 19;
        trap[64] = 60;
        trap[87] = 24;
        trap[93] = 73;
        trap[95] = 75;
        trap[98] = 79;
        if (trap[pPosition] != 0) {
            pPosition = trap[pPosition];
            System.out.println("oops the snacke ate you, your current position now: " + pPosition);
            return pPosition;
        } else {
            return pPosition;
        }
    }

    public static int ladder(int pos) {
        int [] ladder = new int[101];
        ladder[1] = 38;
        ladder[4] = 14;
        ladder[21] = 42;
        ladder[71] = 91;
        ladder[80] = 100;
        if (ladder[pos] != 0) {
            pos = ladder[pos];
            System.out.println("You reacher the ladder you pos now: " + pos);
            return pos;
        } else {
            return pos;
        }
    }
}
