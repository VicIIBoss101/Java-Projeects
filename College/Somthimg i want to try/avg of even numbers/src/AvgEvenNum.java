import java.util.Scanner;

public class AvgEvenNum {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many number will you enter: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        fillArray(numbers, input);
        printArray(numbers);  
        avgEvenNumbers(numbers);
    }

    static void fillArray(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + " Enter a value: ");
            array[i] = input.nextInt();
        }
    }

    static void printArray(int[] array) {
        for (int i : array){
            System.out.print(i + "\t");
        }
    }

    static void avgEvenNumbers(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                count++;
            }
        }
        double avg = (sum * 1.0) / (count * 1.0);
        System.out.println("\n" +"The avg is = " + avg);
    }
}
