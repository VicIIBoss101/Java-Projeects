import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 0, n, x;
        System.out.print("Enter n , x: ");
        n = input.nextInt();
        x = input.nextInt();
        for (int i = 1; i <= n; i++) {
            s += ((int) Math.pow(x, 2));
        }
        System.out.println("S = " + s);
        input.close();
    }
}
