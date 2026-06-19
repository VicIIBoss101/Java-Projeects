package companysystem;

public class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println("==============");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
