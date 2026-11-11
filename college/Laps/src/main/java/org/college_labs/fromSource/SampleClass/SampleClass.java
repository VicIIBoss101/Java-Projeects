package org.college_labs.fromSource.SampleClass;

public class SampleClass {
//data members or fields
        public int publicVar = 10; // Accessible everywhere
        protected int protectedVar = 20; // Accessible within the same package or subclasses
        int defaultVar = 30; // Package-private (no modifier)
        private int privateVar = 40; // Accessible only within this class
// Public getter method for private variable
        public int getPrivateVar() {
            return privateVar;
        }
}
