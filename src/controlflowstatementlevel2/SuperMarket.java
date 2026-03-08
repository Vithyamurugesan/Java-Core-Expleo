package controlflowstatementlevel2;

import java.util.Scanner;

public class SuperMarket {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter price per item: ");
	        int price = sc.nextInt();
	        
	        System.out.print("Enter quantity purchased: ");
	        int quantity = sc.nextInt();
	        
	        double total = price * quantity;
	        double discount = 0;
	        if (quantity > 500) {
	            discount = total * 0.15;
	            total = total - discount;
	            System.out.println("15% discount applied.");
	        }
	        else {
	        	System.out.println("Discount is not applicable for this quantity");
	        }
	        
	        System.out.println("Total amount to be paid: " + total);
	        
	        sc.close();
	    }
}