package org.collage_labs;
import java.util.Scanner;
public class Q3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s = 0;
        for (int i = 1; i <= 99 ; i++){
            s += (double) i / (i + 1);
        }
        System.out.printf("S = %.3f", s );
    }
}
