package org.college_labs.meTrying.Reg;

public class Main {
    public static void main(String[] args) {
        CourseReg regAli = new CourseReg("Ali" , "Java");
        regAli.displayInfo();
        CourseReg regNoor = new CourseReg("Noor" , "Computer graph" , 20);
        regNoor.displayInfo();
        CourseReg regNoorCopy = new CourseReg(regNoor);
        regNoorCopy.hours = 25;
        regNoorCopy.displayInfo();
    }
}
