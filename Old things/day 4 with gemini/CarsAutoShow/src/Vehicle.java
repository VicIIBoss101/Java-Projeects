public class Vehicle {
    protected String brand;
    protected double price;

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("\n==========");
        System.out.print("The brand: " + brand);
        System.out.print(" \t price: " + price);
    }
}
