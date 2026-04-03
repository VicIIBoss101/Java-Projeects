import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 0 , n , x;
        System.out.print("Enter n , x: ");
        n = input.nextInt();
        x = input.nextInt();
        for ( int i = 1; i <= n; i++) {
            s += ((int) Math.pow(x , i));
        }
        System.out.println("S = " + s);
        input.close();
    }
}
