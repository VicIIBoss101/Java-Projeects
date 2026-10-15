package lesson3;

public class Vehicle {
    private int speed;
    private String color;
    private int year;
    private double price;

    public Vehicle(int speed, String color, int year, double price) {
        this.speed = speed;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
    public double getPrice(){
        return price;
    }
}
