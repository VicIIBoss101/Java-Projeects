import java.util.Scanner;
public class Q12 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.print("Enter a month(use 1 for Jan, etc.): ");
            int month = input.nextInt();
            if (month > 12 || month == 0)
                System.out.println("invalid month");
            else 
                break;
        }
        while (true) {
            System.out.print("Enter day of month: ");
            int day = input.nextInt();
            if (day == 0 || day > 31)
                System.out.println("invalid day");
            else 
                break;
        }
    }
}
