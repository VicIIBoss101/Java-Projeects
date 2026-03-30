import java.util.Scanner;

public class Q2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int summation = 0;
        System.out.print("Enter a N: ");
        int n = input.nextInt();
        System.out.print("Enter x: ");
        int x = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int power = Math.powExact(x, i);
            summation += power;
        }
        System.out.println("S = " + summation);
    }
}
