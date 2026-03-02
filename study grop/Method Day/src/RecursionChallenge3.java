import java.util.Scanner;

public class RecursionChallenge3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the start number: ");
        int fNumber = input.nextInt();
        System.out.print("Enter the end number: ");
        int sNumber = input.nextInt();
        System.out.println( "The sum of the numbers from " + fNumber + " to " +sNumber + " is = " + sumOfNumbers(fNumber, sNumber));
    }

    static int sumOfNumbers(int start, int end) { // start = 2 , end = 4 ,
        if (end > start) {
            return end + sumOfNumbers(start, end - 1);
                 /*  4 + (2 , 3) now you can see it as if it's 4 + 5 = 5 <-- the output
                                |
                         3 + ( 2 , 2) now its equal to 5
                                |
                              2 is the end then it will retern
                */
        } else {
            return end;
        }
    }
}
