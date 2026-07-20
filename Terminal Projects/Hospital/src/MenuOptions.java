import java.util.ArrayList;
import java.util.Scanner;

public class MenuOptions {

    String[] mainMenu = { "1. View All Pationts", "2. Check Pationts Status", "3. Add new Pationt", "3. Exit" };

    public void viewAllPationts(ArrayList<Pationt> pationtsL) {
        if (pationtsL.isEmpty()) {
            System.out.println("there is no paitont in the system!!");
        } else {
            System.out.printf("%-2s|%-12s|%-5s|%-5s|%-5s \n", "ID", "\tFull Name", "Status", "Room Num", "days Spent");
            for (Pationt p : pationtsL) {
                System.out.printf("%-2d|%-16s| %-5s|   %-5d|   %-5d\n", p.getPationtId(), p.getPationtName(), p.getPationtStatus(), p.getPationtRoom(), p.getDaysSpent());
            }
        }

    }

    public void checkPationtStatus(ArrayList<Pationt> pationtsL, Scanner input) {
    }

    public void addPationt(ArrayList<Pationt> pationtsL, Scanner input) {
        do {
            System.out.print("Enter Pationt Full Name: ");
            String name = input.nextLine();
            System.out.print("Enter paitont Status: ");
            String status = input.nextLine();
            System.out.print("Enter paitont Room: ");
            int room = input.nextInt();
            System.out.print("Enter paitont daysSpent: ");
            int spentDays = input.nextInt();
            int iD = pationtsL.size() + 1;
            pationtsL.add(new Pationt(iD, name, status, room, spentDays));
            System.out.print("Do you want to add another Pationt?\nYes/No: ");
            input.nextLine();
        } while ((input.nextLine().equalsIgnoreCase("yes")));
    }

    public static void printCustomMenu(String title, String[] options) {
        System.out.println("\n" + title);
        System.out.println("=".repeat(title.length()));
        for (String option : options) {
            System.out.println(option);
        }

        System.out.println("=".repeat(title.length()));
    }

    public void showMainMenu() {
        printCustomMenu("Hospital System", mainMenu);
    }

    public void excution(int choice, ArrayList<Pationt> pationtsL, Scanner input) {
        switch (choice) {
            case 1:
                viewAllPationts(pationtsL);
                break;
            case 3:
                addPationt(pationtsL, input);
                break;
            case 4:
                System.out.print("press 4 again to conform: ");
                return;
            default:
                System.out.println("Wrong choice!!");
                break;
        }
    }
}