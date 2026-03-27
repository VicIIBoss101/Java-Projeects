import java.util.Scanner;

public class Equation3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Y = x^2 * 10 - 2 ");
        System.out.print("Enter value for x: ");
        int x = scan.nextInt();
        x = (int)Math.pow(x , 2);
        int y = x * 10 -2;
        System.out.println("Y = " + y);
    }
}