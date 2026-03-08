package controlflowstatementlevel3;

import java.util.Scanner;

public class FactorialNumber {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        long num = sc.nextLong();

	        if (num <= 0) {
	            System.out.println("Invalid Input");
	        } 
	        else {
	            long fact = 1;
	            int i=1;
	            while (fact < num) {
	                i++;
	                fact = fact * i;
	            }

	            if (fact == num) {
	                System.out.println(i);
	            } else {
	                System.out.println("Sorry. The given number is not a perfect factorial");
	            }
	        }

	        sc.close();
	    }
}