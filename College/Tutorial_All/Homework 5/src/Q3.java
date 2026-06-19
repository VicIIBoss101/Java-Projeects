import java.util.Scanner;

public class Q3 {
    static Scanner input = new Scanner(System.in);

    static void sequenceAndFact(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " : ");
            int fact = 1;
            for (int f = 1; f <= sequence[i]; f++) {
                fact *= f;
            }
            System.out.print(" The fact = " + fact);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the length of the sequence: ");
        int lenSequence = input.nextInt();
        int[] sequence = new int[lenSequence];

        for (int i = 0; i < lenSequence; i++) {
            System.out.print("Enter a value: ");
            int val = input.nextInt();
            if (val >= 0) {
                sequence[i] = val;
            }
        }
        sequenceAndFact(sequence);
    }

}
