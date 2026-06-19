import java.util.Scanner;
public class q67 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Your numbers forward:");
        for (int i : numbers) {
            System.out.println(i);
        }
        int[] revese = new int[3];
        System.out.println("Your numbers reversed:");
        for (int i = 0; i < revese.length; i++) {
            revese[i] = numbers[(revese.length-1) - i];
            System.out.println(revese[i]);
        }
    }
}
