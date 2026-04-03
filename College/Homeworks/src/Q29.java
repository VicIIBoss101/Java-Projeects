import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s = 0, x;
        int n;
        System.out.print("Enter N: ");
        n = input.nextInt();
        System.out.print("Enter x: ");
        x = input.nextDouble();
        for (int i = 1; i <= n; i++) {
            double term1 = Math.pow(x, 2 * i);
            double fact = 1;
            for (int j = 1; j <= (i - 1); j++) {
                fact *= j;
            }
            s += (term1 / fact);
        }
        System.out.println("S = " + s);
        input.close();
    }
}
