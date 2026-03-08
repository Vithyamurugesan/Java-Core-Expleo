package arrayslevel1;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum value in an array : "+max);
		System.out.println("Minimum value in an array : "+min);
		sc.close();
		
	}
}
