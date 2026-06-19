import java.util.Scanner;
public class Q1 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("The second number is the minimum");
        } else {
            System.out.println("The first number is the minimum");
        }
        input.close();
    }
}
