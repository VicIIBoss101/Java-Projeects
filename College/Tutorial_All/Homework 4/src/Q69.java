import java.util.Scanner;
public class Q69 {
    static Scanner input = new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter N: ");
        int n = input.nextInt();
        System.out.print("Enter X: ");
        int x = input.nextInt();
        int s = 0;
        for(int i = 1 ; i <= n ; i++){
            long fact = 1;
            for (int j = 1; j <= (i +1) ; j++){
                fact *= j;
            }
            s += ((int)Math.pow(x, i)) * fact;
        }
        System.out.println("S = " + s);

    }
}