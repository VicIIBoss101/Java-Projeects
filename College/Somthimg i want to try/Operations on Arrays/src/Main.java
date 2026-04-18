import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter columns value for matrix A: ");
        int colA = input.nextInt();
        System.out.print("Enter rows value for matrix A: ");
        int rowA = input.nextInt();
        System.out.print("Enter columns value for matrix B: ");
        int colB = input.nextInt();
        System.out.print("Enter rows value for matrix B: ");
        int rowB = input.nextInt();
        int[][] a = new int[rowA][colA];
        fillArray(a, "A", input);
        int[][] b = new int[rowB][colB];
        fillArray(b, "B", input);
        printArray(a, "A");
        printArray(b, "B");
        System.out.println("Now we will do operation on these matrices");
        operation(input, a, b);
    }
    static void fillArray(int[][] array, String name, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((i + 1) + "-" + (j + 1) + " Enter value for matrix " + name + " :");
                array[i][j] = input.nextInt();
            }
        }
    }
    static void printArray(int[][] array, String name) {
        System.out.println("==================================" + "\n" + name);
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    static void operation(Scanner input, int[][] array1, int[][] array2) {
        while (true) {
            System.out.println("What type of operation do you want to do?");
            System.out
                    .println("1. additon" + "\n" + "2. subtraiton" + "\n" + "3. multiplication" + "\n" + "4. division");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    additon(array1, array2);
                    break;
                case 2:
                    subtraiton(array1, array2);
                    break;
                case 3:
                    multiplication(array1, array2);
                    break;
                case 4:
                    division(array1, array2);
                    break;
                default:
                    System.out.println("Wrong number!");
                    break;
            }
            System.out.print("Enter 1 to eixit and 2 to do another calculation: ");
            int decide = input.nextInt();
            if (decide == 1)
                return;
        }
    }
    static void additon(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        printArray(result, "additon result");
    }
    static void subtraiton(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array1[i][j] - array2[i][j];
            }
        }
        printArray(result, "subtraiton result");
    }
    static void division(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (array2[i][j] != 0) {
                    result[i][j] = array1[i][j] / array2[i][j];
                }
            }
        }
        printArray(result, "division result");
    }
    static void multiplication(int[][] array1, int[][] array2) {
        if (array1.length == array2[0].length) {
            int[][] result = new int[array1.length][array1[0].length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = array1[i][j] + array2[i][j];
                }
            }
            printArray(result, "multiplication result");
        } else {
            System.out.println("The rows must be equal to columns!");
        }
    }
}
