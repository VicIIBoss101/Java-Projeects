import java.util.Scanner;

public class Equation {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the value of X: ");
        int x = scan.nextInt();
        System.out.print("Enter the value of Y : ");
        int y = scan.nextInt();
        int z = x + y + 2;
        System.out.println("z = " + z); 
    }
}
