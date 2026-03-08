package controlflowstatementlevel2;

import java.util.Scanner;

public class AmstrongNumber {

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a 3-digit number: ");
	        int num = sc.nextInt();
	        
	        int original = num;
	        int sum = 0;
	        
	        while (num > 0) {
	            int digit = num % 10;     
	            sum = sum + (digit * digit * digit); 
	            num=num/10;// remove last digit
	        }
	        
	        if (sum == original)
	            System.out.println("Armstrong Number");
	        else
	            System.out.println("Not an Armstrong Number");
	        
	        sc.close();
	    }
}