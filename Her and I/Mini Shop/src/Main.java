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
            System.out.println("1. Customer Menu" + "\n" + "2. Emplpyee Menu" + "\n" + "3. Exit");
            System.out.print("Enter Your choice: ");
            int choice = getValidInt();
            switch (choice) {
                case 1:
                    Customer service = new Customer();
                    service.customerMenu(products, input);
                    break;
                case 2:
                    Employee service2 = new Employee();
                    service2.employeeMenu(products, input);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Wrong choice !");
            }
        }
    }

    public static int getValidInt() {
        while (true) {
            try {
                return input.nextInt();
            } catch (Exception e) {
                System.out.println("please enter only numbers");
                input.nextLine();
            }
        }

    }
}