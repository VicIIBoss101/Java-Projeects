package org.college_labs.At_lap5.Q1;

public class Restan {
    int numOfMeals;
    double price, total, deliveryCost;
    boolean isStudent = false;

    public double setOrder(int numOfMeals, double price) {
        return total = numOfMeals * price;
    }

     double setOrder(int numOfMeals, double price, double deliveryCost) {
        return total = (numOfMeals * price) + deliveryCost;
    }

     double setOrder(int numOfMeals, double price, boolean isStudent) {
        if(isStudent){
        return  total = (numOfMeals * price) - 10/100;
        }
        else return total = numOfMeals * price;
    }
}
