import java.util.Scanner;

public class CheckDay {
    static Scanner input = new Scanner(System.in);

    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote you have to wait " + (18 - age) + " years");
        }
    }

    public static void main(String[] args) throws Exception {
        int age;
        System.out.print("\n" + "Enter your age: ");
        age = input.nextInt();
        checkAge(age);
    }
}
