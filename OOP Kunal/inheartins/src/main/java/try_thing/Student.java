package try_thing;

public class Student extends Person {

    private int grade;
    private String className;
    Student (String name, String address, int phoneNumber,int grade){
        super(name , address,phoneNumber);
        this.grade = grade;

    }
}
