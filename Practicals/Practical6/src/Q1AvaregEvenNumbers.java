public class Q1AvaregEvenNumbers {
    public static void main(String[] args) throws Exception {
        // Write a Java segment code to find the average of even numbers from 2-20,
        // increasing by 2, and
        // track the output by filling the tracking table
        // var : sum count avg
        int sum = 0, count = 0;
        for (int i = 2; i <= 20; i += 2) {
            sum = sum + i;
            count += 1;
        }
        float avg = sum / count;
        System.out.printf("avg = %,.2f ", avg);

    }
}
