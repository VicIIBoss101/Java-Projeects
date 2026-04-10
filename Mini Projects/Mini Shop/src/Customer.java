import java.util.Scanner;
import java.util.ArrayList;

public class Customer {
    static ArrayList<Product> cart = new ArrayList<>();

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
                    editCart(cart, input);
                    break;
                case 3:
                    checkOut(cart, input);
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
        boolean adding = true;
        System.out.print("Do you want show the items? Y / N : ");
        char show = input.nextLine().toLowerCase().charAt(0);
        if (show == 'y') {
            Employee.showAllItems(products, input);
        }
        while (adding) {
            System.out.print("Enter the item number: ");
            int itemIndex = Main.getValidInt();
            input.nextLine();
            itemIndex -= 1;
            cart.add(products.get(itemIndex));
            System.out.println(products.get(itemIndex).getName() + "\n" + products.get(itemIndex).getPrice());
            System.out.print("Do you want to add another item? Y / N: ");
            char decide = input.nextLine().toLowerCase().charAt(0);
            if (decide == 'n') {
                adding = false;
                break;
            }
        }
    }

    void editCart(ArrayList<Product> cart, Scanner input) {
        if (cart.isEmpty()) {
            System.err.println("the cart is empty!");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            return;
        }
        for (Product userCart : cart) {
            System.out.println(userCart.getName() + "\n" + userCart.getPrice());
        }

    }

    void checkOut(ArrayList<Product> userCart, Scanner input) {
        if (cart.isEmpty()) {
            System.err.println("the cart is empty!");
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
            }
            return;
        }
    }
}