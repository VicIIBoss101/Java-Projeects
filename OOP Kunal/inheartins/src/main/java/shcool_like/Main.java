package shcool_like;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] mainMenu = {"1. Show All Student", "2. Check Pass/Fail", "3. exit"};
            while (true) {
                System.out.println("=".repeat(10) + " Java School " + "=".repeat(10));
                printMenu(mainMenu);
                System.out.print("Enter your choice: ");
                int choice = input.hasNextInt() ? input.nextInt() : 5;
                input.nextLine();
                switch (choice){
                    case 1:
                        showAllStudent();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Wrong Number Entered!!");
                        break;
                }
            }
        }
    }

    static void printMenu(String[] menu) {
        for (String s : menu) {
            System.out.println(s);
        }
    }

    static void showAllStudent() {
        String[] students = {"Ali Hussam", "Mohamed Ali", "Abbas Safaa"};
        printMenu(students);
    }
}
