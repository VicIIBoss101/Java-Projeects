package org.college_labs.At_lap5.Q1;

public class Restan {
    double total;

    public double setOrder(int numOfMeals, double price) {
        return total = numOfMeals * price;
    }

    double setOrder(int numOfMeals, double price, double deliveryCost) {
        return total = (numOfMeals * price) + deliveryCost;
    }

    double setOrder(int numOfMeals, double price, boolean isStudent) {
        double total = numOfMeals * price;
        if (isStudent) {
            return total * 0.90; //discount 10%
        }
        return total;
    }
}
