import java.util.Scanner;

public class Q28 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the amount of money: ");
        double money = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int numYears = input.nextInt();
        double interestRate, interestAmount;
        if (numYears > 5) {
            interestRate = 4.5;
        } else {
            interestRate = 3.0;
        }
        interestAmount = money * (interestRate / 100);
        System.out.println("The interest rate is: " + interestRate + "%");
        System.out.println("The total interest amount is: " + interestAmount);
    }

}