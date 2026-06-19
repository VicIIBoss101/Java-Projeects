import java.util.Scanner;
public class Q66 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of terms (N): ");
        int n = input.nextInt();
        int currentTerm = 1;
        System.out.print("The series is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(currentTerm + " ");
            currentTerm = (currentTerm * 2) + 1;
        }
    }
}