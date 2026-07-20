import java.util.ArrayList;
import java.util.Scanner;

public class MenuOptions {

    String[] mainMenu = { "1. View All Pationts", "2. Check Pationts Status", "3. Add new Pationt", "3. Exit" };

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
    private static void printCustomMenu(String title, String[] options) {
        System.out.println("\n" + title);
        System.out.println("=".repeat(title.length()));
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("=".repeat(title.length()));
    }

    private void printPatientInfo(Patient p) {
        System.out.printf("%-2d|%-20s|%-7s| %-7d|   %-7d|%-7s\n", p.getPationtId(), p.getPationtName(),
                p.getPationtStatus(), p.getPationtRoom(), p.getDaysSpent(), p.getFRegTime());
    }

    private void printInfoMenu() {
        System.out.printf("%-2s|%-16s|%-7s|%-7s|%-7s|%-7s \n", "ID", "\tFull Name", "Status", "Room Num",
                "days Spent", "registration Time");
    }

    // ================================================
    public void showMainMenu() {
        printCustomMenu("Hospital System", mainMenu);
    }

}