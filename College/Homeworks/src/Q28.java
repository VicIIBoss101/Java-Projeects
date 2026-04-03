import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double s = 0, x;
        System.out.print("Enter n: ");
        n = input.nextInt();
        System.out.print("Enter x: ");
        x = input.nextDouble();
        for (int i = 1; i <= n; i++) {
            double fact = 1;
            for (double j = x; j >= 1; j--) {
                fact *= j;
            }
            s += ((Math.pow(x, i)) / fact);
        }
        System.out.println("S = " + s);
        input.close();
    }
}
