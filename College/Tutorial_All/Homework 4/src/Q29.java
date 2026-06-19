import java.util.Scanner;

public class Q29 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter The hours worked: ");
        int workHours = input.nextInt();
        double salary;
        if (workHours <= 40) {
            salary = 12.00 * workHours;
        } else {
            // الحالة الثانية: عمل إضافي (Overtime)
            int extraHours = workHours - 40; // نحسب كم ساعة اشتغل فوق الـ 40
            salary = 480.00 + (extraHours * 18.00);
        }
        System.out.println("The salary is: " + salary);
    }

}
