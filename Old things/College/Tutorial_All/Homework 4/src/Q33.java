public class Q33 {
    public static void main(String[] args) {
        for (int i = 8; i >= 1; i--) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                sum += j;
            }
            System.out.println("* " + sum);
        }
    }
}
