import java.util.Scanner;

public class SimpleCalculater {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // هنا خليت الشرط تروو حتى يبقى شغال الا يختار ايقاف يلا توقف
            System.out.println("---- Menu ----");
            System.err.println("1. do calculation" + "\n" + "2. exit");
            System.out.print("\n" + "enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                // هاي السويتش تخص اختيار القائمة الرئيسية

                case 1:
                    System.out.print("\n" + "enter the firts number: ");
                    int number1 = input.nextInt();
                    System.out.println("choice the  operator ");
                    System.out.print(
                            "\n" + "1. (+)" + "\n" + "2. (-)" + "\n" + "3. ( * )" + "\n" + "4. /" + "\n" + " : ");
                    int op = input.nextInt();
                    System.out.print("\n" + "enter the second number: ");
                    int number2 = input.nextInt();

                    switch (op) {
                        // هاي السويتش تخص اختيار العملية الحسابية
                        case 1:
                            additon(number1, number2);
                            break;

                        case 2:
                            subtraction(number1, number2);
                            break;

                        case 3:
                            multiplication(number1, number2);
                            break;

                        case 4:
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
    // ========================================
    // ========================================
    // ========================================

    static void additon(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("\n" + number1 + " + " + number2 + " = " + result + "\n");
    }

    // ================================
    static void subtraction(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("\n" + number1 + " - " + number2 + " = " + result + "\n");

    }

    // ================================
    static void multiplication(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("\n" + number1 + " * " + number2 + " = " + result + "\n");
    }

    // ================================
    static void division(int number1, int number2) {
        double result = (double) number1 / (double) number2;
        if (number2 == 0) {
            System.out.println("The second number must not equal to zero!!");
        } else {
            System.out.println("\n" + number1 + " + " + number2 + " = " + result + "\n");
        }
    }
}