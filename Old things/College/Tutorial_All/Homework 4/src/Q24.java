import java.util.Scanner;
public class Q24 {
    static Scanner input = new Scanner(System.in);
    static boolean chechPassOrFail (int [] degree){
        boolean pass = true;
        for (int i = 0 ; i < degree.length; i++){
            if (degree[i] < 50){
                pass = false;
            }
        }
        return pass;
    }
    public static void main(String[] args) {
        int [] degrees = new int[7];
        for (int i = 0 ; i < degrees.length; i ++){
            System.out.print("Enter a dgree: ");
            degrees[i] = input.nextInt();
        }
        if (chechPassOrFail(degrees)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
