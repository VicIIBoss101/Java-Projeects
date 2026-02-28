public class App {
    public static void main(String[] args) throws Exception {
        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        // To demonstrate a practical example of using arrays, let us create a program
        // that calculates the
        // average ages of different ages:
        int length = ages.length;
        int sum = 0;
        float avg;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        avg = sum / length;
        System.out.println("avg = " + avg);
    }
}
