package lesson3;

import java.util.Scanner;

public class Main {
    static void main() {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("=".repeat(24) + "\nWelcome to java Vehicle\n" + "=".repeat(24));
                System.out.print("1. to add car\n2. to add Motor Bike\n: ");
                int choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("=".repeat(14) + "\nAdding New Car\n" + "=".repeat(14));
                        newCar(input);
                        break;
                    case 2:
                        System.out.println("=".repeat(22) + "\nAdding New Motor Bike\n" + "=".repeat(22));
                        newMotorBike(input);
                        break;
                    default:
                        System.out.println("Wrong number entered!!");
                        break;
                }
            }
        }
    }
    static void newCar(Scanner input){
        System.out.print("Enter model: ");
        String model = input.nextLine();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter speed: ");
        int speed = input.nextInt();
        System.out.print("How many seats: ");
        String seats = input.nextLine();
        input.nextLine();
        System.out.print("Enter color: ");
        String color = input.nextLine();
        System.out.print("Enter price: ");
        float price = input.nextFloat();
        Car c1 = new Car(model,seats,speed,color,year,price);
        c1.getInfo();
    }
    static void newMotorBike(Scanner input){
        System.out.print("Enter Brand Name: ");
        String brand = input.nextLine();
        System.out.print("Enter The Model: ");
        String model = input.nextLine();
        System.out.print("Enter Engine Size: ");
        String engineSize = input.nextLine();
        System.out.print("Enter The Color: ");
        String color = input.nextLine();
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter Max Speed:");
        int speed = input.nextInt();
        System.out.print("Enter price: ");
        float price = input.nextFloat();
        MotorBike bike1 = new MotorBike(brand,model,engineSize,speed,color,year,price);
        bike1.getInfo();
    }
}
