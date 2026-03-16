package exceptionhandlinglevel1;

import java.util.Scanner;
import java.util.InputMismatchException;

class Invoice {

    int partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    // Constructor
    Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {

        if (partNumber <= 0) {
            throw new IllegalArgumentException("Part number must be greater than 0");
        }

        if (partDescription == null || partDescription.isEmpty()) {
            throw new IllegalArgumentException("Part description cannot be empty");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }

        if (pricePerItem <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    void display() {
        System.out.println("Part Number: " + partNumber);
        System.out.println("Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: " + pricePerItem);
        System.out.println("Total Invoice Amount: " + (quantity * pricePerItem));
    }
}

public class InvoiceTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Part Number: ");
            int partNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Part Description: ");
            String desc = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter Price per Item: ");
            double price = sc.nextDouble();

            Invoice inv = new Invoice(partNo, desc, qty, price);

            System.out.println("\nInvoice Details");
            inv.display();

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input type entered.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
