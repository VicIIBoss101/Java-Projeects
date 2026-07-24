import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManage {
    private MenuOptions menu;
    private ArrayList<Patient> patientList = new ArrayList<>();
    private ArrayList<Integer> vipRooms = new ArrayList<>();
    private ArrayList<Integer> regularRooms = new ArrayList<>();

    public HospitalManage() {
        for (int i = 1; i <= 10; i++) {
            vipRooms.add(i);
            regularRooms.add(i);
        }
    }

    // ======================== Getters ========================
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public ArrayList<Integer> getVipRooms() {
        return vipRooms;
    }

    public ArrayList<Integer> getRegularRooms() {
        return regularRooms;
    }

    // ======================== Search / register / delete ========================
    public Patient searchById(int id) {
        for (Patient p : patientList) {
            if (p.getPatientId() == id) {
                return p;
            }
        }
        return null;
    }

    public Patient searchByRoomNum(int rNUm) {
        for (Patient p : patientList) {
            if (p.getPatientRoom() == rNUm) {
                return p;
            }
        }
        return null;
    }

    public void regPatient(Scanner input, String roomType) {
        int roomNum = 0;
        if (roomType.equalsIgnoreCase("vip")) {
            if (!(vipRooms.isEmpty()))
                roomNum = vipRooms.getFirst();
        } else if (roomType.equalsIgnoreCase("regular")) {
            if (!(regularRooms.isEmpty()))
                roomNum = regularRooms.getFirst();
        } else if (roomNum == 0) {
            System.out.println("There is no room available!");
            return;
        }

        System.out.print("Enter your full name: ");
        String name = input.nextLine();
        patientList.add(new Patient(name, roomType, roomNum));
    }

    public Patient deletePatient(Patient p) {
        if (p.getRoomtype().equalsIgnoreCase("vip")) {
            vipRooms.addLast(p.getPatientRoom());
        } else if (p.getRoomtype().equalsIgnoreCase("regular")) {
            regularRooms.addLast(p.getPatientRoom());
        }
        patientList.remove(p);
        return null;
    }

    // ======================== checking and showing ========================
    public void showAllPatients() {
        if (patientList.isEmpty()) {
            System.out.println("There is no Patient in the System!!");
        } else {
            System.out.println("-".repeat(10));
            menu.printInfoMenu();
            for (Patient patient : patientList) {
                menu.printPatientInfo(patient);
            }
            System.out.println("-".repeat(10));
        }
    }

    public void showSpecificPatient(Scanner input) {
        Patient tar = null;
        while (true) {
            System.out.print("1. search by ID\n" + "2. Search by room number\n" + "3. Back\n" + "Enter your choice: ");
            int choice = Main.getValiadInt(input);
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the ID: ");
                    int id = Main.getValiadInt(input);
                    tar = searchById(id);
                    break;
                case 2:
                    System.out.print("\nEnter the room number: ");
                    int roomNum = Main.getValiadInt(input);
                    tar = searchByRoomNum(roomNum);
                    break;
                case 3:
                    return;
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

    public void checkRoomsAvailable(String roomType) {
        if (roomType.equalsIgnoreCase("vip")) {
            if (!(vipRooms.isEmpty())) {
                for (int r : vipRooms) {
                    System.out.print(r + " ");
                }
            } else
                System.out.println("There is no room available");
        } else if (roomType.equalsIgnoreCase("regular")) {
            if (!(regularRooms.isEmpty())) {
                for (int r : regularRooms) {
                    System.out.print(r + " ");
                }
            } else
                System.out.println("There is no room available");
        } else
            System.out.println("This is not room type in this Hospital!!");
    }

    // ======================== . ========================
    protected void cancelReg(Scanner input) {
        Patient tar = null;
        while (tar == null) {
            System.out.print("-".repeat(10) + "\n1. searchbyID\n2. searchbyRoom\n3. back\nEnter Your chocie: ");
            int choice = Main.getValiadInt(input);
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Your ID: ");
                    int id = Main.getValiadInt(input);
                    input.nextLine();
                    tar = searchById(id);
                    break;
                case 2:
                    System.out.print("Enter your room nubmer: ");
                    int roomNum = Main.getValiadInt(input);
                    input.nextLine();
                    tar = searchByRoomNum(roomNum);
                    break;
                case 3:
                    System.out.println("Press enter to continue: ");
                    return;
                default:
                    System.out.println("wrong number enterd!!");
                    input.nextLine();
                    break;
            }
            if (tar == null) {
                System.out.print("There was issues with finding yoru registration!\n"
                        + "Want to try again (Enter 1) or go back (Enter 2): ");
                int decide = Main.getValiadInt(input);
                input.nextLine();
                if (decide == 1)
                    continue;
                else if (decide == 2)
                    return;
            } else {
                break;
            }
        }
        if (tar != null) {
            if (deletePatient(tar) != null) {
                System.out.println("done!!\n");
                input.nextLine();
            }
        }
    }
}