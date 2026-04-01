import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
    static String employeePass = "0001";

    public void employeeMenu(ArrayList<Product> products, Scanner input) {
        boolean access = false;
        while (!access) {
            System.out.println("===============================" + "\n" + "---- Mini Shop ----");
            System.out.print("Enter employee password: ");
            String pass = input.nextLine();
            if (pass.equals(employeePass)) {
                access = true;
            } else {
                System.out.println("Access denide !");
                continue;
            }
        }
        while (access) {
            System.out.println("Access granted ! ");
            System.out.println("===============================" + "\n" + "---- Employee Menu ----");
            System.out.printf("1. %s %n2. %s %n3. %s %n", "show all itesm", "edit items", "exit");
            System.out.print("Enter a number: ");
            int choice = Main.getValidInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    showAllItems(products, input);
                    break;

                case 3:
                    return;
                default:
                    System.out.println("Wrong choice !");
                    break;
            }
        }
    }

    static void showAllItems(ArrayList<Product> products, Scanner input) {
        while (true) {
            for (Product items : products) {
                items.productInfo();

            }
            System.out.print("Do you want to return to employee menu? y / n: ");
            char choice = input.nextLine().toLowerCase().charAt(0);
            if (choice == 'y') {
                break;
            }
        }
    }
}
