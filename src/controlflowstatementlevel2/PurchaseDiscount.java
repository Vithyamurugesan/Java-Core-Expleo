package controlflowstatementlevel2;

import java.util.Scanner;

public class PurchaseDiscount {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter price of item: ");
	        double price = sc.nextDouble();
	        
	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();
	        
	        double purchaseAmount = price * quantity;
	        double discountAmount;
	        double paidAmount;
	        
	        if (purchaseAmount > 1000) {
	            discountAmount = purchaseAmount * 0.10;   
	        } 
	        else {
	            discountAmount = purchaseAmount * 0.05;   
	        }
	        
	        paidAmount = purchaseAmount - discountAmount;
	        
	        System.out.println("Purchase Amount: Rs. " + purchaseAmount);
	        System.out.println("Discount Amount: Rs. " + discountAmount);
	        System.out.println("Paid Amount: Rs. " + paidAmount);
	        
	        sc.close();
	    }
}