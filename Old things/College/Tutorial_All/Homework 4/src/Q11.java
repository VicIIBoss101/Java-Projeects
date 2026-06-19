import java.util.Scanner;
public class Q11 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int total = 0;
        System.out.println("Enter even numbers (Enter -1 to stop):");
        while (true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num % 2 == 0)
                total += num;
            if (num == -1)
                break;
        }
        System.out.println("The total = " + total);
    }
}