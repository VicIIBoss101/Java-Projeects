package try_thing;

public class Person {
    private String name;
    private String address;
    private int phoneNumber;

    public Person(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return ("Name: " + this.name + "\nAddress: " + this.address + "\nPhone Number: " + this.phoneNumber);
    }
}
