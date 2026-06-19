import java.util.Scanner;

public class Q4 {
    static Scanner input = new Scanner(System.in);

    static void check(int number) {
        if (number % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }

    public static void main(String[] args) {
        System.out.print("Etner a number: ");
        int number = input.nextInt();
        check(number);
    }

}
