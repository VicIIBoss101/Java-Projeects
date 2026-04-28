import java.util.Scanner;

public class FindEvenOrOddNum {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        check(num);
    }

    static void check(int num) {
        if (num % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
