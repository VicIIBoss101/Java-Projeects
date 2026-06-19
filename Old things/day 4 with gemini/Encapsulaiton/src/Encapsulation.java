
// كلاس حساب محمي 
class BankAccount {
    private String name ;
    private double balance ;
    BankAccount (String n , double d) {
        name = n;
        balance = d;
    }
    public String getName () {
        return name;
    }
    public double getBalance () {
        return balance ;
    }
    // لايداع الاموال 
    void withdraw (double amount ) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("You have withdraw " + amount );
        }else{
            System.out.println("Error : You don't have that amount in your account !");
        }
    }
    void deposit (double amount) {
        if (amount > 0 ) {
            balance = balance + amount;
            System.out.println("You have deposit " + amount);
        }else{
            System.out.println("Invalid amount ! ");
        }
    }
    void printInfo () {
        System.out.println("==== Account Info ====");
        System.out.println("Account name : " + name);
        System.out.println("Balance : " + balance + "$");
        System.out.println("=====================");
    }
}
public class Encapsulation {
    public static void main (String [] args) {
        BankAccount accounts = new BankAccount("Ali", 500);
        accounts.printInfo();
        accounts.deposit(1000);
       // System.out.println(accounts.balance); بهاي الطريقة ما راح يقدر يوصل له لانه محمي بس السطر الي بعده راح ينطبع
       System.out.println("Manual check : " + accounts.getBalance());
    }
}
