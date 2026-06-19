import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        int arrLength = input.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.print((i + 1) + " Enter value: ");
            array[i] = input.nextInt();
        }
        System.out.println("The array before sorting");
        printArray(array);
        int[] sortedArray = sortingArray(array);
        System.out.println("\n" + "The array after sorting");
        printArray(sortedArray);
    }

    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + "    ");
        }
    }

    static int[] sortingArray(int[] array) {
        int temp = 0;
        int[] result = array;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (result[i] > result[j]) {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}
