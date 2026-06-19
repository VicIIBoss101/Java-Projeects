import java.util.Scanner;
import java.util.ArrayList;

public class justClass {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> thingsIn = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.print("Enter a thing: ");
            thingsIn.add(input.nextLine());
            System.out.println("To stop Enter Y / N");
        } while ((input.nextLine().toLowerCase().charAt(0)) != 'y');
        int rand = (int) (Math.random() * thingsIn.size());
        System.out.println("I decide: " + rand + " " + thingsIn.get(rand));
    }
}