import java.util.Scanner;

public class Fact {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("The fact is: " + fact(n));
    }

    static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

}
