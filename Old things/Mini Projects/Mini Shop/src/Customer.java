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
                    editCart(cart, products, input);
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
            if (itemIndex > products.size() || itemIndex < 0) {
                System.out.println("there is no item!");
                continue;
            }
            itemIndex -= 1;
            cart.add(products.get(itemIndex));
            System.out.println("========\n" + products.get(itemIndex).getName() + "\n" + "========\n"
                    + products.get(itemIndex).getPrice());
            System.out.print("Do you want to add another item? Y / N: ");
            char decide = input.nextLine().toLowerCase().charAt(0);
            if (decide == 'n') {
                adding = false;
                break;
            }
        }
    }

    void editCart(ArrayList<Product> cart, ArrayList<Product> products, Scanner input) {
        if (cart.isEmpty()) {
            System.err.println("the cart is empty!");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
            return;
        }
        for (Product userCart : cart) {
            System.out.println("======\n" + userCart.getName() + "\n" + userCart.getPrice());
        }
        System.out.print("Do you want to \n1. add an item\n2. delete item form the cart: ");
        int cartEdit = Main.getValidInt();
        input.nextLine();
        switch (cartEdit) {
            case 1:
                addToCart(products, input);
                break;
            case 2:
                deleteFromCart(cart, input);
                break;
            default:
                System.out.println("Wrong number! try again");
                break;
        }
    }

    private static void deleteFromCart(ArrayList<Product> cart, Scanner input) {
        boolean deleting = true;
        while (deleting) {
            int i = 1;
            for (Product cartItems : cart) {
                System.out.println(i + " " + cartItems.getName());
                i++;
            }
            if (cart.isEmpty()) {
                System.out.println("The cart is empty!");
                deleting = false;
                break;
            }
            System.out.print("Enter item number: ");
            int itemNum = Main.getValidInt();
            input.nextLine();
            itemNum -= 1;
            if (itemNum > cart.size() || itemNum < 0) {
                System.out.println("Wrong number!");
                continue;
            }
            System.out.print("Do you want to delete: " + cart.get(itemNum).getName() + " Y / N: ");
            char del = input.nextLine().toLowerCase().charAt(0);
            if (del == 'n') {
                continue;
            }
            cart.remove(itemNum);
            System.out.println("The item have been removed!");
            System.out.print("Do you want to delete another item? Y / N: ");
            char decide = input.nextLine().toLowerCase().charAt(0);
            if (decide == 'n') {
                deleting = false;
                break;
            }
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
        double total = 0;
        System.out.println("your cart have: ");
        for (Product items : cart) {
            System.out.println(items.getName() + " " + items.getPrice() + " $");
            total += (items.getPrice());
        }
        System.out.println("The Total = " + total + " $");
        cart.clear();
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
        }
    }
}