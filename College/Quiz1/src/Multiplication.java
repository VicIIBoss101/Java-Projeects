import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = input.nextInt();
        System.out.print("Enter a value for x: ");
        int x = input.nextInt();
        int multi = 1 ;
        for (int i = 1 ; i <= n ; i++) {
            multi = multi * (((int)Math.pow(x , 3)) + i);
        }
        System.out.println("S = " + multi);
        input.close();
    }
}
