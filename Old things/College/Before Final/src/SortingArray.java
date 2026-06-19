import java.util.Scanner;

public class SortingArray {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        int array[] = new int[input.nextInt()];
        fillArray(array, input);
        printArray(array);
        sortingArray(array);
    }

    static void sortingArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The array after sotrign");
        printArray(array);
    }

    static void printArray(int[] array) {
        System.out.println();
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }

    static void fillArray(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a value: ");
            array[i] = input.nextInt();
        }
    }
}
