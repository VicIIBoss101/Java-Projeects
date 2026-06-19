import java.util.Scanner;
public class Q72 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Numbers: ");
        int num = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (areAllFactors(num, a, b, c)) {
            System.out.println(a + ", " + b + ", " + c + " are all factors of " + num);
        } else {
            System.out.println(a + ", " + b + ", " + c + " are not all factors of " + num);
        }
    }

    static boolean areAllFactors(int n, int x, int y, int z) {
        if (n % x == 0 && n % y == 0 && n % z == 0) {
            return true;
        } else {
            return false;
        }
    }
}