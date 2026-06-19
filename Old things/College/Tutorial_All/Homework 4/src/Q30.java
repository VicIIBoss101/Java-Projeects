import java.util.Scanner;
public class Q30 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number <= 0)
            System.out.println("the operation cannot be calculated");
        else
            System.out.println("The square root is: " + (Math.sqrt(number)));
    }
}
