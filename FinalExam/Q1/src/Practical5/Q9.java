package Practical5;

public class Q9 {

    public static void main(String args[]) {
        double num1 = 5, num2 = 6;
        double result;
        char op = '/';
        switch (op) {
            case '+':
                result = (num1 + num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-' :
                result = (num1 - num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*' :
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/' :
                if(num2 == 0 ){
                    System.out.println("Cannot divided by Zero \t please try again !!");
                }else{
                    result = num1 / num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                }
                break;
            default :
                System.out.println("Invalid operator !! ");
                break;
        }
    }
}
