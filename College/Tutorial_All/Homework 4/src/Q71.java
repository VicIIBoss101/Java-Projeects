import java.util.Scanner;

public class Q71 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter day and month: ");
        int day = input.nextInt();
        int month = input.nextInt();
        int remaining = calculateRemainingDays(day, month);

        if (remaining == -1) {
            System.out.println("Invalid input! Please check day/month range.");
        } else {
            System.out.println("remaining days = " + remaining);
        }
    }

    static int calculateRemainingDays(int d, int m) {
        int totalDays;
        switch (m) {
            case 4: case 6: case 9: case 11:
                totalDays = 30;
                break;
            case 2:
                totalDays = 28;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                totalDays = 31;
                break;
            default:
                return -1;
        }
        if (d < 1 || d > totalDays) {
            return -1;
        }
        return totalDays - d;
    }
}