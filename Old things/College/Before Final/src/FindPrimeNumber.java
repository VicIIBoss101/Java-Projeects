import java.util.Scanner;

public class FindPrimeNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number");
    }
    static boolean checkPrinm (int n){
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
