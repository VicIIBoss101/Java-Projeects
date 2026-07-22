import java.util.ArrayList;
import java.util.Scanner;

public class MenuOptions {

    private String[] mainMenu = { "Select Programm mode:", "1. Manager", "2. Employee", "3. Customer",
            "4. exit Programm" };
    private String[] employeeMenu = { "1. Check Available Rooms", "2. check Patient Status", "3. Edit Patient Details",
            "4. exit" };
    private String[] managerMenu = { " " };
    private String[] custromerMenu = { "1. registration Menu", "2. Check out", "3. return to main menu" };
    private String[] registationMenu = { "1. Vip room (540$ pre night)", "2. Regular room (60$ per night)", "3. back" };

    // ======================== . ========================
    public void viewAllPationts(ArrayList<Patient> patientsL) {
        if (patientsL.isEmpty()) {
            System.out.println("there is no paitont in the system!!");
        } else {
            printInfoMenu();
            for (Patient p : patientsL) {
                printPatientInfo(p);
            }
        }
    }

    public void checkPatientStatus(ArrayList<Patient> patientL, Scanner input) {
        System.out.print("Enter the patient ID: ");
        int pID = input.nextInt();
        input.nextLine();
        Patient s = null;
        for (Patient patient : patientL) {
            if (patient.getPationtId() == pID) {
                s = patient;
                break;
            } else
                System.out.println("The patien is not found!");
        }
        if (s != null) {
            printInfoMenu();
            printPatientInfo(s);
            System.out.println("press enter to continue");
            input.nextLine();
        }
    }

    public void addPationt(ArrayList<Patient> patientsL, Scanner input) {
        do {
            System.out.print("Enter Pationt Full Name: ");
            String name = input.nextLine();
            System.out.print("Enter paitont Status: ");
            String status = input.nextLine();
            System.out.print("Enter paitont Room: ");
            int room = input.nextInt();
            System.out.print("Enter paitont daysSpent: ");
            int spentDays = input.nextInt();
            int iD = patientsL.size() + 1;
            patientsL.add(new Patient(iD, name, status, room, spentDays));
            System.out.print("Do you want to add another Pationt?\nYes/No: ");
            input.nextLine();
        } while ((input.nextLine().equalsIgnoreCase("yes")));
    }

    // ======================== Print methodes ========================
    protected  void printCustomMenu(String title, String[] options) {
        System.out.println("\n" + title);
        System.out.println("=".repeat(title.length()));
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("=".repeat(title.length()));
    }

    private void printPatientInfo(Patient p) {
        System.out.printf("%-2d|%-20s|%-7.7s| %-7d|   %-7d|%-7s\n", p.getPationtId(), p.getPationtName(),
                p.getRoomtype(), p.getPationtRoom(), p.getDaysSpent(), p.getFRegTime());
    }

    private void printInfoMenu() {
        System.out.printf("%-2s|%-16s|%-7s|%-7s|%-7s|%-7s \n", "ID", "\tFull Name", "Room Type", "Room Num",
                "days Spent", "registration Time");
    }

    // ======================== Menus Methods ========================
    public void showMainMenu() {
        printCustomMenu("Hospital System", mainMenu);
    }

    public void showEmployeeMenu() {
        printCustomMenu("Employee Menu", employeeMenu);
    }

    public void showManagerMenu() {
        printCustomMenu("Manager Menu", managerMenu);
    }

    public void showCustomerMenu() {
        printCustomMenu("Customer Menu", custromerMenu);
    }
    public void showRigstrationMenu(){
        printCustomMenu("Registation Menu", registationMenu);
    }
}