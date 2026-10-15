package lesson3;

public class Car extends Vehicle {
    private String model;
    private String seats;

    public Car(String model, String seats, int speed, String color, int year, double price) {
        super(speed, color, year, price);
        this.model = model;
        this.seats = seats;
    }

    public void getInfo() {
        System.out.printf("%-5s|%-7s|%-8s|%-6s|%-6s|%-6s", "Type", "Model", "Year", "Color", "Max Speed", "Seats");
        System.out.printf("%-5s|%-7s|%-8d|%-6s|%-6d|%-6s", "Car", model, getYear(), getColor(), getSpeed(), seats);
    }
}
