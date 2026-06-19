package inheritance;

public class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("Salary: " + salary);
    }
}
