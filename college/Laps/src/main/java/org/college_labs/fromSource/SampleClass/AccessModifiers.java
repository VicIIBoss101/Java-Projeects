package org.college_labs.fromSource.SampleClass;

public class AccessModifiers {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
// Accessing public member
        System.out.println("Public: " + obj.publicVar);
// Accessing protected member
        System.out.println("Protected: " + obj.protectedVar);
// Accessing default member
        System.out.println("Default: " + obj.defaultVar);
// Accessing private member
      //  System.out.println("Private: " + obj.privateVar);
    }
}