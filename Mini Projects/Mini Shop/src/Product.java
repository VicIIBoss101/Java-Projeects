public class Product {
    private int no;
    private String name;
    private int quantity;
    private double price;

    public Product(int no, String name, int quantity, double price) {
        this.no = no;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void productInfo() {
        System.out.println("==============");
        System.out.println(this.no + ". " + this.name + "\n" + "price: " + this.price + " $" + "\n" + "quantitiy: "
                + this.quantity);
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public int getProdectNo() {
        return this.no;
    }

    public void updateQuant(int amount) {
        quantity = this.quantity - amount;
    }

    public void updateNo(int newNo) {
        this.no = newNo;
    }

    public void updatePrice(int newPrice) {
        System.out.println("The price before change: " + this.price);
        this.price = newPrice;
        System.out.println("The price after change: " + this.price);

    }
}
