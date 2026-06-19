import java.util.Scanner;

public class Q74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter values for a, b, and x: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        int x = input.nextInt();

        double z = 0;
        boolean valid = true;

        switch (x) {
            case 1:
                z = Math.sin(a) + Math.cos(b);
                break;
            case 2:
                z = Math.sqrt(a) - Math.exp(b) + 2;
                break;
            case 3:
                z = Math.pow(a, b);
                break;
            case 4:
                z = Math.abs(a) + Math.abs(b);
                break;
            default:
                valid = false;
                System.out.println("Invalid value for x!");
        }

        if (valid) {
            System.out.println("The value of z = " + z);
        }
    }
}