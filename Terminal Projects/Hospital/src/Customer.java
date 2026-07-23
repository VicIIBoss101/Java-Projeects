import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Customer {
    private boolean serviceRunnig = true;
    private final int servicePassword = 2020;
    private static final double regularRPrice = 60.0;
    private static final double vipRPrice = 540.0;
    private MenuOptions menu = new MenuOptions();
    // private static Main valid = new Main();

    public void customerService(Scanner input, ArrayList<Integer> vipRoom, ArrayList<Integer> regularRoom,
            ArrayList<Patient> patientL) {
        // ======================== service block ========================
        while (serviceRunnig) {
            menu.showCustomerMenu();
            System.out.print("Enter Your choice: ");
            int chocie = Main.getValiadInt(input);
            input.nextLine();
            switch (chocie) {
                case 1:
                    excuteRegiMenu(input, vipRoom, regularRoom, patientL);
                    break;
                case 2:
                    checkout(input, patientL,vipRoom,regularRoom);
                    break;
                case 3:
                    cancelReg(input, patientL,vipRoom,regularRoom);
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

    private void excuteRegiMenu(Scanner input, ArrayList<Integer> vipRoom,
            ArrayList<Integer> regularRoom, ArrayList<Patient> patientL) {
        menu.showRigstrationMenu();
        System.out.print("Enter your choice: ");
        int choice = Main.getValiadInt(input);
        input.nextLine();
        switch (choice) {
            case 1:
                regVipRoom(input, vipRoom, patientL);
                break;
            case 2:
                regRegularRoom(input, regularRoom, patientL);
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
    // ======================== Registraions methods ========================

    private void regVipRoom(Scanner input, ArrayList<Integer> vipRoom, ArrayList<Patient> patientL) {
        if (vipRoom.isEmpty()) {
            System.out.println("there is no rooms Available!!");
        } else {
            System.out.print("How many night you will stay: ");
            int nightR;
            while (true) {
                nightR = Main.getValiadInt(input);
                input.nextLine();
                if (nightR > 10 || nightR <= 0)
                    System.out.print("invalid number enterd!!\nTry again:");
                else {
                    regPatient(input, patientL, "Vip", nightR, vipRoom.getFirst());
                    System.out.println("Room Registation done!" + "\n" + "you ID is: "
                            + patientL.getLast().getPationtId() + "\nYour room number is: " + vipRoom.getFirst()
                            + "\nPress enter to continue");
                    input.nextLine();
                    vipRoom.removeFirst();
                    break;
                }
            }
        }
    }

    private void regRegularRoom(Scanner input, ArrayList<Integer> regularRoom, ArrayList<Patient> patientL) {
        if (regularRoom.isEmpty()) {
            System.out.println("there is no rooms Available!!");
        } else {
            System.out.print("How many night you will stay: ");
            int nightR;
            while (true) {
                nightR = Main.getValiadInt(input);
                input.nextLine();
                if (nightR > 10 || nightR <= 0)
                    System.out.print("invalid number enterd!!\nTry again:");
                else {
                    regPatient(input, patientL, "Regular", nightR, regularRoom.getFirst());
                    System.out.println("Room Registation done!" + "\n" + "you ID is: "
                            + patientL.getLast().getPationtId() + "\nYour room number is: " + regularRoom.getFirst()
                            + "\nPress enter to continue");
                    input.nextLine();
                    regularRoom.removeFirst();
                    break;
                }
            }
        }
    }

    private void regPatient(Scanner input, ArrayList<Patient> patientL, String roomType, int night, int roomNum) {
        System.out.print("Enter your full name: ");
        String name = input.nextLine();
        patientL.add(new Patient(name, roomType, roomNum, night));
    }

    // ======================== . ========================

    private void cancelReg(Scanner input, ArrayList<Patient> patientL, ArrayList<Integer> vipRoom,
            ArrayList<Integer> regularRoom) {
        Patient tar = null;
        while (tar == null) {
            System.out.print("-".repeat(10) + "\n1. searchbyID\n2. searchbyRoom\n3. back\nEnter Your chocie: ");
            int chocie = Main.getValiadInt(input);
            switch (chocie) {
                case 1:
                    System.out.print("Enter Your ID: ");
                    int id = Main.getValiadInt(input);
                    tar = searchbyID(patientL, id);
                    break;
                case 2:
                    System.out.print("Enter your room nubmer: ");
                    int rommNum = Main.getValiadInt(input);
                    tar = searchbyRoom(patientL, rommNum);
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
                int choice = Main.getValiadInt(input);
                if (chocie == 1)
                    continue;
                else if (choice == 2)
                    return;

            } else {
                break;
            }
        }
        if (tar != null) {
            if (deleteObj(tar, patientL, vipRoom,regularRoom) == null) {
                System.out.println("done!!\n");
                input.nextLine();
            }
        }
    }

    private Patient deleteObj(Patient p, ArrayList<Patient> patientL, ArrayList<Integer> vipRoom,
            ArrayList<Integer> regularRoom) {
        if (p.getRoomtype().equalsIgnoreCase("vip")) {
            vipRoom.addLast(p.getPationtRoom());
        } else if (p.getRoomtype().equalsIgnoreCase("regular")) {
            regularRoom.addLast(p.getPationtRoom());
        }
        patientL.remove(p);
        return null;
    }

    // ======================== checkout method ========================
    private void checkout(Scanner input, ArrayList<Patient> patientL, ArrayList<Integer> vipRoom,
            ArrayList<Integer> regularRoom) {
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
                        s = searchbyID(patientL, id);
                        break;
                    case 2:
                        System.out.print("Enter your Room Number: ");
                        int room = Main.getValiadInt(input);
                        input.nextLine();
                        s = searchbyRoom(patientL, room);
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

                    String[] info = { "Name: " + String.valueOf(s.getPationtName()),
                            "Registation Time: " + String.valueOf(s.getFRegTime()),
                            "Room Type: " + String.valueOf(s.getRoomtype()),
                            "Total Charge: " + String.valueOf(totalAmount) + " $" };
                    menu.printCustomMenu("Check out", info);

                    System.out.println("checkout done!\nPress enter to continue");
                    input.nextLine();
                    deleteObj(s, patientL, vipRoom, regularRoom);
                    checkingOut = false;
                    break;
                }
            }
        }
    }

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

    private Patient searchbyID(ArrayList<Patient> patientL, int id) {
        Patient target = null;
        for (Patient tar : patientL) {
            if (id == tar.getPationtId()) {
                return target = tar;
            }
        }
        if (target == null)
            System.out.println("You enterd wrong number or the Id does'n exist!!");
        return target;
    }

    private Patient searchbyRoom(ArrayList<Patient> patientL, int room) {
        Patient target = null;
        for (Patient tar : patientL) {
            if (room == tar.getPationtRoom()) {
                return target = tar;
            }
        }
        if (target == null)
            System.out.println("You enterd wrong number or the room does'n exist!!");
        return target;
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