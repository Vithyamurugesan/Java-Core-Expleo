package functionlevel2;

import java.util.Scanner;

public class AbsoluteDifference {
	public static int oddSum(int a,int b) {
		int oddsum=0;
		for(int i=a;i<=b;i++) {
			if(i%2==1) {
				oddsum+=i;
			}
		}
		return oddsum;
		
	}
	
	public static int evenSum(int a,int b) {
		int evensum=0;
			for(int i=a;i<=b;i++) {
				if(i%2==0) {
					evensum+=i;
				}
			}
			return evensum;
			
	}
	
	
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the lower bound : ");
		int a=scanner.nextInt();
		System.out.println("Enter the upper bound : ");
		int b=scanner.nextInt();
		int odd=oddSum(a,b);
		int even=evenSum(a,b);	
		System.out.println("The sum of odd numbers from 1 to 1000 is: "+odd);
		System.out.println("The sum of even numbers from 1 to 1000 is: "+even);
		System.out.println("The absolute difference between the two sums is: "+Math.abs(odd-even));	
		scanner.close();
	}
}
