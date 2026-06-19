public class Manager extends Employee {
    private double bonus ;
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bonus:" + bonus);

    }
    public void signPaper() {
        System.out.println("The Manager: " + name + " is signing the paper ....");
    }
}
