import java.util.Scanner;

public class SumNumbers {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int x = input.nextInt();
        System.out.print("Enter number: ");
        int y = input.nextInt();
        System.out.print("Sum = " + sumNum(x, y));
    }

    static int sumNum(int num1, int num2) {
        return num1 + num2;
    }
}

