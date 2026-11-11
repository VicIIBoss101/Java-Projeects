package org.college_labs.fromSource.constructorchain;

public class Main {
        public static void main(String[] args) {
            Patient2 p1 = new Patient2();
            Patient2 p2 = new Patient2("Ali");
            Patient2 p3 = new Patient2("Sara", 25);
            Patient2 p4 = new Patient2(p3);
            p1.displayInformation();
            p2.displayInformation();
            p3.displayInformation();
            p4.displayInformation();
        }
}
