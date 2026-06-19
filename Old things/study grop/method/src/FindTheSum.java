import java.util.Scanner;

public class FindTheSum {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("How many number do you want to enter: ");
        int length = input.nextInt();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            System.out.print("\n" + (i + 1) + " enter a number: ");
            int numbers = input.nextInt();
            sum = (sum + numbers);

        }
        // double avg = sum / length;
        // System.out.println("the sum is = " + sum + "\nthe average is = " + avg);
        // output
        // the sum is = 21
        // the avarge is = 3.0
        // السبب الي خلا المعدل يطلع بشكل 3.0 هو انو المجموع انتجر و اللينغث الي هي عدد
        // الاعداد همين انتجر
        // فالكومبايلر راح يقسمهن و بس يضيف بونت صفر ما يضيف باقي القسمه
        // الحل
        double avg = (double) sum / length;
        System.out.println("The sum is = " + sum + "\nThe average is = " + avg);
        // هنا سوينا تحويل من الانتجر الى الدابل حتى الناتج يطلع بيه كسر
        // اكو طريقه ثانية للتحويل نضرب في 1.0 يعني بهذا الشكل
        // double avg = (sum * 1.0) / length;
    }
}
