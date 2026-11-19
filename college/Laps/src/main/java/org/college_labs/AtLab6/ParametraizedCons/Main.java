package org.college_labs.AtLab6.ParametraizedCons;

public class Main {
    public static void main (String [] args){
        Person originlPerson = new Person("Ali", 30);
        Person copy = new Person(originlPerson);
        System.out.println("\nOriginal person");
        originlPerson.display();
        System.out.println("\ncopy person:");
        copy.display();
    }
}