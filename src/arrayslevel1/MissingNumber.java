package arrayslevel1;

import java.util.Scanner;

public class MissingNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = 100;  // numbers from 1 to 100
	        int[] arr = new int[n - 1];

	        System.out.println("Enter 99 numbers (from 1 to 100 with one missing):");

	        for(int i = 0; i < n - 1; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Expected sum of numbers 1 to 100
	        int expectedSum = n * (n + 1) / 2;

	        // Actual sum of given array
	        int actualSum = 0;
	        for(int i = 0; i < n - 1; i++) {
	            actualSum += arr[i];
	        }

	        int missingNumber = expectedSum - actualSum;

	        System.out.println("Missing number is: " + missingNumber);

	        sc.close();
	    }
}
