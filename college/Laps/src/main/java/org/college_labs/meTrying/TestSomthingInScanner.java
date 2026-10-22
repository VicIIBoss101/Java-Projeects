package org.college_labs.meTrying;
import java.util.Scanner;
public class TestSomthingInScanner {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello " + input.nextLine());
        input.close();
        Scanner input2 = new Scanner(System.in);
        System.out.println("this is " + input2.nextLine());
    }
}
