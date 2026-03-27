public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void productInfo() {
        System.out.println("==============");
        System.out.println(this.name + "\n" + "price: " + this.price +" $" + "\n" + "quantitiy: " + this.quantity);
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }
}
