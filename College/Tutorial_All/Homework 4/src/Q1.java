import java.util.Scanner;

public class Q1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the first number then the second: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("now let's check if number 1 is fact for number 2");
        checkFact(num1, num2);
    }

    static void checkFact(int number1, int number2) {
        if (number1 == findFact(number2)) {
            System.out.println("The first number is fact for second number");
        } else
            System.out.println("The first number is not fact !!");
    }

    static long findFact(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
