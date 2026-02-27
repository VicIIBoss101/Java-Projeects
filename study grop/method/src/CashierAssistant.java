import java.util.Scanner;

public class CashierAssistant {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("enter your name : ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
