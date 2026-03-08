package controlflowstatementlevel2;

import java.util.Scanner;

public class InternetBill {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter browsing hours: ");
	        int hours = sc.nextInt();
	        
	        System.out.print("Enter extra minutes: ");
	        int minutes = sc.nextInt();
	        
	        int totalAmount = 0;
	        
	        if (hours > 7) {
	            System.out.println("Maximum browsing limit is 7 hours.");
	        } 
	        else {
	            if (hours == 5 && minutes == 0) {
	                totalAmount = 200;
	            } 
	            else {
	                totalAmount = (hours * 50) + (minutes * 1);
	            }
	            
	            System.out.println("Total Bill: Rs. " + totalAmount);
	        }
	        
	        sc.close();
	    }
}
