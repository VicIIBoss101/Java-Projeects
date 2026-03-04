import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
