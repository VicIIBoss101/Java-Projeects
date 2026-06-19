import java.util.Scanner;

public class Print {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of courses: ");
        int n = input.nextInt();
        input.nextLine();
        String[] courseName = new String[n];
        for (int i = 0; i < courseName.length; i++) {
            System.out.print("Enter Course " + (i + 1) + " : ");
            courseName[i] = input.nextLine();
        }
        System.out.println("===========================");
        printTitle();
        printSubtitle();
        printArray(courseName, "Course");
    }

    static void printTitle() {
        System.out.println("Second Semester:");
    }

    static void printSubtitle() {
        System.out.println("My Courses are:");
    }

    static void printArray(String[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(name + " " + (i + 1) + " : " + arr[i]);
        }
    }

}
