package hw;

public abstract class Customer {
    int customerId;
    String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    abstract void displayDetails(); // Abstract method
}