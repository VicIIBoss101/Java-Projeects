import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeService {
    private static String pass = "0140";

    public void employeeMenu(ArrayList<Account> customer, Scanner input) {
        System.out.println("-- Welcome to Employee Menu --");

        boolean access = false;
        while (!access) {
            System.out.print("Enter the password: ");
            String enterdPassword = input.nextLine();
            if (enterdPassword.equals(pass)) {
                System.out.println("access granted");
                access = true;
                break;
            } else {
                System.out.println("Access denide !");
                continue;
            }
        }
        while (access) {
            System.out.println("============");
            System.out.println("1. Show accountes in the System" + "\n" + "2. add a new account" + "\n"
                    + "3. delete an account" + "\n" + "4. exit");
            System.out.print("Enter Your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    showAccountes(customer);
                    break;
                case 2:
                    addAccount(customer, input);
                    break;
                case 3:
                    deleteAccount(customer, input);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong chioce !");
            }
        }
    }

    protected void showAccountes(ArrayList<Account> customers) {
        for (Account acc : customers) {
            System.out.println("============" + "\n" + acc.getInfo() + "\n");
        }
    }

    protected void deleteAccount(ArrayList<Account> customers, Scanner input) {
        System.out.print("================\n" + "Enter Account number: ");
        int accountNO = input.nextInt();
        input.nextLine();
        Account targetedAccount = null;
        int accountIndex = -1;

        for (int i = 0; i < customers.size(); i++) {
            if (targetedAccount.getAccountNum() == accountNO) {
                targetedAccount = customers.get(i);
                accountIndex = i;
                break;
            }
        }
        if (targetedAccount != null && accountIndex != -1) {
            System.out.print("Are you sure you want to delete thsi account" + "\n" + targetedAccount.getInfo()
                    + "\nyes / no : ");
            char conformation = input.nextLine().toLowerCase().charAt(0);
            if (conformation == 'y') {
                customers.remove(accountIndex);
                System.out.println("The account has been removers ");
            }
        } else {
            System.out.println("This account number you enterd is not in the System !");
        }
    }

    protected void addAccount(ArrayList<Account> customers, Scanner input) {
        boolean adding = true;
        while (adding) {
            System.out.print("Enter the acount name: ");
            String newAccountName = input.nextLine();
            System.out.print("Enter the account balance: ");
            double newAccountBalance = input.nextDouble();
            input.nextLine();
            int sequence = 0;
            for (Account acc : customers) {
                sequence = acc.getAccountNum() + 1;
            }
            customers.add(new Account(sequence, newAccountName, newAccountBalance));
            Account targetedAccount = null;
            for (Account acc : customers) {
                targetedAccount = acc;
            }
            System.out.println(targetedAccount.getInfo());
            System.out.print("\n" + "Do you want to add another account? Yes / No :  ");
            char decide = input.nextLine().toLowerCase().charAt(0);
            if (decide == 'y') {
                continue;
            } else {
                adding = false;
                break;
            }
        }
    }
}
