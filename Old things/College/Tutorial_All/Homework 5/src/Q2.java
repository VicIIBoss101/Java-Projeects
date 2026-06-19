import java.util.Scanner;

public class Q2 {
    static Scanner input = new Scanner(System.in);

    static void swap(int var1, int var2) {
        System.out.println("befor swaping" + " var1 = " + var1 + " var2 = " + var2);
        int temp = 0 ;
        temp = var2 ;
        var2 = var1 ; 
        var1 = temp;
        System.out.println("After swaping" + " var1 = " + var1 + " var2 = " + var2);
    }

    public static void main(String[] args) {
        System.out.print("Enter the first variable then the second: ");
        int var1 = input.nextInt();
        int var2 = input.nextInt();
        swap(var1, var2);
    }

}
