import java.util.Scanner;

public class Customer {
    private HospitalManage manage;
    private MenuOptions menu;
    private HospitalServices services;
    private Scanner input;
    private boolean serviceRunnig = true;
    private final int servicePassword = 2020;
    private static final double regularRPrice = 60.0;
    private static final double vipRPrice = 540.0;

    public Customer(HospitalManage hospitalM, MenuOptions menuObj, HospitalServices services, Scanner input) {
        this.manage = hospitalM;
        this.input = input;
        this.menu = menuObj;
        this.services = services;
    }

    public void customerService() {
        // ======================== service block ========================
        while (serviceRunnig) {
            menu.showCustomerMenu();
            System.out.print("Enter Your choice: ");
            int chocie = Main.getValiadInt(input);
            input.nextLine();
            switch (chocie) {
                case 1:
                    services.excuteRegiMenu();
                    break;
                case 2:
                    checkout();
                    break;
                case 3:
                    services.cancelRegistration();
                    break;
                case 4:
                    if (exitMode()) {
                        serviceRunnig = false;
                    }
                    break;
                default:
                    System.out.println("Wrong number enterd!!");
                    break;
            }
        }
    }

    private void checkout() {
        boolean checkingOut = true;
        while (checkingOut) {
            Patient s = null;
            System.out.print("1. Search by ID\n2. Search by Room number\nEnter your choice: ");
            int choice = Main.getValiadInt(input);
            input.nextLine();
            while (checkingOut) {
                switch (choice) {
                    case 1:
                        System.out.print("Enter your ID: ");
                        int id = Main.getValiadInt(input);
                        input.nextLine();
                        s = manage.searchById(id);
                        break;
                    case 2:
                        System.out.print("Enter your Room Number: ");
                        int room = Main.getValiadInt(input);
                        input.nextLine();
                        s = manage.searchByRoomNum(room);
                        break;
                    default:
                        System.out.println("worng number enterd!");
                        break;
                }
                if (s == null) {
                    System.out.println("Sorry somthing wrong with finding your registration!!");
                    break;
                } else {
                    // ======================== charge section ========================
                    double totalAmount = 0;
                    int nights = services.getNightSpent(s);
                    if (nights == 0) {
                        nights = 1;
                    }
                    if (s.getRoomtype().equalsIgnoreCase("vip"))
                        totalAmount = nights * vipRPrice;
                    if (s.getRoomtype().equalsIgnoreCase("regular"))
                        totalAmount = nights * regularRPrice;

                    String[] info = { "Name: " + String.valueOf(s.getPatientName()),
                            "Registation Time: " + String.valueOf(s.getFRegTime()),
                            "Room Type: " + String.valueOf(s.getRoomtype()),
                            "Total Charge: " + String.valueOf(totalAmount) + " $" };
                    menu.printCustomMenu("Check out", info);
                    System.out.println("checkout done!\nPress enter to continue");
                    input.nextLine();
                    manage.deletePatient(s);
                    checkingOut = false;
                    break;
                }
            }
        }
    }

    // ======================== exit mode ========================
    private boolean exitMode() {
        System.out.print("Enter confirmation password: ");
        int enteredCode = Main.getValiadInt(input);
        input.nextLine();
        if (enteredCode == servicePassword) {
            return true;
        } else {
            System.out.println("Wrong password!\nPress Enter");
            input.nextLine();
            return false;
        }

    }
}