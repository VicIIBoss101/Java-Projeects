import java.util.Scanner;

public class Summation {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int total, summation = 0, counter = 0;
        System.out.print("Enter value for total : ");
        total = input.nextInt();
        while (summation <= total) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            summation += number;
            counter++;
            if (number < 0) {
                break;
            }
        }
        System.out.println("Number inputs : " + counter);
        System.out.println("Number of Accept numbers: " + (counter - 1));
    }
}