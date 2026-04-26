import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter arrya length: ");
        int len = input.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print((i + 1) + " Enter value: ");
            array[i] = input.nextInt();
        }

        System.out.println("Array before revers");
        printArray(array);

        int[] reversed = reverOrder(array);
        System.out.println("Array after revers");
        printArray(reversed);
    }

    static int[] reverOrder(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = (arr.length - 1); i >= 0; i--) {
            result[(result.length - 1) - i] = arr[i];
        }
        return result;
    }

    static void printArray(int[] array) {
        for (int row : array) {
            System.out.print(row + "    ");
        }
    }
}