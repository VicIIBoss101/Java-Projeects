import java.util.Scanner;

public class Q20 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        revers(num);
    }

    static void revers(int num) {
        System.out.println("The reversed number is: ");
        do {
            int digit = num % 10;
            System.out.print(digit + " ");
            num /= 10;
        } while (num != 0);
    }
}
