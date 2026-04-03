import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s = 0, i = 2;
        int total, counter = 0;
        System.out.print("Enter total : ");
        total = input.nextInt();
        while (s <= total) {
            s += (1.0 / i);
            i++;
            counter++;
        }
        System.out.println("Terms of S = " + counter + "\n" + "S = " + s);
        input.close();
    }
}
