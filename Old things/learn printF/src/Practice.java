public class Practice {
    public static void main(String args[]) {
        String item = "Iphone 15";
        double price = 1200.5;
        System.out.printf("Item: %s total: %,.2f", item, price);
        String name1 = "ali", name2 = "mohammed";
        int id1 = 100, id2 = 201;
        double sal1 = 550.0, sal2 = 1225.5;
        System.out.println();
        System.out.printf("Name \t   ID \tSalary \n");
        System.out.println("-------------------------------");
        System.out.printf("%-10s %s  %,.2f %n", name1, id1, sal1);
        System.out.printf("%-10s %s  %,.2f %n", name2, id2, sal2);
        System.out.println();
        String status = "Completed";
        int progress = 77;
        // بما انو علامة النسبة المئوية مجوزه للاوامر ف نكتبها مرتين حتى تنطبع
        System.out.println("-------------------------------------------");
        System.out.printf("Loading ... [%s] %d%% %n ", status, progress);
        // هسه راح نكتب الطريقة الاحترافية و الاصح
        System.out.println("Now the professional way to write it ");
        // اولا تحدي الفاتورة
        System.out.println();
        System.out.printf("Item: %-10s Total: $%,.2f %n", item, price);
        System.out.println("-------------------------------------------");
        // جدول الاسماء و الهوية و الراتب
        System.out.printf("%-10s %-5s %-10s %n", "Name", "ID", "Salary");
        System.out.println("-------------------------------------------");
        System.out.printf("%-10s %-5d $%,-10.2f %n", name1, id1, sal1);
        System.out.printf("%-10s %-5d $%,-10.2f %n", name2, id2, sal2);
        // النسبة المئوية
        System.out.printf("Status: %s .... Loading [%d%%] %n", status, progress);
    }
}
