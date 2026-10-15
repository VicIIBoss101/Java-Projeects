package com.test_it;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter your name: ");
            System.out.println("Hello " +(input.nextLine()));
        }
    }
}