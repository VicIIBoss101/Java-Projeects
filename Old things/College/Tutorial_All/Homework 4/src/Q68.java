import java.util.Scanner;

public class Q68 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number of 2 digit: ");
        int num1 = input.nextInt();
        System.out.println("Enter a number of 2 digit: ");
        int num2 = input.nextInt();
        System.out.println("The sum of " + num1 + " + " + num2 + " = " + (num1 + num2) );
    }

}
