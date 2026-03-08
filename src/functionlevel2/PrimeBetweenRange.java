package functionlevel2;

import java.util.Scanner;

public class PrimeBetweenRange {
	    // Function to check whether a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // Function to print prime numbers in the interval
	    public static void printPrimes(int x, int y) {
	        for (int i = x; i <= y; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int x = sc.nextInt();
	        int y = sc.nextInt();

	        if (x > y) {
	            System.out.println("Provide valid input");
	        } else {
	            printPrimes(x, y);
	        }

	        sc.close();
	    }
}
