import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double z = 0;
        int sum = 0, x1, x2, n;
        System.out.print("Enter n: ");
        n = input.nextInt();
        System.out.print("Enter x1 , x2 :");
        x1 = input.nextInt();
        x2 = input.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            int term = ((int) Math.pow(x1 , i)) - ((int) Math.pow(x2 , i));
            sum += ((int) Math.pow(term , 2));
        }
        z = Math.sqrt(sum);
        System.out.println("Z = " + z);
        input.close();
    }
}
