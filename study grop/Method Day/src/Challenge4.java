import java.util.Scanner;

public class Challenge4 {
    static Scanner input = new Scanner(System.in);

    static boolean nearHundred (int number){
        if ((100 - number) <= 10 || (200 - number) <= 10){
            return true;
        }else {
            return false;
        }
    }
    public static void main (String [] args){
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        System.out.println(nearHundred(number));
    }
}