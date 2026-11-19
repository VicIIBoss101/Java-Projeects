package org.college_labs.meTrying.beforeMID;

public class MIdQ {
    public static int process(double x, int y) {
        int a = (int) (x / 2);
        double b = x - a;
        return a + (int) b + y;
    }

    public static void main(String[] args) {
        System.out.println(process(9.7,  3));
    }
}
