public class Q36 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j < i + 4; j++) {
                System.out.print(i + " ");
            }
            int lastNumber;
            if (i == 1)
                lastNumber = 4;
            else if (i == 2)
                lastNumber = 8;
            else if (i == 3)
                lastNumber = 16;
            else
                lastNumber = 256;

            System.out.println(lastNumber);
        }
    }
}
