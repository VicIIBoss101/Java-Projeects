public class Q27 {
    public static void main(String[] args) {
        int s = 0;
        int k;
        int i = 10;
        while (i >= 1) {
            k = 1;
            int j = 1;
            while (j <= 5) {
                k *= j;
                s += k;

                j++;
            }
            int m = 1;
            while (m >= 3) {
                s += m;

                m++;
            }
            i--;
        }
    }
}