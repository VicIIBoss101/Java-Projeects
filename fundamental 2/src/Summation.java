import java.util.Scanner;

public class Summation {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double s = 0, x;
        System.out.print("Enter value for n: ");
        int n = input.nextInt();
        System.out.print("Enter value for x: ");
        x = input.nextLong();
        for (int i = 2; i <= n; i++) {
            double powerTerm = Math.pow(x, (i * 2));
            double fact = 1;
            for (int j = 1; j <= (i - 2); j++) {
                fact *= j;
            }
            s += (powerTerm / fact);
        }
        System.out.println("S = " + s);
    }
}
