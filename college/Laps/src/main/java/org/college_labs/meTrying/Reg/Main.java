package org.college_labs.meTrying.Reg;

public class Main {
    public static void main(String[] args) {
        CourseReg regAli = new CourseReg("Ali" , "Java");
        regAli.displayInfo();
        // انشاء كائن ثاني باسم noor
        CourseReg regNoor = new CourseReg("Noor" , "Computer graph" , 20);
        regNoor.displayInfo();
        // انشاء كائن 3 نسخه من كائن 2
        CourseReg regNoorCopy = new CourseReg(regNoor);
        // تغير عدد ساعات الكائن الثالث
        regNoorCopy.hours = 25;
        regNoorCopy.displayInfo();
    }
}
