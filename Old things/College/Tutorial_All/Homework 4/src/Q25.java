import java.util.Scanner;
public class Q25 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter x value: ");
        int x = input.nextInt();
        if (x < 0)
            System.out.println("Y = " + ((3* x)+ 7));
        else 
            System.out.println("Y = " + ((-2)* x + 3));
    }
}
