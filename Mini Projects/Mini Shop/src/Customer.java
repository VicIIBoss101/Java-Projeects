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
        for (Product p : products) {
            p.productInfo();
        }
        while (true) {
            System.out.print("Enter product Number: ");
            int productNum = input.nextInt();
            input.nextLine();
            products.get(productNum - 1);
            System.out.print("How much do you want: ");
            int quant = input.nextInt();
            input.nextLine();
            if (quant > products.get(productNum - 1).getQuantity()) {
                System.out.println(
                        "We don't have that amount ! We only have: " + products.get(productNum - 1).getQuantity());
            } else {
                products.get(productNum - 1).updateQuant(quant);
            }
            System.out.print("Do you want to add another product: yes / no  ");
            char deicde = input.nextLine().toLowerCase().charAt(0);
            if (deicde == 'n') {
                return;
            }
        }
    }
}