import java.util.Scanner;

public class EligiableToVote {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("you cane vote");
        } else {
            System.out.println("You are not allowed to vote you have to wait " + (18 - age) + " years ");
        }
    }

}
