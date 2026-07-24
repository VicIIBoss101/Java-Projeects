import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
    private  final int password = 2222;
    private MenuOptions menu = new MenuOptions();
    private Customer search = new Customer();

    public void employeeService(ArrayList<Patient> patientsL, Scanner input, ArrayList<Integer> vipRooms,
            ArrayList<Integer> regularRooms) {
        boolean serviceRunnig = true;
        while (serviceRunnig) {
            menu.showEmployeeMenu();
            System.out.print("Enter your choice: ");
            int choice = Main.getValiadInt(input);
            input.nextLine();
            switch (choice) {
                case 1:
                    checkRooms(input, vipRooms, regularRooms);
                    break;
                case 2:
                    showPatien(patientsL, input, vipRooms, regularRooms);
                    break;
                case 3:
                    search.excuteRegiMenu(input, vipRooms, regularRooms, patientsL);
                    break;
                case 4:
                    search.cancelReg(input, patientsL, vipRooms, regularRooms);
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
    private void showPatien(ArrayList<Patient> patientL, Scanner input, ArrayList<Integer> vipRooms,
            ArrayList<Integer> regularRooms) {
        String[] pMenu = { "1. Show All Patients", "2. show specific patient", "3. back" };
        menu.printCustomMenu("Patient Menu", pMenu);
        System.out.print("Enter your chocie: ");
        int choice = Main.getValiadInt(input);
        input.nextLine();
        switch (choice) {
            case 1:
                showAll(patientL);
                break;
            case 2:
                showSpecificPatient(patientL, input);
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

    private void checkRooms(Scanner input, ArrayList<Integer> vipRooms, ArrayList<Integer> regularRooms) {
        System.out.print("-".repeat(8) + "\n1. To show vip Rooms\n" + "2. To show regular Rooms\n" + "3. Back\n"
                + "Enter your choice: ");
        int chocie = Main.getValiadInt(input);
        input.nextLine();
        switch (chocie) {
            case 1:
                checkRoomsAvailable(vipRooms);
                break;
            case 2:
                checkRoomsAvailable(regularRooms);
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

    // ======================== show Patient methods ========================
    private void showAll(ArrayList<Patient> pList) {
        if (pList.isEmpty()) {
            System.out.println("There is no Patient in the System!!");
        } else {
            System.out.println("-".repeat(10));
            menu.printInfoMenu();
            for (Patient patient : pList) {
                menu.printPatientInfo(patient);
            }
            System.out.println("-".repeat(10));
        }
    }

    private void showSpecificPatient(ArrayList<Patient> pList, Scanner input) {
        Patient tar = null;
        while (true) {
            System.out.print("1. search by ID\n" + "2. Search by room number\n" + "3. Back\n" + "Enter your choice: ");
            int choice = Main.getValiadInt(input);
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the ID: ");
                    int id = Main.getValiadInt(input);
                    tar = search.searchbyID(pList, id);
                    break;
                case 2:
                    System.out.print("\nEnter the room number: ");
                    int roomNum = Main.getValiadInt(input);
                    tar = search.searchbyRoom(pList, roomNum);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong number entered!!\n");
                    break;
            }
            input.nextLine();
            System.out.println("press enter to continue: ");
            input.nextLine();
            if (tar != null) {
                System.out.println("-_".repeat(8));
                menu.printInfoMenu();
                menu.printPatientInfo(tar);
                System.out.println("-".repeat(8));
                break;
            }
        }
    }

    // // ======================== check rooms methods // ========================
    private void checkRoomsAvailable(ArrayList<Integer> Rooms) {
        if (Rooms.isEmpty())
            System.out.println("There is no room available");
        else {
            for (int r : Rooms) {
                System.out.print(r + " ");
            }
        }
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
