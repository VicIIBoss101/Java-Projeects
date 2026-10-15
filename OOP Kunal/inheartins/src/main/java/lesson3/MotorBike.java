package lesson3;

public class MotorBike extends Vehicle {
    private String model;
    private String brand;
    private String engineSize;
    MotorBike(String brand, String model,String engineSize, int speed, String color, int year, double price){
        super(speed, color,year,price);
        this.model = model;
        this.brand = brand;
        this.engineSize = engineSize;
    }
    public void getInfo(){
        System.out.printf("%n%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s| %n","Brand","Model","Year","Engine Size","Color","Max Speed","Price" );
        System.out.printf("%-5s|%-5s|%-5d|%-5s|%-5s|%-5d|%-5f|%n",brand,model,getYear(),engineSize,getColor(),getSpeed(),getPrice() );
    }
}
