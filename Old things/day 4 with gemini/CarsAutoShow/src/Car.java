public class Car extends Vehicle {
    private int seats;

    public Car(String brand, double price, int seats) {
        super(brand, price);
        this.seats = seats;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" Seats: " + seats);
    }

    public void honk() {
        System.out.println("!Beep !Beep");
    }
}
