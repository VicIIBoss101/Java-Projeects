import java.util.Scanner;
public class Q6 {
    static Scanner input = new Scanner(System.in);
    public static void main (String args []){
        System.out.print("Enter num1 then num2: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        check(num1 , num2);
    }
    static void check (int num1 , int num2){
        if (num1 > num2)
            System.out.println(num1 + " is larger");
        if (num2 > num1)
            System.out.println(num2 + " is larger");
        else
            System.out.println("The numbers are equal");
    }
}
