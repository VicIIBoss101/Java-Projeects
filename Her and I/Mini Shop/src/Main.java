import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Tomato", 50, 3));
        products.add(new Product("Cucumber", 10, 2));
        products.add(new Product("Potato", 7, 1));
        while (true) {
            System.out.println("---- Mini Shop ----");
            System.out.println("1. Customer Menu" + "\n" + "2. Emplpyee Menu" + "\n" + "3. Exit" );
            System.out.print("Enter Your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    Customer service = new Customer();
                    service.customerMenu(products, input);
                    break;
            }
        }
    }
}