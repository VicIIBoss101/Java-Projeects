import java.util.Scanner;
import java.util.ArrayList;;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Patient> patientsInof = new ArrayList<>();
        ArrayList<Integer> vipRoom = new ArrayList<>();
        availableRoom(vipRoom);
        ArrayList<Integer> regularRoom = new ArrayList<>();
        availableRoom(regularRoom);
        MenuOptions menus = new MenuOptions();
        try (Scanner input = new Scanner(System.in)) {

            while (true) {
                menus.showMainMenu();
                System.out.print("Enter your choice: ");
                int choice = getValiadInt(input);
                input.nextLine();
                switch (choice) {
                    case 1:
                        Employee emp = new Employee();
                        emp.employeeService(patientsInof, input, vipRoom, regularRoom);
                        break;
                    case 2:
                        Customer cMenu = new Customer();
                        cMenu.customerService(input, vipRoom, regularRoom, patientsInof);
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

    private static void availableRoom(ArrayList<Integer> romsType) {
        for (int i = 1; i <= 10; i++) {
            romsType.add(i);
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