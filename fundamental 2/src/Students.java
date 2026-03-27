import java.util.Scanner;
public class Students {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many Students will you enter: ");
        int studentsNumber = scan.nextInt();
        int counter = 0;
        for (int i = 1 ; i <= studentsNumber ; i++) {
            System.out.print("No." + i +" . " + " Enter degree: ");
            int degree = scan.nextInt();
            if (degree >= 50) {
                counter += 1;
            }
        }
        System.out.println(counter + " The number of strudents pass");
    }
}
