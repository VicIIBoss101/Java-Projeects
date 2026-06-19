package inheritance;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        // السوبر لازم يكون اول سطر في الكونستركتور الابن
        // هنا كانما نقول يا كلاس امبلويي اخذ الاسم و الراتب  و تصرف معهم كما برمجتك
        this.bonus = bonus;
        // هذا المتغير هو ملك للابن 
    }

    @Override
    // الي فوق بسطر معناها انا سويت تعديل للدالة و ليس انشاءت واحدة جديدة
    public void printInfo() {
        super.printInfo();
        // استخدمنا سوبر بنقطة لاننا نادينا دالة عادية 
        // بينما في الكونستركتور استخدمنا الاقواس لاننا بدأنا بالبناء
        System.out.println("Bouns: " + bonus);
    }
    public void signPaper () {
        System.out.println("Manager signed the papaer! ");
    }
}
