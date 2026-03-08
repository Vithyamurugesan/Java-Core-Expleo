package functionlevel1;

import java.util.Scanner;

public class CalculateSumOfOddEven {
	static void calculateSum(int []arr) {
		int evensum=0,oddsum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evensum+=arr[i];
			}
			else {
				oddsum+=arr[i];
			}
			
		}
		System.out.println("Even Sum of the array : "+evensum);
		System.out.println("Odd sum of the array : "+oddsum);
	}
	
	public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array size: ");
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();	//Getting the array as input
			}
			CalculateSumOfOddEven.calculateSum(arr);  //Calling the method
			sc.close();
	}
}
