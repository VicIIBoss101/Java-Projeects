import java.util.Scanner;
import java.util.ArrayList;;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Patient> patientsInof = new ArrayList<>();
        ArrayList<Integer> vipRoom = new ArrayList<>();
        availableRoom(vipRoom);
        ArrayList<Integer> regularRoom = new ArrayList<>();
        availableRoom(regularRoom);
        patientsInof.add(new Patient(1, "ali sami haliem", "Vip", 5, 2));
        MenuOptions menus = new MenuOptions();
        try (Scanner input = new Scanner(System.in)) {

            while (true) {
                menus.showMainMenu();
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        menus.viewAllPationts(patientsInof);
                        break;
                    case 2:
                        Customer cMenu = new Customer();
                        cMenu.customerService(input, vipRoom, regularRoom, patientsInof);
                        break;
                    case 3:
                        menus.addPationt(patientsInof, input);
                        break;
                    case 4:
                        return;

                    default:
                        System.out.println("Wrong chocie number entered!!");
                        break;
                }
            }
        }
    }

    private static void availableRoom(ArrayList<Integer> romsType) {
        for (int i = 1; i <= 10; i++) {
            romsType.add(i);
        }
    }
}