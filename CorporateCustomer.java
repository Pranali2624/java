package hw;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(int customerId, String name) {
        super(customerId, name);
    }

    @Override
    void displayDetails() {
        System.out.println("Corporate Customer: ID = " + customerId + ", Name = " + name);
    }
}