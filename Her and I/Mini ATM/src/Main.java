import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //
        ArrayList<Account> customers = new ArrayList<>();
        customers.add(new Account(101, "Ali Hadi", 500.55));
        customers.add(new Account(102, "Hussain Ali", 700.5));
        customers.add(new Account(103, "Mortada Alaa", 5400.88));
        //
        while (true) {
            System.out.println("---- Mini Bank ----");
            System.out.println("1. customer menu" + "\n" + "2. employee menu" + "\n" + "3. exit");
            System.out.print("Enter you choice: ");
            int menuChoice = input.nextInt();
            input.nextLine();
            //
            switch (menuChoice) {
                case 1:
                    customerMenu(customers);

            }
        }
    }

    public static void customerMenu(ArrayList<Account> customers) {
        while (true) {
            System.out.println("-- Customer Menu --");
            System.err.print("Enter you account number: ");
            int accNumber = input.nextInt();
            //
            Account foundAccount = null;
            for (Account acc : customers) {
                if (acc.getAccountNum() == accNumber) {
                    foundAccount = acc;
                    break;
                    /*
                     * هنا سوينا كائن مؤقت من نفس الكلاس الهدف منه ننسب اليه كل خصائص الكائن الي
                     * مخزن في المصقوقة
                     * يعني من خزنا الحسابات في المصفوفة
                     * لازم نمرر هاي اللسته في هاي الدالة من السويتش
                     * بعد ما مررنا هاي للسته هسه عدنا وصول كامل الها
                     * من سوينا هذا المتغير نكدر نسوي لوب بين اللكائنات
                     * و داخل الكلاس لازم عندنا شي يرجع قيمه الحساب دالة ايضا
                     * تسمى getter
                     * حتى نحصل على رقم الحساب هذا الرقم نقارنه مع الرقم الي دخله اليوزر
                     * اذا تساوت الارقام ننسب الكائن الي في المصفوفة الى الكائن المؤقت
                     * راح يكون الكائن المؤثت مثل المرجع
                     * يعني كأنه ريموت او وسيط
                     * راح نمرر البيانات من خلاله و هو يوصلها للكائن الي في المصفوفة
                     */
                }
            }
            if (foundAccount != null) {
                foundAccount.accountInfo();
            } else {
                System.out.println("Sorry we didn't found your account");
                continue;
            }

        }
    }
}
