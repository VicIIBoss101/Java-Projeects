import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 0, x, n;
        System.out.print("Enter n: ");
        n = input.nextInt();
        System.out.print("Enter x: ");
        x = input.nextInt();
        for (int i = 1; i <= n; i++) {
            s += ((int) Math.pow(-1 , i)) * ((int) Math.pow(x , i)) ;
        }
        System.out.println("S = " + s);
        input.close();
    }
}
