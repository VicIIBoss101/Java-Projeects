import java.util.Scanner;
import java.util.ArrayList;

public class Customer {
    private boolean serviceRunnig = true;
    private int servicePassword = 2020;

    public void customerService(Scanner input, ArrayList<Integer> vipRoom, ArrayList<Integer> regularRoom,
            ArrayList<Patient> patientL) {
        MenuOptions menu = new MenuOptions();
        while (serviceRunnig) {
            menu.showCustomerMenu();
            System.out.print("Enter Your choice: ");
            int chocie = input.nextInt();
            input.nextLine();
            switch (chocie) {
                case 1:
                    excuteRegiMenu(input, menu, vipRoom, regularRoom, patientL);
                    break;
                case 2:

                    break;
                case 3:
                    exitMode(input);
                    serviceRunnig = false;
                    break;
                default:
                    System.out.println("Wrong number enterd!!");
                    break;
            }
        }
    }

    private void excuteRegiMenu(Scanner input, MenuOptions menu, ArrayList<Integer> vipRoom,
            ArrayList<Integer> regularRoom, ArrayList<Patient> patientL) {
        menu.showRigstrationMenu();
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                Patient vPatient = new Patient();
                regVipRoom( input, vipRoom);
                patientL.add(vPatient);
                break;
            case 2:
                Patient rPatient = new Patient();
                regRegularRoom( input, regularRoom,patientL);
                patientL.add(rPatient);
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

    private void regVipRoom( Scanner input, ArrayList<Integer> vipRoom) {
        if (vipRoom.isEmpty()) {
            System.out.println("there is no rooms Available!!");
        } else {
            System.out.print("How many night you will stay: ");
            int nightR;
            while (true) {
                nightR = input.nextInt();
                input.nextLine();
                if (nightR > 10 || nightR <= 0)
                    System.out.print("invalid number enterd!!\nTry again:");
                else {
                    newp.setRoomAndNights("VIP", nightR);
                    System.out.println("Room Registation done!");
                    vipRoom.removeFirst();
                    break;
                }
            }
        }
    }

    private void regRegularRoom( Scanner input, ArrayList<Integer> regularRoom, ArrayList<Patient> patientL) {
        if (regularRoom.isEmpty()) {
            System.out.println("there is no rooms Available!!");
        } else {
            System.out.print("How many night you will stay: ");
            int nightR;
            while (true) {
                nightR = input.nextInt();
                input.nextLine();
                if (nightR > 10 || nightR <= 0)
                    System.out.print("invalid number enterd!!\nTry again:");
                else {
                    regPatient(input, patientL,"Regular" ,nightR);
                    System.out.println("Room Registation done!");
                    regularRoom.removeFirst();
                    break;
                }
            }
        }
    }

    private void regPatient(Scanner input, ArrayList<Patient> patientL,String roomType,int night){
        System.out.print("Enter your full name: ");
        String name = input.nextLine();
        int id = (patientL.size()) +  1;
        



    }

    // ======================== checkout method ========================
    private void checkout() {
    }

    // ======================== exit mode ========================
    private void exitMode(Scanner input) {
        while (true) {
            System.out.print("Enter conformation password: ");
            int enterdCode = input.nextInt();
            input.nextLine();
            if (enterdCode == servicePassword)
                return;
            else {
                System.out.println("wrong password!\nPress Enter");
                input.nextLine();
                break;
            }
        }
    }
}
