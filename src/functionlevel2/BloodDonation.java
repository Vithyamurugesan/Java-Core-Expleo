package functionlevel2;

import java.util.Scanner;

public class BloodDonation {
	    // Function to check eligibility
	    public static boolean isEligible(int age, int weight) {
	        if (age > 18 && age <= 55 && weight > 45) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter age:");
	        int age = sc.nextInt();

	        System.out.println("Enter weight:");
	        int weight = sc.nextInt();

	        if (isEligible(age, weight)) {
	            System.out.println("Eligible for blood donation");
	        } else {
	            System.out.println("Not eligible for blood donation");
	        }

	        sc.close();
	    }
}
