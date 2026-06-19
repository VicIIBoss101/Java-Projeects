import java.util.Scanner;

public class Cahllenge3 {
    static Scanner input = new Scanner(System.in);

    static void swap(int a, int b) {// a = 11 , b = 6
        // 5 + 6 = 11
        a = a + b;
        // a = 11 , b = 6
        b = a - b;
        // 11 - 6 = 5
        a = a - b;
        // 11 - 5 = 6
        System.out.println("a = " + a + " b = " + b);

    }

    public static void main(String[] args) {
        System.out.println("enter first number ");
        int a = input.nextInt();
        System.out.println("enter the next number: ");
        int b = input.nextInt();
        System.out.println("The numbers before swap " + "a = " + a + " b = " + b);
        swap(a, b);

    }
}
