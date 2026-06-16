import java.util.Scanner;

public class justClass {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char[] strArr = new char[5];
        String sep = "";
        for (int i = 0; i < strArr.length; i++) {
            sep = " , ";
            System.out.print(strArr[i] + " ");
        }
    }
}