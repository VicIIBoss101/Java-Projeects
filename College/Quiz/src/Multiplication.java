import java.util.Scanner;
public class Multiplication {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a value for N : ");
        int n = input.nextInt();
        System.out.print("Enter a value for X: ");
        double x = input.nextDouble();
        double multi = 1 ;
        for (int i = 1; i <= n ; i ++) {
            multi = multi * ((Math.pow(x , 3)) + i);
        }
        System.out.println("S = " + multi);
    }
}
