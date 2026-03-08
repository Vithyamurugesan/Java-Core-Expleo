package controlstatement;

import java.util.Scanner;

public class SimpleIfElseIf {
	public static void main(String[]args) {
		String seattype;
		System.out.println("Type of seats Available\nRegular\nPREMIUM\nEXECUTIVE\nVIP\nChoose any one of the option :");
		Scanner sc=new Scanner(System.in);
		seattype=sc.next();
		if(seattype.equals("REGULAR")) {
			System.out.println("You have selected Executive Seat and cost is Rs.80");	
		}
		else if(seattype.equals("PREMIUM")) {
			System.out.println("You have selected Executive Seat and cost is Rs.100");
		}
		else if(seattype.equals("EXECUTIVE")) {
			System.out.println("You have selected Executive Seat and cost is Rs.120");
		}
		else if(seattype.equals("VIP")) {
			System.out.println("You have selected Executive Seat and cost is Rs.150");
		}
		else {
			System.out.println("You have not selected any type");
		}
		sc.close();
		
		
	}


}
