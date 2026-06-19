import java.util.Scanner;

public class Q4 {
    static Scanner input = new Scanner(System.in);

    static void printNumber(int[] numbers) {
        int sum = 0, oddSum = 0, evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] % 2 == 0)
                evenSum += numbers[i];
            else
                oddSum += numbers[i];

        }
        double oddAvg = (oddSum * 1.0) / (numbers.length * 1.0);
        double evenAvg = (evenSum * 1.0) / (numbers.length * 1.0);
        System.out.println("The sum = "+ sum + " the even avg: " + evenAvg + " the odd avg: " + oddAvg);
    }

    public static void main(String[] args) {
        System.out.print("How many numbers will you enter: ");
        int length = input.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter a value: ");
            numbers[i] = input.nextInt();
        }
        printNumber(numbers);   
    }
}
