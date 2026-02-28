import java.util.Scanner;

public class CheckGrade {
    static Scanner input = new Scanner(System.in);

    static void checkGrade(int grade) {
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else if (grade >= 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        System.out.print("\n" + "Enter your grade: ");
        int grade = input.nextInt();
        checkGrade(grade);

    }
}
