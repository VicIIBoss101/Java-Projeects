import java.util.Scanner;

public class Q73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        solveEquation(a, b, c);
    }
    public static void solveEquation(double a, double b, double c) {
        // 1. حساب المميز (الذي تحت الجذر)
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            // حالتان للجذر (موجب وسالب)
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } 
        else if (discriminant == 0) {
            // جذر واحد مكرر
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } 
        else {
            // المميز سالب (لا توجد جذور حقيقية)
            System.out.println("The equation has no real roots.");
        }
    }
}