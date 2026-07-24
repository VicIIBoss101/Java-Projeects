import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            HospitalManage manage = new HospitalManage();
            MenuOptions menus = new MenuOptions();
            HospitalServices services = new HospitalServices(manage, menus, input);

            while (true) {
                menus.showMainMenu();
                System.out.print("Enter your choice: ");
                int choice = getValiadInt(input);
                input.nextLine();
                switch (choice) {
                    case 1:
                        Employee emp = new Employee(manage,menus,services, input);
                        emp.employeeService();
                        break;
                    case 2:
                        Customer cMenu = new Customer(manage,menus,services, input);
                        cMenu.customerService();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Wrong chocie number entered!!\nPress enter to continue");
                        input.nextLine();
                        break;
                }
            }
        }
    }

    public static int getValiadInt(Scanner input) {
        while (true) {
            try {
                return input.nextInt();
            } catch (Exception e) {
                System.out.print("-".repeat(10) + "\n" + "Please Enter just numbers: ");
                input.nextLine();
            }
        }
    }
}