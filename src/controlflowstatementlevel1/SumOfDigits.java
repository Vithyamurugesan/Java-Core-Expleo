package controlflowstatementlevel1;

import java.util.Scanner;

public class SumOfDigits {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0;
	        while (num != 0) {
	            int digit = num % 10;   // Get last digit
	            sum = sum + digit;      // Add to sum
	            num = num / 10;         // Remove last digit
	        }
	        System.out.println("Sum of digits = " + sum);
	        sc.close();
	    }
}
