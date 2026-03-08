package controlflowstatementlevel2;

import java.util.Scanner;
public class CalculateBill {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of pages :");
		int pages=sc.nextInt();
		System.out.println("Enter the number of copies :");
		int copy=sc.nextInt();
		int typing=pages*3;
		int printing=0;
		if(copy==1) {
			printing=pages*1;
		}
		else if(copy>1) {
			printing=(pages*1)+(pages*(copy-1)*3);
		}
		int totalbill=typing+printing;
		System.out.println("Typing cost : "+typing);
		System.out.println("Printing cost : "+printing);
		System.out.println("The total bill for workdone :"+totalbill);
		
		sc.close();
	}
}
