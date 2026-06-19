import java.util.Scanner;
public class Summation {
    
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args)  {
        System.out.print("Enter a value for N : ");
        int n = input.nextInt();
        System.out.print("Enter a value for x: ");
        int x = input.nextInt();
        int summation = 0;
        for (int i = 1 ; i <= n ; i ++){
            summation = summation + (((int)Math.pow(x, i)) + i);
        }
        System.out.print("R = " + summation);
    }
}
