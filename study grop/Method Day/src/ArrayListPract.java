import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPract {
    static Scanner input = new Scanner(System.in);

    public static ArrayList<Integer> grades = new ArrayList<>();
    public static ArrayList<String> student = new ArrayList<>();

    static void addStudentNamesAndGrade() {
        System.out.println("If you want to exit type stop");

        while (true) {
            input.nextLine();
            System.out.println("===========================");
            System.out.print("\n" + "Do you want to enter a student to the system ? Y / N ");
            String decide = input.nextLine();
            if (decide.equalsIgnoreCase("n") || decide.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.print("\n" + "enter student name: ");
                String studentName = input.nextLine();
                System.out.print("\n" + "enter student grade: ");
                int studentGrade = input.nextInt();

                student.add(studentName);
                grades.add(studentGrade);
            }
        }
    }

    static void showStudentsList() {
        System.out.println("===========================");
        if (student.isEmpty() || grades.isEmpty()) {
            System.out.println("one of the listes is empty fill them");
            System.out.println("===========================");
        } else {
            for (int i = 1; i <= student.size(); i++) {
                System.out.println(i + ". " + student.get(i - 1) + " " + grades.get(i - 1));
            }
        }
    }

    static void checkPassOrFail() {
        System.out.println("===========================");
        if (student.isEmpty() || grades.isEmpty()) {
            System.out.println("one of the listes are empty fill them first");
            System.out.println("===========================");
        } else {
            for (int i = 1; i <= student.size(); i++) {
                if (grades.get(i - 1) >= 50) {
                    System.out.println(student.get(i - 1) + " pass");
                } else {
                    System.out.println(student.get(i - 1) + " fail");
                }
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Student System ---");
            System.out.println("1. Enter names and grades to the system");
            System.out.println("2. Show students names and grades");
            System.out.println("3. Check if the student pass or fail");
            System.out.println("4. Close the System");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    addStudentNamesAndGrade();
                    break;

                case 2:
                    showStudentsList();
                    break;

                case 3:
                    checkPassOrFail();
                    break;

                case 4:
                    System.out.println("Shut down the system");
                    return;

                default:
                    System.out.println("Wrong choice !!");
                    break;

            }
        }
    }
}
