package controlflowstatementlevel1;

import java.util.Scanner;

public class BloodDonar {
	    public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();
	        
	        System.out.print("Enter Weight : ");
	        float weight = sc.nextFloat();
	       
	        if (age > 18 && age < 55 && weight > 45) {
	            System.out.println("Eligible for blood donation.");
	        }
	        
	        else{
	            System.out.println("Not eligible for blood donation.");
	        }
	        
	        sc.close();
	    }
}
