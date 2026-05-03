import java.util.Scanner;

public class BiggestNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        int l = input.nextInt();
        int[] array = new int[l];
        fillArray(array, input);
        printArray(array);
        findBiggest(array);
    }

    static void fillArray(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+ 1) + " Enter a value: ");
            array[i] = input.nextInt();
        }
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
    static void findBiggest(int [] array){
        int biggest = 0;
        for (int i = 0 ; i < array.length; i++){
            if (array[i] > biggest){
                biggest = array[i];
            }
        }
        System.out.println("The biggest number is : " + biggest);
    }
}
