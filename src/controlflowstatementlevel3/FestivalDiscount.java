package controlflowstatementlevel3;

import java.util.Scanner;

public class FestivalDiscount {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Total Cost: ");
	        double totalCost = sc.nextDouble();

	        double discount = 0;

	        if (totalCost < 2000) {
	            discount = totalCost * 0.05;     // 5%
	        }
	        else if (totalCost < 5000) {
	            discount = totalCost * 0.25;     // 25%
	        }
	        else if (totalCost < 10000) {
	            discount = totalCost * 0.35;     // 35%
	        }
	        else {
	            discount = totalCost * 0.50;     // 50%
	        }

	        double amountToPay = totalCost - discount;

	        System.out.println(amountToPay);

	        sc.close();
	    }
}
