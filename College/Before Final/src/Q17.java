import java.util.Scanner;
public class Q17 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("** Find The sum and the avg for the sequence of numbers **");
        int sum = 0, ngeNum = 0, posNum = 0, count = 0;
        double avg = 0;
        while (true) {
            System.out.print("Enter number: ");
            int num = input.nextInt();
            sum += num;
            if (num >= 0) posNum++;
            if (num < 0) ngeNum++;
            System.out.print("Enter 1 to exit and 2 to continue");
            int choice = input.nextInt();
            if (choice == 1)
                break;
            count++;
        }
        avg = (sum * 1.0) / (count * 1.0);
        System.out.println(
                "The sum of the number: " + sum + "\n" + "The avg is: " + avg + "\n" + " The positive numbers: "
                        + posNum + " The negative number: " + ngeNum);
    }
}