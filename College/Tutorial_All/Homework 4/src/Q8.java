public class Q8 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " The square root " + sqrt(i));
            System.out.println(i + " The cube root " + cube(i));
        }
    }

    static double sqrt(int num) {
        return Math.sqrt(num);
    }

    static double cube(int num) {
        return Math.cbrt(num);
    }
}
