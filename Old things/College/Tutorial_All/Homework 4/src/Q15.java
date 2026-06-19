import java.util.Scanner;

public class Q15 {
    static Scanner input = new Scanner(System.in);

    static void check(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            int pos = (ch - 'A') + 1;
            System.out.println("The character is a uppercase letter.");
            System.out.println(ch + " posistion is " + pos);
        } else if (ch >= 'a' && ch <= 'z') {
            int pos = (ch - 'a') + 1;
            System.out.println("The character entered is a lowercase letter");
            System.out.println(ch + " posistion is " + pos);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter any character: ");
        char ch = input.nextLine().charAt(0);
        check(ch);
    }
}
