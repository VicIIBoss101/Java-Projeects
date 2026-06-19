import java.util.Scanner;

public class Q70 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N (number of terms): ");
        int n = input.nextInt();
        long a = 1, b = 0;
        System.out.println("The series is: ");
        for (int i = 1; i <= n; i++) {
            long next = a + b;
            System.out.print(next + "! ");
            a = b;
            b = next;
        }
    }
}