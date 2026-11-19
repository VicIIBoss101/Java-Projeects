package org.college_labs.meTrying.Reg;

public class CourseReg {
    String studentName;
    String courseName;
    int hours;
// منشأ اول ياخذ اسم و اسم كورس
    public CourseReg(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }
// منشا ثاني ياخذ 3 متغيرات ( اسم طالب , اسم كورس , وقت )
    public CourseReg(String studentName, String courseName, int hours) {
        // استدعاء المنشااخر و تمرير القيم له
        this(studentName, courseName);
        this.hours = hours;
    }

    public CourseReg(CourseReg copy) {
        // إنشاء نسخه من كائن
        this(copy.studentName, copy.courseName, copy.hours);
    }

    public void displayInfo() {
        // عرض بيانات
        System.out.println("Student Name: " + studentName + " , Course Name: " + courseName + " , Hours: " + hours);
    }


}
