import java.util.Scanner;

public class Q5 {
    static Scanner input = new Scanner(System.in);

    static void checkMultiple(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is multiple of " + num2);
        } else
            System.out.println(num1 + " is not multiple of " + num2);
    }

    public static void main(String[] args) {
        System.out.print("Enter num1 then num2: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        checkMultiple(num1, num2);
    }
}
