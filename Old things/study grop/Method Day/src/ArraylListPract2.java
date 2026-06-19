import java.util.ArrayList;
import java.util.Scanner;

public class ArraylListPract2 {
    static Scanner input = new Scanner(System.in);

    public static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("---- To-Do List ----");
            System.out.println(
                    "1. creat new list" + "\n" + "2. Show current list" + "\n" + "3. remove task" + "\n" + "4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    newList();
                    break;

                case 2:
                    showList();
                    break;

                case 3:
                    removeTask();
                    break;

                case 4:
                    System.out.println("You closed the program");
                    return;

                default:
                    System.out.println("Wrong choice!!");
                    break;
            }
        }
    }

    // ========================================================
    // ========================================================
    static void newList() {
        System.out.println("===========================");

        if (tasks.isEmpty()) {
            int i = 1;
            while (true) {
                System.out.println("! If you want to stop type exit");
                System.out.print("\n" + i + ". Enter the tastk : ");
                String uTask = input.nextLine();
                if (uTask.equalsIgnoreCase("exit")) {
                    System.out.println("===========================");
                    return;
                } else {
                    tasks.add(uTask);
                }
                i++;
            }
        } else {
            System.out.println("there is a list :");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.print("\n" + "Do you want to delete this list ? Y / N \n  : ");
            String dChoice = input.nextLine();
            if (dChoice.equalsIgnoreCase("y") || dChoice.equalsIgnoreCase("yes")) {
                tasks.clear();
                System.out.println("The list has been deleted !!");
            } else {
                return;
            }
        }
        System.out.println("===========================");
    }

    static void showList() {
        System.out.println("==========================");
        if (tasks.isEmpty()) {
            System.out.println("The list is isEmpty!!");
            return;
        } else {
            int count = 1;
            for (String i : tasks) {
                System.out.println(count + ". " + i);
                count++;
            }
            return;
        }
    }

    static void removeTask() {
        System.out.println("==========================");
        if (tasks.isEmpty()) {
            System.out.println("The list is isEmpty!!");
            return;
        } else {
            int count = 1;
            for (String i : tasks) {
                System.out.println(count + ". " + i);
                count++;
            }
            System.out.print("\n" + "Do you want " + "\n" + "1. replace" + "\n" + "2. remove");
            System.out.print("\n" + "Enter your choice: ");
            int choice = input.nextInt();
            if (choice == 2) {
                System.out.print("\n" + "Enter the number of the task: ");
                int taskIndex = input.nextInt();
                tasks.remove(taskIndex - 1);
                System.out.println("The task has been removed ! ");
                return;
            }
            if (choice == 1) {
                System.out.print("\n" + "Enter the number of the task: ");
                int taskIndex = input.nextInt();
                System.out.print("\n" + "enter the new task: ");
                input.nextLine();
                String nTask = input.nextLine();
                tasks.set(taskIndex - 1, nTask);
                System.out.println("The task has been updated !");
                return;

            }
        }
    }

}
