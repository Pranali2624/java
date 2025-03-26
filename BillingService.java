package hw;

public class BillingService {
    // Process billing for both customer types
    public void processBill(Customer customer, double amount, double discount) {
        double tax;

        if (customer instanceof GeneralCustomer) {
            tax = (amount > 1000) ? 5 : 0; // Apply tax if amount > 1000 then apply 5 persent tax baby
        } else if (customer instanceof CorporateCustomer) {
            tax = 5; // Corporate customers  5% tax
        } else {
            tax = 0; 
        }

        double finalAmount = calculateFinalAmount(amount, discount, tax);
        System.out.println("Final Price: $" + finalAmount);
    }

    // Utility method to calculate the final price
    private double calculateFinalAmount(double amount, double discount, double tax) {
        double discountAmount = (amount * discount / 100);
        double discountedPrice = amount - discountAmount;
        double taxAmount = (discountedPrice * tax / 100);
        return discountedPrice + taxAmount;
    }
}