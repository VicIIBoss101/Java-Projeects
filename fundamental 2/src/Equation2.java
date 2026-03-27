import java.util.Scanner;

public class Equation2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter The value for x: ");
        int z, x, y;
        x = scan.nextInt();
        if (x > 0) {
            z = x + 5;
        } else if (x == 0) {
            z = 7;
        } else {
            System.out.print("Enter the value for y: ");
            y = scan.nextInt();
            z = x * y;
        }
        System.out.println("Z = " + z);
    }
}
