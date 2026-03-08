package controlstatement;

import java.util.Scanner;

public class SimpleIfElse {

	public static void main(String[] args) {
		boolean seatAvailable=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the seat number :");
		String Seatnumber=sc.next();
		if(seatAvailable) {
			System.out.println("You have booked the seat number "+Seatnumber);
		}
		else {
			System.out.println("You haven't book the seat number");
			
		}
		sc.close();
	}
}
