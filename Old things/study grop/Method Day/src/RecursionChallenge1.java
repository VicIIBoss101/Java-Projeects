import java.util.Scanner;

public class RecursionChallenge1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a number to print the countdown and countup for it :");
        int number = input.nextInt();
        countDown(number);
        System.out.println("=====================================");
        countUp(number);
    }

    static void countDown(int x) {
        if (x > 50) {
            System.out.println("really nigga !! you want to count this number " + x + " ?");
        } else {
            if (x < 1) {
                return;
            } else {
                System.out.println(x);
                countDown(x - 1);
            }
        }
    }

    static void countUp(int y) {
        if (y > 50) {
            System.out.println("really nigga !! you want to count this number " + y + " ?");
        } else {

            if (y < 1) {
                return;
            } else {
                countUp(y - 1);
                System.out.println(y);
            }
        }
    }
}
