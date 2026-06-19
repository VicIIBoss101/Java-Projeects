import java.util.Scanner;

public class Q7 {
    static Scanner input = new Scanner(System.in);

    static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    static long product(int[] nums) {
        long product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }
        return product;
    }

    static double average(int[] nums) {
        double average = ((sum(nums)) * 1.0) / ((nums.length) * 1.0);
        return average;
    }

    static int smallest(int[] nums) {
        int smallest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    static int largest(int[] nums) {
        int largest = 0;
        for (int i = 0 ; i < nums.length; i++){
            if (largest < nums [i]){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.print("How many numbers will you enter: ");
        int n = input.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " Enter a value: ");
            nums[i] = input.nextInt();
        }
        System.out.println("\n" +"The sum = " + sum(nums) + "\n");
        System.out.println("The product = " + product(nums)+ "\n");
        System.out.println("The average = " + average(nums)+ "\n");
        System.out.println("The smallest = " + smallest(nums)+ "\n");
        System.out.println("The largest = " + largest(nums)+ "\n");
    }
}
