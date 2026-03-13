import java.util.Scanner;
import java.util.ArrayList;

public class RouletteGame {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            // menu block
            System.out.println("---- Roulette Game ----");
            System.out.println("Enter names and the computer will choice a random person");
            boolean add = true;
            int counter = 0;
            // counter to keep trak of the names
            while (add) {
                counter += 1;
                // get and set the names block
                System.out.print(counter + ". enter name : ");
                String usersName = input.nextLine();
                names.add(usersName);
                // see if the user want to start the roulette or add another name
                System.out.print("Do you want to add another name? yes / y or No / n \n: ");
                String decide = input.nextLine();

                if (decide.equalsIgnoreCase("yes") || decide.equalsIgnoreCase("y")) {
                    continue;

                } else {
                    // choice random person and exit
                    int choice = (int) (Math.random() * names.size());
                    System.out.println("I choose : " + names.get(choice));
                    add = false;
                    return;
                }
            }
        }
    }
}
