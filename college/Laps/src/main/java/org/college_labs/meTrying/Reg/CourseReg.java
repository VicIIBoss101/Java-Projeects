package org.college_labs.meTrying.Reg;

public class CourseReg {
    String studentName;
    String courseName;
    int hours;

    public CourseReg(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public CourseReg(String studentName, String courseName, int hours) {
        this(studentName, courseName);
        this.hours = hours;
    }

    public CourseReg(CourseReg copy) {
        this(copy.studentName, copy.courseName, copy.hours);
    }

    public void displayInfo() {
        System.out.println("Student Name: " + studentName + " , Course Name: " + courseName + " , Hours: " + hours);
    }


}
