package hw;

public class GeneralCustomer extends Customer {
    public GeneralCustomer(int customerId, String name) {
        super(customerId, name);
    }

    @Override
    void displayDetails() {
        System.out.println("General Customer: ID = " + customerId + ", Name = " + name);
    }
}