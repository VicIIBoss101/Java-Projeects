package org.college_labs.Tasks.javaReview;

import java.util.Scanner;

public class StudentInfoReview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        final String sName = input.nextLine();
        // here we set the name as constant
        System.out.print("Enter Student age: ");
        int sAge = input.nextInt();
        int[] marks = setMarks(input);
        // to set the marks for this student
        //it's calling to the method and assignment at the same time!
        printStudentInfo(sName, sAge, marks);
    }

    static void printStudentInfo(String sName, int sAge, int[] marks) {
        System.out.println("=".repeat(5) + " Student Info " + "=".repeat(5));
        System.out.println(sName + " is a " + sAge + " Years Old ");
//        printMarks(marks);
        System.out.println("The Average: " + studentAvg(marks));
        // simple method to print the student info
    }

    static void printMarks(int[] marks) {

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }
    }

    static double studentAvg(int[] marks) {
        int sum = 0;
        for (int mark : marks) sum += mark;
        return ((double) sum / marks.length);
    }

    static int[] setMarks(Scanner input) {
        System.out.print("How Many Subjects the Student have: ");
        int length = input.nextInt();
        int[] marks = new int[length];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter " + (i + 1) + " Subject mark: ");
            marks[i] = input.nextInt();
        }
        return marks;
        /*
        simply creating method to set the marks
        this method is dynamic the length of it is adjustable
        * */
    }
}
