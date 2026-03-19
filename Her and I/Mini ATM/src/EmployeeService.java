import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeService {
    private static String pass = "0140";

    public void employeeMenu(ArrayList<Account> customer, Scanner input) {
        System.out.println("-- Welcome to Employee Menu --");
        //
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
            switch (choice) {
                case 1 :
                    showAccountes(customer);
                    break;
                case 4:
                    return;
                default :
                System.out.println("Wrong chioce !");
            }
        }
    }
    void showAccountes (ArrayList<Account> customers ) {
        for (Account acc : customers) {
            System.out.println("============" + "\n" + acc.getInfo() + "\n");
        }
    }
    void addAccount (ArrayList<Account> customers ) {
        
    }
}
