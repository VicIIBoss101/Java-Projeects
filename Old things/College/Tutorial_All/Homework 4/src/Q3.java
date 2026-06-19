import java.util.Scanner;

public class Q3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a grade: ");
        int grade = input.nextInt();
        checkPass(grade);   
    }
    static void checkPass (int grade){
        if(grade >= 60)
            System.out.println("A passing grade");
        else
            System.out.println("A failing grade");
    }
}
