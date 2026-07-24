import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalServices {
    private HospitalManage manage;
    private MenuOptions menu;
    private Scanner input;

    public HospitalServices(HospitalManage manage, MenuOptions menu, Scanner input) {
        this.manage = manage;
        this.menu = menu;
        this.input = input;
    }

    public void regPatient(String roomType) {
        int roomNum = 0;
        ArrayList<Integer> rooms = manage.getRoomsByType(roomType);
        if (rooms == null || rooms.isEmpty()) {
            System.out.println("Threr is no romm available!!");
            return;
        } else {
            roomNum = rooms.getFirst();
            rooms.removeFirst();
        }

        System.out.print("Enter your full name: ");
        String name = input.nextLine();
        manage.getPatientList().add(new Patient(name, roomType, roomNum));
        System.out.println(
                "-_".repeat(5) + "\nregistration done you id: " + manage.getPatientList().getLast().getPatientId()
                        + "\nYou room is: " + manage.getPatientList().getLast().getPatientRoom());
        input.nextLine();
    }

    protected void excuteRegiMenu() {
        menu.showRigstrationMenu();
        System.out.print("Enter your choice: ");
        int choice = Main.getValiadInt(input);
        input.nextLine();
        switch (choice) {
            case 1:
                // vip
                regPatient("vip");
                break;
            case 2:
                // regular
                regPatient("regular");
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

    public void showAllPatients() {
        if (manage.getPatientList().isEmpty()) {
            System.out.println("There is no Patient in the System!!");
        } else {
            System.out.println("-".repeat(10));
            menu.printInfoMenu();
            for (Patient patient : manage.getPatientList()) {
                menu.printPatientInfo(patient);
            }
            System.out.println("-".repeat(10));
        }
    }

    public void showSpecificPatient() {
        System.out.print("1. Search by ID\n2. Search by Room Number\nEnter choice: ");
        int choice = Main.getValiadInt(input);
        input.nextLine();

        Patient tar = null;
        if (choice == 1) {
            System.out.print("Enter Patient ID: ");
            int id = Main.getValiadInt(input);
            input.nextLine();
            tar = manage.searchById(id);
        } else if (choice == 2) {
            System.out.print("Enter Room Number: ");
            int roomNum = Main.getValiadInt(input);
            input.nextLine();
            tar = manage.searchByRoomNum(roomNum);
        }

        if (tar != null) {
            menu.printInfoMenu();
            menu.printPatientInfo(tar);
        } else {
            System.out.println(" Patient not found!");
        }
    }

    public void checkRoomsAvailable(String roomType) {
        ArrayList<Integer> rooms = manage.getRoomsByType(roomType);
        if (rooms == null)
            System.out.println("Threr is no romm available!!");
        else {
            for (Integer r : rooms) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }

    public int getNightSpent(Patient s) {
        int totalNight = 0;
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime pEnteredDate = s.getRegTime();
        LocalDate todayDate = nowDateTime.toLocalDate();
        LocalDate pINDate = pEnteredDate.toLocalDate();
        long nights = ChronoUnit.DAYS.between(pINDate, todayDate);
        totalNight = (int) nights;
        s.setDaySpent(totalNight);
        return totalNight;
    }

    public void cancelRegistration() {
        System.out.print("Enter ID to cancel: ");
        int id = Main.getValiadInt(input);
        input.nextLine();
        Patient p = manage.searchById(id);

        if (p != null && manage.deletePatient(p) == null) {
            System.out.println(" Registration canceled successfully!");
        } else {
            System.out.println("Registration not found or couldn't be canceled.");
        }
    }
}