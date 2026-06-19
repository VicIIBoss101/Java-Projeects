import java.util.Scanner;

public class printMultiTable {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter a number: ");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

}
