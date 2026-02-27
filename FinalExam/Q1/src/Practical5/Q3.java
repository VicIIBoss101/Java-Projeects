/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Practical5;

/**
 *
 * @author hp
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int age = 10, wait = 18 - age;
        if(age >= 18){
            System.out.println("You are eligibel to vote.");
        }else{
            System.out.println("You must wait "  + wait + " to vote");
        }
    }
}
