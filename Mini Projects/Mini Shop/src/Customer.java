import java.util.Scanner;
import java.util.ArrayList;

public class Customer {
    public void customerMenu(ArrayList<Product> products, Scanner input) {

        while (true) {
            System.out.println("---- Mini Shop ----");
            System.out.println("Welcome to the customers menu ^_____^");
            System.out.println("1. Add items to cart" + "\n" + "2. edit the cart" + "\n"
                    + "3. Check out" + "\n" + "4. exit");
            System.out.print("Enter a number: ");
            int choice = Main.getValidInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    addToCart(products, input);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }

    void addToCart(ArrayList<Product> products, Scanner input) {
    }

    void editCart(ArrayList<Product> products, Scanner input) {
    }

    void checkOut(ArrayList<Product> products, Scanner input) {
    }
}