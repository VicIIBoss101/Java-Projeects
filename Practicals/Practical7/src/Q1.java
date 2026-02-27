public class Q1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // =======================================
        // Write a Java segment code to find the total sales from the array of daily
        // sales: {120, 250, 180, 300,
        // 160}, and track the output by filling in the track table:
        // ========================================
        int sales[] = { 120, 250, 180, 300, 160 };
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        System.out.printf("Total sales = %-2d", sum);

    }
}
