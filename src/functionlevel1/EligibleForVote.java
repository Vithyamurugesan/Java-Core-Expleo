package functionlevel1;

import java.util.Scanner;

public class EligibleForVote {
	public static void voteCheck(int age) {
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		EligibleForVote.voteCheck(age);  //calling the method 
		sc.close();
	}
}
