package functionlevel3;

import java.util.Scanner;

public class SalaryIncrement {
	    // Function to calculate incremented salary
	    public static double calculateIncrement(double salary, double rating) {

	        if (salary <= 0 || rating < 1 || rating > 10) {
	            return -1;  // indicates invalid input
	        }

	        if (rating >= 1 && rating <= 4) {
	            return salary + (salary * 0.10);
	        } 
	        else if (rating > 4 && rating <= 7) {
	            return salary + (salary * 0.25);
	        } 
	        else {  // rating > 7 and <= 10
	            return salary + (salary * 0.30);
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the salary");
	        double salary = sc.nextDouble();

	        System.out.println("Enter the appraisal rating");
	        double rating = sc.nextDouble();

	        double result = calculateIncrement(salary, rating);

	        if (result == -1) {
	            System.out.println("Invalid Input");
	        } else {
	            System.out.println((int)result);
	        }

	        sc.close();
	    }
}
