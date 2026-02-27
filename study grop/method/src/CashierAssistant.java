import java.util.Scanner;

public class CashierAssistant {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("enter you age : ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You can voit ");
        } else {
            System.out.println("You are not old enough !");
        }

    }
}
