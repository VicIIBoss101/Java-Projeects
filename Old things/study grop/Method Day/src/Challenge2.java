import java.util.Scanner;

public class Challenge2 {
    static Scanner input = new Scanner(System.in);

    static boolean check(int a, int b) {
        if ((a == 10 || b == 10) || (a + b) == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("enter first number: ");
        int a = input.nextInt();
        System.out.println("enter the next number: ");
        int b = input.nextInt();
        System.out.println(check(a, b));
    }

}
