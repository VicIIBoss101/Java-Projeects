import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 0, n, x;
        System.out.print("Enter n , x: ");
        n = input.nextInt();
        x = input.nextInt();
        for (int i = 1; i <= n; i++) {
            s += x;
        }
        System.out.println("S = " + s);
        input.close();
    }
}
