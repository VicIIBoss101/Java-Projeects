import java.util.Scanner;
import java.util.ArrayList;

public class Customer {
    private boolean serviceRunnig;

    public void customerService(Scanner input, ArrayList<Integer> vipRoom, ArrayList<Integer> regularRoom) {
        MenuOptions menu = new MenuOptions();
        while (serviceRunnig) {
            menu.showCustomerMenu();
            System.out.print("Enter Your choice");
            int chocie = input.nextInt();
            switch (chocie) {
                case 1:

                    break;
                case 2:
                    break;
                default:
                    System.out.println("Wrong number enterd!!");
                    break;
            }
        }
    }

    private void excuteRegiMenu(Scanner input, MenuOptions menu, ArrayList<Integer> vipRoom,
            ArrayList<Integer> regularRoom) {
        menu.showRigstrationMenu();
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:

                break;
            case 2:
                break;
            default:
                System.out.println("Wrong choice!!");
                break;
        }

    }

    private void regVipRoom(Patient newp, Scanner input) {
        System.out.print("How many night you will stay: ");
        int nightR= input.nextInt();
        if(nightR > 10 || nightR<= 0){
            System.out.println();
        }
    }

}
