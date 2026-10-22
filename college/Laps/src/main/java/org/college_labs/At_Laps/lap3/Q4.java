package org.college_labs.At_Laps.lap3;
import java.util.Scanner;
public class Q4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter value for x: ");
            int x = input.nextInt();
            if (x > 0)
                System.out.println("z = " + (x + 5));
            else if (x == 0)
                System.out.println("Z = 7" );
            else{
                System.out.print("Enter value for y: ");
                int y = input.nextInt();
                System.out.println("Z = " + (x * y));
            }
            System.out.println("Enter 1 to exit: ");
            int chocie = input.nextInt();
            if (chocie == 1)
                return;
        }

    }

}
