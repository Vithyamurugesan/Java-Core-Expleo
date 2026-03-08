package arrayslevel2;

import java.util.Scanner;

public class SearchCount {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int[25];

	        System.out.println("Enter 25 numbers:");

	        for(int i = 0; i < 25; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter number to search: ");
	        int key = sc.nextInt();

	        int count = 0;

	        for(int i = 0; i < 25; i++) {
	            if(arr[i] == key) {
	                count++;
	            }
	        }

	        if(count > 0) {
	            System.out.println("Number is present.");
	            System.out.println("It appears " + count + " times.");
	        } else {
	            System.out.println("Number is not present in the array.");
	        }

	        sc.close();
	    }
}
