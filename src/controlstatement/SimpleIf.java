package controlstatement;

import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
		boolean seatavailable=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Seat number: ");
		String seatNumber=sc.next();
		if(seatavailable) {
			System.out.println("You have booked the seat number "+seatNumber);
		}
		sc.close();	
	}


}
