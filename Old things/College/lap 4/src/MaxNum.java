import java.util.Scanner;

public class MaxNum {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number1: ");
        int n1 = input.nextInt();
        System.out.print("Enter number2: ");
        int n2 = input.nextInt();
        System.out.println("The max number is: " + maxNum(n1, n2)   );

    }
    static int maxNum (int num1  , int num2){
        if (num1 > num2) 
            return num1;
        else 
            return num2;
    }

}
