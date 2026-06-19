import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Account> customers = new ArrayList<>();
        customers.add(new Account(101, "Ali Hadi", 500.55));
        customers.add(new Account(102, "Hussain Ali", 700.5));
        customers.add(new Account(103, "Mortada Alaa", 5400.88));

        while (true) {
            System.out.println("---- Mini Bank ----");
            System.out.println("1. customer menu" + "\n" + "2. employee menu" + "\n" + "3. exit");
            System.out.print("Enter you choice: ");
            int menuChoice = input.nextInt();
            input.nextLine();

            switch (menuChoice) {
                case 1:
                    CustomerService service = new CustomerService();
                    service.customerMenu(customers, input);
                    break;
                case 2:
                    EmployeeService service2 = new EmployeeService();
                    service2.employeeMenu(customers, input);
                    break;
                case 3:
                    System.out.println("You closed the program !");
                    return;
                default:
                    System.out.println("Wrong choice !!");
                    break;
            }
        }
    }
}
