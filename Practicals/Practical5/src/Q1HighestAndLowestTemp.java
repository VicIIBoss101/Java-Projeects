public class Q1HighestAndLowestTemp {
    public static void main(String[] args) throws Exception {
        // =============================================================================
        // =============================================================================
        // Write a Java segment code to find the highest and lowest temperatures of the
        // following array[] of
        // daily temperatures: {72, 68, 75, 70, 74, 69}; (Do not use math functions),
        // and track the output by
        // filling in the following track table:
        int temp[] = { 72, 68, 75, 70, 74, 69 };
        int highTemp = temp[0];
        int lowTemp = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (lowTemp > temp[i]) {
                lowTemp = temp[i];
            }
            if (highTemp < temp[i]) {
                highTemp = temp[i];
            }
        }
        System.out.printf("Highest temp: %d %nLowest temp: %d", highTemp, lowTemp);
    }
}
