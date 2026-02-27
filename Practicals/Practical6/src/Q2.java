public class Q2 {
    public static void main(String[] args) {
        // ==================================================================
        // Write a Java segment code to find the average of multiples of 3 from 3-30,
        // increasing by 3, and
        // track the output by filling the tracking table:
        // =================================================================
        int count = 0, sum = 0;
        for (int i = 3; i <= 30; i += 3) {
            System.out.printf("Count = %-5d Sum = %-5d i = %-5d", count, sum, i);
            System.out.println();
            sum += i;
            count++;
        }
        System.out.printf("Sum = %-5d count = %-5d", sum, count);
        float avg = sum / count;
        System.out.printf("Avg = %.2f ", avg);
        // الخطوات الاخيرة مجرد حتى اتاكد من الجدول التتبع

    }
}
