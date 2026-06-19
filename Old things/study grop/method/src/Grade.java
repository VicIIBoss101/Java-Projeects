import java.util.Scanner;

public class Grade {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter grade: ");
        int grade = input.nextInt();
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else if (grade >= 50) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

    }
}
