import java.util.Scanner;
import java.util.ArrayList;

public class CustomerService {
    public void customerMenu(ArrayList<Account> customers , Scanner input) {
        System.out.println("-- Customer Menu --");
        System.out.print("Enter you account number: ");
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
            System.out.println("Sorry we didn't found your account ! try again");
            System.out.println("You will be back to the main menu");
            return;
        }
        while (true) {
            System.out.println("\n" + "1. deposit" + "\n" + "2. withdraw" + "\n" + "3. exit");
            int customerChoice = input.nextInt();
            switch (customerChoice) {
                case 1:
                    System.out.print("Enter the amount you want to deposit: ");
                    double depositAmount = input.nextDouble();
                    foundAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    foundAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    return;

                default:
                    System.out.println("Wrong choice !");
                    break;
            }
        }
    }
}
