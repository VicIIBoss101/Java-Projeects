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
                case 2:
                    editItems(products, input);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Wrong choice !");
                    break;
            }
        }
    }

    public static void showAllItems(ArrayList<Product> products, Scanner input) {
        while (true) {
            for (Product items : products) {
                items.productInfo();
            }
            System.out.print("Type y to return: ");
            char choice = input.nextLine().toLowerCase().charAt(0);
            if (choice == 'y') {
                break;
            }
        }
    }

    static void editItems(ArrayList<Product> products, Scanner input) {
        boolean editing = true;
        while (editing) {
            System.out.print("1. edit item details \n2. delete item\n3. add item\n4. return \n : ");
            int choice = Main.getValidInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    editItemDetails(products, input);
                    break;
                case 2:
                    deleteItem(products, input);
                    break;
                case 3:
                    addItem(products, input);
                    break;
                case 4:
                    editing = false;
                    break;
                default:
                    System.out.println("Wrong choice !!");
                    break;
            }
        }
    }

    private static void addItem(ArrayList<Product> products, Scanner input) {
        boolean adding = true;
        while (adding) {
            System.out.print("Enter item name: ");
            String itemName = input.nextLine();
            System.out.print("Enter item price: ");
            int itemPrice = Main.getValidInt();
            input.nextLine();
            System.out.print("Enter Quantity: ");
            int itemQuantity = Main.getValidInt();
            input.nextLine();
            int itemNo = (products.size()) + 1;
            products.add(new Product(itemNo, itemName, itemQuantity, itemPrice));
            products.get(itemNo - 1).productInfo();
            System.out.print("\n" + "Do you want to add another item? y / n: ");
            char decide = input.nextLine().toLowerCase().charAt(0);
            if (decide == 'n') {
                adding = false;
                break;
            }
        }
    }

    private static void deleteItem(ArrayList<Product> products, Scanner input) {
        boolean deleting = true;
        while (deleting) {
            System.out.print("Enter Item number: ");
            int index = Main.getValidInt();
            input.nextLine();
            index -= 1;
            if (index > products.size()) {
                System.out.println("sorry this item is not in the store! or you enterd a wrong number");
                continue;
            } else {
                products.get(index).productInfo();
                System.out.print("Do you watn to delete this item ? yes / no: ");
                char conform = input.nextLine().toLowerCase().charAt(0);
                if (conform == 'y') {
                    products.remove(index);
                    System.out.println("The item has been removed! ");
                    for (int i = 0; i < products.size(); i++) {
                        products.get(i).updateNo((i + 1));
                    }
                }
            }
            System.out.print("Do you want to delete another item? y / n: ");
            char decide = input.nextLine().toLowerCase().charAt(0);
            if (decide == 'n') {
                deleting = false;
                break;
            }
        }
    }

    private static void editItemDetails(ArrayList<Product> products, Scanner input) {
        boolean editing = true;
        while (editing) {
            System.out.print("Enter item index: ");
            int index = Main.getValidInt();
            input.nextLine();
            index -= 1;
            if (products.size() < index) {
                System.out.println("wrong index try again!");
                continue;
            }
            System.out.print("1. edit item price " + "\n" + "2. edit item quantity : ");
            int choice = Main.getValidInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the new price: ");
                    int newPrice = Main.getValidInt();
                    input.nextLine();
                    products.get(index).updatePrice(newPrice);
                    break;
                case 2:
                    System.out.print("Enter the quantitiy: ");
                    int newQuantity = Main.getValidInt();
                    input.nextLine();
                    products.get(index).editQuantity(newQuantity);
                    break;
                default:
                    System.out.println("Wrong number!!");
                    break;
            }
            System.out.print("Edit another Item? Y / n :");
            char decide = input.nextLine().toLowerCase().charAt(0);
            if (decide == 'n') {
                editing = false;
                break;
            }
        }
    }
}