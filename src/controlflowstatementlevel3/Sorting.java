package controlflowstatementlevel3;

import java.util.Scanner;

public class Sorting {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter characters: ");
	        String str = sc.nextLine();

	        char arr[] = str.toCharArray();
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {   
	                    char temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Sorted Output:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        
	        
	        sc.close();
	 }
}