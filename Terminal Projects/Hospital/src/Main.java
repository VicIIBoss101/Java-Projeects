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
                        clearConsole();
                        emp.employeeService();
                        break;
                    case 2:
                        Customer cMenu = new Customer(manage,menus,services, input);
                        clearConsole();
                        cMenu.customerService();
                        break;
                    case 3:
                        return;
                    default:
                        clearConsole();
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
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }
}