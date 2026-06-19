import java.util.Scanner;

public class Q21 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many numbers will you enter: ");
        int n = input.nextInt();
        int numbers[] = new int[n];
        System.out.print("what is the Target number: ");
        int target = input.nextInt();
        int count = 0 ;
        fullArray(numbers, input);
        for (int i = 0 ; i < numbers.length; i ++){
            if (numbers[i] == target)
                count++;
        }
        System.out.println(target + " has appeard " +  count + " times");
    }
    static void fullArray(int[]array , Scanner input){
        for (int i = 0 ; i < array.length; i++){
            System.out.print("Enter a value: ");
            array[i] = input.nextInt();
        }
    }
}
