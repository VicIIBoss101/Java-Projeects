import java.util.Scanner;

public class RecursionChallenge2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("enter a number to find the fact for it: ");
        int number = input.nextInt();
        System.out.println("Fact " + number + " = " + fact(number));
    }

    static int fact(int x) {
        if ( x < 1 ){
            return 1;
        } else {
            return x * fact(x - 1);
        }

    }
}
