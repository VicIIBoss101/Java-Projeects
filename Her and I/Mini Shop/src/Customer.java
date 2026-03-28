import java.util.Scanner;
import java.util.ArrayList;

public class Customer {
    public void customerMenu(ArrayList<Product> products, Scanner input) {

        while (true) {
            System.out.println("---- Mini Shop ----");
            System.out.println("Welcome to the customers menu ^_____^");
            System.out.println("1. Show all the products" + "2. Add items to cart" + "\n" + "3. edit the cart" + "\n"
                    + "4. Check out" + "\n" + "5. exit");
            System.out.print("Enter a number: ");
            int choice = Main.getValidInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }
}
