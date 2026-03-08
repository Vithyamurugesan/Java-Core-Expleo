package arrayslevel1;

import java.util.Scanner;

public class MergeArray {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // First array
	        System.out.println("Enter size of first array:");
	        int n1 = sc.nextInt();
	        int[] arr1 = new int[n1];

	        System.out.println("Enter elements of first array:");
	        for(int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        // Second array
	        System.out.println("Enter size of second array:");
	        int n2 = sc.nextInt();
	        int[] arr2 = new int[n2];

	        System.out.println("Enter elements of second array:");
	        for(int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        // Third array (merged)
	        int[] arr3 = new int[n1 + n2];

	        // Copy first array
	        for(int i = 0; i < n1; i++) {
	            arr3[i] = arr1[i];
	        }

	        // Copy second array
	        for(int i = 0; i < n2; i++) {
	            arr3[n1 + i] = arr2[i];
	        }

	        // Display arrays
	        System.out.println("First Array:");
	        for(int i = 0; i < n1; i++) {
	            System.out.print(arr1[i] + " ");
	        }

	        System.out.println("\nSecond Array:");
	        for(int i = 0; i < n2; i++) {
	            System.out.print(arr2[i] + " ");
	        }

	        System.out.println("\nMerged Array:");
	        for(int i = 0; i < arr3.length; i++) {
	            System.out.print(arr3[i] + " ");
	        }

	        sc.close();
	    }
}
