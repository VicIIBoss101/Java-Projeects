import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\nHow many cars do you want to add : ");
        int size = getValidInt();
        Vehicle[] autoShow = new Vehicle[size];
        for (int i = 0; i < size; i++) {
            // العداد لازم يبدا من 0 لان راح نخزن قيم بالمصفوفة ولازم تبدا من صفر
            // اذا بدا من الواحد ما راح يطلع ايرور بس البرنامج ينهار اذا اجينا نطبع العناصر
            input.nextLine();
            System.out.print("\nEnter the Vehicle name : ");
            String name = input.nextLine();
            System.out.print("Enter the price: ");
            double price = getValidDouble();
            System.out.println("Vehicle Type");
            System.out.print("1.Standard\t2. Passenger car\n : ");
            int type = getValidChoice();
            if (type == 2) {
                System.out.print("How many seats: ");
                int seats = getValidInt();
                autoShow[i] = new Car(name, price, seats);
                autoShow[i].printInfo();
            } else {
                autoShow[i] = new Vehicle(name, price);
            }
        }
        System.out.println("======================");
        System.out.println("the autoShow has ");
        for (int i = 0; i < autoShow.length; i++) {
            autoShow[i].printInfo();
            if (autoShow[i] instanceof Car) {
                ((Car) autoShow[i]).honk();
            }
        }

    }

    // =================================================
    // to avoid crashes if enter anything not a number
    public static int getValidInt() {
        while (true) {
            try {
                return input.nextInt();
            } catch (Exception e) {
                System.out.println();
                System.out.println("!! Enter only numbers ");
                System.out.print("Try again: ");
                input.next();
            }
        }
    }

    public static double getValidDouble() {
        while (true) {
            try {
                return input.nextDouble();
            } catch (Exception e) {
                System.out.println();
                System.out.println("!! Enter only numbers");
                System.out.print("Try again: ");
                input.next();
            }
        }
    }

    public static int getValidChoice() {
        while (true) {
            int type = getValidInt();
            if (type == 1 || type == 2) {
                return type;
            } else {
                System.out.println("\n there are only two choices");
                System.out.print("try again :");
                input.nextLine();
            }
        }
    }
    // =================================================
}
