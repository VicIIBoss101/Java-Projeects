package Practical5;

public class Q8 {

    public static void main(String args[]) {
        int a = 9, b = 3, c = 5;
        if (((a + b) > c) && ((a+c) > b) && ((c+b) > a)) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid traiangle");
        }
    }
}
