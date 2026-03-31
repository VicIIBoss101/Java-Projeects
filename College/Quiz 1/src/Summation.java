import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = input.nextInt();
        System.out.print("Enter value for x: ");
        int x = input.nextInt();
        int summation = 0;
        for (int i = 1; i <= n; i++) {
            summation = summation + (((int) Math.pow(x, i)) + i);
        }
        System.out.println("R = " + summation);
        input.close();
    }
}
