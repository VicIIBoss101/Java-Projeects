import java.util.Scanner;

public class TotalAndSequenceOfNum {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter The total of the numbers: ");
        int total = input.nextInt();
        int sum = 0, count = 0;
        while (sum <= total) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            sum += num;
            count++;
        }
        System.out.println("the numbers enterd: " + count + "\n" + "The accepted numbers: " + (count - 1));
    }
}
