import java.util.Scanner;
public class RockPaperScissours {
    
    static Scanner input = new Scanner(System.in);
    static String[] element = { "rock", "paper", "Scissours" };
    static int playerScore = 0 , computerScore = 0;
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("---- Mini game ----");
            System.out.println("1. start the game");
            System.out.println("2. show the score bord");
            System.out.println("3. exit");
            System.out.print("enter choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    game();
                    break;
                case 2:
                    System.out.println("player : " + playerScore + "\t" + " computer : " + computerScore);
                    break;
                case 3:
                    System.out.println("You closed the game !");
                    return;
                default:
                    System.out.println("Wrong choice!! ");
                    break;
            }
        }
    }
    static void game() {
        while (true) {
            System.out.println("===============================");
            for (int i = 0; i < element.length; i++) {
                System.out.println((i + 1) + ". " + element[i]);
            }
            System.out.print("choose one: ");
            int playerMove = input.nextInt();
            input.nextLine();
            int computerMove = (int) (Math.random() * (3) + 1);
            if (playerMove < 1 || playerMove > 3) {
                System.out.println("wrong choice !! ");
                continue;
            } else {
                System.out.println("you choose " + element[playerMove - 1]);
                System.out.println("The computer choise " + element[computerMove - 1]);
            }
            if (playerMove == computerMove) {
                System.out.println("It's draw");
            } else if ((playerMove == 1 && computerMove == 3) || (playerMove == 2 && computerScore == 1)
                    || (playerMove == 3 && computerMove == 2)) {
                System.out.println("You win");
                playerScore += 1;
            } else if ((computerMove == 1 && playerMove == 3) || (computerMove == 2 && playerMove == 1)
                    || (computerMove == 3 && playerMove == 2)) {
                System.out.println("The computer win");
                computerScore += 1;
            }
            System.out.println("player : " + playerScore + "\t" + " computer : " + computerScore);
            System.out.print("another round ? Y / N : ");
            char anotherRound = input.nextLine().charAt(0);
            if (Character.toLowerCase(anotherRound) == 'n') {
                return;
            } else {
                continue;
            }
        }
    }
}
