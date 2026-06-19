import java.util.Scanner;

public class Q26 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter value for x: ");
        int x = input.nextInt();
        if (x < 5)
            System.out.println("f(x) = " + (5 * ((int) Math.pow(x, 2))));
        else
            System.out.println("f(x) = " + Math.sqrt((x + 3)));
    }
}
