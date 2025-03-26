package hw;

import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillingService billingService = new BillingService();

        // Display customer type options
        System.out.println("Select Customer Type:");
        System.out.println("1. General");
        System.out.println("2. Corporate");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Ask for customer details
        System.out.print("Enter your Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Billing Amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discount = scanner.nextDouble();

        Customer customer = null;
        switch (choice) {
            case 1:
                customer = new GeneralCustomer(customerId, name);
                break;
            case 2:
                customer = new CorporateCustomer(customerId, name);
                break;
            default:
                System.out.println("Invalid choice! Please enter either 1 or 2.");
                scanner.close();
                return;
        }
        
        customer.displayDetails();
        System.out.println("\n--- Bill Details ---");
        billingService.processBill(customer, amount, discount);

        scanner.close();
    }
}
