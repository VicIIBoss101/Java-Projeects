public class Account {
    protected String name;
    protected int accountNum;
    protected double balance;

    public Account(int accountNum, String name, double balance) {
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }

    public void accountInfo() {
        System.out.println("=====================");
        System.out.println(
                "Welcome " + name + "\n" + "Your account number: " + accountNum + "\n" + "Your balance is: " + balance);
        System.out.println("=====================");
    }

    public void deposit(double amount) {
        System.out.println(
                "You balance before the deposit: " + balance + "\n" + "you balance after deposit: " + (amount + balance));
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You don't have that amount in your account");
        } else {
            System.out.println("You balance before withdraw: " + balance + "\n" + "You balance after withdraw: "
                    + (balance - amount));
            this.balance -= amount;
        }
    }

    public int getAccountNum() {
        return this.accountNum;
    }

    public String getInfo() {
        return "Account num " + accountNum + "\nName holder: " + name + "\nBalance: " + balance;
    }
}
