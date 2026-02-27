public class Pract3 {
    public static void main(String[] args) {
        String[] names = { "Ali", "Abdulrahman", "Noor", "Mohammed" };
        double[] grades = { 85.5, 92.0, 76.5, 100, 0 };
        System.out.printf("%-15s | %-2s %n", "Student Name", "Grade");
        System.out.println("---------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s | %5.1f %n", names[i], grades[i]);

        }
    }

}
