import java.util.Scanner;

public class Q1 {
    static Scanner input = new Scanner(System.in);
    static int powFun(int number , int power){
        int reslut = (int)Math.pow(number, power);
        return reslut;
    }
    public static void main(String[] args) {
        System.out.print ("Enter the number then the power for it: ");
        int number = input.nextInt();
        int power = input.nextInt();
        System.out.println("The reslut = " + powFun(number, power));
    }
}
