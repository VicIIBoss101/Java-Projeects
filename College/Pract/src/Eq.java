import java.util.Scanner;

public class Eq {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter n : ");
        int n = input.nextInt();
        double s = 0;
        double term1 = 3;
        System.out.print("S = ");
        for (int i = 1; i <= n; i ++) {
            double term = ((i*1.0) / (term1));
            s += term;
            System.out.print(i + "/" + (term1) + "  +  ");
            term1 += 2;
        }
        System.out.println("\n" + "S = " + s);
    }
}
