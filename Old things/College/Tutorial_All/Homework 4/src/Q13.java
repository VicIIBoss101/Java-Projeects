import java.util.Scanner;
public class Q13 {
    static Scanner input = new Scanner(System.in);

    static void check(char ch) {
        if (ch >= 'A' && ch <= 'A') {
            System.out.println("The character entered is not a lowercase letter");
        } else {
            System.out.println("The character is a lowercase letter.");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter any character: ");
        char ch = input.nextLine().charAt(0);
        check(ch);
    }
}