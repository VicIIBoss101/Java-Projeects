import java.util.Scanner;

public class Q39 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int originalNum = num;
        int reversedNum = 0;
        int remainder;
         while (num != 0) {
            remainder = num % 10;                
            reversedNum = reversedNum * 10 + remainder; 
            num /= 10;                          
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome.");
        }
    }
}