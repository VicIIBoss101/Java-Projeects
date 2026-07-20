import java.util.Scanner;
import java.util.ArrayList;;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Pationt> pationtsInof = new ArrayList<>();
        pationtsInof.add(new Pationt(1, "ali sami haliem", "good", 5, 2));
        MenuOptions menus = new MenuOptions();
        Scanner input = new Scanner(System.in);
        while (true) {
            menus.showMainMenu();
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    menus.viewAllPationts(pationtsInof);
                    break;
                case 2:
                    menus.checkPationtStatus(pationtsInof, input);
                    break;
                case 3:
                    menus.addPationt(pationtsInof, input);
                    break;
                case 4:
                    return;

                default:
                    System.out.println("Wrong chocie number entered!!");
                    break;
            }

        }
        // input.close();
    }
}