import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, posSum = 0, negSum = 0;
        System.out.print("Enter N : ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int number = input.nextInt();
            if (number >= 0) {
                posSum += number;
            } else {
                negSum += number;
            }
        }
        System.out.println("posSum = " + posSum + "\n" + "negSum = " + negSum);
        input.close();
    }
}
