
public class Transpose {
    public static void main(String[] args) {
        int[][] number = {
                { 10, 20, 30 },
                { 40, 50, 60 } };
        int row = number.length;
        int col = number[0].length;
        int[][] transpose = new int[col][row];
        System.out.println("The array before tanspose");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j] + "\t");
                transpose[j][i] = number[i][j];
            }
            System.out.println();
        }

        int rowTranspose = transpose.length;
        int colTranspose = transpose[0].length;
        System.out.println("The Transpose");
        for (int i = 0; i < rowTranspose; i++) {
            for (int j = 0; j < colTranspose; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
