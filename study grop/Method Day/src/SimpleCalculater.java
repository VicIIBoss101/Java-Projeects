import java.util.Scanner;

public class SimpleCalculater {
    static Scanner input = new Scanner(System.in);

    static void additon(int number1, int number2) {
        System.out.println();
        int result = number1 + number2;
        System.out.printf("%d + %d = %d", number1, number2, result);
        System.out.println();
    }

    static void subtraction(int number1, int number2) {
        int result = number1 - number2;
        System.out.println();
        System.out.printf("%d - %d = %d", number1, number2, result);
        System.out.println();
    }

    static void multiplication(int number1, int number2) {
        int result = number1 * number2;
        System.out.println();
        System.out.printf("%d × %d = %d", number1, number2, result);
        System.out.println();
    }

    static void division(int number1, int number2) {
        double result = (double) number1 / (double) number2;
        if (number2 == 0) {
            System.out.println("The second number must be not equal to zero!!");
        } else {
            System.out.println();
            System.out.printf("%d ÷ %d = %d", number1, number2, result);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("---- Menu ----");
            System.err.println("1. do calculation" + "\n" + "2. exit");
            System.out.print("\n" + "enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("\n" + "enter the firts number: ");
                    int number1 = input.nextInt();
                    System.out.print("\n" + "enter the  operator: ");
                    char op = input.next().charAt(0);
                    System.out.print("\n" + "enter the second number: ");
                    int number2 = input.nextInt();

                    switch (op) {
                        case '+':
                            additon(number1, number2);
                            break;

                        case '-':
                            subtraction(number1, number2);
                            break;

                        case '*':
                            multiplication(number1, number2);
                            break;

                        case '/':
                            division(number1, number2);
                            break;

                        default:
                            System.out.println("Wrong operator!!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("thank you");
                    return;

                default:
                    System.out.println("Wrong choice!!");
            }
        }
    }
}