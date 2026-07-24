import java.util.Scanner;

public class Employee {
    private HospitalManage manage; 
    private Scanner input;
    private MenuOptions menu;
    private  final int password = 2222;

    public Employee(HospitalManage hospitalM, Scanner input) {
        this.manage = hospitalM;
        this.input = input;
    }
    public void employeeService() {
        boolean serviceRunnig = true;
        while (serviceRunnig) {
            menu.showEmployeeMenu();
            System.out.print("Enter your choice: ");
            int choice = Main.getValiadInt(input);
            input.nextLine();
            switch (choice) {
                case 1:
                    checkRooms();
                    break;
                case 2:
                    showPatien( input);
                    break;
                case 3:
                    menu.excuteRegiMenu();
                    break;
                case 4:
                    manage.cancelReg(input);
                    break;
                case 5:
                    if (exitMode(input))
                        return;
                    break;
                default:
                    System.out.println("Wrong number entered!!");
                    input.nextLine();
                    break;
            }
        }
    }

    // ======================== Employee service methodes ========================
    private void showPatien( Scanner input) {
        String[] pMenu = { "1. Show All Patients", "2. show specific patient", "3. back" };
        menu.printCustomMenu("Patient Menu", pMenu);
        System.out.print("Enter your chocie: ");
        int choice = Main.getValiadInt(input);
        input.nextLine();
        switch (choice) {
            case 1:
                manage.showAllPatients();
                break;
            case 2:
                manage.showSpecificPatient(input);
                break;
            case 3:
                break;

            default:
                System.out.println("Wrong nubmer entered");
                break;
        }
        System.out.print("\npress Enter to continue");
        input.nextLine();
    }

    private void checkRooms() {
        System.out.print("-".repeat(8) + "\n1. To show vip Rooms\n" + "2. To show regular Rooms\n" + "3. Back\n"
                + "Enter your choice: ");
        int choice = Main.getValiadInt(input);
        input.nextLine();
        switch (choice) {
            case 1:
                manage.checkRoomsAvailable("vip");
                break;
                case 2:
                manage.checkRoomsAvailable("regular");
                break;
            case 3:
                return;
            default:
                System.out.println("Wrong number entered!!");
                break;
        }
        System.out.print("\n" + "-".repeat(8) + "\npress Enter to continue");
        input.nextLine();
    }

    // ======================== exit ========================
    private boolean exitMode(Scanner input) {
        while (true) {
            System.out.print("Enter confirmation password: ");
            int enteredCode = Main.getValiadInt(input);
            input.nextLine();
            if (enteredCode == password) {
                return true;
            } else {
                System.out.println("Wrong password!\nPress Enter");
                input.nextLine();
                return false;
            }
        }
    }
}
