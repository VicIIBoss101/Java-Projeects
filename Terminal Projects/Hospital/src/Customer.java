import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Customer {
    private HospitalManage manage;
    private Scanner input;
    private boolean serviceRunnig = true;
    private final int servicePassword = 2020;
    private static final double regularRPrice = 60.0;
    private static final double vipRPrice = 540.0;
    private MenuOptions menu = new MenuOptions();

    public Customer(HospitalManage hospitalM, Scanner input) {
        this.manage = hospitalM;
        this.input = input;
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
                    excuteRegiMenu();
                    break;
                case 2:
                    checkout(input);
                    break;
                case 3:
                    manage.cancelReg(input);
                    break;
                case 4:
                    if (exitMode(input)) {
                        serviceRunnig = false;
                    }
                    break;
                default:
                    System.out.println("Wrong number enterd!!");
                    break;
            }
        }
    }

    protected void excuteRegiMenu() {
        menu.showRigstrationMenu();
        System.out.print("Enter your choice: ");
        int choice = Main.getValiadInt(input);
        input.nextLine();
        switch (choice) {
            case 1:
                // vip
                manage.regPatient(input, "vip");
                break;
            case 2:
                // regular
                manage.regPatient(input, "regular");
                break;
            case 3:
                System.out.print("press enter to continue: ");
                input.nextLine();
                break;
            default:
                System.out.println("Wrong choice!!");
                break;
        }

    }

    private void checkout(Scanner input) {
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
                    int nights = nightSpent(s);
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

    
    // ======================== checkout method ========================

    private int nightSpent(Patient s) {
        int totalNight = 0;
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime pEnteredDate = s.getRegTime();
        LocalDate todayDate = nowDateTime.toLocalDate();
        LocalDate pINDate = pEnteredDate.toLocalDate();
        long nights = ChronoUnit.DAYS.between(pINDate, todayDate);
        totalNight = (int) nights;
        return totalNight;
    }

    // ======================== exit mode ========================
    private boolean exitMode(Scanner input) {
        while (true) {
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
}